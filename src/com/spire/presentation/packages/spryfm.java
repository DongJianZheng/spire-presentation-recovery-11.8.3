/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprexl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzgm;
import com.spire.presentation.packages.sprzro;
import java.math.BigInteger;

public class spryfm
extends sprqqe {
    public sprzgm cfr_renamed_91;
    public BigInteger cfr_renamed_0 = BigInteger.valueOf(0L);
    public sproug cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ spryfm(sprszm sprszm2) {
        spryfm spryfm2;
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprnvm) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            if (!sprnvm2.cfr_renamed_4567() || 0 != sprnvm2.cfr_renamed_312()) throw new IllegalArgumentException(sprzro.cfr_renamed_9("\u0007k\u0002l\u000b}Hy\t{\u001blHl\u001a{\u0007{"));
            spryfm2 = this;
            this.cfr_renamed_0 = sprktm.cfr_renamed_23(sprnvm2.cfr_renamed_2414()).cfr_renamed_97();
        } else {
            spryfm2 = this;
        }
        int n2 = ++n;
        spryfm2.cfr_renamed_91 = sprzgm.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        spryfm spryfm3 = this;
        void v3 = arg0;
        int n3 = ++n;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
        int n4 = ++n;
        this.cfr_renamed_4 = sproug.cfr_renamed_23(v3.cfr_renamed_85(n4));
        int n5 = ++n;
        spryfm3.cfr_renamed_2 = sprktm.cfr_renamed_23(v3.cfr_renamed_85(n5));
        spryfm3.cfr_renamed_1 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(++n));
    }

    public sprzgm cfr_renamed_845() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_1145() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public spryfm(sprqxk sprqxk2) {
        void arg0;
        spryfm spryfm2;
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        if (!sprmvh.cfr_renamed_8665(sprgxh2)) {
            throw new IllegalArgumentException(sprexl.cfr_renamed_9("}@~W2L{@s\\k\u000evA\u007fO{@2Ga\u000ebAa]{L~K"));
        }
        int[] nArray = ((sprik)sprgxh2.cfr_renamed_845()).cfr_renamed_1764().cfr_renamed_1765();
        if (nArray.length == 3) {
            spryfm2 = this;
            this.cfr_renamed_91 = new sprzgm(nArray[2], nArray[1]);
        } else if (nArray.length == 5) {
            spryfm2 = this;
            this.cfr_renamed_91 = new sprzgm(nArray[4], nArray[1], nArray[2], nArray[3]);
        } else {
            throw new IllegalArgumentException(sprzro.cfr_renamed_9("\u000b|\u001a\u007f\r)\u0005|\u001b}Ha\t\u007f\r)\t)\u001c{\u0001g\u0007d\u0001h\u0004)\u0007{Hy\rg\u001ch\u0006f\u0005`\teHk\tz\u0001z"));
        }
        spryfm2.cfr_renamed_3 = new sprktm(sprgxh2.cfr_renamed_1778().cfr_renamed_1779());
        spryfm spryfm3 = this;
        spryfm3.cfr_renamed_4 = new sprfvg(sprgxh2.cfr_renamed_1997().cfr_renamed_91());
        spryfm3.cfr_renamed_2 = new sprktm(arg0.cfr_renamed_1146());
        spryfm3.cfr_renamed_1 = new sprfvg(spruhm.cfr_renamed_9445(arg0.cfr_renamed_1145()));
    }

    public byte[] cfr_renamed_1997() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    public static spryfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryfm) {
            return (spryfm)arg0;
        }
        if (arg0 != null) {
            return new spryfm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        if (0 != this.cfr_renamed_0.compareTo(BigInteger.valueOf(0L))) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprktm(this.cfr_renamed_0)));
        }
        sprrvm sprrvm3 = sprrvm2;
        spryfm spryfm2 = this;
        sprrvm sprrvm4 = sprrvm2;
        spryfm spryfm3 = this;
        sprrvm2.cfr_renamed_5004(spryfm3.cfr_renamed_91);
        sprrvm4.cfr_renamed_5004(spryfm3.cfr_renamed_3);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(spryfm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(spryfm2.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }
}

