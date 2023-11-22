package kadai_020;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
    
	public void Dictionary_Chapter20e(){
		HashMap<String,String> fMap = new HashMap<String,String>();
	    fMap.put("apple1","りんご");
	    fMap.put("peach","桃");
	    fMap.put("banana","バナナ");
	    fMap.put("lemon","レモン");
	    fMap.put("pear","梨");
	    fMap.put("kiwi","キウィ");
	    fMap.put("strawberry","いちご");
	    fMap.put("grape","ぶどう");
	    fMap.put("muscat","マスカット");
	    fMap.put("cherry","さくらんぼ");
	    
	    //System.out.println("apple1の意味は" + fMap.get("apple1"));
	    //System.out.println("apple1の意味は" + fMap.get("banana"));
	    //System.out.println("apple1の意味は" + fMap.get("grape"));
	    //System.out.println("apple1の意味は" + fMap.get("orange"));
	    
	    
	      ArrayList<String> fList = new ArrayList<String>();
	      fList.add("apple1");
	      fList.add("banana");
	      fList.add("grape");
	      fList.add("orange");
	      for(int i = 0; i < fList.size(); i++) {
               String getlist = fList.get(i);
               String getmap = fMap.get(getlist);
               if (getmap != null) {
	               System.out.println(getlist+"の意味は" + getmap);
               }
               else { 
                   System.out.println(getlist+"は辞書に存在しません");
               }
	      }
	    
	}

}
