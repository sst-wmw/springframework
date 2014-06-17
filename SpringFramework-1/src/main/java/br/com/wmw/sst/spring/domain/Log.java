package br.com.wmw.sst.spring.domain;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private String fileTXT;

    public Log(final String fileTXT) {
        this.fileTXT = fileTXT;
    }

    public String getFileTXT() {
        return fileTXT;
    }

    public void setFileTXT(final String fileTXT) {
        this.fileTXT = fileTXT;
    }

    public void geraLog(final String message) {
        File file = null;
        FileWriter fw = null;
        try {
            file = new File(fileTXT);
            fw = new FileWriter(file, true);
            fw.append(String.format("\n[%s] - %s.", dateFormat.format(new Date()), message));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        	if (fw != null) {
        		try {
        			fw.close();
        		} catch (Exception ex) {
        			ex.printStackTrace();
        		}
        	}
        }

    }

}
