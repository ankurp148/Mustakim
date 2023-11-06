package genricUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility implements IAutoConstants
{
	Workbook workbook;
	@DataProvider(name="data")
	public Object[][] readExcel() 
	{
		File file=new File("C:\\Users\\HP\\Downloads\\personal.xlsx");
        try {
			workbook = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        Sheet sheet = workbook.getSheet("sheet4");
        int rowcount = sheet.getPhysicalNumberOfRows();
        int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
        Object [][] data=new Object[rowcount][cellcount];
		for (int i=0;i<rowcount;i++) 
		{
			Row actualRow = sheet.getRow(i);
			
			for (int j=0;j<actualRow.getPhysicalNumberOfCells();j++)
			{
				data[i][j]=actualRow.getCell(j).toString();
			}
		}
		return data;
	}
	
 
}
