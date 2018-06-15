package test.c_18.preference_demo;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferenceDemo {
	public static void main(String[] args) throws BackingStoreException{
		Preferences prefs=Preferences.userNodeForPackage(PreferenceDemo.class);
		prefs.put("Location", "Oz");
		prefs.put("Footware", "Jimmy chou");
		prefs.putInt("companions", 4);
		prefs.putBoolean("WitchesExist", true);
		int usageCount=prefs.getInt("usageCount", 0);
		usageCount++;
		prefs.putInt("usageCount", usageCount);
		for(String key : prefs.keys()){
			System.out.println(key+": "+prefs.get(key, null));
		}
		System.out.println("How many companions does Dorothy have? "+prefs.getInt("Companions", 0));
	}
}
