package excel;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	
	// to run excel we need Apachi POI into our main
	
	public static void main(String[] args) {
		
		//creates Blank Workbook 
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// create or select sheet. sheet is created using 
		XSSFSheet sheet = workbook.createSheet("SheetSample");
		
		
		
		// we need data in order to write into the sheet, creating the data
		Map<String,Object[]> dataSet = new TreeMap<String,Object[]>();
		dataSet.put("1", new Object[] {"ID", "UserName", "Password"});
		dataSet.put("2", new Object[] {"1", "Lochin", "abc"});
		dataSet.put("3", new Object[] {"2", "Shukhrat", "fhg"});
		dataSet.put("4", new Object[] {"3", "Nurillo", "gjgjg"});
		dataSet.put("5", new Object[] {"4", "Muhsin", "asaaas"});
		dataSet.put("6", new Object[] {"5", "Honzoda", "yerts54"});
		dataSet.put("7", new Object[] {"6", "Zarina", "adadad"});
		
		//Iterate through the data
		Set<String> set = dataSet.keySet();
		
		int rownum = 0;
		
		for 
		
		
		
		
		
	}

}
