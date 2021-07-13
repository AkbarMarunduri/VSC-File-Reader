package amd.programer.baru.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;


public class CvsReader {
    public static void main(String[] args) throws IOException {

        Reader in = new FileReader("D:\\JAVA\\CVS-reader-java\\CVS-reader-java\\src\\main\\csv\\MOCK.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
//        InputStream inputStream = CvsReader.class.getResourceAsStream("D:\\JAVA\\CVS-reader-java\\CVS-reader-java\\src\\main\\java\\amd\\programer\\baru\\csv\\MOCK.csv");
//        InputStreamReader reader = new InputStreamReader(inputStream);
//        CSVParser records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(reader);

        for (CSVRecord record : records) {
            String id = record.get("id");
            String firstName = record.get("first_name");
            String lastName = record.get("last_name");
            String email = record.get("email");
            String genre = record.get("gender");
            String ipAddress = record.get("ip_address");

            System.out.println(id + "-" + firstName + "-" + lastName + "-" + email + "-" + genre + "-" + ipAddress);
        }

    }
}
