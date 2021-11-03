package array;

/**
　　* @description: 数组新增和删除操作
　　* @param ${tags}
　　* @return ${return_type}
　　* @throws
　　* @author Cff
　　* @date 2021/11/3 21:28
　　*/
public class Myarray {
    private int[] array;
    private int size;

    public Myarray(int capcity) {
        this.array = new int[capcity];
        this.size = 0;
    }

    //插入数组
    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组元素实际范围！");
        }
        if (size >= array.length) {
            resize();
        }
        //从左向右循环，将元素逐个向右移动1位
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        //腾出的位置放新元素
        array[index] = element;
        size++;
    }

    //数组扩容
    private void resize() {
        int[] arrayNew = new int[array.length * 2];
        //将array数组拷贝到arrayNew上面
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
    }

    //输出数组
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    //删除数组
    public int delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组元素实际范围！");
        }
        int deleteElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deleteElement;
    }

    public static void main(String[] args) {
        Myarray myArray = new Myarray(4);
        myArray.insert(0, 3);
        myArray.insert(1, 7);
        myArray.insert(2, 9);
        myArray.insert(3, 5);
        myArray.insert(1, 6);
        myArray.output();
        System.out.println("删除元素:" + myArray.delete(3));
    }
}
