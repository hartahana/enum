//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;

class Series {
    int[] array;
    int number;

    Series(int c) {
        this.array = new int[c];
        this.number = 0;
    }

    void addItem(int a) {
        this.array[this.number] = a;
        ++this.number;
    }

    int[] getItem() {
        return this.array;
    }
}
