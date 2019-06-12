/*package xmlBinding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

public class WriteObjectToXML {
	public static void main(String[] args) {
		Employee employee = new Employee(5, "Piyush");
		MarshalUnMarshal marshalUnMarshal = new MarshalUnMarshal();
		String xmlContent = marshalUnMarshal.writeToXML(employee);
		System.out.println(xmlContent);
		writeXMLToFile(xmlContent);
		
		String xmlContentFromFile = readXMLFromFile("F:\\Employee.txt");
		Employee employee2 = (Employee) marshalUnMarshal.readObjectFromXML(Employee.class, xmlContentFromFile);
		System.out.println(employee2.getName() + " " + employee2.getId());
	}
	
	public static void writeXMLToFile(String xmlContent){
		File file = new File("F:\\Employee.txt");
		FileWriter fileWriter = null;
		BufferedWriter bufferFileWriter  = null;
		try {
			file.createNewFile();
			fileWriter = new FileWriter(file,true);
			//Use BufferedWriter instead of FileWriter for better performance
			bufferFileWriter  = new BufferedWriter(fileWriter);
			fileWriter.append(xmlContent);
			bufferFileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			file.deleteOnExit();
			try {
				fileWriter.close();
				bufferFileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static String readXMLFromFile(String fileNameWithPath){
		File file = new File("F:\\Employee.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			return bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			file.deleteOnExit();
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}

class MarshalUnMarshal {
	public String writeToXML(Object obj){
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
		//	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(obj, byteArrayOutputStream);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return byteArrayOutputStream.toString();	
	}
	
	public Object readObjectFromXML(Class<?> object, String xmlContent){
		
		try {
			StringReader reader = new StringReader(xmlContent);
			JAXBContext jaxbContext = JAXBContext.newInstance(object);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Object obj = unmarshaller.unmarshal(reader);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

@XmlRootElement
class Employee {
     
    private Integer id;
    private String name;
     
    //JAXB requires a default constructor.
    @SuppressWarnings("unused")
	private Employee(){}
     
    public Employee(Integer id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
     
    public Integer getId()
    {
        return id;
    }
     
    public void setId(Integer id)
    {
        this.id = id;
    }
     
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
     
    @Override
    public String toString()
    {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}*/