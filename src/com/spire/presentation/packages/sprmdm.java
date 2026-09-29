/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcxz;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;
import java.util.Vector;

public class sprmdm
extends sprqqe {
    public int cfr_renamed_91;
    public static final int cfr_renamed_0 = 3;
    public spraem cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public Vector cfr_renamed_3;
    public static final int cfr_renamed_4 = 2;

    public int cfr_renamed_423() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmdm(sprszm sprszm2) {
        Enumeration enumeration;
        void v2;
        sprszm arg0;
        sprmdm sprmdm2 = this;
        sprmdm2.cfr_renamed_1 = null;
        sprmdm sprmdm3 = this;
        sprmdm2.cfr_renamed_3 = new Vector();
        sprmdm2.cfr_renamed_91 = -1;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            ++n;
            this.cfr_renamed_1 = spraem.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), false);
            v2 = arg0;
        } else {
            if (arg0.cfr_renamed_84() == 2) {
                ++n;
                this.cfr_renamed_1 = spraem.cfr_renamed_23(arg0.cfr_renamed_85(0));
            }
            v2 = arg0;
        }
        if (!(v2.cfr_renamed_85(n) instanceof sprszm)) {
            throw new IllegalArgumentException(sprjvo.cfr_renamed_9("&\"\u0006`!(\u001c+)9\u001c?;4\u00069\t5H(\u0006.\u0007)\u0001#\u000f"));
        }
        arg0 = (sprszm)arg0.cfr_renamed_85(n);
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            sprmdm sprmdm4;
            int n2;
            sprxgf sprxgf2 = (sprxgf)enumeration.nextElement();
            if (sprxgf2 instanceof sprlem) {
                n2 = 2;
                sprmdm4 = this;
            } else if (sprxgf2 instanceof sprkgn) {
                n2 = 3;
                sprmdm4 = this;
            } else if (sprxgf2 instanceof sprfvg) {
                n2 = 1;
                sprmdm4 = this;
            } else {
                throw new IllegalArgumentException(sprcxz.cfr_renamed_9("Qww6ew\u007fcv6gocs3s}u|rzxt6ZsgpRbgd@o}brn"));
            }
            if (sprmdm4.cfr_renamed_91 < 0) {
                this.cfr_renamed_91 = n2;
            }
            if (n2 != this.cfr_renamed_91) {
                throw new IllegalArgumentException(sprjvo.cfr_renamed_9("\u0000\u00015H\"\u000em\u001e,\u00048\rm\u001c4\u0018(\u001bm\u0001#H\u0004\r9\u000e\f\u001c9\u001a\u001e\u0011#\u001c,\u0010"));
            }
            this.cfr_renamed_3.addElement(sprxgf2);
            enumeration2 = enumeration;
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_1));
        }
        sprrvm sprrvm3 = new sprrvm(this.cfr_renamed_3.size());
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.elements();
        while (enumeration2.hasMoreElements()) {
            sprrvm3.cfr_renamed_5004((sprco)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
        return new sprcen(sprrvm2);
    }

    public Object[] cfr_renamed_205() {
        int n;
        if (this.cfr_renamed_423() == 1) {
            int n2;
            Object[] objectArray = new sproug[this.cfr_renamed_3.size()];
            int n3 = n2 = 0;
            while (n3 != objectArray.length) {
                int n4 = n2++;
                objectArray[n4] = (sproug)this.cfr_renamed_3.elementAt(n4);
                n3 = n2;
            }
            return objectArray;
        }
        if (this.cfr_renamed_423() == 2) {
            int n5;
            Object[] objectArray = new sprlem[this.cfr_renamed_3.size()];
            int n6 = n5 = 0;
            while (n6 != objectArray.length) {
                int n7 = n5++;
                objectArray[n7] = (sprlem)this.cfr_renamed_3.elementAt(n7);
                n6 = n5;
            }
            return objectArray;
        }
        Object[] objectArray = new sprkgn[this.cfr_renamed_3.size()];
        int n8 = n = 0;
        while (n8 != objectArray.length) {
            int n9 = n++;
            objectArray[n9] = (sprkgn)this.cfr_renamed_3.elementAt(n9);
            n8 = n;
        }
        return objectArray;
    }

    public spraem cfr_renamed_422() {
        return this.cfr_renamed_1;
    }

    public static sprmdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmdm) {
            return (sprmdm)arg0;
        }
        if (arg0 != null) {
            return new sprmdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

