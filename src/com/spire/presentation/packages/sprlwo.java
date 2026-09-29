/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravy;
import com.spire.presentation.packages.sprctp;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprkyo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqoo;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprqvo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrvo;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwfp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryw;

@sprtea
public class sprlwo
extends sprujo {
    private int cfr_renamed_132;
    private sprtbp cfr_renamed_102;
    private sprwbp cfr_renamed_93;
    private sprqt cfr_renamed_86;
    private sprkyo cfr_renamed_152;
    private sprrvo cfr_renamed_112;
    private spryw cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprpln cfr_renamed_0;
    private sprmrn cfr_renamed_1;
    private sprhhp cfr_renamed_2;
    private sprtbp cfr_renamed_3;
    private sprjeka cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15541() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public void cfr_renamed_17485() {
        sprlwo sprlwo2 = this;
        sprsuja sprsuja2 = sprlwo2.cfr_renamed_16647();
        sprsuja sprsuja3 = sprlwo2.cfr_renamed_16647();
        sprxln sprxln2 = sprxln.cfr_renamed_13253(new sprgeja(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181(), sprsuja3.cfr_renamed_1980() - sprsuja2.cfr_renamed_1980(), sprsuja3.spr\u3181() - sprsuja2.spr\u3181()));
        sprlwo sprlwo3 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo3.cfr_renamed_0);
        sprlwo3.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    private /* synthetic */ void cfr_renamed_17486() {
        sprqvo sprqvo2 = new sprqvo();
        sprlwo sprlwo2 = this;
        sprqvo sprqvo3 = sprqvo2;
        sprqvo3.cfr_renamed_17484(this);
        int n = (int)sprlwo2.cfr_renamed_14060().cfr_renamed_3274();
        sprlwo2.cfr_renamed_13218();
        this.cfr_renamed_102.cfr_renamed_12572(this.cfr_renamed_13220());
        if ((sprqvo3.cfr_renamed_3() & 0xFFFF) > 1) {
            this.cfr_renamed_13218();
            sprlwo sprlwo3 = this;
            sprlwo3.cfr_renamed_13220();
            sprlwo3.cfr_renamed_13218();
            this.cfr_renamed_13220();
            this.cfr_renamed_13220();
        }
        if ((sprqvo2.cfr_renamed_3() & 0xFFFF) > 2) {
            this.cfr_renamed_13218();
        }
        this.cfr_renamed_17487((int)(sprqvo2.cfr_renamed_806() & 0xFFFFFFFFL), n);
    }

    private static /* synthetic */ byte[] cfr_renamed_17488(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg1.length + 54];
        int n2 = n = 0;
        while (n2 < 54) {
            int n3 = n++;
            byArray[n3] = arg0[n3];
            n2 = n;
        }
        sprlwo.cfr_renamed_17489(byArray);
        int n4 = n = 0;
        while (n4 < arg1.length) {
            int n5 = n + 54;
            byte by = arg1[n];
            byArray[n5] = by;
            n4 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ String cfr_renamed_17490() {
        int n;
        String string = "";
        int n2 = this.cfr_renamed_13218() & 0xFFFF;
        int n3 = n = 0;
        while (n3 < n2) {
            Object[] objectArray = new Object[2];
            objectArray[0] = string;
            objectArray[1] = this.cfr_renamed_13218() & 0xFFFF;
            string = sprraia.cfr_renamed_11562(sprdbd.cfr_renamed_9("W\u0018QS\u001dU"), objectArray);
            n3 = ++n;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprlwo(spreen spreen2, sprqt sprqt2, spryw spryw2) {
        void arg1;
        void arg0;
        sprlwo sprlwo2 = this;
        super((spreen)arg0);
        sprlwo sprlwo3 = this;
        this.cfr_renamed_4 = new sprjeka();
        byte[] byArray = new byte[4];
        byArray[0] = 83;
        byArray[1] = 68;
        byArray[2] = 0;
        byArray[3] = 1;
        this.cfr_renamed_91 = byArray;
        sprlwo2.cfr_renamed_86 = arg1;
        sprlwo2.cfr_renamed_119 = spryw2;
    }

    @sprtea
    public void cfr_renamed_17491() {
        sprlwo sprlwo2 = this;
        sprwbp sprwbp2 = sprlwo2.cfr_renamed_16078();
        sprtbp sprtbp2 = new sprtbp(sprwbp2);
        sprlwo2.cfr_renamed_102 = sprlwo2.cfr_renamed_16259() ? sprtbp2 : new sprtbp(sprwbp.cfr_renamed_1447);
        this.cfr_renamed_93 = sprwbp2;
    }

    public long cfr_renamed_1452() {
        return this.cfr_renamed_112.cfr_renamed_1452();
    }

    private /* synthetic */ sprwbp cfr_renamed_16078() {
        sprlwo sprlwo2 = this;
        int n = sprlwo2.cfr_renamed_12137() & 0xFF;
        int n2 = sprlwo2.cfr_renamed_12137() & 0xFF;
        int n3 = sprlwo2.cfr_renamed_12137() & 0xFF;
        sprlwo2.cfr_renamed_12137();
        return sprwbp.cfr_renamed_12796(n3, n2, n);
    }

    @sprtea
    public void cfr_renamed_17492() {
        if (this.cfr_renamed_4.size() <= 0) {
            return;
        }
        sprwbp sprwbp2 = (sprwbp)this.cfr_renamed_4.cfr_renamed_12514();
        sprlwo sprlwo2 = this;
        sprlwo2.cfr_renamed_102 = new sprtbp(sprwbp2);
    }

    @sprtea
    public void cfr_renamed_17493() {
        sprxln sprxln2;
        sprlwo sprlwo2 = this;
        sprxln sprxln3 = sprxln2 = sprqoo.cfr_renamed_16383(this.cfr_renamed_17494(), this.cfr_renamed_16647(), sprlwo2.cfr_renamed_16647(), 1);
        sprxln3.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln3.cfr_renamed_12550(this.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    private /* synthetic */ sprsuja cfr_renamed_16647() {
        return new sprsuja(this.cfr_renamed_13220(), this.cfr_renamed_13220());
    }

    @sprtea
    public void cfr_renamed_8520() {
        sprxln sprxln2 = sprxln.cfr_renamed_13120(this.cfr_renamed_16647(), this.cfr_renamed_16647());
        sprlwo sprlwo2 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo2.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    private /* synthetic */ int cfr_renamed_17495() {
        sprlwo sprlwo2 = this;
        int n = sprlwo2.cfr_renamed_13218();
        int n2 = sprlwo2.cfr_renamed_13218();
        int n3 = sprlwo2.cfr_renamed_13218();
        int n4 = sprlwo2.cfr_renamed_13218();
        int n5 = 0;
        if ((n3 & 0xFFFF) == 2) {
            n5 |= 8;
        }
        if ((n4 & 0xFFFF) == 2) {
            n5 |= 2;
        }
        if ((n2 & 0xFFFF) == 2) {
            n5 |= 4;
        }
        if ((n & 0xFFFF) == 8) {
            n5 |= 1;
        }
        return n5;
    }

    @sprtea
    public void cfr_renamed_17496() {
        int n;
        int n2 = this.cfr_renamed_13218();
        sprsuja[][] sprsujaArray = new sprsuja[n2][];
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            sprsujaArray[n++] = this.cfr_renamed_17497();
            n3 = n;
        }
        sprxln sprxln2 = sprqoo.cfr_renamed_16382(sprsujaArray, false);
        sprlwo sprlwo2 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo2.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public sprqt cfr_renamed_12479() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public void cfr_renamed_17498() {
        sprlwo sprlwo2 = this;
        sprxln sprxln2 = sprxln.cfr_renamed_13658(this.cfr_renamed_16647(), sprlwo2.cfr_renamed_102);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17499(boolean arg0) {
        int n;
        int n2;
        sprlwo sprlwo2 = this;
        byte[] byArray = sprlwo2.cfr_renamed_16065((int)(sprlwo2.cfr_renamed_152.cfr_renamed_17500().cfr_renamed_806() & 0xFFFFFFFFL));
        int n3 = 66;
        if ((int)(sprlwo2.cfr_renamed_152.cfr_renamed_17500().cfr_renamed_806() & 0xFFFFFFFFL) < n3) {
            return;
        }
        byte[] byArray2 = sprlwo.cfr_renamed_17501(n3, byArray);
        if (this.cfr_renamed_17502(byArray2)) {
            byArray = sprlwo.cfr_renamed_17503(byArray, n3, byArray2);
        }
        this.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_14060().cfr_renamed_3274() - (long)(arg0 ? 16 : 8));
        sprlwo sprlwo3 = this;
        int n4 = sprlwo3.cfr_renamed_12261();
        int n5 = sprlwo3.cfr_renamed_12261();
        sprlwo sprlwo4 = this;
        if (arg0) {
            n2 = sprlwo4.cfr_renamed_12261();
            n = this.cfr_renamed_12261();
        } else {
            n2 = (int)(sprlwo4.cfr_renamed_112.cfr_renamed_1942() & 0xFFFFFFFFL);
            n = (int)(this.cfr_renamed_112.cfr_renamed_1452() & 0xFFFFFFFFL);
        }
        sprson sprson2 = new sprson(new sprsuja(n4, n5), new sprphja(n2, n), byArray);
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprson2);
        this.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17504() {
        sprxln sprxln2 = sprqoo.cfr_renamed_16388(this.cfr_renamed_17497(), false);
        sprlwo sprlwo2 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo2.cfr_renamed_0);
        if ((sprlwo2.cfr_renamed_152.cfr_renamed_17500().cfr_renamed_3() & 0xFFFF) > 1) {
            this.cfr_renamed_17486();
        }
        if ((this.cfr_renamed_152.cfr_renamed_17500().cfr_renamed_3() & 0xFFFF) > 2 && this.cfr_renamed_16259()) {
            sprqvo sprqvo2 = new sprqvo();
            sprlwo sprlwo3 = this;
            sprqvo2.cfr_renamed_17484(sprlwo3);
            sprlwo3.cfr_renamed_17487((int)(sprqvo2.cfr_renamed_806() & 0xFFFFFFFFL), (int)this.cfr_renamed_14060().cfr_renamed_3274());
        }
        this.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    private static /* synthetic */ void cfr_renamed_17489(byte[] byArray) {
        arg0[30] = 0;
        arg0[31] = 0;
        arg0[32] = 0;
        arg0[33] = 0;
    }

    private static /* synthetic */ byte[] cfr_renamed_17503(byte[] arg0, int arg1, byte[] arg2) {
        byte[] byArray = sprwfp.cfr_renamed_12181(sprlwo.cfr_renamed_17505(arg0, arg1), 0, 1);
        return sprlwo.cfr_renamed_17488(arg2, byArray);
    }

    @sprtea
    public void cfr_renamed_17506() {
        sprlwo sprlwo2 = this;
        sprsuja sprsuja2 = sprlwo2.cfr_renamed_16647();
        String string = sprlwo2.cfr_renamed_17507();
        sprlwo sprlwo3 = this;
        sprthn sprthn2 = new sprthn(sprlwo3.cfr_renamed_2, sprlwo3.cfr_renamed_3.cfr_renamed_12551(), sprsuja2, string, 0.0f);
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprthn2);
        this.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17508() {
        sprxln sprxln2 = sprqoo.cfr_renamed_16388(this.cfr_renamed_17497(), false);
        sprlwo sprlwo2 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo2.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17509() {
        sprxln sprxln2;
        sprlwo sprlwo2 = this;
        sprxln sprxln3 = sprxln2 = sprqoo.cfr_renamed_16379(this.cfr_renamed_17494(), this.cfr_renamed_16647(), sprlwo2.cfr_renamed_16647());
        sprxln3.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln3.cfr_renamed_12550(this.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    public long cfr_renamed_1942() {
        return this.cfr_renamed_112.cfr_renamed_1942();
    }

    @sprtea
    public void cfr_renamed_17487(int arg0, int arg1) {
        int n = (int)this.cfr_renamed_14060().cfr_renamed_3274();
        if (arg0 > n - arg1) {
            this.cfr_renamed_16065(arg0 - (n - arg1));
        }
    }

    private /* synthetic */ sprgeja cfr_renamed_17494() {
        return new sprgeja(this.cfr_renamed_13220(), this.cfr_renamed_13220(), this.cfr_renamed_13220(), this.cfr_renamed_13220());
    }

    private /* synthetic */ void cfr_renamed_17510() {
        this.cfr_renamed_13220();
        this.cfr_renamed_13220();
    }

    private /* synthetic */ boolean cfr_renamed_17502(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            if (arg0[n + 30] != this.cfr_renamed_91[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    @sprtea
    public void cfr_renamed_17511() {
        sprxln sprxln2;
        sprlwo sprlwo2 = this;
        sprxln sprxln3 = sprxln2 = sprqoo.cfr_renamed_16390(this.cfr_renamed_17494(), this.cfr_renamed_16647(), sprlwo2.cfr_renamed_16647());
        sprxln3.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln3.cfr_renamed_12550(this.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17512() {
        sprlwo sprlwo2 = this;
        this.cfr_renamed_3 = new sprtbp(this.cfr_renamed_16078());
    }

    @sprtea
    public void cfr_renamed_17513() {
        sprlwo sprlwo2 = this;
        sprsuja sprsuja2 = sprlwo2.cfr_renamed_16647();
        sprlwo2.cfr_renamed_17507();
        this.cfr_renamed_13220();
        this.cfr_renamed_13220();
        String string = this.cfr_renamed_17490();
        sprlwo sprlwo3 = this;
        sprthn sprthn2 = new sprthn(sprlwo3.cfr_renamed_2, sprlwo3.cfr_renamed_3.cfr_renamed_12551(), sprsuja2, string, 0.0f);
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprthn2);
        this.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_17514() {
        sprlwo sprlwo2 = this;
        sprsuja sprsuja2 = sprlwo2.cfr_renamed_16647();
        sprsuja sprsuja3 = sprlwo2.cfr_renamed_16647();
        sprxln sprxln2 = sprqoo.cfr_renamed_16380(new sprgeja(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181(), sprsuja3.cfr_renamed_1980() - sprsuja2.cfr_renamed_1980(), sprsuja3.spr\u3181() - sprsuja2.spr\u3181()));
        sprlwo sprlwo3 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo3.cfr_renamed_0);
        sprlwo3.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    private static /* synthetic */ byte[] cfr_renamed_17501(int arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            int n3 = n++;
            byArray[n3] = arg1[n3];
            n2 = n;
        }
        return byArray;
    }

    private /* synthetic */ sprsuja[] cfr_renamed_17497() {
        int n;
        int n2 = this.cfr_renamed_13218();
        sprsuja[] sprsujaArray = new sprsuja[n2];
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            sprsuja sprsuja2;
            sprsuja sprsuja3 = this.cfr_renamed_16647();
            if (sprsuja2.cfr_renamed_1980() <= (float)(this.cfr_renamed_1942() & 0xFFFFFFFFL) && sprsuja3.spr\u3181() <= (float)(this.cfr_renamed_1452() & 0xFFFFFFFFL)) {
                sprsujaArray[n] = sprsuja3;
            }
            n3 = ++n;
        }
        return sprsujaArray;
    }

    @sprtea
    public void cfr_renamed_17515() {
        sprlwo sprlwo2 = this;
        sprlwo2.cfr_renamed_13218();
        if (sprlwo2.cfr_renamed_93 != null) {
            this.cfr_renamed_4.cfr_renamed_12516(this.cfr_renamed_93);
            this.cfr_renamed_93 = null;
        }
    }

    @sprtea
    public void cfr_renamed_17516() {
        sprlwo sprlwo2 = this;
        sprsuja sprsuja2 = sprlwo2.cfr_renamed_16647();
        if (sprlwo2.cfr_renamed_2 != null) {
            sprsuja2 = new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181() + this.cfr_renamed_2.cfr_renamed_13265());
        }
        this.cfr_renamed_17507();
        this.cfr_renamed_13220();
        String string = this.cfr_renamed_17490();
        sprlwo sprlwo3 = this;
        sprthn sprthn2 = new sprthn(sprlwo3.cfr_renamed_2, sprlwo3.cfr_renamed_3.cfr_renamed_12551(), sprsuja2, string, 0.0f);
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprthn2);
        this.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }

    @sprtea
    public void cfr_renamed_16679() {
        sprqvo sprqvo2 = new sprqvo();
        sprlwo sprlwo2 = this;
        sprqvo sprqvo3 = sprqvo2;
        sprqvo3.cfr_renamed_17484(this);
        this.cfr_renamed_17517(0);
        String string = sprlwo2.cfr_renamed_17507();
        sprlwo2.cfr_renamed_17507();
        sprlwo sprlwo3 = this;
        this.cfr_renamed_13220();
        sprlwo sprlwo4 = this;
        long l = sprlwo4.cfr_renamed_13220();
        sprlwo3.cfr_renamed_17517(sprlwo4.cfr_renamed_13218());
        sprlwo3.cfr_renamed_13218();
        this.cfr_renamed_13218();
        sprlwo sprlwo5 = this;
        int n = sprlwo5.cfr_renamed_17495();
        sprlwo5.cfr_renamed_13218();
        this.cfr_renamed_13218();
        this.cfr_renamed_13218();
        this.cfr_renamed_16259();
        this.cfr_renamed_16259();
        this.cfr_renamed_16259();
        this.cfr_renamed_12137();
        if ((sprqvo3.cfr_renamed_3() & 0xFFFF) > 1) {
            this.cfr_renamed_12137();
            this.cfr_renamed_13218();
            this.cfr_renamed_16259();
            this.cfr_renamed_13218();
        }
        if ((sprqvo2.cfr_renamed_3() & 0xFFFF) > 2) {
            this.cfr_renamed_13218();
        }
        this.cfr_renamed_2 = this.cfr_renamed_119.cfr_renamed_14804(string, l, n);
    }

    @sprtea
    public void cfr_renamed_17518(sprlwo arg0) {
        new sprqvo().cfr_renamed_17484(arg0);
        arg0.cfr_renamed_13218();
        this.cfr_renamed_13220();
        this.cfr_renamed_13220();
        sprlwo sprlwo2 = this;
        sprlwo2.cfr_renamed_17510();
        sprlwo2.cfr_renamed_17510();
        arg0.cfr_renamed_16259();
    }

    public sprmrn cfr_renamed_17519() {
        int n;
        this.cfr_renamed_14060().cfr_renamed_11548(0L);
        this.cfr_renamed_112 = new sprrvo();
        this.cfr_renamed_112.cfr_renamed_17484(this);
        this.cfr_renamed_1 = new sprmrn();
        int n2 = n = 0;
        while ((long)n2 < (this.cfr_renamed_112.cfr_renamed_17520() & 0xFFFFFFFFL)) {
            this.cfr_renamed_152 = new sprkyo();
            this.cfr_renamed_152.cfr_renamed_17484(this);
            n2 = ++n;
        }
        return this.cfr_renamed_1;
    }

    private static /* synthetic */ byte[] cfr_renamed_17505(byte[] arg0, int arg1) {
        int n;
        byte[] byArray = new byte[arg0.length - arg1];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            int n3 = n++;
            byArray[n3] = arg0[n3 + arg1];
            n2 = n;
        }
        return byArray;
    }

    @sprtea
    public void cfr_renamed_17521() {
        sprghp sprghp2 = new sprghp(this.cfr_renamed_16078());
        this.cfr_renamed_0 = this.cfr_renamed_16259() ? sprghp2 : new sprghp(sprwbp.cfr_renamed_1447);
    }

    private /* synthetic */ String cfr_renamed_17507() {
        sprszca sprszca2 = sprszca.cfr_renamed_12817(sprctp.cfr_renamed_16449(this.cfr_renamed_132 & 0xFFFF, 1252));
        int n = sprszca2.cfr_renamed_17522() ? this.cfr_renamed_12254() : this.cfr_renamed_12261();
        sprujo sprujo2 = new sprujo(this.cfr_renamed_14060(), sprszca2);
        return new String(sprujo2.cfr_renamed_17523(n));
    }

    @sprtea
    public void cfr_renamed_17517(int arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public boolean cfr_renamed_17524() {
        this.cfr_renamed_14060().cfr_renamed_11548(0L);
        sprlwo sprlwo2 = this;
        String string = sprszca.cfr_renamed_14249().cfr_renamed_14565(sprlwo2.cfr_renamed_16065(6));
        sprlwo2.cfr_renamed_14060().cfr_renamed_11548(0L);
        return spravy.cfr_renamed_9(">y$w<|").equals(string);
    }

    @sprtea
    public void cfr_renamed_17525() {
        sprxln sprxln2 = sprqoo.cfr_renamed_16385(this.cfr_renamed_17494(), new sprphja(this.cfr_renamed_13220(), this.cfr_renamed_13220()));
        sprlwo sprlwo2 = this;
        sprxln2.cfr_renamed_12505(this.cfr_renamed_102);
        sprxln2.cfr_renamed_12550(sprlwo2.cfr_renamed_0);
        sprlwo2.cfr_renamed_1.cfr_renamed_12507(sprxln2);
    }
}

