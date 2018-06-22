package gov.gsa.generic;

import gov.gsa.managers.FileReaderManager;

public class ConfigFileReaderTest {
	
		public static void main(String[] args){
			System.out.println("Browser Name:"+FileReaderManager.getInstance().getConfigFileReader().getBrowser());
			System.out.println("App URL:"+FileReaderManager.getInstance().getConfigFileReader().getApplicationURL());
			System.out.println(FileReaderManager.getInstance().getConfigFileReader().isWindowMaximize());
		}
}
