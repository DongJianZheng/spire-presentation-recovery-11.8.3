/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhua;
import com.spire.presentation.packages.sprliy;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprnma;
import com.spire.presentation.packages.sprrma;
import com.spire.presentation.packages.sprsta;
import com.spire.presentation.packages.sprwla;
import com.spire.presentation.packages.spryoa;
import com.spire.presentation.packages.spryua;
import java.security.SecureRandom;
import java.util.Vector;

public class sprcqa
extends sprrma {
    private int[] cfr_renamed_0;
    public sprhua[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_1013() {
        if (this.cfr_renamed_1014()) {
            return;
        }
        if (this.cfr_renamed_1015()) {
            return;
        }
        this.cfr_renamed_1016();
    }

    public boolean cfr_renamed_1017() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1018() throws RuntimeException {
        if (!this.cfr_renamed_2) {
            throw new RuntimeException();
        }
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_1019(sprrma arg0) {
        spryua[] spryuaArray;
        spryua[] spryuaArray2;
        spryua spryua2;
        Object object;
        if (this.cfr_renamed_1 != arg0.cfr_renamed_1) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("\u0007|rT\u0010U,C.U-S!V\u0006S%V$\u0014#U-J5N%y\u000fx\r[4H)Bz\u001a\u0002\u000b`R!I`[`^)\\&_2_.N`^%]2_%\u001a!T$\u001a4R5I`Y!T.U4\u001a\"_`Y/L%H4_$\u001a4Ua"));
        }
        if (arg0 instanceof sprwla) {
            arg0.cfr_renamed_1019(this);
            return;
        }
        sprhua[] sprhuaArray = new sprhua[this.cfr_renamed_1];
        int n = object = 0;
        while (n < this.cfr_renamed_1) {
            sprhuaArray[object++] = new sprhua((int)this.cfr_renamed_1);
            n = object;
        }
        while ((spryua2 = arg0.cfr_renamed_1020((sprhua)this.cfr_renamed_4)).cfr_renamed_805()) {
        }
        sprcqa sprcqa2 = this;
        if (spryua2 instanceof sprsta) {
            sprsta[] sprstaArray = new sprsta[sprcqa2.cfr_renamed_1];
            spryuaArray2 = sprstaArray;
            sprstaArray[this.cfr_renamed_1 - true] = sprsta.cfr_renamed_1021((sprwla)arg0);
            spryuaArray = spryuaArray2;
        } else {
            spryoa[] spryoaArray = new spryoa[sprcqa2.cfr_renamed_1];
            spryuaArray2 = spryoaArray;
            spryoaArray[this.cfr_renamed_1 - true] = spryoa.cfr_renamed_1022((sprcqa)arg0);
            spryuaArray = spryuaArray2;
        }
        spryuaArray[this.cfr_renamed_1 - 2] = spryua2;
        reference v5 = this.cfr_renamed_1 - 3;
        Object object2 = v5;
        object = v5;
        while (object2 >= 0) {
            spryuaArray2[--object] = (spryua)spryuaArray2[object + 1].cfr_renamed_955(spryua2);
            object2 = object;
        }
        if (arg0 instanceof sprwla) {
            Object object3 = object = 0;
            while (object3 < this.cfr_renamed_1) {
                int n2;
                int n3 = n2 = 0;
                while (n3 < this.cfr_renamed_1) {
                    if (spryuaArray2[object].cfr_renamed_1012((int)(this.cfr_renamed_1 - n2 - true))) {
                        sprhuaArray[this.cfr_renamed_1 - n2 - true].cfr_renamed_949((int)(this.cfr_renamed_1 - object - true));
                    }
                    n3 = ++n2;
                }
                object3 = ++object;
            }
        } else {
            Object object4 = object = 0;
            while (object4 < this.cfr_renamed_1) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < this.cfr_renamed_1) {
                    if (spryuaArray2[object].cfr_renamed_1012(n4)) {
                        sprhuaArray[this.cfr_renamed_1 - n4 - true].cfr_renamed_949((int)(this.cfr_renamed_1 - object - true));
                    }
                    n5 = ++n4;
                }
                object4 = ++object;
            }
        }
        sprcqa sprcqa3 = this;
        sprcqa3.cfr_renamed_3.addElement(arg0);
        sprcqa3.cfr_renamed_2.addElement(sprhuaArray);
        sprrma sprrma2 = arg0;
        sprrma2.cfr_renamed_3.addElement(this);
        sprrma2.cfr_renamed_2.addElement(this.cfr_renamed_1023(sprhuaArray));
    }

    private /* synthetic */ boolean cfr_renamed_1014() {
        int n;
        boolean bl = false;
        int n2 = 0;
        this.cfr_renamed_4 = (int)new sprhua((int)(this.cfr_renamed_1 + true));
        this.cfr_renamed_4.cfr_renamed_949(0);
        this.cfr_renamed_4.cfr_renamed_949((int)this.cfr_renamed_1);
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_1 && !bl) {
            sprcqa sprcqa2 = this;
            sprcqa2.cfr_renamed_4.cfr_renamed_949(n);
            ++n2;
            bl = sprcqa2.cfr_renamed_4.cfr_renamed_1000();
            if (bl) {
                sprcqa sprcqa3 = this;
                sprcqa3.cfr_renamed_2 = true;
                sprcqa3.cfr_renamed_4 = n;
                return bl;
            }
            sprcqa sprcqa4 = this;
            sprcqa4.cfr_renamed_4.cfr_renamed_965(n);
            bl = sprcqa4.cfr_renamed_4.cfr_renamed_1000();
            n3 = ++n;
        }
        return bl;
    }

    public boolean cfr_renamed_1024() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ boolean cfr_renamed_1016() {
        boolean bl = false;
        sprcqa sprcqa2 = this;
        this.cfr_renamed_4 = (int)new sprhua((int)(this.cfr_renamed_1 + true));
        int n = 0;
        while (!bl) {
            sprcqa sprcqa3 = this;
            ++n;
            sprcqa3.cfr_renamed_4.cfr_renamed_988();
            sprcqa sprcqa4 = this;
            sprcqa3.cfr_renamed_4.cfr_renamed_949((int)sprcqa4.cfr_renamed_1);
            sprcqa4.cfr_renamed_4.cfr_renamed_949(0);
            if (!sprcqa3.cfr_renamed_4.cfr_renamed_1000()) continue;
            bl = true;
            return true;
        }
        return bl;
    }

    private /* synthetic */ void cfr_renamed_809() {
        int n;
        sprhua[] sprhuaArray = new sprhua[this.cfr_renamed_1 - true];
        this.cfr_renamed_1 = new sprhua[this.cfr_renamed_1];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = new sprhua((int)this.cfr_renamed_1, sprliy.cfr_renamed_9("7f?l"));
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1 - true) {
            int n4 = n++;
            sprhuaArray[n4] = new sprhua(1, sprlxg.cfr_renamed_9("\u000ft\u0005")).cfr_renamed_979((int)(this.cfr_renamed_1 + n4)).cfr_renamed_998((sprhua)this.cfr_renamed_4);
            n3 = n;
        }
        int n5 = n = 1;
        while (n5 <= Math.abs((int)(this.cfr_renamed_1 >> 1))) {
            int n6;
            int n7 = n6 = 1;
            while (n7 <= this.cfr_renamed_1) {
                if (sprhuaArray[this.cfr_renamed_1 - (n << 1)].cfr_renamed_1012((int)(this.cfr_renamed_1 - n6))) {
                    this.cfr_renamed_1[n6 - 1].cfr_renamed_949((int)(this.cfr_renamed_1 - n));
                }
                n7 = ++n6;
            }
            n5 = ++n;
        }
        int n8 = n = Math.abs((int)(this.cfr_renamed_1 >> 1)) + 1;
        while (n8 <= this.cfr_renamed_1) {
            this.cfr_renamed_1[(n << 1) - this.cfr_renamed_1 - 1].cfr_renamed_949((int)(this.cfr_renamed_1 - n++));
            n8 = n;
        }
    }

    @Override
    public void cfr_renamed_1025() {
        if (this.cfr_renamed_1014()) {
            return;
        }
        if (this.cfr_renamed_1015()) {
            return;
        }
        this.cfr_renamed_1016();
    }

    @Override
    public spryua cfr_renamed_1020(sprhua arg0) {
        int n;
        sprnma sprnma2 = new sprnma(arg0, this);
        int n2 = n = sprnma2.cfr_renamed_813();
        while (n2 > 1) {
            sprnma sprnma3;
            int n3;
            do {
                int n4;
                spryoa spryoa2 = new spryoa(this, new SecureRandom());
                sprnma sprnma4 = new sprnma(2, spryoa.cfr_renamed_1026(this));
                sprnma4.cfr_renamed_1027(1, spryoa2);
                sprnma sprnma5 = new sprnma(sprnma4);
                int n5 = n4 = 1;
                while (n5 <= this.cfr_renamed_1 - true) {
                    sprnma sprnma6 = sprnma5;
                    sprnma5 = sprnma6.cfr_renamed_1028(sprnma6, sprnma2);
                    sprnma5 = sprnma5.cfr_renamed_1029(sprnma4);
                    n5 = ++n4;
                }
                sprnma3 = sprnma5.cfr_renamed_1030(sprnma2);
                n3 = sprnma3.cfr_renamed_813();
                n = sprnma2.cfr_renamed_813();
            } while (n3 == 0 || n3 == n);
            n2 = n = (n3 << 1 > n ? sprnma2.cfr_renamed_1031(sprnma3) : new sprnma(sprnma3)).cfr_renamed_813();
        }
        return sprnma2.cfr_renamed_1032(0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcqa(int n) {
        void arg0;
        sprcqa sprcqa2 = this;
        this.cfr_renamed_2 = false;
        sprcqa2.cfr_renamed_3 = false;
        sprcqa2.cfr_renamed_0 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(sprliy.cfr_renamed_9("\u0006\u0003\u0000V\u001eWMA\b\u0003\fWMO\bB\u001eWM\u0010"));
        }
        sprcqa sprcqa3 = this;
        sprcqa3.cfr_renamed_1 = arg0;
        sprcqa3.cfr_renamed_1025();
        sprcqa3.cfr_renamed_809();
        sprcqa sprcqa4 = this;
        sprcqa3.cfr_renamed_3 = new Vector();
        sprcqa3.cfr_renamed_2 = new Vector();
    }

    /*
     * WARNING - void declaration
     */
    public sprcqa(int n, sprhua sprhua2) throws RuntimeException {
        int n2;
        void arg0;
        void arg1;
        sprcqa sprcqa2 = this;
        this.cfr_renamed_2 = false;
        sprcqa2.cfr_renamed_3 = false;
        sprcqa2.cfr_renamed_0 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("$_'H%_`W5I4\u001a\"_`[4\u001a,_!I4\u001as"));
        }
        if (arg1.cfr_renamed_806() != arg0 + true) {
            throw new RuntimeException();
        }
        if (!arg1.cfr_renamed_1000()) {
            throw new RuntimeException();
        }
        sprcqa sprcqa3 = this;
        sprcqa3.cfr_renamed_1 = arg0;
        sprcqa3.cfr_renamed_4 = arg1;
        this.cfr_renamed_809();
        int n3 = 2;
        int n4 = n2 = 1;
        while (n4 < this.cfr_renamed_4.cfr_renamed_806() - 1) {
            if (this.cfr_renamed_4.cfr_renamed_1012(n2)) {
                if (++n3 == 3) {
                    this.cfr_renamed_4 = n2;
                }
                if (n3 <= 5) {
                    this.cfr_renamed_0[n3 - 3] = n2;
                }
            }
            n4 = ++n2;
        }
        if (n3 == 3) {
            this.cfr_renamed_2 = true;
        }
        if (n3 == 5) {
            this.cfr_renamed_3 = true;
        }
        sprcqa sprcqa4 = this;
        sprcqa4.cfr_renamed_3 = new Vector();
        sprcqa sprcqa5 = this;
        sprcqa4.cfr_renamed_2 = new Vector();
    }

    public int[] cfr_renamed_1033() throws RuntimeException {
        if (!this.cfr_renamed_3) {
            throw new RuntimeException();
        }
        int[] nArray = new int[3];
        System.arraycopy(this.cfr_renamed_0, 0, nArray, 0, 3);
        return nArray;
    }

    private /* synthetic */ boolean cfr_renamed_1015() {
        int n;
        boolean bl = false;
        int n2 = 0;
        this.cfr_renamed_4 = (int)new sprhua((int)(this.cfr_renamed_1 + true));
        this.cfr_renamed_4.cfr_renamed_949(0);
        this.cfr_renamed_4.cfr_renamed_949((int)this.cfr_renamed_1);
        int n3 = n = 1;
        while (n3 <= this.cfr_renamed_1 - 3 && !bl) {
            int n4 = n;
            this.cfr_renamed_4.cfr_renamed_949(n4);
            int n5 = n4 + 1;
            while (n5 <= this.cfr_renamed_1 - 2 && !bl) {
                int n6;
                int n7 = n6;
                this.cfr_renamed_4.cfr_renamed_949(n7);
                int n8 = n7 + 1;
                while (n8 <= this.cfr_renamed_1 - true && !bl) {
                    int n9;
                    boolean bl2;
                    int n10;
                    sprcqa sprcqa2 = this;
                    sprcqa2.cfr_renamed_4.cfr_renamed_949(n10);
                    if ((sprcqa2.cfr_renamed_1 & 1) != 0) {
                        bl2 = true;
                        n9 = n;
                    } else {
                        bl2 = false;
                        n9 = n;
                    }
                    if (bl2 | (n9 & 1) != 0 | (n6 & 1) != 0 | (n10 & 1) != 0) {
                        ++n2;
                        bl = this.cfr_renamed_4.cfr_renamed_1000();
                        if (bl) {
                            sprcqa sprcqa3 = this;
                            sprcqa3.cfr_renamed_3 = true;
                            sprcqa3.cfr_renamed_0[0] = n;
                            sprcqa3.cfr_renamed_0[1] = n6;
                            sprcqa3.cfr_renamed_0[2] = n10;
                            return bl;
                        }
                    }
                    this.cfr_renamed_4.cfr_renamed_965(n10++);
                    n8 = n10;
                }
                this.cfr_renamed_4.cfr_renamed_965(n6++);
                n5 = n6;
            }
            this.cfr_renamed_4.cfr_renamed_965(n++);
            n3 = n;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public sprcqa(int n, boolean bl) {
        sprcqa sprcqa2;
        void arg1;
        void arg0;
        sprcqa sprcqa3 = this;
        this.cfr_renamed_2 = false;
        sprcqa3.cfr_renamed_3 = false;
        sprcqa3.cfr_renamed_0 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(sprliy.cfr_renamed_9("\u0006\u0003\u0000V\u001eWMA\b\u0003\fWMO\bB\u001eWM\u0010"));
        }
        this.cfr_renamed_1 = arg0;
        if (arg1 != false) {
            sprcqa sprcqa4 = this;
            sprcqa2 = sprcqa4;
            sprcqa4.cfr_renamed_1025();
        } else {
            sprcqa sprcqa5 = this;
            sprcqa2 = sprcqa5;
            sprcqa5.cfr_renamed_1013();
        }
        sprcqa2.cfr_renamed_809();
        sprcqa sprcqa6 = this;
        sprcqa6.cfr_renamed_3 = new Vector();
        sprcqa6.cfr_renamed_2 = new Vector();
    }

    public sprhua cfr_renamed_1034(int arg0) {
        return new sprhua(this.cfr_renamed_1[arg0]);
    }
}

