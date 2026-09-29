/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprcy;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgmga;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.spridja;
import com.spire.presentation.packages.spriez;
import com.spire.presentation.packages.sprihja;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprmv;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprmzn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprten;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprwin
implements sprmv {
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    public sprgmga cfr_renamed_2;
    public StringBuilder cfr_renamed_3;
    private static final String cfr_renamed_4 = "\r\n";

    @Override
    public void cfr_renamed_12390(String arg0, sprgtja arg1) {
        if (arg1.cfr_renamed_12010() > 1) {
            this.cfr_renamed_12391(arg0, sprebp.cfr_renamed_12392(arg1));
        }
    }

    public void cfr_renamed_12393(String arg0) {
        this.cfr_renamed_2.cfr_renamed_12393(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_12394(String string, StringBuilder stringBuilder) {
        String arg0;
        Iterator iterator;
        void arg1;
        arg1.setLength(0);
        if (!sprznp.cfr_renamed_12328(string)) {
            return;
        }
        String string2 = sprraia.cfr_renamed_11844('_', 1);
        boolean bl = true;
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            sprghha.cfr_renamed_12279((StringBuilder)arg1, sprwin.cfr_renamed_12395(n, bl) ? sprxsp.cfr_renamed_12396(n) : string2);
            bl = false;
            iterator2 = iterator;
        }
    }

    private /* synthetic */ void cfr_renamed_12397(spriez arg0, boolean arg1) {
        if (arg0.cfr_renamed_12398() == -1) {
            return;
        }
        if (arg1 && this.cfr_renamed_2.cfr_renamed_12399() == 1) {
            String string;
            String string2 = sprraia.cfr_renamed_11844(this.cfr_renamed_2.cfr_renamed_12400(), this.cfr_renamed_2.cfr_renamed_12401() * this.cfr_renamed_0);
            spriez spriez2 = arg0;
            while ((string = spriez2.cfr_renamed_8520()) != null) {
                spriez2 = arg0;
                sprwin sprwin2 = this;
                sprwin2.cfr_renamed_2.cfr_renamed_12402(cfr_renamed_4);
                sprwin2.cfr_renamed_2.cfr_renamed_12402(string2);
                sprwin2.cfr_renamed_2.cfr_renamed_12402(string);
            }
            this.cfr_renamed_1 = true;
            return;
        }
        this.cfr_renamed_2.cfr_renamed_12402(arg0.cfr_renamed_12403());
    }

    @Override
    public void cfr_renamed_12404(String arg0, String arg1, String arg2) {
        if (sprraia.cfr_renamed_11730(arg1, arg2)) {
            return;
        }
        this.cfr_renamed_12405(arg0, arg1);
    }

    private static /* synthetic */ boolean cfr_renamed_12395(int arg0, boolean arg1) {
        if (arg1) {
            return sprwin.cfr_renamed_12406(arg0);
        }
        return sprwin.cfr_renamed_12407(arg0);
    }

    @Override
    public void cfr_renamed_12408(String arg0) {
        this.cfr_renamed_12409(arg0, true);
    }

    public sprwin(spreen arg0, boolean arg1) {
        this(arg0, sprszca.cfr_renamed_11605(), arg1);
    }

    @Override
    public void cfr_renamed_12410(String arg0) {
        this.cfr_renamed_12391(arg0, null);
    }

    @Override
    public void cfr_renamed_12411(String arg0, int arg1) {
        this.cfr_renamed_12391(arg0, sprebp.cfr_renamed_12412(arg1));
    }

    public void cfr_renamed_12413(String arg0) {
    }

    public void cfr_renamed_12414(boolean arg0) {
        this.cfr_renamed_2.cfr_renamed_12415(arg0 ? 1 : 0);
    }

    private /* synthetic */ void cfr_renamed_12416() {
        if (this.cfr_renamed_1) {
            sprwin sprwin2 = this;
            sprwin2.cfr_renamed_2.cfr_renamed_12402(cfr_renamed_4);
            sprwin sprwin3 = this;
            String string = sprraia.cfr_renamed_11844(sprwin2.cfr_renamed_2.cfr_renamed_12400(), this.cfr_renamed_2.cfr_renamed_12401() * sprwin3.cfr_renamed_0);
            sprwin3.cfr_renamed_2.cfr_renamed_12402(string);
            sprwin2.cfr_renamed_1 = false;
        }
    }

    @Override
    public void cfr_renamed_12417(String arg0, boolean arg1) {
        if (arg1 && this.cfr_renamed_2.cfr_renamed_12399() == 1) {
            this.cfr_renamed_12397(new sprihja(arg0), true);
            return;
        }
        this.cfr_renamed_2.cfr_renamed_12402(arg0);
    }

    @Override
    public void cfr_renamed_12418() {
        this.cfr_renamed_12409(null, true);
    }

    public static boolean cfr_renamed_12419(String arg0) {
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return false;
        }
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            if (sprwin.cfr_renamed_12420((Integer)iterator.next())) continue;
            return true;
        }
        return false;
    }

    public void cfr_renamed_12421(String arg0, String arg1, boolean arg2) {
        if (arg2) {
            this.cfr_renamed_2.cfr_renamed_12405(arg0, this.cfr_renamed_12422(arg1));
            return;
        }
        this.cfr_renamed_2.cfr_renamed_12405(arg0, arg1);
    }

    @Override
    public void cfr_renamed_12402(String arg0) {
        this.cfr_renamed_12417(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12423(String string) {
        void arg0;
        sprwin sprwin2 = this;
        sprwin sprwin3 = this;
        sprwin3.cfr_renamed_12416();
        sprwin3.cfr_renamed_12424((String)arg0);
        sprwin2.cfr_renamed_2.cfr_renamed_12425((String)arg0);
        sprwin2.cfr_renamed_12413(string);
        ++sprwin2.cfr_renamed_0;
    }

    private static /* synthetic */ boolean cfr_renamed_12406(int arg0) {
        return arg0 >= 65 && arg0 <= 90 || arg0 == 95 || arg0 >= 97 && arg0 <= 122 || arg0 >= 192 && arg0 <= 214 || arg0 >= 216 && arg0 <= 246 || arg0 >= 248 && arg0 <= 767 || arg0 >= 880 && arg0 <= 893 || arg0 >= 895 && arg0 <= 8191 || arg0 >= 8204 && arg0 <= 8205 || arg0 >= 8304 && arg0 <= 8591 || arg0 >= 11264 && arg0 <= 12271 || arg0 >= 12289 && arg0 <= 55295 || arg0 >= 63744 && arg0 <= 64975 || arg0 >= 65008 && arg0 <= 65533 || arg0 >= 65536 && arg0 <= 983039;
    }

    public void cfr_renamed_2947() {
        this.cfr_renamed_2.cfr_renamed_2947();
    }

    private static /* synthetic */ boolean cfr_renamed_12407(int arg0) {
        return sprwin.cfr_renamed_12406(arg0) || arg0 == 45 || arg0 == 46 || arg0 >= 48 && arg0 <= 57 || arg0 == 183 || arg0 >= 768 && arg0 <= 879 || arg0 >= 8255 && arg0 <= 8256;
    }

    public void cfr_renamed_12424(String arg0) {
    }

    public void cfr_renamed_12426(String arg0, String arg1) {
        this.cfr_renamed_2.cfr_renamed_12426(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_12427(spreen spreen2, boolean bl) {
        void arg1;
        void arg0;
        this.cfr_renamed_12397(new spridja((spreen)arg0, sprszca.cfr_renamed_11605()), (boolean)arg1);
    }

    public void cfr_renamed_12428() {
    }

    public static sprmjp cfr_renamed_12429(sprcy arg0) {
        sprmjp sprmjp2 = null;
        StringBuilder stringBuilder = new StringBuilder(1024);
        block0: for (String string : arg0) {
            int n;
            String string2;
            if (sprwin.cfr_renamed_12430(string)) continue;
            if (sprmjp2 == null) {
                sprmjp2 = new sprmjp(false);
            }
            sprwin.cfr_renamed_12394(string, stringBuilder);
            String string3 = string2 = stringBuilder.toString();
            int n2 = n = 1;
            while (n2 < 1000) {
                if (!arg0.cfr_renamed_12431(string3) && !sprmjp2.cfr_renamed_8526(string3)) {
                    sprmjp2.cfr_renamed_12432(string, string3);
                    continue block0;
                }
                Object[] objectArray = new Object[2];
                objectArray[0] = string2;
                Integer n3 = n;
                objectArray[1] = n3;
                string3 = sprraia.cfr_renamed_11562("{0}_{1}", objectArray);
                n2 = ++n;
            }
        }
        return sprmjp2;
    }

    @Override
    public void cfr_renamed_12433(String arg0, String arg1) {
        if (sprznp.cfr_renamed_12328(arg1)) {
            this.cfr_renamed_12391(arg0, arg1);
        }
    }

    public void cfr_renamed_12434() {
        this.cfr_renamed_2.cfr_renamed_12435();
    }

    private /* synthetic */ void cfr_renamed_12409(String string, boolean bl) {
        sprwin sprwin2;
        sprwin sprwin3 = this;
        sprwin3.cfr_renamed_0 = sprrgga.cfr_renamed_2548(sprwin3.cfr_renamed_0 - 1, 0);
        sprwin3.cfr_renamed_12416();
        sprwin3.cfr_renamed_12428();
        if (bl) {
            sprwin sprwin4 = this;
            sprwin2 = sprwin4;
            sprwin4.cfr_renamed_2.cfr_renamed_12436();
        } else {
            sprwin sprwin5 = this;
            sprwin2 = sprwin5;
            sprwin5.cfr_renamed_2.cfr_renamed_12437();
        }
        sprwin2.cfr_renamed_12438();
    }

    private static /* synthetic */ boolean cfr_renamed_12430(String arg0) {
        Iterator iterator;
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return false;
        }
        boolean bl = true;
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            if (!sprwin.cfr_renamed_12395((Integer)iterator.next(), bl)) {
                return false;
            }
            bl = false;
            iterator2 = iterator;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12391(String string, String string2) {
        void arg0;
        sprwin sprwin2 = this;
        sprwin2.cfr_renamed_12423((String)arg0);
        sprwin2.cfr_renamed_9853(string2);
        sprwin2.cfr_renamed_12439();
    }

    @Override
    public void cfr_renamed_12405(String arg0, String arg1) {
        this.cfr_renamed_2.cfr_renamed_12405(arg0, this.cfr_renamed_12422(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprwin(spreen spreen2, sprszca sprszca2, boolean bl) {
        void arg2;
        void arg0;
        byte[] byArray;
        void arg1;
        int n = 65000;
        byte[] byArray2 = new byte[5];
        byArray2[0] = 43;
        byArray2[1] = 47;
        byArray2[2] = 118;
        byArray2[3] = 56;
        byArray2[4] = 45;
        byte[] byArray3 = byArray2;
        if (arg1.cfr_renamed_11859() == n && (byArray = arg1.cfr_renamed_12440()).length == 0) {
            byArray = byArray3;
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        }
        this.cfr_renamed_2 = sprten.cfr_renamed_12338((spreen)arg0, (sprszca)arg1);
        sprwin sprwin2 = this;
        sprwin2.cfr_renamed_3 = new StringBuilder(2048);
        this.cfr_renamed_2.cfr_renamed_12441(false);
        if (arg2 != false) {
            sprwin sprwin3 = this;
            sprwin3.cfr_renamed_2.cfr_renamed_12415(1);
            sprwin3.cfr_renamed_2.cfr_renamed_12442(1);
            sprwin3.cfr_renamed_2.cfr_renamed_12443('\t');
        }
    }

    public String cfr_renamed_12422(String arg0) {
        if (!sprwin.cfr_renamed_12419(arg0)) {
            return arg0;
        }
        this.cfr_renamed_3.setLength(0);
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (!sprwin.cfr_renamed_12420(n)) continue;
            sprghha.cfr_renamed_12279(this.cfr_renamed_3, sprxsp.cfr_renamed_12396(n));
        }
        return this.cfr_renamed_3.toString();
    }

    private static /* synthetic */ boolean cfr_renamed_12420(int arg0) {
        return arg0 == 9 || arg0 == 10 || arg0 == 13 || arg0 >= 32 && arg0 <= 55295 || arg0 >= 57344 && arg0 <= 65533 || arg0 >= 65536 && arg0 <= 0x10FFFF;
    }

    @Override
    public void cfr_renamed_12444(byte[] arg0, int arg1, int arg2) {
        sprfym sprfym2;
        sprfym sprfym3 = sprfym2 = new sprfym(arg0, arg1, arg2);
        while (!sprfym3.cfr_renamed_12445()) {
            sprwin sprwin2 = this;
            sprfym sprfym4 = sprfym2;
            sprfym3 = sprfym4;
            sprwin2.cfr_renamed_9853(sprfym4.cfr_renamed_12446());
            sprwin2.cfr_renamed_2.cfr_renamed_12447(cfr_renamed_4);
        }
    }

    public sprwin() {
    }

    public void cfr_renamed_12448(String arg0) {
        this.cfr_renamed_9853(arg0.replace(cfr_renamed_4, "\n").replace("\r", sprmzn.cfr_renamed_9("S\u0015<]<)S")).replace("\n", cfr_renamed_4));
    }

    @Override
    public void cfr_renamed_12439() {
        this.cfr_renamed_12409(null, false);
    }

    public void cfr_renamed_12449(boolean arg0) {
        this.cfr_renamed_2.cfr_renamed_12450(arg0);
    }

    @Override
    public void cfr_renamed_12451(spreen arg0) {
        if (arg0 instanceof sprpdja) {
            this.cfr_renamed_12444(((sprpdja)arg0).cfr_renamed_3461(), 0, (int)arg0.cfr_renamed_806());
            return;
        }
        this.cfr_renamed_12444(sprmvo.cfr_renamed_12452(arg0), 0, (int)arg0.cfr_renamed_806());
    }

    @Override
    public void cfr_renamed_12453() {
        sprwin sprwin2 = this;
        while (sprwin2.cfr_renamed_0 > 0) {
            sprwin sprwin3 = this;
            sprwin2 = sprwin3;
            sprwin3.cfr_renamed_12439();
        }
        sprwin sprwin4 = this;
        sprwin4.cfr_renamed_2.cfr_renamed_12454();
        sprwin4.cfr_renamed_2.cfr_renamed_2947();
    }

    public void cfr_renamed_12455(String arg0) {
        this.cfr_renamed_2.cfr_renamed_12455(arg0);
    }

    @Override
    public void cfr_renamed_12456(String arg0) {
        this.cfr_renamed_12409(arg0, false);
    }

    public boolean cfr_renamed_12457() {
        return this.cfr_renamed_2.cfr_renamed_12399() == 1;
    }

    @Override
    public void cfr_renamed_9853(String arg0) {
        this.cfr_renamed_2.cfr_renamed_9853(this.cfr_renamed_12422(arg0));
    }

    @Override
    public void cfr_renamed_12458(String string) {
        sprwin sprwin2 = this;
        sprwin2.cfr_renamed_2.cfr_renamed_12450(true);
        sprwin2.cfr_renamed_12423(string);
    }

    public void cfr_renamed_12438() {
    }

    public void cfr_renamed_12459(String arg0, String arg1, String arg2, String arg3) {
        this.cfr_renamed_2.cfr_renamed_12459(arg0, arg1, arg2, arg3);
    }
}

