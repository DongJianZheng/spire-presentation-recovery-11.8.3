/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbul;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprgrl;
import com.spire.presentation.packages.sprgrm;
import com.spire.presentation.packages.sprhxl;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlrm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproci;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprptm;
import com.spire.presentation.packages.sprqlm;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprqul;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsol;
import com.spire.presentation.packages.sprtsm;
import com.spire.presentation.packages.sprutm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvmm;
import com.spire.presentation.packages.spryq;
import com.spire.presentation.packages.sprznl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprvsl {
    private sprsol cfr_renamed_132;
    private char[] cfr_renamed_102;
    private final BigInteger cfr_renamed_93;
    private sprtsm cfr_renamed_86;
    private sprgem cfr_renamed_152;
    private sprfan cfr_renamed_112;
    private sprcf cfr_renamed_119;
    private sprqtm cfr_renamed_91;
    private List cfr_renamed_0;
    private sprlrm cfr_renamed_1;
    private sprigm cfr_renamed_2;
    private int cfr_renamed_3;
    private sprqlm[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvsl cfr_renamed_10980(sprnbm sprnbm2) {
        void arg0;
        return this.cfr_renamed_10964(new sprigm((sprnbm)arg0));
    }

    public sprvsl cfr_renamed_10846(sprnbm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_86.cfr_renamed_10846(arg0);
        }
        return this;
    }

    public sprvsl cfr_renamed_10965(sprvhm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_86.cfr_renamed_10965(arg0);
        }
        return this;
    }

    public sprbul cfr_renamed_1451() throws sprcsl {
        Object object;
        Object object2;
        Object object3;
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_93));
        if (!this.cfr_renamed_152.cfr_renamed_29()) {
            sprvsl sprvsl2 = this;
            sprvsl2.cfr_renamed_86.cfr_renamed_9837(sprvsl2.cfr_renamed_152.cfr_renamed_31());
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_86.cfr_renamed_1451());
        if (!this.cfr_renamed_0.isEmpty()) {
            object3 = new sprrvm();
            Object object4 = object2 = this.cfr_renamed_0.iterator();
            while (object4.hasNext()) {
                object = (spryq)object2.next();
                object4 = object2;
                ((sprrvm)object3).cfr_renamed_5004(new sprqlm(object.cfr_renamed_324(), object.cfr_renamed_97()));
            }
            sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object3));
        }
        object3 = sprptm.cfr_renamed_23(new sprcen(sprrvm2));
        object2 = new sprgrm();
        if (this.cfr_renamed_119 != null) {
            object = ((sprptm)object3).cfr_renamed_4351();
            if (((sprikm)object).cfr_renamed_1485() == null || ((sprikm)object).cfr_renamed_1157() == null) {
                sprvhm sprvhm2 = ((sprptm)object3).cfr_renamed_4351().cfr_renamed_1157();
                sprgrl sprgrl2 = new sprgrl(sprvhm2);
                if (this.cfr_renamed_2 != null) {
                    sprgrl2.cfr_renamed_10952(this.cfr_renamed_2);
                } else {
                    sprqul sprqul2 = new sprqul(this.cfr_renamed_132);
                    sprgrl2.cfr_renamed_10953(sprqul2, this.cfr_renamed_102);
                }
                object2 = new sprgrm(sprgrl2.cfr_renamed_7373(this.cfr_renamed_119));
            } else {
                sprgrl sprgrl3 = new sprgrl((sprptm)object3);
                object2 = new sprgrm(sprgrl3.cfr_renamed_7373(this.cfr_renamed_119));
            }
        } else if (this.cfr_renamed_1 != null) {
            sprvsl sprvsl3 = this;
            object2 = new sprgrm(sprvsl3.cfr_renamed_3, sprvsl3.cfr_renamed_1);
        } else if (this.cfr_renamed_91 != null) {
            object2 = new sprgrm(3, new sprlrm(this.cfr_renamed_91));
        } else if (this.cfr_renamed_112 != null) {
            object2 = new sprgrm();
        }
        object = new sprbvm((sprptm)object3, (sprgrm)object2, this.cfr_renamed_4);
        return new sprbul((sprbvm)object);
    }

    public sprvsl cfr_renamed_4371() {
        if (this.cfr_renamed_119 != null || this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sproci.cfr_renamed_9("`\fc\u001b/\ra\u0007/\u0012}\r`\u0004/\riB\u007f\r|\u0011j\u0011|\u000b`\f/\u0003c\u000e`\u0015j\u0006"));
        }
        this.cfr_renamed_112 = sprpen.cfr_renamed_4;
        return this;
    }

    private /* synthetic */ sprrcm cfr_renamed_4369(Date arg0) {
        if (arg0 != null) {
            return new sprrcm(arg0);
        }
        return null;
    }

    public sprvsl cfr_renamed_4367(Date arg0, Date arg1) {
        sprvsl sprvsl2 = this;
        sprvsl2.cfr_renamed_86.cfr_renamed_10981(new sprutm(this.cfr_renamed_4369(arg0), this.cfr_renamed_4369(arg1)));
        return sprvsl2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprvsl cfr_renamed_10982(sprcf arg0) {
        if (this.cfr_renamed_1 != null || this.cfr_renamed_112 != null || this.cfr_renamed_91 != null) {
            throw new IllegalStateException(sprksa.cfr_renamed_9("\nD\tSEE\u000bOEZ\u0017E\nLEE\u0003\n\u0015E\u0016Y\u0000Y\u0016C\nDEK\tF\n]\u0000N"));
        }
        this.cfr_renamed_119 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvsl cfr_renamed_10983(sprsol sprsol2, char[] cArray) {
        void arg0;
        this.cfr_renamed_132 = arg0;
        this.cfr_renamed_102 = cArray;
        return this;
    }

    public sprvsl cfr_renamed_10(BigInteger arg0) {
        if (arg0 != null) {
            this.cfr_renamed_86.cfr_renamed_5001(new sprktm(arg0));
        }
        return this;
    }

    public sprvsl cfr_renamed_10847(sprnbm arg0) {
        if (arg0 != null) {
            this.cfr_renamed_86.cfr_renamed_10847(arg0);
        }
        return this;
    }

    public sprvsl cfr_renamed_10984(sprvmm arg0) {
        if (this.cfr_renamed_119 != null || this.cfr_renamed_112 != null || this.cfr_renamed_91 != null) {
            throw new IllegalStateException(sproci.cfr_renamed_9("`\fc\u001b/\ra\u0007/\u0012}\r`\u0004/\riB\u007f\r|\u0011j\u0011|\u000b`\f/\u0003c\u000e`\u0015j\u0006"));
        }
        this.cfr_renamed_3 = 2;
        sprvsl sprvsl2 = this;
        sprvsl2.cfr_renamed_1 = new sprlrm(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvsl(BigInteger bigInteger) {
        void arg0;
        sprvsl sprvsl2 = this;
        sprvsl sprvsl3 = this;
        sprvsl3.cfr_renamed_3 = 2;
        sprvsl3.cfr_renamed_93 = arg0;
        sprvsl sprvsl4 = this;
        sprvsl3.cfr_renamed_152 = new sprgem();
        sprvsl2.cfr_renamed_86 = new sprtsm();
        sprvsl2.cfr_renamed_0 = new ArrayList();
        sprvsl2.cfr_renamed_4 = null;
    }

    public sprvsl cfr_renamed_10985(sprqtm arg0) {
        if (this.cfr_renamed_119 != null || this.cfr_renamed_112 != null || this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprksa.cfr_renamed_9("\nD\tSEE\u000bOEZ\u0017E\nLEE\u0003\n\u0015E\u0016Y\u0000Y\u0016C\nDEK\tF\n]\u0000N"));
        }
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprvsl cfr_renamed_10986(int arg0, sprvmm arg1) {
        if (this.cfr_renamed_119 != null || this.cfr_renamed_112 != null || this.cfr_renamed_91 != null) {
            throw new IllegalStateException(sproci.cfr_renamed_9("`\fc\u001b/\ra\u0007/\u0012}\r`\u0004/\riB\u007f\r|\u0011j\u0011|\u000b`\f/\u0003c\u000e`\u0015j\u0006"));
        }
        if (arg0 != 2 && arg0 != 3) {
            throw new IllegalArgumentException(sprksa.cfr_renamed_9("\u0011S\u0015OEG\u0010Y\u0011\n\u0007OEz\u0017E\nL*L5E\u0016Y\u0000Y\u0016C\nDK~<z u.o<u d&c5b x(o+~EV\u0019\n5X\nE\u0003e\u0003z\nY\u0016O\u0016Y\fE\u000b\u00041s5o:a s:k\"x o(o+~"));
        }
        this.cfr_renamed_3 = arg0;
        sprvsl sprvsl2 = this;
        sprvsl2.cfr_renamed_1 = new sprlrm(arg1);
        return this;
    }

    public sprvsl cfr_renamed_10987(sprqlm[] arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprvsl cfr_renamed_10964(sprigm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprvsl cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        sprvsl sprvsl2 = this;
        sprvsl2.cfr_renamed_152.cfr_renamed_5013(arg0, arg1, arg2);
        return sprvsl2;
    }

    public sprvsl cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws sprznl {
        sprvsl sprvsl2 = this;
        sprhxl.cfr_renamed_5280(sprvsl2.cfr_renamed_152, arg0, arg1, arg2);
        return sprvsl2;
    }

    public sprvsl cfr_renamed_10988(spryq arg0) {
        sprvsl sprvsl2 = this;
        sprvsl2.cfr_renamed_0.add(arg0);
        return sprvsl2;
    }
}

