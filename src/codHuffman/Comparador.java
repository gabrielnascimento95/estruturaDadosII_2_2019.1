package codHuffman;
import java.util.Comparator;

public class Comparador implements Comparator<No>{

	@Override
	public int compare(No o1, No o2) {
		return o1.getFreq() - o2.getFreq();
	}

}
