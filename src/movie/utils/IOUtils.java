package movie.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class IOUtils {

	private final static String DB_PATH = "db/";

	public static <T> boolean fileWriter(T obj, String fileName) {
		try {
			ObjectMapper mapper = getObjectMapper();
			String writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(DB_PATH + fileName));
			bufferedWriter.write(writeValueAsString);
			bufferedWriter.close();
			return true;
		} catch (IOException e) {
			System.out.println(e);
		}
		return false;
	}

	public static <T> T fileReader(TypeReference<T> type, String fileName) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(DB_PATH + fileName));
			String readLine = null;
			String result = "";
			while ((readLine = bufferedReader.readLine()) != null) {
				result += readLine;
			}

			bufferedReader.close();
			if (!StringUtils.isNullOrEmpty(result)) {
				ObjectMapper mapper = getObjectMapper();
				return (T) mapper.readValue(result, type);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return null;
	}

	private static ObjectMapper getObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper;
	}
}