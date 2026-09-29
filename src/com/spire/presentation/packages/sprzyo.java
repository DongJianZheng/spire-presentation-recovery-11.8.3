/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuja;
import com.spire.presentation.packages.spreso;
import com.spire.presentation.packages.sprfdp;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprfrja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprgmja;
import com.spire.presentation.packages.sprgvja;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.spriap;
import com.spire.presentation.packages.spricja;
import com.spire.presentation.packages.sprklja;
import com.spire.presentation.packages.sprmqja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpgja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprpmo;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqso;
import com.spire.presentation.packages.sprrgja;
import com.spire.presentation.packages.sprrpja;
import com.spire.presentation.packages.sprsro;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjja;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzjp;

@sprtea
public class sprzyo {
    private sprhbja cfr_renamed_91;
    public static final String cfr_renamed_0 = "TakaoPGothic";
    private int cfr_renamed_1;
    private sprfrja cfr_renamed_2;
    private int cfr_renamed_3;
    private sprfqja cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17711(sprtbp arg0, sprgvja[] arg1) {
        this.cfr_renamed_2.cfr_renamed_17712(spreso.cfr_renamed_16967(arg0), arg1);
    }

    @sprtea
    public sprcuja cfr_renamed_11632() {
        return this.cfr_renamed_2.cfr_renamed_11632();
    }

    @sprtea
    public void cfr_renamed_17713(sprqso arg0, int arg1, int arg2, int arg3, int arg4) {
        this.cfr_renamed_2.cfr_renamed_17714(arg0.cfr_renamed_17684(), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_17715(int arg0, int arg1, sprgvja[] arg2) {
        this.cfr_renamed_2.cfr_renamed_17715(arg0, arg1, arg2);
    }

    public void cfr_renamed_17716(sprqso arg0, sprgeja arg1, sprgeja arg2) {
        this.cfr_renamed_2.cfr_renamed_17717(arg0.cfr_renamed_17684(), arg1, arg2, 2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 3);
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

    @sprtea
    public void cfr_renamed_17718(sprcuja arg0) {
        this.cfr_renamed_2.cfr_renamed_17718(arg0);
    }

    @sprtea
    public sprrgja cfr_renamed_17719() {
        return null;
    }

    @sprtea
    public void cfr_renamed_17720(sprrgja arg0) {
    }

    public sprzyo(sprqso arg0) {
        this(arg0.cfr_renamed_17684());
    }

    @sprtea
    public void cfr_renamed_17721(float arg0, float arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_17721(arg0, arg1, arg2);
    }

    @sprtea
    public void cfr_renamed_17722(sprtbp arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3, sprsuja arg4) {
        this.cfr_renamed_2.cfr_renamed_17723(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_17724(sprmqja arg0, float arg1, float arg2, float arg3, float arg4) {
        sprpgja sprpgja2 = new sprpgja(arg0);
        try {
            this.cfr_renamed_2.cfr_renamed_17725(sprpgja2, arg1, arg2, arg3, arg4);
            if (sprpgja2 == null) return;
            sprpgja2.dispose();
            return;
        }
        catch (Throwable throwable) {
            if (sprpgja2 == null) throw throwable;
            sprpgja2.dispose();
            throw throwable;
        }
    }

    @sprtea
    public void cfr_renamed_17726(sprqso arg0, sprgeja arg1) {
        this.cfr_renamed_2.cfr_renamed_17727(arg0.cfr_renamed_17684(), arg1);
    }

    public sprfrja cfr_renamed_15026() {
        return this.cfr_renamed_17728(false);
    }

    public void cfr_renamed_16924(int arg0) {
        this.cfr_renamed_2.cfr_renamed_16924(arg0);
    }

    @sprtea
    public void cfr_renamed_17729(sprqso arg0, int arg1, int arg2, sprgeja arg3) {
        this.cfr_renamed_2.cfr_renamed_17730(arg0.cfr_renamed_17684(), arg1, arg2, arg3, 2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_17731(String arg0, sprhhp arg1, sprpln arg2, float arg3, float arg4) {
        sprzjp sprzjp2 = new sprzjp();
        try {
            sprklja sprklja2 = sprzyo.cfr_renamed_17732(arg1, sprzjp2);
            this.cfr_renamed_2.cfr_renamed_16978(arg0, sprklja2, spriap.cfr_renamed_16964(arg2), arg3, arg4);
            if (sprzjp2 == null) return;
            sprzjp2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprzjp2 == null) throw throwable;
            sprzjp2.cfr_renamed_11665();
            throw throwable;
        }
    }

    @sprtea
    public void cfr_renamed_17733(sprtbp arg0, sprpeja arg1, float arg2, float arg3) {
        this.cfr_renamed_2.cfr_renamed_17734(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3);
    }

    @sprtea
    public void cfr_renamed_17735(sprpln arg0, sprpmo arg1) {
        this.cfr_renamed_2.cfr_renamed_16986(spriap.cfr_renamed_16964(arg0), arg1.cfr_renamed_4);
    }

    public int cfr_renamed_16932() {
        return this.cfr_renamed_2.cfr_renamed_16932();
    }

    public void cfr_renamed_17736() {
        this.cfr_renamed_2.cfr_renamed_16007(3);
    }

    public void cfr_renamed_13994(sprwbp arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_17724(arg0.cfr_renamed_12795(), arg1, arg2, arg3, arg4);
    }

    private static /* synthetic */ sprklja cfr_renamed_17732(sprhhp arg0, sprzjp arg1) {
        sprhhp sprhhp2 = arg0;
        sprklja sprklja2 = sprfdp.cfr_renamed_16971(sprhhp2, arg1);
        if (sprhhp2.cfr_renamed_13461() != arg0.cfr_renamed_13261().cfr_renamed_13303()) {
            sprklja2 = new sprklja(sprklja2, arg0.cfr_renamed_13461());
        }
        return sprklja2;
    }

    public void cfr_renamed_16975(int arg0) {
        this.cfr_renamed_2.cfr_renamed_16975(arg0);
    }

    public void cfr_renamed_17737(sprqso arg0, float arg1, float arg2) {
        this.cfr_renamed_2.cfr_renamed_17738(arg0.cfr_renamed_17684(), arg1, arg2);
    }

    @sprtea
    public sprrpja cfr_renamed_17739(sprgeja arg0, sprgeja arg1, int arg2) {
        return this.cfr_renamed_2.cfr_renamed_17739(arg0, arg1, arg2);
    }

    public sprzyo(sprgmja arg0) {
        sprzyo sprzyo2 = this;
        sprzyo sprzyo3 = this;
        sprzyo2.cfr_renamed_2 = sprfrja.cfr_renamed_17708(arg0);
        sprzyo2.cfr_renamed_3 = sprzyo3.cfr_renamed_2.cfr_renamed_16926();
        sprzyo2.cfr_renamed_1 = sprzyo2.cfr_renamed_2.cfr_renamed_16927();
        sprzyo2.cfr_renamed_4 = sprzyo2.cfr_renamed_2.cfr_renamed_12672();
        sprzyo2.cfr_renamed_91 = sprzyo2.cfr_renamed_2.cfr_renamed_12590();
    }

    public void cfr_renamed_13572(float arg0) {
        float f = arg0;
        this.cfr_renamed_2.cfr_renamed_17740(f, f);
    }

    @sprtea
    public void cfr_renamed_17741(float arg0, float arg1) {
        this.cfr_renamed_2.cfr_renamed_17741(arg0, arg1);
    }

    public void cfr_renamed_17742(sprqso arg0, sprpeja arg1, sprpeja arg2) {
        this.cfr_renamed_2.cfr_renamed_17743(arg0.cfr_renamed_17684(), arg1, arg2, 2);
    }

    @sprtea
    public void cfr_renamed_17744(sprtbp arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_2.cfr_renamed_17745(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_17746(sprtbp arg0, sprsuja[] arg1) {
        this.cfr_renamed_2.cfr_renamed_17747(spreso.cfr_renamed_16967(arg0), arg1);
    }

    @sprtea
    public void cfr_renamed_17748(sprtbp arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        this.cfr_renamed_2.cfr_renamed_17749(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static sprzyo cfr_renamed_17750(sprqso arg0) {
        return new sprzyo(arg0);
    }

    public void cfr_renamed_17751(sprpln arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_2.cfr_renamed_17725(spriap.cfr_renamed_16964(arg0), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_17752(sprtbp arg0, sprpmo arg1) {
        this.cfr_renamed_2.cfr_renamed_16968(spreso.cfr_renamed_16967(arg0), arg1.cfr_renamed_4);
    }

    @sprtea
    public void cfr_renamed_17753(sprtbp arg0, sprgeja arg1, float arg2, float arg3) {
        this.cfr_renamed_2.cfr_renamed_17754(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3);
    }

    public void cfr_renamed_17755(sprtbp arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_2.cfr_renamed_17756(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_15996(sprwbp arg0) {
        this.cfr_renamed_2.cfr_renamed_17709(arg0.cfr_renamed_12795());
    }

    @sprtea
    public void cfr_renamed_17757(sprghp arg0, sprsuja[] arg1) {
        this.cfr_renamed_2.cfr_renamed_17758(spriap.cfr_renamed_16964(arg0), arg1);
    }

    public void cfr_renamed_17759(sprwbp arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_13994(arg0, arg1, arg2, arg3, arg4);
    }

    public sprfrja cfr_renamed_17728(boolean arg0) {
        return this.cfr_renamed_2;
    }

    @sprtea
    public void cfr_renamed_17760(sprtbp arg0, sprgvja arg1, sprgvja arg2, sprgvja arg3, sprgvja arg4) {
        this.cfr_renamed_2.cfr_renamed_17761(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_17762(sprrpja arg0) {
        this.cfr_renamed_2.cfr_renamed_17762(arg0);
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_2637();
    }

    public int cfr_renamed_16956() {
        return this.cfr_renamed_2.cfr_renamed_16956();
    }

    public void cfr_renamed_17763() {
        this.cfr_renamed_2.cfr_renamed_15987(5);
    }

    @sprtea
    public void cfr_renamed_17764(sprtbp arg0, int arg1, int arg2, int arg3, int arg4) {
        this.cfr_renamed_2.cfr_renamed_17765(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4);
    }

    @sprtea
    public void cfr_renamed_17766(sprtbp arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.cfr_renamed_2.cfr_renamed_17767(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_17768(String arg0, sprhhp arg1, sprpln arg2, float arg3, float arg4, float arg5, float arg6, boolean arg7) {
        sprzjp sprzjp2 = new sprzjp();
        try {
            float f = arg3;
            sprgeja sprgeja2 = new sprgeja(f, arg4, arg5 - f, arg6 - arg4);
            sprvjja sprvjja2 = new sprvjja();
            if (arg7) {
                sprvjja2.cfr_renamed_16548(3);
            }
            sprklja sprklja2 = sprzyo.cfr_renamed_17732(arg1, sprzjp2);
            this.cfr_renamed_2.cfr_renamed_17769(arg0, sprklja2, spriap.cfr_renamed_16964(arg2), sprgeja2, sprvjja2);
            if (sprzjp2 == null) return;
            sprzjp2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprzjp2 == null) throw throwable;
            sprzjp2.cfr_renamed_11665();
            throw throwable;
        }
    }

    public sprqgp cfr_renamed_12672() {
        return sprsro.cfr_renamed_16980(this.cfr_renamed_2.cfr_renamed_12672());
    }

    public void cfr_renamed_15024() {
        this.cfr_renamed_2.cfr_renamed_16431(3);
    }

    public float cfr_renamed_16959() {
        return this.cfr_renamed_2.cfr_renamed_16959();
    }

    @sprtea
    public void cfr_renamed_17770(sprqso arg0, sprgvja[] arg1) {
        this.cfr_renamed_2.cfr_renamed_17771(arg0.cfr_renamed_17684(), arg1);
    }

    public void cfr_renamed_2637() {
        if (this.cfr_renamed_2 != null) {
            if (this.cfr_renamed_91 != null) {
                this.cfr_renamed_91.dispose();
                this.cfr_renamed_91 = null;
            }
            if (this.cfr_renamed_4 != null) {
                this.cfr_renamed_4.dispose();
                this.cfr_renamed_4 = null;
            }
            this.cfr_renamed_2.dispose();
            this.cfr_renamed_2 = null;
        }
    }

    public void cfr_renamed_17772() {
        this.cfr_renamed_15024();
    }

    @sprtea
    public void cfr_renamed_17773(sprtbp arg0, sprsuja[] arg1) {
        throw new UnsupportedOperationException();
    }

    public void cfr_renamed_17774() {
        this.cfr_renamed_2.cfr_renamed_15987(7);
    }

    @sprtea
    public void cfr_renamed_17775(sprtbp arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        this.cfr_renamed_2.cfr_renamed_17776(spreso.cfr_renamed_16967(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @sprtea
    public void cfr_renamed_17777(sprtbp arg0, sprgvja[] arg1) {
        this.cfr_renamed_2.cfr_renamed_17778(spreso.cfr_renamed_16967(arg0), arg1);
    }

    public void cfr_renamed_17779() {
        this.cfr_renamed_2.cfr_renamed_16007(2);
    }

    public void cfr_renamed_17725(spricja arg0, float arg1, float arg2, float arg3, float arg4) {
        this.cfr_renamed_2.cfr_renamed_17725(arg0, arg1, arg2, arg3, arg4);
    }

    public void cfr_renamed_17780() {
        sprzyo sprzyo2 = this;
        sprzyo2.cfr_renamed_2.cfr_renamed_16007(4);
        sprzyo2.cfr_renamed_2.cfr_renamed_16431(4);
    }

    public void cfr_renamed_12643(sprqgp arg0) {
        this.cfr_renamed_2.cfr_renamed_16948(sprsro.cfr_renamed_16358(arg0));
    }

    public void cfr_renamed_16976(float arg0) {
        this.cfr_renamed_2.cfr_renamed_16976(arg0);
    }
}

