package sample;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.InvalidConfigurationException;

public class FileConfigurationSample {
	
	public static FileConfiguration loadConfig(File file) {
		FileConfiguration config = new FileConfiguration();
		try {
			config.load(file);
		} catch (InvalidConfigurationException | IOException ex) {
			//ロード中にエラー発生。
			ex.printStackTrace();[
			return null;
		}
		return config;
	}
	
	public static boolean saveConfig(File file, FileConfiguration config) {
		try {
			config.save(file);
		} catch (IOException ex) {
			//保存失敗
			ex.printStackTrace();
			return false;
		}
		return true;
	}
}