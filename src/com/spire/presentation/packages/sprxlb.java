/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.spriqb;
import com.spire.presentation.packages.sprisda;
import com.spire.presentation.packages.sprkwc;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprouba;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvqb;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

public class sprxlb
extends MacSpi
implements sprgb {
    private int cfr_renamed_105;
    private int cfr_renamed_137;
    private spruc cfr_renamed_79;
    private int cfr_renamed_107;

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_79.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineReset() {
        this.cfr_renamed_79.cfr_renamed_41();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprxlb sprxlb2;
        sprt sprt2;
        if (arg0 == null) {
            throw new InvalidKeyException(sprouba.cfr_renamed_9("`yr<bo+r~pg"));
        }
        if (!(arg0 instanceof sprmpb)) {
            if (arg1 instanceof IvParameterSpec) {
                sprt2 = new sprnjd(new sprnld(arg0.getEncoded()), ((IvParameterSpec)arg1).getIV());
                sprxlb2 = this;
            } else if (arg1 instanceof spriqb) {
                sprt2 = new sprkwc(sprxlb.cfr_renamed_2401(((spriqb)arg1).cfr_renamed_284())).cfr_renamed_2402(arg0.getEncoded()).cfr_renamed_1451();
                sprxlb2 = this;
            } else {
                if (arg1 != null) throw new InvalidAlgorithmParameterException(sprouba.cfr_renamed_9("~r`rdke<{}y}fy\u007fyy<\u007fe{y%"));
                sprt2 = new sprnld(arg0.getEncoded());
                sprxlb2 = this;
            }
        } else {
            sprmpb sprmpb2 = (sprmpb)arg0;
            if (sprmpb2.cfr_renamed_2292() != null) {
                sprt2 = sprmpb2.cfr_renamed_2292();
            } else {
                if (!(arg1 instanceof PBEParameterSpec)) throw new InvalidAlgorithmParameterException(sprisda.cfr_renamed_9("\u001e;\u000bY<\u001c?\f'\u000b+\nn)\f<n\t/\u000b/\u0014+\r+\u000b=Y:\u0016n\u001b+Y=\u001c:W"));
                sprt2 = sprvqb.cfr_renamed_2403(sprmpb2, arg1);
            }
            sprxlb2 = this;
        }
        sprxlb2.cfr_renamed_79.cfr_renamed_1524(sprt2);
    }

    @Override
    public void engineUpdate(byte arg0) {
        this.cfr_renamed_79.cfr_renamed_1221(arg0);
    }

    private static /* synthetic */ Hashtable cfr_renamed_2401(Map arg0) {
        Iterator iterator;
        Hashtable hashtable = new Hashtable();
        Iterator iterator2 = iterator = arg0.keySet().iterator();
        while (iterator2.hasNext()) {
            Object k;
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            Object k2 = k = iterator3.next();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    @Override
    public int engineGetMacLength() {
        return this.cfr_renamed_79.cfr_renamed_2404();
    }

    /*
     * WARNING - void declaration
     */
    public sprxlb(spruc spruc2, int n, int n2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        sprxlb sprxlb2 = this;
        sprxlb sprxlb3 = this;
        sprxlb sprxlb4 = this;
        this.cfr_renamed_107 = 2;
        sprxlb4.cfr_renamed_105 = 1;
        sprxlb4.cfr_renamed_137 = 160;
        sprxlb3.cfr_renamed_79 = arg0;
        sprxlb3.cfr_renamed_107 = arg1;
        sprxlb2.cfr_renamed_105 = arg2;
        sprxlb2.cfr_renamed_137 = n3;
    }

    @Override
    public byte[] engineDoFinal() {
        sprxlb sprxlb2 = this;
        byte[] byArray = new byte[sprxlb2.engineGetMacLength()];
        sprxlb2.cfr_renamed_79.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public sprxlb(spruc spruc2) {
        sprxlb sprxlb2 = this;
        sprxlb sprxlb3 = this;
        sprxlb3.cfr_renamed_107 = 2;
        sprxlb3.cfr_renamed_105 = 1;
        sprxlb2.cfr_renamed_137 = 160;
        sprxlb2.cfr_renamed_79 = spruc2;
    }
}

