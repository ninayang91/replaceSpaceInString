

public class Main {

    public static void main(String[] args) {
       // Test tst = new Test();
        char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
        
        int length = 7;//the dog there are 7 chars
        replaceSpaces(ch, length);  
    }
	
	//replace all spaces in a string with '%20'
    public static void replaceSpaces(char[] ch, int trueLength){
    	int spaceCounter=0;
    	for(int i=0;i<trueLength;i++){
    		if(ch[i]==' '){
    			spaceCounter++;
    		}
    	}
    	int newLength=trueLength+spaceCounter*2;
    	if(newLength>ch.length-1){
    		System.out.println("Array doesn't have enough spaces");
    		return;
    	}
    	ch[newLength]='\0';
    	for(int i=trueLength-1;i>=0;i--){
    		if(ch[i]==' '){
    			ch[newLength-1]='0';
    			ch[newLength-2]='2';
    			ch[newLength-3]='%';
    			newLength -= 3;
    		}else{
    			ch[newLength-1]=ch[i];//there will be no overwrite since we did accurate counting and calculation
    			newLength--;
    		}
    	}
    	System.out.println(ch);
    }
	


}