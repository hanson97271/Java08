package Java08;

class CBox {
	int length;
	int width;
	int height;
	int volume;
	int surfaceArea;


	void showData() {
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	void showAll() {
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("volume="+volume);
		System.out.println("surfaceArea="+surfaceArea);
	}
	

	public static void main(String args[]) {
		CBox box = new CBox();
		box.length = box.width = box.height = 1;
		box.volume = box.length * box.height * box.width;
		box.surfaceArea = (box.height * box.length + box.height * box.width + box.length * box.width) * 2;
		box.showData();
		box.showAll();
	}
	
}