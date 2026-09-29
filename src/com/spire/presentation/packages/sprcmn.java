/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgvja;
import com.spire.presentation.packages.sprhyn;
import com.spire.presentation.packages.spriao;
import com.spire.presentation.packages.sprkin;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpzn;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrdo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwgs;
import com.spire.presentation.packages.sprwhp;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprwzn;
import com.spire.presentation.packages.sprypn;
import com.spire.presentation.packages.spryun;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzlp;
import com.spire.presentation.packages.sprzyo;
import java.util.Iterator;

@sprtea
public class sprcmn {
    private byte[] cfr_renamed_132;
    private sprtqo cfr_renamed_102;
    private double cfr_renamed_93;
    private boolean cfr_renamed_86;
    private sprwvn cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private boolean cfr_renamed_119;
    private double cfr_renamed_91;
    private sprkin cfr_renamed_0;
    private int cfr_renamed_1;
    private sprwbp[] cfr_renamed_2;
    private sprczo cfr_renamed_3;
    private sprwzn cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_14171(sprvyo arg0, spreen arg1) {
        if (arg0.cfr_renamed_14172() == 1 && this.cfr_renamed_0.cfr_renamed_14173() == 6) {
            this.cfr_renamed_0.cfr_renamed_14174(3);
        }
        switch (this.cfr_renamed_0.cfr_renamed_14173()) {
            case 6: {
                this.cfr_renamed_14175(arg0, arg1);
                return;
            }
            case 7: 
            case 8: {
                this.cfr_renamed_14176(arg0, true, arg1);
                return;
            }
        }
        this.cfr_renamed_14176(arg0, false, arg1);
    }

    @sprtea
    public byte[] cfr_renamed_14177() {
        return this.cfr_renamed_112;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public spruao cfr_renamed_14114() {
        switch (this.cfr_renamed_0.cfr_renamed_14173()) {
            case 7: 
            case 8: {
                return new sprhyn(this.cfr_renamed_0.cfr_renamed_14173(), this.cfr_renamed_3);
            }
            case 3: {
                return new spryun();
            }
            case 6: {
                return new spriao();
            }
            case 4: 
            case 5: {
                sprrdo sprrdo2;
                sprrdo sprrdo3 = sprrdo2 = new sprrdo();
                sprcmn sprcmn2 = this;
                sprrdo2.cfr_renamed_14178(this.cfr_renamed_1);
                sprrdo2.cfr_renamed_14179(sprcmn2.cfr_renamed_3.cfr_renamed_1942());
                sprrdo3.cfr_renamed_14180(sprcmn2.cfr_renamed_4.cfr_renamed_14181());
                sprrdo3.cfr_renamed_14182(this.cfr_renamed_0.cfr_renamed_14173() == 4);
                return sprrdo2;
            }
            case 1: {
                return null;
            }
            case 2: {
                return new sprpzn();
            }
        }
        throw new IllegalStateException(sprwgs.cfr_renamed_9(" i\u001ei\u001ap\u001b'\u001cj\u0014`\u0010'\u0016h\u0018w\u0007b\u0006t\u001ch\u001b'\u0013n\u0019s\u0010uUs\fw\u0010)"));
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_14176(sprvyo arg0, boolean arg1, spreen arg2) {
        var4_4 = arg0.cfr_renamed_14183(arg1);
        if (!this.cfr_renamed_0.cfr_renamed_14184()) {
            this.cfr_renamed_14185(var4_4);
        }
        if (var4_4.cfr_renamed_14186()) {
            this.cfr_renamed_14187(var4_4);
        }
        if (!this.cfr_renamed_0.cfr_renamed_14188()) ** GOTO lbl12
        if (var4_4.cfr_renamed_14189()) {
            var4_4 = var4_4.cfr_renamed_14190();
            v0 = this;
        } else {
            this.cfr_renamed_14191();
lbl12:
            // 2 sources

            v0 = this;
        }
        v0.cfr_renamed_4 = sprwzn.cfr_renamed_14192(var4_4.cfr_renamed_14193());
        v1 = var4_4;
        this.cfr_renamed_1 = v1.cfr_renamed_14121();
        if (v1.cfr_renamed_14193() == 1) {
            this.cfr_renamed_2 = var4_4.cfr_renamed_14120();
        }
        if (var4_4.cfr_renamed_14186()) {
            this.cfr_renamed_112 = var4_4.cfr_renamed_14194();
        }
        arg2.cfr_renamed_4924(var4_4.cfr_renamed_14195(), 0, var4_4.cfr_renamed_14195().length);
    }

    @sprtea
    public static sprcmn cfr_renamed_14113(sprypn arg0, byte[] arg1, sprtqo arg2) {
        sprkin sprkin2;
        sprkin sprkin3 = sprkin2 = new sprkin();
        sprypn sprypn2 = arg0;
        sprkin2.cfr_renamed_13408(sprypn2.cfr_renamed_13097().cfr_renamed_13404());
        sprkin3.cfr_renamed_14196(sprypn2.cfr_renamed_13097().cfr_renamed_12479());
        sprkin3.cfr_renamed_14197(false);
        return new sprcmn(arg1, arg2, sprkin2);
    }

    @sprtea
    public sprwbp[] cfr_renamed_14120() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_14198(sprvyo arg0, spreen arg1) {
        sprvyo sprvyo2;
        if (this.cfr_renamed_14199(arg0)) {
            arg1.cfr_renamed_4924(this.cfr_renamed_132, 0, this.cfr_renamed_132.length);
            sprvyo2 = arg0;
        } else {
            sprvyo sprvyo3 = arg0;
            sprvyo2 = sprvyo3;
            sprvyo3.cfr_renamed_14200(arg1, this.cfr_renamed_0.cfr_renamed_13404());
        }
        switch (sprvyo2.cfr_renamed_14172()) {
            case 0: {
                this.cfr_renamed_4 = sprwzn.cfr_renamed_14201();
                this.cfr_renamed_1 = 8;
                return;
            }
            case 2: {
                this.cfr_renamed_4 = sprwzn.cfr_renamed_14202();
                this.cfr_renamed_1 = 8;
                return;
            }
        }
        throw new IllegalStateException(sprqad.cfr_renamed_9("2J\u0002\\\u0017A\u0004P\u0002@GG\bH\bVGI\b@\u0002HI"));
    }

    private /* synthetic */ void cfr_renamed_14203() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_14187(sprwhp arg0) {
        switch (arg0.cfr_renamed_14193()) {
            case 0: {
                if (this.cfr_renamed_0.cfr_renamed_14204()) {
                    sprcmn.cfr_renamed_14205(arg0);
                    this.cfr_renamed_86 = true;
                    return;
                }
                sprcmn.cfr_renamed_14206(arg0);
                return;
            }
            case 1: {
                sprcmn.cfr_renamed_14207(arg0);
                return;
            }
            case 2: {
                return;
            }
        }
        throw new IllegalStateException(sprwgs.cfr_renamed_9("R\u001bb\rw\u0010d\u0001b\u0011'\u0016h\u0019h\u0007'\u0018h\u0011b\u0019)"));
    }

    private /* synthetic */ void cfr_renamed_14185(sprwhp arg0) {
        if (!arg0.cfr_renamed_14186()) {
            return;
        }
        if (arg0.cfr_renamed_14193() == 0) {
            sprcmn.cfr_renamed_14208(arg0);
        }
        arg0.cfr_renamed_14209(sprkpp.cfr_renamed_4);
        arg0.cfr_renamed_14210(false);
        this.cfr_renamed_14203();
    }

    private /* synthetic */ void cfr_renamed_14191() {
    }

    private static /* synthetic */ void cfr_renamed_14208(sprwhp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_14194().length) {
            if ((arg0.cfr_renamed_14194()[n] & 0xFF) != 255) {
                sprwhp sprwhp2 = arg0;
                double d = sprcmn.cfr_renamed_14211(sprwhp2.cfr_renamed_14194()[n]);
                int n3 = n * 3;
                sprwhp sprwhp3 = arg0;
                sprwhp2.cfr_renamed_14195()[n3] = sprcmn.cfr_renamed_14212(sprwhp3.cfr_renamed_14195()[n3], d);
                sprwhp3.cfr_renamed_14195()[n3 + 1] = sprcmn.cfr_renamed_14212(arg0.cfr_renamed_14195()[n3 + 1], d);
                sprwhp2.cfr_renamed_14195()[n3 + 2] = sprcmn.cfr_renamed_14212(arg0.cfr_renamed_14195()[n3 + 2], d);
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_14175(sprvyo arg0, spreen arg1) {
        if (!arg0.cfr_renamed_14213()) {
            this.cfr_renamed_14198(arg0, arg1);
            return;
        }
        if (!this.cfr_renamed_0.cfr_renamed_14184()) {
            sprcmn sprcmn2 = this;
            sprcmn2.cfr_renamed_14203();
            sprcmn2.cfr_renamed_14214(arg0, arg1, sprwbp.cfr_renamed_955);
            return;
        }
        sprcmn sprcmn3 = this;
        sprcmn3.cfr_renamed_112 = sprcmn3.cfr_renamed_14215(arg0);
        if (sprcmn3.cfr_renamed_112 != null && this.cfr_renamed_0.cfr_renamed_14204()) {
            this.cfr_renamed_14214(arg0, arg1, sprwbp.cfr_renamed_1513);
            return;
        }
        this.cfr_renamed_14198(arg0, arg1);
    }

    private static /* synthetic */ void cfr_renamed_14206(sprwhp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_14194().length) {
            if (arg0.cfr_renamed_14194()[n] == 0) {
                int n3 = n * 3;
                sprwhp sprwhp2 = arg0;
                sprwhp2.cfr_renamed_14195()[n3] = -1;
                sprwhp2.cfr_renamed_14195()[n3 + 1] = -1;
                sprwhp2.cfr_renamed_14195()[n3 + 2] = -1;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_14216() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_14214(sprvyo arg0, spreen arg1, sprwbp arg2) {
        block9: {
            sprcmn sprcmn2;
            block8: {
                sprvyo sprvyo2 = new sprvyo(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452(), arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218(), 2498570);
                try {
                    sprzyo sprzyo2 = new sprzyo(sprvyo2);
                    try {
                        sprzyo2.cfr_renamed_13994(arg2, 0.0f, 0.0f, arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452());
                    }
                    finally {
                        if (sprzyo2 != null) {
                            sprzyo2.cfr_renamed_11665();
                        }
                    }
                    sprpeja sprpeja2 = new sprpeja(0, 0, arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452());
                    sprvyo sprvyo3 = sprvyo2;
                    sprpeja sprpeja3 = sprpeja2;
                    arg0.cfr_renamed_13988(sprpeja3, sprvyo3, sprpeja3);
                    sprvyo3.cfr_renamed_14200(arg1, this.cfr_renamed_0.cfr_renamed_13404());
                    if (sprvyo2 == null) break block8;
                    sprcmn2 = this;
                }
                catch (Throwable throwable) {
                    if (sprvyo2 != null) {
                        sprvyo2.cfr_renamed_11665();
                    }
                    throw throwable;
                }
                sprvyo2.cfr_renamed_11665();
                break block9;
            }
            sprcmn2 = this;
        }
        sprcmn2.cfr_renamed_4 = sprwzn.cfr_renamed_14201();
        sprcmn sprcmn3 = this;
        sprcmn3.cfr_renamed_1 = 8;
        sprcmn3.cfr_renamed_86 = true;
    }

    public boolean cfr_renamed_14219() {
        return this.cfr_renamed_86;
    }

    public void cfr_renamed_14220(boolean arg0) {
        this.cfr_renamed_86 = arg0;
    }

    @sprtea
    public static sprcmn cfr_renamed_14221(sprgdo arg0, byte[] arg1, sprtqo arg2) {
        sprkin sprkin2;
        sprkin sprkin3 = sprkin2 = new sprkin();
        sprkin3.cfr_renamed_14174(arg0.cfr_renamed_13097().cfr_renamed_14173());
        sprkin3.cfr_renamed_13408(arg0.cfr_renamed_13097().cfr_renamed_13404());
        return new sprcmn(arg1, arg2, sprkin2);
    }

    private static /* synthetic */ void cfr_renamed_14207(sprwhp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_14120().length) {
            if (arg0.cfr_renamed_14120()[n].cfr_renamed_1778() == 0) {
                arg0.cfr_renamed_14120()[n] = sprwbp.cfr_renamed_1453;
            }
            n2 = ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_14222(sprlfja arg0, sprlfja arg1, sprvyo arg2) {
        sprlfja sprlfja2;
        if (this.cfr_renamed_0.cfr_renamed_14223() != 0) {
            if (this.cfr_renamed_93 <= (double)this.cfr_renamed_0.cfr_renamed_14223()) return false;
            if (this.cfr_renamed_91 <= (double)this.cfr_renamed_0.cfr_renamed_14223()) {
                return false;
            }
        }
        int n = 76800;
        int n2 = arg2.cfr_renamed_14172();
        int n3 = 3;
        int n4 = 3;
        switch (n2) {
            case 0: {
                n3 = 3;
                n4 = 3;
                sprlfja2 = arg1;
                break;
            }
            case 2: {
                n3 = 1;
                n4 = 1;
                sprlfja2 = arg1;
                break;
            }
            case 1: {
                n3 = 1;
                n4 = 3;
                sprlfja2 = arg1;
                break;
            }
            default: {
                throw new IllegalStateException(sprqad.cfr_renamed_9("2J\u0002\\\u0017A\u0004P\u0002@GG\bH\bVGI\b@\u0002HI"));
            }
        }
        if (sprlfja2.cfr_renamed_1942() * arg1.cfr_renamed_1452() * n4 + n >= arg0.cfr_renamed_1942() * arg0.cfr_renamed_1452() * n3) return false;
        boolean bl = true;
        boolean bl2 = bl;
        if (bl2) return this.cfr_renamed_14224(arg0, arg1, arg2);
        return false;
    }

    private static /* synthetic */ byte cfr_renamed_14225(byte arg0, double arg1) {
        return (byte)sprrgga.cfr_renamed_12793(arg1 * (double)(arg0 & 0xFF));
    }

    private /* synthetic */ boolean cfr_renamed_14199(sprvyo arg0) {
        return arg0.cfr_renamed_12642() == 5 && arg0.cfr_renamed_14172() != 1 && !arg0.cfr_renamed_14226() && this.cfr_renamed_0.cfr_renamed_13404() == 100;
    }

    private static /* synthetic */ void cfr_renamed_14205(sprwhp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_14194().length) {
            if ((arg0.cfr_renamed_14194()[n] & 0xFF) != 255) {
                sprwhp sprwhp2 = arg0;
                double d = sprcmn.cfr_renamed_14211(sprwhp2.cfr_renamed_14194()[n]);
                int n3 = n * 3;
                sprwhp sprwhp3 = arg0;
                sprwhp2.cfr_renamed_14195()[n3] = sprcmn.cfr_renamed_14225(sprwhp3.cfr_renamed_14195()[n3], d);
                sprwhp3.cfr_renamed_14195()[n3 + 1] = sprcmn.cfr_renamed_14225(arg0.cfr_renamed_14195()[n3 + 1], d);
                sprwhp2.cfr_renamed_14195()[n3 + 2] = sprcmn.cfr_renamed_14225(arg0.cfr_renamed_14195()[n3 + 2], d);
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_13227(spreen arg0) {
        block3: {
            sprvyo sprvyo2 = this.cfr_renamed_14227();
            try {
                sprvyo sprvyo3 = sprvyo2;
                this.cfr_renamed_3 = sprczo.cfr_renamed_14228(sprvyo3.cfr_renamed_1942(), sprvyo2.cfr_renamed_1452(), sprvyo2.cfr_renamed_14217(), sprvyo2.cfr_renamed_14218());
                this.cfr_renamed_14171(sprvyo3, arg0);
                if (sprvyo2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
                throw throwable;
            }
            sprvyo2.cfr_renamed_11665();
            return;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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
    public sprwzn cfr_renamed_12768() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ byte[] cfr_renamed_14215(sprvyo arg0) {
        if (arg0.cfr_renamed_14172() != 0) {
            return null;
        }
        if (!arg0.cfr_renamed_14213()) {
            return null;
        }
        return arg0.cfr_renamed_14229();
    }

    public void cfr_renamed_14230(sprqgp arg0) {
        sprovja.cfr_renamed_11658(this.cfr_renamed_152, arg0);
    }

    @sprtea
    public sprczo cfr_renamed_13711() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_14121() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcmn(byte[] byArray, sprtqo sprtqo2, sprkin sprkin2) {
        void arg1;
        void arg0;
        sprcmn sprcmn2 = this;
        sprcmn sprcmn3 = this;
        sprcmn3.cfr_renamed_152 = new sprwvn();
        sprcmn2.cfr_renamed_86 = false;
        sprcmn2.cfr_renamed_132 = arg0;
        this.cfr_renamed_102 = arg1;
        this.cfr_renamed_0 = sprkin2;
        if (this.cfr_renamed_0.cfr_renamed_14188()) {
            sprcmn sprcmn4 = this;
            sprcmn4.cfr_renamed_14216();
            sprcmn4.cfr_renamed_0.cfr_renamed_14174(3);
            return;
        }
        if (this.cfr_renamed_0.cfr_renamed_14173() == 6) {
            sprcmn sprcmn5 = this;
            sprcmn5.cfr_renamed_0.cfr_renamed_14174(sprsto.cfr_renamed_13225(sprcmn5.cfr_renamed_132) == 5 ? 6 : 3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ sprvyo cfr_renamed_14227() {
        sprvyo sprvyo2 = null;
        try {
            sprvyo2 = new sprvyo(this.cfr_renamed_132);
            boolean bl = this.cfr_renamed_102 != null && this.cfr_renamed_102.cfr_renamed_14231();
            sprczo sprczo2 = sprsto.cfr_renamed_13321(this.cfr_renamed_132);
            sprpeja sprpeja2 = bl ? this.cfr_renamed_102.cfr_renamed_14232(new sprpeja(sprgvja.cfr_renamed_3, sprczo2.cfr_renamed_2773())) : new sprpeja(sprgvja.cfr_renamed_3, sprczo2.cfr_renamed_2773());
            sprcmn sprcmn2 = this;
            sprlfja sprlfja2 = sprcmn2.cfr_renamed_14233(sprpeja2.cfr_renamed_2773());
            boolean bl2 = sprcmn2.cfr_renamed_14222(sprpeja2.cfr_renamed_2773(), sprlfja2, sprvyo2);
            sprlfja sprlfja3 = sprlfja2 = bl2 ? sprlfja2 : sprpeja2.cfr_renamed_2773();
            if (!bl && !bl2) {
                this.cfr_renamed_119 = true;
                sprvyo sprvyo3 = sprvyo2;
                return sprvyo3;
            }
            sprvyo sprvyo4 = sprvyo2.cfr_renamed_14234(sprpeja2, sprlfja2, sprvyo2.cfr_renamed_14217(), sprvyo2.cfr_renamed_14218());
            this.cfr_renamed_119 = false;
            sprvyo sprvyo5 = sprvyo4;
            return sprvyo5;
        }
        finally {
            if (sprvyo2 != null && !this.cfr_renamed_119) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    private static /* synthetic */ double cfr_renamed_14211(byte arg0) {
        return (double)(arg0 & 0xFF) / 255.0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_14224(sprlfja arg0, sprlfja arg1, sprvyo arg2) {
        sprvyo sprvyo2;
        sprpdja sprpdja2;
        sprvyo sprvyo3;
        block8: {
            boolean bl;
            if (this.cfr_renamed_0.cfr_renamed_14173() != 6) return true;
            if (!this.cfr_renamed_14199(arg2)) {
                return true;
            }
            sprvyo3 = arg2.cfr_renamed_14234(new sprpeja(sprgvja.cfr_renamed_3, arg0), arg1, arg2.cfr_renamed_14217(), arg2.cfr_renamed_14218());
            try {
                block9: {
                    sprpdja2 = new sprpdja();
                    try {
                        sprvyo3.cfr_renamed_14200(sprpdja2, this.cfr_renamed_0.cfr_renamed_13404());
                        if (sprpdja2.cfr_renamed_806() <= (long)this.cfr_renamed_132.length) break block8;
                        bl = false;
                        if (sprpdja2 == null) break block9;
                    }
                    catch (Throwable throwable) {
                        if (sprpdja2 == null) throw throwable;
                        sprpdja2.cfr_renamed_2637();
                        throw throwable;
                    }
                    sprpdja2.cfr_renamed_2637();
                }
                if (sprvyo3 == null) return bl;
            }
            catch (Throwable throwable) {
                if (sprvyo3 == null) throw throwable;
                sprvyo3.cfr_renamed_11665();
                throw throwable;
            }
            sprvyo3.cfr_renamed_11665();
            return bl;
        }
        if (sprpdja2 != null) {
            sprvyo2 = sprvyo3;
            sprpdja2.cfr_renamed_2637();
        } else {
            sprvyo2 = sprvyo3;
        }
        if (sprvyo2 == null) return true;
        sprvyo3.cfr_renamed_11665();
        return true;
    }

    private /* synthetic */ sprlfja cfr_renamed_14233(sprlfja arg0) {
        Iterator iterator;
        if (this.cfr_renamed_152.size() == 0 || !this.cfr_renamed_0.cfr_renamed_14023()) {
            return arg0;
        }
        double d = 0.0;
        double d2 = 0.0;
        Iterator iterator2 = iterator = this.cfr_renamed_152.iterator();
        while (iterator2.hasNext()) {
            sprqgp sprqgp2 = (sprqgp)iterator.next();
            sprsuja[] sprsujaArray = sprqgp2.cfr_renamed_14235(new sprgeja(0.0f, 0.0f, 1.0f, 1.0f));
            double d3 = sprzlp.cfr_renamed_13957(sprsujaArray[0], sprsujaArray[1]);
            double d4 = sprzlp.cfr_renamed_13957(sprsujaArray[0], sprsujaArray[3]);
            d = d3 > d ? d3 : d;
            d2 = d4 > d2 ? d4 : d2;
            iterator2 = iterator;
        }
        this.cfr_renamed_93 = (double)arg0.cfr_renamed_1942() / sprnmp.cfr_renamed_13293(d);
        this.cfr_renamed_91 = (double)arg0.cfr_renamed_1452() / sprnmp.cfr_renamed_13293(d2);
        double d5 = (double)this.cfr_renamed_0.cfr_renamed_14236() / this.cfr_renamed_93;
        double d6 = (double)this.cfr_renamed_0.cfr_renamed_14236() / this.cfr_renamed_91;
        sprlfja sprlfja2 = arg0;
        int n = d5 < 1.0 ? spryxp.cfr_renamed_14019((double)sprlfja2.cfr_renamed_1942() * d5) : sprlfja2.cfr_renamed_1942();
        sprlfja sprlfja3 = arg0;
        int n2 = d6 < 1.0 ? spryxp.cfr_renamed_14019((double)sprlfja3.cfr_renamed_1452() * d6) : sprlfja3.cfr_renamed_1452();
        return new sprlfja(n, n2);
    }

    private static /* synthetic */ byte cfr_renamed_14212(byte arg0, double arg1) {
        return (byte)sprrgga.cfr_renamed_12793(255.0 + arg1 * (double)((arg0 & 0xFF) - 255));
    }
}

