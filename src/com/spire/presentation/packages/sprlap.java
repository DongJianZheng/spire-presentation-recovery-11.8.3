/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprdvo;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.spriso;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprmcja;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprpt;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtxo;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprlap
implements sprpt {
    private spravp cfr_renamed_91;
    private spriso[] cfr_renamed_0;
    private sprdsp cfr_renamed_1;
    private sprfzo cfr_renamed_2;
    private sprtxo cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_18249(sprmcja sprmcja2, byte[] byArray) {
        void arg1;
        sprmcja arg0;
        sprmcja sprmcja3 = arg0;
        arg0.cfr_renamed_11735("<");
        sprmcja3.cfr_renamed_11835(sprlap.cfr_renamed_18250((byte[])arg1));
        sprmcja3.cfr_renamed_11735(">");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_18251() {
        byte[] byArray;
        block4: {
            sprpdja sprpdja2 = new sprpdja();
            try {
                Iterator iterator;
                sprruo sprruo2 = new sprruo(sprpdja2);
                sprpxo sprpxo2 = new sprpxo();
                sprlap sprlap2 = this;
                sprpxo2.cfr_renamed_2 = sprlap2.cfr_renamed_4;
                sprpxo2.cfr_renamed_4 = sprlap2.cfr_renamed_91.size();
                sprpxo2.cfr_renamed_18252(sprruo2);
                long l = sprpdja2.cfr_renamed_3274() + (long)(16 * this.cfr_renamed_91.size());
                Iterator iterator2 = iterator = this.cfr_renamed_91.iterator();
                while (iterator2.hasNext()) {
                    sprnyja sprnyja2 = (sprnyja)iterator.next();
                    byte[] byArray2 = (byte[])sprnyja2.getValue();
                    sprkto sprkto2 = new sprkto();
                    new sprkto().cfr_renamed_0 = (String)sprnyja2.getKey();
                    sprkto2.cfr_renamed_2 = byArray2.length;
                    sprkto2.cfr_renamed_3 = l;
                    sprkto2.cfr_renamed_4 = sprkto.cfr_renamed_18081(byArray2);
                    sprkto2.cfr_renamed_18252(sprruo2);
                    l = (l & 0xFFFFFFFFL) + ((long)spryxp.cfr_renamed_17420(byArray2.length, 4) & 0xFFFFFFFFL);
                    iterator2 = iterator;
                }
                byArray = sprpdja2.cfr_renamed_4529();
                if (sprpdja2 == null) break block4;
            }
            catch (Throwable throwable) {
                if (sprpdja2 != null) {
                    sprpdja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprpdja2.cfr_renamed_2637();
            return byArray;
        }
        return byArray;
    }

    private static /* synthetic */ String cfr_renamed_18250(byte[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = spryxp.cfr_renamed_17420(arg0.length, 4);
        int n3 = n = 0;
        while (n3 < n2) {
            if (n > 0 && n % 36 == 0) {
                sprghha.cfr_renamed_14118(stringBuilder);
            }
            byte by = n < arg0.length ? arg0[n] : (byte)0;
            Object[] objectArray = new Object[1];
            objectArray[0] = by;
            sprghha.cfr_renamed_12289(stringBuilder, sprpgp.cfr_renamed_9("Iw\b?\u0000:"), objectArray);
            n3 = ++n;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprlap(sprfzo sprfzo2, sprtxo sprtxo2, sprdsp sprdsp2) {
        void arg2;
        void arg1;
        void arg0;
        sprlap sprlap2 = this;
        sprlap sprlap3 = this;
        this.cfr_renamed_4 = 65536;
        sprlap3.cfr_renamed_2 = arg0;
        sprlap3.cfr_renamed_3 = arg1;
        sprlap2.cfr_renamed_1 = arg2;
        sprlap2.cfr_renamed_0 = sprdvo.cfr_renamed_14131(sprdsp2);
        sprlap sprlap4 = this;
        sprlap2.cfr_renamed_91 = new spravp(true);
    }

    @Override
    public void cfr_renamed_15094(String arg0, byte[] arg1) {
        this.cfr_renamed_91.cfr_renamed_12160(arg0, arg1);
    }

    @Override
    public int cfr_renamed_18088() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_18084(spreen arg0) {
        Iterator iterator;
        Object object;
        int n;
        sprmcja sprmcja2;
        sprmcja sprmcja3 = sprmcja2 = new sprmcja(arg0);
        sprmcja sprmcja4 = sprmcja2;
        sprmcja2.cfr_renamed_11735(sprkgs.cfr_renamed_9("/4ZF'Ax`oAseo5lzda"));
        sprmcja4.cfr_renamed_11735(sprpgp.cfr_renamed_9("\u000e{"));
        sprmcja4.cfr_renamed_11735(sprkgs.cfr_renamed_9("%Se{~Aseo5>'"));
        sprmcja3.cfr_renamed_11735(sprpgp.cfr_renamed_9("ht(\\3\u007f&F5[?\u0012\u001c\u0012v\u0012w\u0012w\u0012v\u0012w\u0012w\u0012\u001a"));
        sprmcja3.cfr_renamed_11646(sprkgs.cfr_renamed_9("%Se{~[kxo5%n:h"), sprznp.cfr_renamed_12328(this.cfr_renamed_2.cfr_renamed_14129()) ? this.cfr_renamed_2.cfr_renamed_14129() : this.cfr_renamed_2.cfr_renamed_13492());
        Object[] objectArray = new Object[4];
        objectArray[0] = sprebp.cfr_renamed_14096((float)this.cfr_renamed_2.cfr_renamed_14887() / (float)this.cfr_renamed_2.cfr_renamed_13317());
        objectArray[1] = sprebp.cfr_renamed_14096((float)this.cfr_renamed_2.cfr_renamed_14888() / (float)this.cfr_renamed_2.cfr_renamed_13317());
        objectArray[2] = sprebp.cfr_renamed_14096((float)this.cfr_renamed_2.cfr_renamed_13487() / (float)this.cfr_renamed_2.cfr_renamed_13317());
        objectArray[3] = sprebp.cfr_renamed_14096((float)this.cfr_renamed_2.cfr_renamed_14889() / (float)this.cfr_renamed_2.cfr_renamed_13317());
        sprmcja2.cfr_renamed_11843(sprpgp.cfr_renamed_9("ht(\\3p\u0005]?\u0012\u001cIwOgIvOgIuOgItO\u001a"), objectArray);
        sprmcja sprmcja5 = sprmcja2;
        sprmcja sprmcja6 = sprmcja2;
        sprmcja sprmcja7 = sprmcja2;
        sprmcja sprmcja8 = sprmcja2;
        sprmcja2.cfr_renamed_11735(sprkgs.cfr_renamed_9("%Ek|da^lzp*%"));
        sprmcja8.cfr_renamed_11735(sprpgp.cfr_renamed_9("ht(\\3{)T("));
        sprmcja8.cfr_renamed_11735(sprkgs.cfr_renamed_9("6)"));
        sprmcja7.cfr_renamed_11646(sprpgp.cfr_renamed_9("ht&_.^>|&_\"\u0012oIwOn"), this.cfr_renamed_2.cfr_renamed_13460());
        sprmcja7.cfr_renamed_11646(sprkgs.cfr_renamed_9(":L`fyDtgp*=q%w<"), this.cfr_renamed_2.cfr_renamed_13492());
        sprmcja6.cfr_renamed_11646(sprpgp.cfr_renamed_9("\u001d\u0012\\#W5^.\\\"b(A.F.])\u0012<\u0002:"), sprebp.cfr_renamed_14096((float)this.cfr_renamed_3.cfr_renamed_152 / (float)this.cfr_renamed_2.cfr_renamed_13317()));
        sprmcja6.cfr_renamed_11646(sprkgs.cfr_renamed_9(":_{npxyc{oAb|i~dpyf*n:h"), sprebp.cfr_renamed_14096((float)this.cfr_renamed_3.cfr_renamed_105 / (float)this.cfr_renamed_2.cfr_renamed_13317()));
        sprmcja5.cfr_renamed_11646(sprpgp.cfr_renamed_9("\u001d\u000eF&^.Q\u0006\\ ^\"\u0012<\u0002:"), sprebp.cfr_renamed_14096(this.cfr_renamed_3.cfr_renamed_0));
        sprmcja5.cfr_renamed_11646(sprkgs.cfr_renamed_9(":cfL|rpnEcai}*n:h"), this.cfr_renamed_3.cfr_renamed_1 > 0 ? "true" : "false");
        sprmcja sprmcja9 = sprmcja2;
        sprmcja2.cfr_renamed_11735(sprpgp.cfr_renamed_9("\fy"));
        sprmcja9.cfr_renamed_11735(sprkgs.cfr_renamed_9(":O{izn|dr*\\YZFt~|d$O{izn|dr"));
        sprmcja9.cfr_renamed_11735(sprpgp.cfr_renamed_9("hq/S5a3@.\\ Ag\u000e{"));
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.length) {
            object = this.cfr_renamed_0[n];
            String string = sprdvo.cfr_renamed_14137(((spriso)object).cfr_renamed_320() == 0 ? 0 : ((spriso)object).cfr_renamed_12561());
            sprmcja2.cfr_renamed_11676(sprkgs.cfr_renamed_9("%n:h*n;h"), string, ((spriso)object).cfr_renamed_320());
            n2 = ++n;
        }
        sprmcja sprmcja10 = sprmcja2;
        sprmcja10.cfr_renamed_11735(sprpgp.cfr_renamed_9("\fy"));
        sprmcja10.cfr_renamed_11735(sprkgs.cfr_renamed_9("%fl{~f*N"));
        sprlap.cfr_renamed_18249(sprmcja2, this.cfr_renamed_18251());
        Iterator iterator2 = iterator = this.cfr_renamed_91.iterator();
        while (iterator2.hasNext()) {
            object = (sprnyja)iterator.next();
            sprlap.cfr_renamed_18249(sprmcja2, (byte[])((sprnyja)object).getValue());
            iterator2 = iterator;
        }
        sprmcja sprmcja11 = sprmcja2;
        sprmcja2.cfr_renamed_11735("]");
        sprmcja11.cfr_renamed_11735(sprpgp.cfr_renamed_9("\fy"));
        sprmcja11.cfr_renamed_11735(sprkgs.cfr_renamed_9("worc{*Se{~[kxo5i`xgo{~qcv~5o{n5npl|dplzda*eee"));
        sprmcja2.cfr_renamed_2947();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_15096() {
        sprpdja sprpdja2 = new sprpdja();
        try {
            this.cfr_renamed_18084(sprpdja2);
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    @Override
    public void cfr_renamed_18083(int arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

