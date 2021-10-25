
import java.util.*;

public class BitOutputStream {
	
	Stack<Boolean> buffer;
	BitOutputStream(){
		buffer = new Stack<Boolean>();
	}

	public void WriteBit(char c){
		boolean checker = false;
		if (c == '1') checker = true;
		buffer.add(checker);
		if (buffer.size() == 8) OutputByte();
	}
	
	public void close(){
		OutputByte();	
	}
	
	private void OutputByte(){
		int exp = 1;
		byte b = 0;
		
		while(buffer.empty() == false) {
			 if (buffer.pop() == true) b+=exp;
			 exp *= 2;
		}
		System.out.println(b);
	}
}


