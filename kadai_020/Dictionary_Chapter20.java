package kadai_020; 

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public void Refer(String innlist[]) {
		
		HashMap<String,String> fMap = new HashMap<String,String>();
		fMap.put("apple","りんご");
		fMap.put("peach","桃");
		fMap.put("banana","バナナ");
		fMap.put("lemon","レモン");
		fMap.put("pear","梨");
		fMap.put("kiwi","キウィ");
		fMap.put("strawberry","いちご");
		fMap.put("grape","ぶどう");
		fMap.put("muscat","マスカット");
		fMap.put("cherry","さくらんぼ");
	    
		for(int i = 0; i < innlist.length; i++) {
			String getlist = innlist[i];
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
