/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class spryvo {
    private long cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private int[] cfr_renamed_132;
    private int cfr_renamed_102;
    private double cfr_renamed_93;
    private long cfr_renamed_86;
    private int cfr_renamed_152;
    private static final int cfr_renamed_112 = 1;
    private int cfr_renamed_119;
    private double cfr_renamed_91;
    private long cfr_renamed_0;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 4;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public boolean cfr_renamed_17457() {
        return this.cfr_renamed_4 == 2 && this.cfr_renamed_132.length == 3 && (this.cfr_renamed_132[0] & 0xFFFF) == 16 && (this.cfr_renamed_132[1] & 0xFFFF) == 16 && (this.cfr_renamed_132[2] & 0xFFFF) == 16;
    }

    private static /* synthetic */ long cfr_renamed_17458(sprmzo arg0, boolean arg1) {
        long l = arg0.cfr_renamed_13220();
        if (!arg1) {
            l = sproup.cfr_renamed_17452(l);
        }
        return l;
    }

    private /* synthetic */ boolean cfr_renamed_17459() {
        boolean bl;
        boolean bl2 = bl = (this.cfr_renamed_132[0] & 0xFFFF) == 4 || (this.cfr_renamed_132[0] & 0xFFFF) == 8 || (this.cfr_renamed_132[0] & 0xFFFF) == 16;
        return bl && this.cfr_renamed_17460();
    }

    public int cfr_renamed_17461() {
        return this.cfr_renamed_4;
    }

    public static boolean cfr_renamed_17462(spreen arg0) {
        short s = new sprujo(arg0).cfr_renamed_12254();
        return s == 18761 || s == 19789;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_17463(sprmzo arg0) {
        int n;
        boolean bl;
        boolean bl2 = bl = arg0.cfr_renamed_12254() == 19789;
        if ((spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF) != 42) {
            return;
        }
        sprmzo sprmzo2 = arg0;
        long l = spryvo.cfr_renamed_17458(sprmzo2, bl);
        sprmzo2.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_0 + (l & 0xFFFFFFFFL));
        int n2 = spryvo.cfr_renamed_17464(sprmzo2, bl);
        long l2 = sprmzo2.cfr_renamed_14060().cfr_renamed_3274();
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            sprmzo sprmzo3 = arg0;
            sprmzo sprmzo4 = arg0;
            sprmzo4.cfr_renamed_14060().cfr_renamed_11548(l2);
            l2 += 12L;
            int n4 = spryvo.cfr_renamed_17464(sprmzo4, bl);
            int n5 = spryvo.cfr_renamed_17464(sprmzo3, bl);
            long l3 = spryvo.cfr_renamed_17458(sprmzo3, bl);
            if (((n5 & 0xFFFF) == 1 || (n5 & 0xFFFF) == 2) && (l3 & 0xFFFFFFFFL) > 4L || (n5 & 0xFFFF) == 3 && (l3 & 0xFFFFFFFFL) > 2L || (n5 & 0xFFFF) == 4 && (l3 & 0xFFFFFFFFL) > 1L || (n5 & 0xFFFF) == 5) {
                sprmzo sprmzo5 = arg0;
                long l4 = spryvo.cfr_renamed_17458(sprmzo5, bl);
                sprmzo5.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_0 + (l4 & 0xFFFFFFFFL));
            }
            switch (n4) {
                case 256: {
                    this.cfr_renamed_86 = (n5 & 0xFFFF) == 3 ? (long)spryvo.cfr_renamed_17464(arg0, bl) : spryvo.cfr_renamed_17458(arg0, bl);
                    break;
                }
                case 257: {
                    this.cfr_renamed_137 = (n5 & 0xFFFF) == 3 ? (long)spryvo.cfr_renamed_17464(arg0, bl) : spryvo.cfr_renamed_17458(arg0, bl);
                    break;
                }
                case 282: {
                    this.cfr_renamed_93 = spryvo.cfr_renamed_17465(arg0, bl);
                    break;
                }
                case 283: {
                    this.cfr_renamed_91 = spryvo.cfr_renamed_17465(arg0, bl);
                    break;
                }
                case 262: {
                    this.cfr_renamed_4 = spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF;
                    break;
                }
                case 296: {
                    this.cfr_renamed_79 = spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF;
                    break;
                }
                case 259: {
                    this.cfr_renamed_152 = spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF;
                    break;
                }
                case 258: {
                    this.cfr_renamed_132 = spryvo.cfr_renamed_17466(arg0, bl, l3);
                    break;
                }
                case 284: {
                    this.cfr_renamed_102 = spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF;
                    break;
                }
                case 277: {
                    this.cfr_renamed_107 = spryvo.cfr_renamed_17464(arg0, bl);
                    break;
                }
                case 332: {
                    this.cfr_renamed_3 = spryvo.cfr_renamed_17464(arg0, bl) & 0xFFFF;
                    break;
                }
                case 334: {
                    this.cfr_renamed_119 = spryvo.cfr_renamed_17464(arg0, bl);
                    break;
                }
                case 274: {
                    this.cfr_renamed_1 = spryvo.cfr_renamed_17464(arg0, bl);
                    break;
                }
            }
            n3 = ++n;
        }
        return;
    }

    @sprtea
    public int cfr_renamed_17467() {
        return this.cfr_renamed_79;
    }

    public int cfr_renamed_17468() {
        if (this.cfr_renamed_1 == 0) {
            return 1;
        }
        return this.cfr_renamed_1;
    }

    private static /* synthetic */ int cfr_renamed_17464(sprmzo arg0, boolean arg1) {
        int n = arg0.cfr_renamed_13218();
        if (!arg1) {
            n = sproup.cfr_renamed_17450(n);
        }
        return n;
    }

    public double cfr_renamed_17469() {
        return this.cfr_renamed_93;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_17470() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 5: 
            case 32773: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public spryvo(byte[] byArray) {
        this(new sprpdja((byte[])arg0));
        void arg0;
    }

    private /* synthetic */ boolean cfr_renamed_17471() {
        return (this.cfr_renamed_132[0] & 0xFFFF) == 0 && this.cfr_renamed_17472();
    }

    private /* synthetic */ boolean cfr_renamed_17473() {
        if (this.cfr_renamed_102 != 1) {
            return false;
        }
        if (!this.cfr_renamed_17474()) {
            return false;
        }
        return this.cfr_renamed_17475();
    }

    private static /* synthetic */ double cfr_renamed_17465(sprmzo arg0, boolean arg1) {
        sprmzo sprmzo2 = arg0;
        long l = spryvo.cfr_renamed_17458(sprmzo2, arg1);
        long l2 = spryvo.cfr_renamed_17458(sprmzo2, arg1);
        if ((l2 & 0xFFFFFFFFL) != 0L) {
            return (l & 0xFFFFFFFFL) / (l2 & 0xFFFFFFFFL);
        }
        return 0.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_17474() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 5: 
            case 6: 
            case 32773: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public spryvo(sprmzo sprmzo2) {
        void arg0;
        spryvo spryvo2 = this;
        spryvo spryvo3 = this;
        spryvo spryvo4 = this;
        spryvo spryvo5 = this;
        spryvo5.cfr_renamed_4 = Short.MAX_VALUE;
        spryvo5.cfr_renamed_79 = 2;
        spryvo4.cfr_renamed_152 = 1;
        spryvo4.cfr_renamed_102 = 1;
        spryvo3.cfr_renamed_3 = 1;
        spryvo3.cfr_renamed_107 = 1;
        spryvo2.cfr_renamed_119 = 4;
        int[] nArray = new int[1];
        nArray[0] = 0;
        spryvo2.cfr_renamed_132 = nArray;
        this.cfr_renamed_0 = arg0.cfr_renamed_14060().cfr_renamed_3274();
        this.cfr_renamed_17463(sprmzo2);
    }

    public int cfr_renamed_17476() {
        if ((this.cfr_renamed_137 & 0xFFFFFFFFL) != 0L) {
            return (int)(this.cfr_renamed_137 & 0xFFFFFFFFL);
        }
        return 100;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_17477(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            boolean bl = spryvo.cfr_renamed_17462(sprpdja2);
            return bl;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public spryvo(spreen spreen2) {
        this(new sprmzo((spreen)arg0));
        void arg0;
    }

    private /* synthetic */ boolean cfr_renamed_17478() {
        return this.cfr_renamed_3 == 1 && this.cfr_renamed_119 == 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_17460() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 2: 
            case 32773: {
                return true;
            }
        }
        return false;
    }

    public double cfr_renamed_17479() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_17472() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 32773: {
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ int[] cfr_renamed_17466(sprmzo arg0, boolean arg1, long arg2) {
        int n;
        int[] nArray = new int[(int)(arg2 & 0xFFFFFFFFL)];
        int n2 = n = 0;
        while (n2 < nArray.length) {
            nArray[n++] = spryvo.cfr_renamed_17464(arg0, arg1);
            n2 = n;
        }
        return nArray;
    }

    public int cfr_renamed_17480() {
        if ((this.cfr_renamed_86 & 0xFFFFFFFFL) != 0L) {
            return (int)(this.cfr_renamed_86 & 0xFFFFFFFFL);
        }
        return 100;
    }

    private /* synthetic */ boolean cfr_renamed_17475() {
        int n;
        if (this.cfr_renamed_132.length != (this.cfr_renamed_107 & 0xFFFF)) {
            return false;
        }
        boolean bl = (this.cfr_renamed_132[0] & 0xFFFF) == 8 || (this.cfr_renamed_132[0] & 0xFFFF) == 16;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_132.length) {
            bl = bl && this.cfr_renamed_132[n] == this.cfr_renamed_132[0];
            n2 = ++n;
        }
        return bl;
    }

    private /* synthetic */ boolean cfr_renamed_17481() {
        if (this.cfr_renamed_102 != 1) {
            return false;
        }
        if (!this.cfr_renamed_17482()) {
            return false;
        }
        if (!this.cfr_renamed_17478()) {
            return false;
        }
        return this.cfr_renamed_17475();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_13223() {
        if (this.cfr_renamed_79 != 1 && this.cfr_renamed_79 != 2 && this.cfr_renamed_79 != 3) {
            return false;
        }
        switch (this.cfr_renamed_17461()) {
            case 0: 
            case 1: {
                return this.cfr_renamed_17471() || this.cfr_renamed_17459();
            }
            case 3: {
                return this.cfr_renamed_17483();
            }
            case 2: {
                return this.cfr_renamed_17473();
            }
            case 5: {
                return this.cfr_renamed_17481();
            }
        }
        return false;
    }

    private /* synthetic */ boolean cfr_renamed_17483() {
        boolean bl;
        boolean bl2 = bl = (this.cfr_renamed_132[0] & 0xFFFF) == 1 || (this.cfr_renamed_132[0] & 0xFFFF) == 4 || (this.cfr_renamed_132[0] & 0xFFFF) == 8;
        return bl && this.cfr_renamed_17470();
    }

    public int cfr_renamed_2860() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_17482() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 5: 
            case 6: 
            case 32773: {
                return true;
            }
        }
        return false;
    }
}

