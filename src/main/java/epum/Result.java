//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;

class Result {
    int[] array;
    double result;
    String oper;

    Result(int[] input, String oper) {
        this.array = input;
        this.oper = oper;
    }

    void Oper() {
        epum.Operation op;
        if (this.oper == "max") {
            op = epum.Operation.MAX;
            this.result = op.action(this.array);
        }

        if (this.oper == "min") {
            op = epum.Operation.MIN;
            this.result = op.action(this.array);
        }

        if (this.oper == "avg") {
            op = epum.Operation.AVG;
            this.result = op.action(this.array);
        }

    }
}
