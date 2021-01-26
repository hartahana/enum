//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
//сохраняем последовательность в массиве
package epum;

//передаем в массив данные
class Series {
    int[] array;
    int number;

    Series(int c) {
        this.array = new int[c]; //
        this.number = 0;
    }
//добавляем элемент в последовательность
    void addItem(int a) {
        this.array[this.number] = a;
        ++this.number;
    }
//возвращаем последовательность целиком
    int[] getItem() {
        return this.array;
    }
}
