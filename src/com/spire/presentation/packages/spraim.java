/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravz;
import com.spire.presentation.packages.sprbfm;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgoh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvth;
import com.spire.presentation.packages.sprwyl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprysha;
import java.math.BigInteger;

public class spraim
extends sprqqe
implements sprbr {
    private sprgxh cfr_renamed_1261;
    private sprlem cfr_renamed_1197 = null;
    private byte[] cfr_renamed_4;

    public sprgxh cfr_renamed_1769() {
        return this.cfr_renamed_1261;
    }

    public spraim(sprgxh arg0) {
        this(arg0, null);
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public spraim(sprgxh sprgxh2, byte[] byArray) {
        void arg0;
        this.cfr_renamed_1261 = arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
        this.cfr_renamed_4437();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        spraim spraim2;
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_1197.cfr_renamed_5078(cfr_renamed_953)) {
            spraim2 = this;
            sprrvm sprrvm3 = sprrvm2;
            sprrvm3.cfr_renamed_5004(new sprbfm(this.cfr_renamed_1261.cfr_renamed_1778()).cfr_renamed_119());
            sprrvm3.cfr_renamed_5004(new sprbfm(this.cfr_renamed_1261.cfr_renamed_1997()).cfr_renamed_119());
        } else {
            if (this.cfr_renamed_1197.cfr_renamed_5078(cfr_renamed_1442)) {
                sprrvm sprrvm4 = sprrvm2;
                sprrvm4.cfr_renamed_5004(new sprbfm(this.cfr_renamed_1261.cfr_renamed_1778()).cfr_renamed_119());
                sprrvm4.cfr_renamed_5004(new sprbfm(this.cfr_renamed_1261.cfr_renamed_1997()).cfr_renamed_119());
            }
            spraim2 = this;
        }
        if (spraim2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprdye(this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spraim(sprwyl sprwyl2, BigInteger bigInteger, BigInteger bigInteger2, sprszm sprszm2) {
        void arg2;
        void arg1;
        void v0;
        void arg3;
        void arg0;
        this.cfr_renamed_1197 = sprwyl2.cfr_renamed_4028();
        if (this.cfr_renamed_1197.cfr_renamed_5078(cfr_renamed_953)) {
            BigInteger bigInteger3 = ((sprktm)arg0.cfr_renamed_284()).cfr_renamed_97();
            BigInteger bigInteger4 = new BigInteger(1, sproug.cfr_renamed_23(arg3.cfr_renamed_85(0)).cfr_renamed_186());
            BigInteger bigInteger5 = new BigInteger(1, sproug.cfr_renamed_23(arg3.cfr_renamed_85(1)).cfr_renamed_186());
            v0 = arg3;
            spraim spraim2 = this;
            spraim2.cfr_renamed_1261 = new sprvth(bigInteger3, bigInteger4, bigInteger5, (BigInteger)arg1, (BigInteger)arg2);
        } else if (this.cfr_renamed_1197.cfr_renamed_5078(cfr_renamed_1442)) {
            Object object;
            sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_284());
            int n = ((sprktm)sprszm3.cfr_renamed_85(0)).cfr_renamed_5023();
            sprlem sprlem2 = (sprlem)sprszm3.cfr_renamed_85(1);
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            if (sprlem2.cfr_renamed_5078(cfr_renamed_728)) {
                n2 = sprktm.cfr_renamed_23(sprszm3.cfr_renamed_85(2)).cfr_renamed_5023();
            } else if (sprlem2.cfr_renamed_5078(cfr_renamed_114)) {
                object = sprszm.cfr_renamed_23(sprszm3.cfr_renamed_85(2));
                n2 = sprktm.cfr_renamed_23(((sprszm)object).cfr_renamed_85(0)).cfr_renamed_5023();
                n3 = sprktm.cfr_renamed_23(((sprszm)object).cfr_renamed_85(1)).cfr_renamed_5023();
                n4 = sprktm.cfr_renamed_23(((sprszm)object).cfr_renamed_85(2)).cfr_renamed_5023();
            } else {
                throw new IllegalArgumentException(spravz.cfr_renamed_9("!6\u001c-U*\f.\u0010~\u001a8U\u001b6~\u0017?\u00067\u0006~\u001c-U0\u001a*U7\u0018.\u0019;\u0018;\u001b*\u0010:"));
            }
            object = new BigInteger(1, sproug.cfr_renamed_23(arg3.cfr_renamed_85(0)).cfr_renamed_186());
            BigInteger bigInteger6 = new BigInteger(1, sproug.cfr_renamed_23(arg3.cfr_renamed_85(1)).cfr_renamed_186());
            v0 = arg3;
            this.cfr_renamed_1261 = new sprgoh(n, n2, n3, n4, (BigInteger)object, bigInteger6, (BigInteger)arg1, (BigInteger)arg2);
        } else {
            throw new IllegalArgumentException(sprysha.cfr_renamed_9("\u001e_#DjC3G/\u0017%Qjr\tt?E<Rj^9\u0017$X>\u0017#Z:[/Z/Y>R."));
        }
        if (v0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = ((sprdye)arg3.cfr_renamed_85(2)).cfr_renamed_81();
        }
    }

    private /* synthetic */ void cfr_renamed_4437() {
        if (sprmvh.cfr_renamed_8673(this.cfr_renamed_1261)) {
            this.cfr_renamed_1197 = cfr_renamed_953;
            return;
        }
        if (sprmvh.cfr_renamed_8665(this.cfr_renamed_1261)) {
            this.cfr_renamed_1197 = cfr_renamed_1442;
            return;
        }
        throw new IllegalArgumentException(spravz.cfr_renamed_9("\n\u001d7\u0006~\u0001'\u0005;U1\u0013~0\u001d6+\u0007(\u0010~\u001c-U0\u001a*U7\u0018.\u0019;\u0018;\u001b*\u0010:"));
    }
}

