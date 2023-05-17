package Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class MyHashMap{
	HashMap<Integer,String> map=new HashMap<>();
	
	public MyHashMap() {
		map.put(1,"Amrut");
		map.put(2,"Rahul");
		map.put(3,"Raju");
	}
	
	public Map<Integer,String> methodToReturnSynchronizedMap(){
		return(Map<Integer,String>) Collections.synchronizedMap(map);
	}
	
	public Map<Integer,String> methodToReturnUnmodifiableMap(){
		return(Map<Integer,String>) Collections.unmodifiableMap(map);
	}
}
public class MainClass {
	public static void main(String[] args) {
		MyHashMap MHM=new MyHashMap();
		
		Map<Integer,String> smap=MHM.methodToReturnSynchronizedMap();
		Map<Integer,String> umap=MHM.methodToReturnUnmodifiableMap();
		
		System.out.println(MHM.methodToReturnSynchronizedMap());
		System.out.println(MHM.methodToReturnUnmodifiableMap());
		
		try {
			umap.put(4,"Shashi");
		}
		catch(UnsupportedOperationException e){
			System.out.println("can not modify umap");
		}
		umap.put(5,"Shashi");
		
	}

}
