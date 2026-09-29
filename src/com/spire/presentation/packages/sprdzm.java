/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.AppException;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprban;
import com.spire.presentation.packages.sprhs;
import com.spire.presentation.packages.sprigp;
import com.spire.presentation.packages.sprlp;
import com.spire.presentation.packages.sprpmfa;
import com.spire.presentation.packages.sprrw;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtz;
import com.spire.presentation.packages.sprvp;
import com.spire.presentation.packages.sprvt;
import java.util.Iterator;

@sprtea
public class sprdzm
implements sprlp {
    private sprvp cfr_renamed_137;
    private sprrw cfr_renamed_79;
    private boolean cfr_renamed_107;
    private int cfr_renamed_132;
    private sprigp cfr_renamed_102;
    private double cfr_renamed_93;
    private boolean cfr_renamed_86;
    private double cfr_renamed_152;
    private spralq cfr_renamed_112;
    private int cfr_renamed_119;
    private sprtz cfr_renamed_91;
    private double cfr_renamed_0;
    private sprvp cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private String cfr_renamed_3;
    private sprlp cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_2;
    }

    @Override
    public double cfr_renamed_12751() {
        if (!this.cfr_renamed_86) {
            return this.cfr_renamed_93;
        }
        double d = this.cfr_renamed_93;
        d += this.cfr_renamed_91.cfr_renamed_12726();
        return d *= this.cfr_renamed_91.cfr_renamed_12723() / 100.0;
    }

    @Override
    public int cfr_renamed_12752() {
        return this.cfr_renamed_132;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public boolean cfr_renamed_12753() {
        return this.cfr_renamed_107;
    }

    @Override
    public double cfr_renamed_12494() {
        Iterator iterator;
        double d = 0.0;
        double d2 = 0.0;
        Iterator iterator2 = iterator = this.cfr_renamed_12560().iterator();
        while (iterator2.hasNext()) {
            sprhs sprhs2 = (sprhs)iterator.next();
            if (sprhs2.cfr_renamed_12561() == 32) {
                d2 += sprhs2.cfr_renamed_12565();
            }
            d += (d2 += sprhs2.cfr_renamed_12564()) + sprhs2.cfr_renamed_12563().cfr_renamed_2;
            d2 = 0.0;
            iterator2 = iterator;
        }
        return d;
    }

    @Override
    public double cfr_renamed_12754() {
        if (!this.cfr_renamed_86) {
            if (this.cfr_renamed_12753()) {
                return this.cfr_renamed_152;
            }
            return -this.cfr_renamed_152;
        }
        sprdzm sprdzm2 = this;
        double d = sprdzm2.cfr_renamed_152;
        d = d / 1000.0 * this.cfr_renamed_91.cfr_renamed_12485();
        d *= this.cfr_renamed_91.cfr_renamed_12723() / 100.0;
        if (sprdzm2.cfr_renamed_12753()) {
            return d;
        }
        return -d;
    }

    @Override
    public sprvp cfr_renamed_12661() {
        return this.cfr_renamed_91.cfr_renamed_12661();
    }

    @Override
    public double cfr_renamed_12485() {
        return this.cfr_renamed_91.cfr_renamed_12485();
    }

    @Override
    public sprvt cfr_renamed_12560() {
        return new sprban(this);
    }

    @Override
    public sprvp cfr_renamed_12489() {
        return this.cfr_renamed_91.cfr_renamed_12489();
    }

    public sprigp cfr_renamed_12755() {
        return this.cfr_renamed_102;
    }

    @Override
    public double cfr_renamed_12495() {
        Iterator iterator;
        double d = 0.0;
        Iterator iterator2 = iterator = this.cfr_renamed_12560().iterator();
        while (iterator2.hasNext()) {
            sprhs sprhs2 = (sprhs)iterator.next();
            d += sprhs2.cfr_renamed_12563().cfr_renamed_0;
            iterator2 = iterator;
        }
        return d;
    }

    @Override
    public spralq cfr_renamed_12563() {
        return this.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_12756() {
        return this.cfr_renamed_119;
    }

    @Override
    public String cfr_renamed_314() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdzm(sprrw sprrw2, String string, byte[] byArray, int n, double d, spralq spralq2, double d2, int n2, double d3, sprvp sprvp2, boolean bl, boolean bl2, sprigp sprigp2) {
        void arg12;
        void arg11;
        void arg10;
        void arg8;
        void arg3;
        void arg1;
        void arg6;
        void arg5;
        void arg7;
        void arg4;
        void arg9;
        void arg0;
        void arg2;
        if (sprrw2 == null) {
            throw new NullPointerException(sprpmfa.cfr_renamed_9(")z<{<f-m+"));
        }
        if (arg2 == null) {
            throw new NullPointerException(AppException.cfr_renamed_9("\"\\4@3"));
        }
        this.cfr_renamed_79 = arg0;
        this.cfr_renamed_91 = (sprtz)this.cfr_renamed_79.cfr_renamed_12484().cfr_renamed_12099();
        sprdzm sprdzm2 = this;
        sprdzm sprdzm3 = this;
        sprdzm sprdzm4 = this;
        sprdzm sprdzm5 = this;
        sprdzm sprdzm6 = this;
        sprdzm sprdzm7 = this;
        this.cfr_renamed_137 = arg0.cfr_renamed_12490().cfr_renamed_12491();
        sprdzm7.cfr_renamed_1 = arg9;
        sprdzm7.cfr_renamed_0 = arg4;
        sprdzm6.cfr_renamed_132 = arg7;
        sprdzm6.cfr_renamed_112 = arg5;
        sprdzm5.cfr_renamed_93 = arg6;
        sprdzm5.cfr_renamed_3 = arg1;
        sprdzm4.cfr_renamed_2 = arg2;
        sprdzm4.cfr_renamed_119 = arg3;
        sprdzm3.cfr_renamed_152 = arg8;
        sprdzm3.cfr_renamed_107 = arg10;
        sprdzm2.cfr_renamed_86 = arg11;
        sprdzm2.cfr_renamed_102 = arg12;
    }
}

