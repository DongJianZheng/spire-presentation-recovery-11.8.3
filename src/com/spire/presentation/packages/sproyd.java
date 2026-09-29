/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbf;
import com.spire.presentation.packages.sprfoe;
import com.spire.presentation.packages.sprfwd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.spriod;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprjpe;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprnoe;
import com.spire.presentation.packages.sprnyd;
import com.spire.presentation.packages.sprqoe;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprre;
import com.spire.presentation.packages.sprsqe;
import com.spire.presentation.packages.sprsxd;
import com.spire.presentation.packages.sprtod;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprupe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwyd;
import com.spire.presentation.packages.sprxro;
import com.spire.presentation.packages.sprxry;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprzod;
import com.spire.presentation.packages.sprzpe;
import java.io.IOException;

public class sproyd {
    public static final int cfr_renamed_91 = 2;
    public static final int cfr_renamed_0 = 3;
    private final sprnoe cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    private final sprqoe cfr_renamed_4;

    private /* synthetic */ sprfoe cfr_renamed_4376(sprtzd arg0) {
        int n;
        if (this.cfr_renamed_1 == null) {
            return null;
        }
        sprfoe[] sprfoeArray = this.cfr_renamed_1.cfr_renamed_4377();
        sprfoe sprfoe2 = null;
        int n2 = n = 0;
        while (n2 != sprfoeArray.length) {
            if (sprfoeArray[n].cfr_renamed_324().equals(arg0)) {
                sprfoe2 = sprfoeArray[n];
                return sprfoe2;
            }
            n2 = ++n;
        }
        return sprfoe2;
    }

    /*
     * WARNING - void declaration
     */
    public sproyd(sprqoe sprqoe2) {
        void arg0;
        sproyd sproyd2 = this;
        sproyd2.cfr_renamed_4 = arg0;
        sproyd2.cfr_renamed_1 = sprqoe2.cfr_renamed_609().cfr_renamed_4378();
    }

    public boolean cfr_renamed_4379(sprja arg0, sprsxd arg1, char[] arg2) throws sprzod, IllegalStateException {
        sprzpe sprzpe2 = this.cfr_renamed_4.cfr_renamed_2431();
        if (sprzpe2.cfr_renamed_324() == 1) {
            sprsqe sprsqe2 = sprsqe.cfr_renamed_23(sprzpe2.cfr_renamed_2456());
            if (sprsqe2.cfr_renamed_4380() == null || sprsqe2.cfr_renamed_4380().cfr_renamed_4381() != null) {
                throw new IllegalStateException(sprxro.cfr_renamed_9("w\u001a9%R8X69\u0005k\u0010j\u0010w\u00019\u001cwUi\u0007v\u001a\u007fUv\u00139\u0005v\u0006j\u0010j\u0006p\u001aw"));
            }
            sprmoe sprmoe2 = sprsqe2.cfr_renamed_4380().cfr_renamed_4382();
            if (new sprfwd(arg1).cfr_renamed_4331(sprmoe2, arg2, this.cfr_renamed_4351().cfr_renamed_1157())) {
                return this.cfr_renamed_4383(arg0, sprsqe2);
            }
            return false;
        }
        throw new IllegalStateException(sprxry.cfr_renamed_9("zn`!Ghso}os!_dm!`xdd4nr!ds{nr!{g4q{rgdgr}nz"));
    }

    public boolean cfr_renamed_4384() {
        return this.cfr_renamed_4.cfr_renamed_2431() != null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_4383(sprja arg0, sprsqe arg1) throws sprzod {
        sprga sprga2;
        sprga sprga3;
        try {
            sprga3 = arg0.cfr_renamed_578(arg1.cfr_renamed_615());
        }
        catch (sprfya sprfya2) {
            throw new sprzod(new StringBuilder().insert(0, sprxro.cfr_renamed_9("l\u001bx\u0017u\u00109\u0001vUz\u0007|\u0014m\u00109\u0003|\u0007p\u0013p\u0010kO9")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
        if (arg1.cfr_renamed_4380() != null) {
            sprga sprga4 = sprga3;
            sprga2 = sprga4;
            sprwyd.cfr_renamed_4329(arg1.cfr_renamed_4380(), sprga4.cfr_renamed_470());
            return sprga2.cfr_renamed_1435(arg1.cfr_renamed_79().cfr_renamed_81());
        }
        sprwyd.cfr_renamed_4329(this.cfr_renamed_4.cfr_renamed_609(), sprga3.cfr_renamed_470());
        sprga2 = sprga3;
        return sprga2.cfr_renamed_1435(arg1.cfr_renamed_79().cfr_renamed_81());
    }

    public boolean cfr_renamed_4385() {
        sprzpe sprzpe2 = this.cfr_renamed_4.cfr_renamed_2431();
        if (sprzpe2.cfr_renamed_324() == 1) {
            return sprsqe.cfr_renamed_23(sprzpe2.cfr_renamed_2456()).cfr_renamed_4380().cfr_renamed_4382() != null;
        }
        return false;
    }

    public boolean cfr_renamed_4386(sprtzd arg0) {
        return this.cfr_renamed_4376(arg0) != null;
    }

    public sprre cfr_renamed_4387(sprtzd arg0) {
        sprfoe sprfoe2 = this.cfr_renamed_4376(arg0);
        if (sprfoe2 != null) {
            if (sprfoe2.cfr_renamed_324().equals(sprbf.cfr_renamed_0)) {
                return new sprtod(sprjpe.cfr_renamed_23(sprfoe2.cfr_renamed_97()));
            }
            if (sprfoe2.cfr_renamed_324().equals(sprbf.cfr_renamed_91)) {
                return new spriod(sprxte.cfr_renamed_23(sprfoe2.cfr_renamed_97()));
            }
            if (sprfoe2.cfr_renamed_324().equals(sprbf.cfr_renamed_4)) {
                return new sprnyd(sprxte.cfr_renamed_23(sprfoe2.cfr_renamed_97()));
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprqoe cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprqoe.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprxry.cfr_renamed_9("lumrnflqe4euuu;4")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprxro.cfr_renamed_9("\u0018x\u0019\u007f\u001ak\u0018|\u00119\u0011x\u0001xO9")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprupe cfr_renamed_4351() {
        return this.cfr_renamed_4.cfr_renamed_609().cfr_renamed_4351();
    }

    public sprqoe cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sproyd(byte[] arg0) throws IOException {
        this(sproyd.cfr_renamed_1443(arg0));
    }

    public int cfr_renamed_4388() {
        return this.cfr_renamed_4.cfr_renamed_2431().cfr_renamed_324();
    }

    public boolean cfr_renamed_4389(sprja arg0) throws sprzod, IllegalStateException {
        sprzpe sprzpe2 = this.cfr_renamed_4.cfr_renamed_2431();
        if (sprzpe2.cfr_renamed_324() == 1) {
            sprsqe sprsqe2 = sprsqe.cfr_renamed_23(sprzpe2.cfr_renamed_2456());
            if (sprsqe2.cfr_renamed_4380() != null && sprsqe2.cfr_renamed_4380().cfr_renamed_4382() != null) {
                throw new IllegalStateException(sprxry.cfr_renamed_9("wqs}g}buu}nz!fdet}sqr4qurgv{sp!wiqb\u007f"));
            }
            return this.cfr_renamed_4383(arg0, sprsqe2);
        }
        throw new IllegalStateException(sprxro.cfr_renamed_9("w\u001amUJ\u001c~\u001bp\u001b~UR\u0010`Um\fi\u00109\u001a\u007fUi\u0007v\u001a\u007fUv\u00139\u0005v\u0006j\u0010j\u0006p\u001aw"));
    }

    public boolean cfr_renamed_4390() {
        return this.cfr_renamed_1 != null;
    }
}

