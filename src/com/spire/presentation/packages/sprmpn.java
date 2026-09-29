/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraep;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgjp;
import com.spire.presentation.packages.sprlzia;
import com.spire.presentation.packages.sprmnn;
import com.spire.presentation.packages.spromn;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrup;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxcja;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprxun;
import java.util.Iterator;

@sprtea
public abstract class sprmpn {
    private spralq cfr_renamed_102;
    private int cfr_renamed_93;
    private sprbgp cfr_renamed_86;
    private sprmnn cfr_renamed_152;
    private String cfr_renamed_112;
    private sprqt cfr_renamed_119;
    private StringBuilder cfr_renamed_91;
    private spralq cfr_renamed_0;
    private spralq cfr_renamed_1;
    private spravp cfr_renamed_2;
    private int cfr_renamed_3;
    private spralq cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_13296(byte[] byArray) {
        void arg0;
        int n = arg0.hashCode();
        byte[] byArray2 = (byte[])this.cfr_renamed_102.get(n);
        if (byArray2 == null) {
            sprmpn sprmpn2 = this;
            byArray2 = sprmpn2.cfr_renamed_152.cfr_renamed_13297((byte[])arg0);
            sprmpn2.cfr_renamed_102.put((Object)n, byArray2);
        }
        return byArray2;
    }

    @sprtea
    public void cfr_renamed_13284() {
    }

    private /* synthetic */ sprvqo cfr_renamed_13298(sprfzo arg0) {
        sprmpn sprmpn2 = this;
        String string = sprmpn2.cfr_renamed_13299(arg0);
        sprvqo sprvqo2 = (sprvqo)sprmpn2.cfr_renamed_2.cfr_renamed_12347(string);
        if (sprvqo2 == null) {
            sprvqo2 = arg0.cfr_renamed_13300(false);
            this.cfr_renamed_2.cfr_renamed_13301(string, sprvqo2);
        }
        return sprvqo2;
    }

    private /* synthetic */ String cfr_renamed_13299(sprfzo arg0) {
        String string = (String)this.cfr_renamed_1.get(arg0.cfr_renamed_13302());
        if (string == null) {
            Object[] objectArray = new Object[2];
            objectArray[0] = arg0.cfr_renamed_13302();
            objectArray[1] = arg0.cfr_renamed_13303();
            sprlzia sprlzia2 = sprgjp.cfr_renamed_13304(objectArray);
            String string2 = sprxcja.cfr_renamed_9("%e>u,");
            String string3 = sprlzia2.cfr_renamed_2223(sprxun.cfr_renamed_9("\u001b"));
            Object[] objectArray2 = new Object[2];
            objectArray2[0] = string3;
            objectArray2[1] = string2;
            string = this.cfr_renamed_13305(sprraia.cfr_renamed_11562(sprxcja.cfr_renamed_9("117/107"), objectArray2));
            this.cfr_renamed_1.cfr_renamed_12160(arg0.cfr_renamed_13302(), string);
        }
        return string;
    }

    @sprtea
    public String cfr_renamed_13270(sprfzo arg0) {
        return this.cfr_renamed_13299(arg0);
    }

    @sprtea
    public sprbgp cfr_renamed_3365() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpn(String string, sprqt sprqt2) {
        void arg1;
        void arg0;
        sprmpn sprmpn2 = this;
        this.cfr_renamed_0 = new spralq();
        sprmpn2.cfr_renamed_91 = new StringBuilder();
        this.cfr_renamed_1 = new spralq();
        this.cfr_renamed_2 = new spravp();
        this.cfr_renamed_102 = new spralq();
        this.cfr_renamed_4 = new spralq();
        this.cfr_renamed_86 = new sprbgp();
        if (sprqt2 == null) {
            throw new NullPointerException(sprxun.cfr_renamed_9("(A-N6N8c>L3B>C4"));
        }
        sprmpn sprmpn3 = this;
        sprmpn3.cfr_renamed_112 = arg0;
        sprmpn3.cfr_renamed_119 = arg1;
        this.cfr_renamed_152 = new sprmnn(100, (sprqt)arg1, 5);
    }

    @sprtea
    public String cfr_renamed_13306(sprfzo arg0, String arg1) {
        Iterator iterator;
        sprvqo sprvqo2 = this.cfr_renamed_13298(arg0);
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        Iterator iterator2 = iterator = new sprcop(arg1).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            if (sprxsp.cfr_renamed_13307(n)) {
                Object[] objectArray = new Object[1];
                objectArray[0] = sprvqo2.cfr_renamed_13308(n);
                sprghha.cfr_renamed_12289(stringBuilder, sprxcja.cfr_renamed_9(")x;{(117"), objectArray);
                bl = true;
            }
            sprghha.cfr_renamed_12279(stringBuilder, sprxun.cfr_renamed_9("d"));
            iterator2 = iterator;
        }
        if (stringBuilder.length() > 0) {
            StringBuilder stringBuilder2 = stringBuilder;
            stringBuilder2.setLength(stringBuilder2.length() - 1);
        }
        if (bl) {
            return stringBuilder.toString();
        }
        return "";
    }

    private /* synthetic */ String cfr_renamed_13309(byte[] arg0) {
        int n = sprsto.cfr_renamed_13225(arg0);
        Object[] objectArray = new Object[2];
        objectArray[0] = this.cfr_renamed_13310();
        objectArray[1] = spraep.cfr_renamed_13311(n);
        String string = sprraia.cfr_renamed_11562(sprxcja.cfr_renamed_9("h'`-d117/107"), objectArray);
        return this.cfr_renamed_13305(string);
    }

    @sprtea
    public String cfr_renamed_13312(sprfzo arg0, String arg1) {
        sprmpn sprmpn2 = this;
        sprvqo sprvqo2 = sprmpn2.cfr_renamed_13298(arg0);
        sprmpn2.cfr_renamed_91.setLength(0);
        Iterator iterator = new sprcop(arg1).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (sprvqo2.cfr_renamed_13308(n) < 0) continue;
            sprghha.cfr_renamed_12279(this.cfr_renamed_91, sprxsp.cfr_renamed_12396(n));
        }
        return this.cfr_renamed_91.toString();
    }

    private /* synthetic */ int cfr_renamed_13310() {
        return ++this.cfr_renamed_93;
    }

    public spralq cfr_renamed_13313() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprmnn cfr_renamed_13314() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public void cfr_renamed_13103(sprbgp arg0) {
        this.cfr_renamed_86 = arg0;
    }

    private static /* synthetic */ String cfr_renamed_13315(sprqjn arg0, sprfzo arg1, boolean arg2) {
        sprfzo sprfzo2;
        short s;
        if (arg0.cfr_renamed_13073() == 0 && arg0.cfr_renamed_13074() == 0) {
            return "";
        }
        String string = sprxun.cfr_renamed_9("\f$\u0010\"\f$\u0011\"");
        Object[] objectArray = new Object[2];
        if (arg2) {
            s = -arg0.cfr_renamed_13073();
            sprfzo2 = arg1;
        } else {
            s = arg0.cfr_renamed_13073();
            sprfzo2 = arg1;
        }
        objectArray[0] = sprmpn.cfr_renamed_13316(s, sprfzo2);
        objectArray[1] = sprmpn.cfr_renamed_13316(arg0.cfr_renamed_13074(), arg1);
        return sprraia.cfr_renamed_11562(string, objectArray);
    }

    private static /* synthetic */ String cfr_renamed_13316(int arg0, sprfzo arg1) {
        return sprebp.cfr_renamed_13083((float)arg0 * 100.0f / (float)arg1.cfr_renamed_13317());
    }

    @sprtea
    public spromn cfr_renamed_13318(byte[] arg0, sprtqo arg1) {
        sprmpn sprmpn2 = this;
        int n = sprtqo.cfr_renamed_13319(arg0 = sprmpn2.cfr_renamed_13296(arg0), arg1);
        spromn spromn2 = (spromn)sprmpn2.cfr_renamed_4.get(n);
        if (spromn2 == null) {
            arg0 = this.cfr_renamed_152.cfr_renamed_13320(arg0, arg1);
            sprmpn sprmpn3 = this;
            spromn2 = new spromn(sprmpn3.cfr_renamed_13309(arg0), sprsto.cfr_renamed_13321(arg0), arg0);
            sprmpn3.cfr_renamed_4.put((Object)n, spromn2);
        }
        return spromn2;
    }

    @sprtea
    public void cfr_renamed_13269(int arg0, String arg1) {
        this.cfr_renamed_119.cfr_renamed_12477(arg0, 5, arg1);
    }

    @sprtea
    public spravp cfr_renamed_13280() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public String cfr_renamed_13235(String arg0) {
        String string = (String)this.cfr_renamed_0.get(arg0);
        if (string != null) {
            return string;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_3++;
        String string2 = string = sprraia.cfr_renamed_11562(sprxcja.cfr_renamed_9("c%n!l+s!^117"), objectArray);
        this.cfr_renamed_0.put(arg0, string2);
        return string2;
    }

    @sprtea
    public String cfr_renamed_13264(sprfzo arg0, sprpon[] arg1, float arg2, boolean arg3) {
        int n;
        sprvqo sprvqo2 = this.cfr_renamed_13298(arg0);
        StringBuilder stringBuilder = new StringBuilder();
        Object object = arg1;
        int n2 = arg1.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            sprpon sprpon2 = object[n];
            sprghha.cfr_renamed_12279(stringBuilder, sprmpn.cfr_renamed_13322(sprpon2));
            sprqjn[] sprqjnArray = sprpon2.cfr_renamed_13027();
            int n5 = sprqjnArray.length;
            int n6 = n4 = 0;
            while (n6 < n5) {
                sprqjn sprqjn2 = sprqjnArray[n4];
                int n7 = (Integer)sprvqo2.cfr_renamed_13323().cfr_renamed_576(sprqjn2.cfr_renamed_13072());
                short s = sprrgga.cfr_renamed_13324(sprqjn2.cfr_renamed_13071(), (short)0);
                Object[] objectArray = new Object[3];
                objectArray[0] = n7;
                objectArray[1] = sprmpn.cfr_renamed_13316(s, arg0);
                objectArray[2] = sprmpn.cfr_renamed_13315(sprqjn2, arg0, arg3);
                sprghha.cfr_renamed_12289(stringBuilder, sprxun.cfr_renamed_9("$\u0010\"\f$\u0011\"[m]d"), objectArray);
                n6 = ++n4;
            }
            n3 = ++n;
        }
        if (stringBuilder.length() > 0) {
            object = stringBuilder;
            n2 = object.length();
            object.setLength(n2 - 1);
        }
        return stringBuilder.toString();
    }

    @sprtea
    public void cfr_renamed_13260(sprfzo arg0, sprpon[] arg1) {
        int n;
        sprvqo sprvqo2 = this.cfr_renamed_13298(arg0);
        sprpon[] sprponArray = arg1;
        int n2 = arg1.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            sprpon sprpon2 = sprponArray[n];
            sprqjn[] sprqjnArray = sprpon2.cfr_renamed_13027();
            int n5 = sprqjnArray.length;
            int n6 = n4 = 0;
            while (n6 < n5) {
                sprqjn sprqjn2 = sprqjnArray[n4];
                int n7 = sprvqo2.cfr_renamed_13325(sprqjn2.cfr_renamed_13072());
                if (sprpon2.cfr_renamed_13079().length == 1 && sprpon2.cfr_renamed_13027().length == 1) {
                    sprvqo2.cfr_renamed_13326(sprpon2.cfr_renamed_13079()[0], n7);
                }
                n6 = ++n4;
            }
            n3 = ++n;
        }
    }

    private static /* synthetic */ String cfr_renamed_13322(sprpon arg0) {
        int n;
        int n2 = 0;
        Integer[] integerArray = arg0.cfr_renamed_13079();
        int n3 = integerArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            ++n2;
            int n5 = integerArray[n];
            if (sprxsp.cfr_renamed_13307(n5)) {
                ++n2;
            }
            n4 = ++n;
        }
        if (n2 == 1 && arg0.cfr_renamed_13027().length == 1) {
            return "";
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = n2;
        objectArray[1] = arg0.cfr_renamed_13027().length;
        return sprraia.cfr_renamed_11562(sprxcja.cfr_renamed_9("bzz|pz{|c"), objectArray);
    }

    private /* synthetic */ String cfr_renamed_13305(String arg0) {
        return sprrup.cfr_renamed_13327(this.cfr_renamed_112, arg0);
    }
}

