package com.db;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.model.Evaluation;

public class EvaluationFile {
	public static ArrayList<Evaluation> list=new ArrayList<Evaluation>();
	static LineNumberReader fnr ;
	static PrintWriter out = null;
	static String pathFile="/database.txt";

	public EvaluationFile() {
		
	}
	
	public static ArrayList<Evaluation> readFile(){
		list=new ArrayList<Evaluation>();
		try {
			System.out.println(new File(pathFile).getAbsolutePath());
			fnr = new LineNumberReader(new FileReader(new File(pathFile)));
			while(fnr.ready()) {
				String[] s=fnr.readLine().split("/");
				if(s.length==4) {
					Evaluation e=new Evaluation(s[0],Integer.valueOf(s[1]),Integer.valueOf(s[2]),Integer.valueOf(s[3]));
					list.add(e);
				}
			}
			fnr.close();
			orderByMedium();
			if(list.size()==0) {
				Evaluation e1=new Evaluation("Restaurant 1",1,1,1);
				Evaluation e2=new Evaluation("Restaurant 2",2,2,2);
				Evaluation e3=new Evaluation("Restaurant 3",3,3,3);
				Evaluation e4=new Evaluation("Restaurant 4",4,4,4);
				EvaluationFile.list.add(e1);
				EvaluationFile.list.add(e2);
				EvaluationFile.list.add(e3);
				EvaluationFile.list.add(e4);
				EvaluationFile.writeFile();
			}
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void writeFile() {
			try {
				orderByMedium();
				String s="";
				for(Evaluation e : list) {
					s+=e.getName()+"/"+e.getQn()+"/"+e.getQsa()+"/"+e.getQse()+"\n";
				}		
				out=new PrintWriter(pathFile);
				out.write(s);
				out.close();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	}
	
	
	
	public static void orderByMedium() {
		Collections.sort(list,new Comparator<Evaluation>() {

			@Override
			public int compare(Evaluation e1, Evaluation e2) {
				double d=(e1.getMedium()-e2.getMedium())*100;				
				return (int)d;
			}
			
		});
						
	}
	
	

}
