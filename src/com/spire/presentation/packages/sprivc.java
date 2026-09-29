/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczc;
import com.spire.presentation.packages.sprhxc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sproad;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.sprouc;
import com.spire.presentation.packages.sprtyc;
import com.spire.presentation.packages.sprwad;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprye;
import java.io.IOException;

public abstract class sprivc
extends sprczc {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sproc cfr_renamed_2875() throws IOException {
        switch (this.cfr_renamed_4) {
            case 13: 
            case 48: 
            case 54: 
            case 62: 
            case 66: 
            case 104: 
            case 133: 
            case 151: 
            case 164: 
            case 165: 
            case 187: 
            case 193: 
            case 49282: 
            case 49283: {
                return this.cfr_renamed_3178(7);
            }
            case 16: 
            case 49: 
            case 55: 
            case 63: 
            case 67: 
            case 105: 
            case 134: 
            case 152: 
            case 160: 
            case 161: 
            case 188: 
            case 194: 
            case 49278: 
            case 49279: {
                return this.cfr_renamed_3178(9);
            }
            case 19: 
            case 50: 
            case 56: 
            case 64: 
            case 68: 
            case 106: 
            case 135: 
            case 153: 
            case 162: 
            case 163: 
            case 189: 
            case 195: 
            case 49280: 
            case 49281: {
                return this.cfr_renamed_3179(3);
            }
            case 22: 
            case 51: 
            case 57: 
            case 69: 
            case 103: 
            case 107: 
            case 136: 
            case 154: 
            case 158: 
            case 159: 
            case 190: 
            case 196: 
            case 49276: 
            case 49277: 
            case 49310: 
            case 49311: 
            case 49314: 
            case 49315: 
            case 52245: 
            case 58398: 
            case 58399: {
                return this.cfr_renamed_3179(5);
            }
            case 49153: 
            case 49154: 
            case 49155: 
            case 49156: 
            case 49157: 
            case 49189: 
            case 49190: 
            case 49197: 
            case 49198: 
            case 49268: 
            case 49269: 
            case 49288: 
            case 49289: {
                return this.cfr_renamed_3180(16);
            }
            case 49163: 
            case 49164: 
            case 49165: 
            case 49166: 
            case 49167: 
            case 49193: 
            case 49194: 
            case 49201: 
            case 49202: 
            case 49272: 
            case 49273: 
            case 49292: 
            case 49293: {
                return this.cfr_renamed_3180(18);
            }
            case 49158: 
            case 49159: 
            case 49160: 
            case 49161: 
            case 49162: 
            case 49187: 
            case 49188: 
            case 49195: 
            case 49196: 
            case 49266: 
            case 49267: 
            case 49286: 
            case 49287: 
            case 52244: 
            case 58388: 
            case 58389: {
                return this.cfr_renamed_3181(17);
            }
            case 49168: 
            case 49169: 
            case 49170: 
            case 49171: 
            case 49172: 
            case 49191: 
            case 49192: 
            case 49199: 
            case 49200: 
            case 49270: 
            case 49271: 
            case 49290: 
            case 49291: 
            case 52243: 
            case 58386: 
            case 58387: {
                return this.cfr_renamed_3181(19);
            }
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 10: 
            case 47: 
            case 53: 
            case 59: 
            case 60: 
            case 61: 
            case 65: 
            case 132: 
            case 150: 
            case 156: 
            case 157: 
            case 186: 
            case 192: 
            case 49274: 
            case 49275: 
            case 49308: 
            case 49309: 
            case 49312: 
            case 49313: 
            case 58384: 
            case 58385: {
                return this.cfr_renamed_3182();
            }
        }
        throw new spryad(80);
    }

    public sproc cfr_renamed_3180(int arg0) {
        sprivc sprivc2 = this;
        sprivc sprivc3 = this;
        return new sprwad(arg0, sprivc2.cfr_renamed_119, sprivc2.cfr_renamed_3, sprivc3.cfr_renamed_91, sprivc3.cfr_renamed_1);
    }

    public sproc cfr_renamed_3182() {
        return new sproad(this.cfr_renamed_119);
    }

    public sproc cfr_renamed_3179(int arg0) {
        return new sprhxc(arg0, this.cfr_renamed_119, null);
    }

    public sprivc() {
    }

    @Override
    public int[] cfr_renamed_3048() {
        int[] nArray = new int[6];
        nArray[0] = 49199;
        nArray[1] = 49191;
        nArray[2] = 49171;
        nArray[3] = 156;
        nArray[4] = 60;
        nArray[5] = 47;
        return nArray;
    }

    public sproc cfr_renamed_3181(int arg0) {
        sprivc sprivc2 = this;
        sprivc sprivc3 = this;
        return new sprouc(arg0, sprivc2.cfr_renamed_119, sprivc2.cfr_renamed_3, sprivc3.cfr_renamed_91, sprivc3.cfr_renamed_1);
    }

    public sprivc(sprye arg0) {
        super(arg0);
    }

    public sproc cfr_renamed_3178(int arg0) {
        return new sprtyc(arg0, this.cfr_renamed_119, null);
    }

    @Override
    public sprmc cfr_renamed_2471() throws IOException {
        switch (this.cfr_renamed_4) {
            case 10: 
            case 13: 
            case 16: 
            case 19: 
            case 22: 
            case 49155: 
            case 49160: 
            case 49165: 
            case 49170: {
                sprivc sprivc2 = this;
                return sprivc2.cfr_renamed_2.cfr_renamed_3060(sprivc2.cfr_renamed_112, 7, 2);
            }
            case 52243: 
            case 52244: 
            case 52245: {
                sprivc sprivc3 = this;
                return sprivc3.cfr_renamed_2.cfr_renamed_3060(sprivc3.cfr_renamed_112, 102, 0);
            }
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 49156: 
            case 49161: 
            case 49166: 
            case 49171: {
                sprivc sprivc4 = this;
                return sprivc4.cfr_renamed_2.cfr_renamed_3060(sprivc4.cfr_renamed_112, 8, 2);
            }
            case 60: 
            case 62: 
            case 63: 
            case 64: 
            case 103: 
            case 49187: 
            case 49189: 
            case 49191: 
            case 49193: {
                sprivc sprivc5 = this;
                return sprivc5.cfr_renamed_2.cfr_renamed_3060(sprivc5.cfr_renamed_112, 8, 3);
            }
            case 49308: 
            case 49310: {
                sprivc sprivc6 = this;
                return sprivc6.cfr_renamed_2.cfr_renamed_3060(sprivc6.cfr_renamed_112, 15, 0);
            }
            case 49312: 
            case 49314: {
                sprivc sprivc7 = this;
                return sprivc7.cfr_renamed_2.cfr_renamed_3060(sprivc7.cfr_renamed_112, 16, 0);
            }
            case 156: 
            case 158: 
            case 160: 
            case 162: 
            case 164: 
            case 49195: 
            case 49197: 
            case 49199: 
            case 49201: {
                sprivc sprivc8 = this;
                return sprivc8.cfr_renamed_2.cfr_renamed_3060(sprivc8.cfr_renamed_112, 10, 0);
            }
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 49157: 
            case 49162: 
            case 49167: 
            case 49172: {
                sprivc sprivc9 = this;
                return sprivc9.cfr_renamed_2.cfr_renamed_3060(sprivc9.cfr_renamed_112, 9, 2);
            }
            case 61: 
            case 104: 
            case 105: 
            case 106: 
            case 107: {
                sprivc sprivc10 = this;
                return sprivc10.cfr_renamed_2.cfr_renamed_3060(sprivc10.cfr_renamed_112, 9, 3);
            }
            case 49188: 
            case 49190: 
            case 49192: 
            case 49194: {
                sprivc sprivc11 = this;
                return sprivc11.cfr_renamed_2.cfr_renamed_3060(sprivc11.cfr_renamed_112, 9, 4);
            }
            case 49309: 
            case 49311: {
                sprivc sprivc12 = this;
                return sprivc12.cfr_renamed_2.cfr_renamed_3060(sprivc12.cfr_renamed_112, 17, 0);
            }
            case 49313: 
            case 49315: {
                sprivc sprivc13 = this;
                return sprivc13.cfr_renamed_2.cfr_renamed_3060(sprivc13.cfr_renamed_112, 18, 0);
            }
            case 157: 
            case 159: 
            case 161: 
            case 163: 
            case 165: 
            case 49196: 
            case 49198: 
            case 49200: 
            case 49202: {
                sprivc sprivc14 = this;
                return sprivc14.cfr_renamed_2.cfr_renamed_3060(sprivc14.cfr_renamed_112, 11, 0);
            }
            case 65: 
            case 66: 
            case 67: 
            case 68: 
            case 69: {
                sprivc sprivc15 = this;
                return sprivc15.cfr_renamed_2.cfr_renamed_3060(sprivc15.cfr_renamed_112, 12, 2);
            }
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 49266: 
            case 49268: 
            case 49270: 
            case 49272: {
                sprivc sprivc16 = this;
                return sprivc16.cfr_renamed_2.cfr_renamed_3060(sprivc16.cfr_renamed_112, 12, 3);
            }
            case 49274: 
            case 49276: 
            case 49278: 
            case 49280: 
            case 49282: 
            case 49286: 
            case 49288: 
            case 49290: 
            case 49292: {
                sprivc sprivc17 = this;
                return sprivc17.cfr_renamed_2.cfr_renamed_3060(sprivc17.cfr_renamed_112, 19, 0);
            }
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: {
                sprivc sprivc18 = this;
                return sprivc18.cfr_renamed_2.cfr_renamed_3060(sprivc18.cfr_renamed_112, 13, 2);
            }
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                sprivc sprivc19 = this;
                return sprivc19.cfr_renamed_2.cfr_renamed_3060(sprivc19.cfr_renamed_112, 13, 3);
            }
            case 49275: 
            case 49277: 
            case 49279: 
            case 49281: 
            case 49283: 
            case 49287: 
            case 49289: 
            case 49291: 
            case 49293: {
                sprivc sprivc20 = this;
                return sprivc20.cfr_renamed_2.cfr_renamed_3060(sprivc20.cfr_renamed_112, 20, 0);
            }
            case 49267: 
            case 49269: 
            case 49271: 
            case 49273: {
                sprivc sprivc21 = this;
                return sprivc21.cfr_renamed_2.cfr_renamed_3060(sprivc21.cfr_renamed_112, 13, 4);
            }
            case 58384: 
            case 58386: 
            case 58388: 
            case 58398: {
                sprivc sprivc22 = this;
                return sprivc22.cfr_renamed_2.cfr_renamed_3060(sprivc22.cfr_renamed_112, 100, 2);
            }
            case 1: {
                sprivc sprivc23 = this;
                while (false) {
                }
                return sprivc23.cfr_renamed_2.cfr_renamed_3060(sprivc23.cfr_renamed_112, 0, 1);
            }
            case 2: 
            case 49153: 
            case 49158: 
            case 49163: 
            case 49168: {
                sprivc sprivc24 = this;
                return sprivc24.cfr_renamed_2.cfr_renamed_3060(sprivc24.cfr_renamed_112, 0, 2);
            }
            case 59: {
                sprivc sprivc25 = this;
                return sprivc25.cfr_renamed_2.cfr_renamed_3060(sprivc25.cfr_renamed_112, 0, 3);
            }
            case 4: {
                sprivc sprivc26 = this;
                return sprivc26.cfr_renamed_2.cfr_renamed_3060(sprivc26.cfr_renamed_112, 2, 1);
            }
            case 5: 
            case 49154: 
            case 49159: 
            case 49164: 
            case 49169: {
                sprivc sprivc27 = this;
                return sprivc27.cfr_renamed_2.cfr_renamed_3060(sprivc27.cfr_renamed_112, 2, 2);
            }
            case 58385: 
            case 58387: 
            case 58389: 
            case 58399: {
                sprivc sprivc28 = this;
                return sprivc28.cfr_renamed_2.cfr_renamed_3060(sprivc28.cfr_renamed_112, 101, 2);
            }
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: {
                sprivc sprivc29 = this;
                return sprivc29.cfr_renamed_2.cfr_renamed_3060(sprivc29.cfr_renamed_112, 14, 2);
            }
        }
        throw new spryad(80);
    }
}

