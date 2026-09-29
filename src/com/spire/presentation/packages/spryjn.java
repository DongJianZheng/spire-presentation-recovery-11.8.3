/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprkfha;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sprpsn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprznp;

@sprtea
public class spryjn {
    private spreen cfr_renamed_3;
    private sprpsn cfr_renamed_4;

    @sprtea
    public static String cfr_renamed_14078(float arg0) {
        if (Float.isNaN(arg0)) {
            return "0";
        }
        return sprebp.cfr_renamed_14096(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14075(String string, int[] nArray) {
        void arg0;
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835((String)arg0);
        spryjn2.cfr_renamed_14055();
        spryjn2.cfr_renamed_14062(nArray);
    }

    public void cfr_renamed_14301(String arg0, String arg1) {
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835(arg0);
        spryjn2.cfr_renamed_14055();
        this.cfr_renamed_14302(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14072(String string, sprqgp sprqgp2) {
        void arg1;
        void arg0;
        spryjn spryjn2 = this;
        spryjn spryjn3 = this;
        spryjn3.cfr_renamed_11835((String)arg0);
        spryjn3.cfr_renamed_14055();
        spryjn3.cfr_renamed_11835("[");
        spryjn2.cfr_renamed_14066((sprqgp)arg1);
        spryjn2.cfr_renamed_11835("]");
    }

    public void cfr_renamed_12304(String arg0) {
        this.cfr_renamed_14302(arg0.substring(1));
    }

    public void cfr_renamed_14085(String arg0, String arg1) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg1;
        this.cfr_renamed_11735(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    public void cfr_renamed_11835(String arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            this.cfr_renamed_3.cfr_renamed_11594((byte)arg0.charAt(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_11594(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_11594(arg0);
    }

    @sprtea
    public static String cfr_renamed_14303(sprwbp arg0) {
        byte[] byArray = sprwbp.cfr_renamed_14304((byte)arg0.cfr_renamed_3353(), (byte)arg0.cfr_renamed_1145(), (byte)arg0.cfr_renamed_1997());
        Object[] objectArray = new Object[4];
        objectArray[0] = spryjn.cfr_renamed_14078((float)(byArray[0] & 0xFF) / 255.0f);
        objectArray[1] = spryjn.cfr_renamed_14078((float)(byArray[1] & 0xFF) / 255.0f);
        objectArray[2] = spryjn.cfr_renamed_14078((float)(byArray[2] & 0xFF) / 255.0f);
        objectArray[3] = spryjn.cfr_renamed_14078((float)(byArray[3] & 0xFF) / 255.0f);
        return sprraia.cfr_renamed_11562(sprbrz.cfr_renamed_9("@\\FL@]FL@^FL@_F"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14089(String string, sprgeja sprgeja2) {
        void arg0;
        void arg1;
        spryjn spryjn2 = this;
        spryjn spryjn3 = this;
        void v2 = arg1;
        spryjn spryjn4 = this;
        spryjn spryjn5 = this;
        spryjn spryjn6 = this;
        spryjn6.cfr_renamed_11835((String)arg0);
        spryjn6.cfr_renamed_14055();
        spryjn5.cfr_renamed_11835("[");
        spryjn5.cfr_renamed_14067(arg1.cfr_renamed_13430());
        spryjn4.cfr_renamed_14055();
        spryjn4.cfr_renamed_14067(arg1.cfr_renamed_13342());
        spryjn4.cfr_renamed_14055();
        spryjn3.cfr_renamed_14067(v2.cfr_renamed_13341());
        spryjn3.cfr_renamed_14055();
        spryjn2.cfr_renamed_14067(v2.cfr_renamed_13429());
        spryjn2.cfr_renamed_11835("]");
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14092(String string, float[] fArray) {
        void arg0;
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835((String)arg0);
        spryjn2.cfr_renamed_14055();
        spryjn2.cfr_renamed_14093(fArray);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14062(int[] nArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_11835(sprebp.cfr_renamed_14063((int)arg0[n3]));
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    public void cfr_renamed_11735(String arg0) {
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835(arg0);
        spryjn2.cfr_renamed_14076();
    }

    public void cfr_renamed_9011(int arg0) {
        this.cfr_renamed_11835(sprebp.cfr_renamed_14063(arg0));
    }

    private static /* synthetic */ String cfr_renamed_14074(boolean arg0) {
        if (arg0) {
            return "true";
        }
        return "false";
    }

    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_4924(arg0, arg1, arg2);
    }

    public void cfr_renamed_14305(String arg0, String arg1) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg1;
        this.cfr_renamed_11835(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14066(sprqgp sprqgp2) {
        void arg0;
        spryjn spryjn2 = this;
        spryjn spryjn3 = this;
        void v2 = arg0;
        spryjn spryjn4 = this;
        spryjn spryjn5 = this;
        spryjn5.cfr_renamed_14067(arg0.cfr_renamed_12595());
        spryjn5.cfr_renamed_14055();
        spryjn5.cfr_renamed_14067(arg0.cfr_renamed_12596());
        spryjn4.cfr_renamed_14055();
        spryjn4.cfr_renamed_14067(arg0.cfr_renamed_12597());
        spryjn4.cfr_renamed_14055();
        spryjn3.cfr_renamed_14067(v2.cfr_renamed_12598());
        spryjn3.cfr_renamed_14055();
        spryjn2.cfr_renamed_14067(v2.cfr_renamed_12599());
        spryjn2.cfr_renamed_14055();
        spryjn2.cfr_renamed_14067(sprqgp2.cfr_renamed_12600());
    }

    public void cfr_renamed_14286(String arg0, String arg1) {
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        this.cfr_renamed_11835(arg0);
        this.cfr_renamed_14306(arg1);
    }

    public void cfr_renamed_14076() {
        this.cfr_renamed_11835("\r\n");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_14071(byte arg0) {
        switch (arg0) {
            case 40: 
            case 41: 
            case 92: {
                this.cfr_renamed_11594((byte)92);
                this.cfr_renamed_11594(arg0);
                return;
            }
            case 13: {
                this.cfr_renamed_11835(sprouaa.cfr_renamed_9("ps\u001dv"));
                return;
            }
        }
        this.cfr_renamed_11594(arg0);
    }

    public void cfr_renamed_14307(String arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            this.cfr_renamed_14071((byte)arg0.charAt(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_14059(String arg0, String arg1, String arg2) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg1;
        objectArray[1] = arg2;
        this.cfr_renamed_11735(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    public void cfr_renamed_14302(String arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        Object object = new sprcop(arg0).iterator();
        while (object.hasNext()) {
            int n = (Integer)object.next();
            if (spryjn.cfr_renamed_14308(n)) {
                Object[] objectArray = new Object[1];
                objectArray[0] = n;
                sprghha.cfr_renamed_12289(stringBuilder, sprbrz.cfr_renamed_9("\u0018\u0017\u000bVc^F"), objectArray);
                continue;
            }
            sprghha.cfr_renamed_12279(stringBuilder, sprxsp.cfr_renamed_12396(n));
        }
        Object object2 = object = (Object)new sprkfha().cfr_renamed_11606(stringBuilder.toString());
        this.cfr_renamed_4924((byte[])object2, 0, ((Object)object2).length);
    }

    public void cfr_renamed_14289(String arg0, sprgtja arg1) {
        if (sprgtja.cfr_renamed_12041(arg1, sprgtja.cfr_renamed_82)) {
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = sprebp.cfr_renamed_14309(arg1);
        String string = sprraia.cfr_renamed_11562(sprouaa.cfr_renamed_9("\u0007\u00168\u001c>"), objectArray);
        this.cfr_renamed_14310(arg0, string, true);
    }

    public void cfr_renamed_14058(String arg0) {
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835(arg0);
        spryjn2.cfr_renamed_14055();
    }

    public void cfr_renamed_14094(String arg0, int arg1) {
        this.cfr_renamed_14057(arg0, sprebp.cfr_renamed_14063(arg1));
    }

    public void cfr_renamed_14061() {
        this.cfr_renamed_11835(sprbrz.cfr_renamed_9("R\u0005"));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14093(float[] fArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_14067((float)arg0[n3]);
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    public void cfr_renamed_14310(String arg0, String arg1, boolean arg2) {
        spryjn spryjn2;
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        spryjn spryjn3 = this;
        spryjn3.cfr_renamed_11835(arg0);
        if (spryjn3.cfr_renamed_4 != null) {
            byte[] byArray = new byte[arg1.length()];
            String string = arg1;
            sprszca.cfr_renamed_14249().cfr_renamed_14311(string, 0, string.length(), byArray, 0);
            spryjn spryjn4 = this;
            byte[] byArray2 = spryjn4.cfr_renamed_4.cfr_renamed_1512(byArray);
            spryjn4.cfr_renamed_11835("<");
            spryjn4.cfr_renamed_11835(sprznp.cfr_renamed_14312(byArray2));
            spryjn4.cfr_renamed_11835(">");
            return;
        }
        this.cfr_renamed_11835("(");
        spryjn spryjn5 = this;
        if (arg2) {
            spryjn5.cfr_renamed_14307(arg1);
            spryjn2 = this;
        } else {
            spryjn5.cfr_renamed_11835(arg1);
            spryjn2 = this;
        }
        spryjn2.cfr_renamed_11835(")");
    }

    /*
     * WARNING - void declaration
     */
    public spryjn(spreen spreen2) {
        void arg0;
        if (spreen2 == null) {
            throw new NullPointerException("stream");
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = null;
    }

    public void cfr_renamed_14306(String arg0) {
        int n;
        if (this.cfr_renamed_4 != null) {
            int n2 = arg0.length() * 2 + 2;
            byte[] byArray = new byte[n2];
            byArray[0] = -2;
            byArray[1] = -1;
            String string = arg0;
            sprszca.cfr_renamed_14313().cfr_renamed_14311(string, 0, string.length(), byArray, 2);
            spryjn spryjn2 = this;
            byte[] byArray2 = spryjn2.cfr_renamed_4.cfr_renamed_1512(byArray);
            spryjn2.cfr_renamed_11835("<");
            spryjn2.cfr_renamed_11835(sprznp.cfr_renamed_14312(byArray2));
            spryjn2.cfr_renamed_11835(">");
            return;
        }
        spryjn spryjn3 = this;
        spryjn3.cfr_renamed_11835("(");
        spryjn3.cfr_renamed_11594((byte)-2);
        this.cfr_renamed_11594((byte)-1);
        int n3 = n = 0;
        while (n3 < arg0.length()) {
            char c = arg0.charAt(n);
            char c2 = c;
            this.cfr_renamed_14070(c);
            n3 = ++n;
        }
        this.cfr_renamed_11835(")");
    }

    public void cfr_renamed_14073(String arg0, boolean arg1) {
        this.cfr_renamed_14057(arg0, spryjn.cfr_renamed_14074(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14080(String string, boolean[] blArray) {
        void arg0;
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835((String)arg0);
        spryjn2.cfr_renamed_14055();
        spryjn2.cfr_renamed_14081(blArray);
    }

    @sprtea
    public static String cfr_renamed_14088(sprwbp arg0) {
        Object[] objectArray = new Object[3];
        objectArray[0] = spryjn.cfr_renamed_14078((float)arg0.cfr_renamed_3353() / 255.0f);
        objectArray[1] = spryjn.cfr_renamed_14078((float)arg0.cfr_renamed_1145() / 255.0f);
        objectArray[2] = spryjn.cfr_renamed_14078((float)arg0.cfr_renamed_1997() / 255.0f);
        return sprraia.cfr_renamed_11562(sprouaa.cfr_renamed_9("8\u001c>\f8\u001d>\f8\u001e>"), objectArray);
    }

    public void cfr_renamed_14055() {
        this.cfr_renamed_11835(" ");
    }

    public void cfr_renamed_14314(String arg0, String arg1, String arg2, String arg3) {
        Object[] objectArray = new Object[3];
        objectArray[0] = arg1;
        objectArray[1] = arg2;
        objectArray[2] = arg3;
        this.cfr_renamed_11835(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    public void cfr_renamed_14086() {
        this.cfr_renamed_11835(sprbrz.cfr_renamed_9("P\u0007"));
    }

    public void cfr_renamed_14067(float arg0) {
        this.cfr_renamed_11835(spryjn.cfr_renamed_14078(arg0));
    }

    @sprtea
    public static String cfr_renamed_14315(sprwbp arg0) {
        double d = (0.3 * (double)arg0.cfr_renamed_3353() + 0.59 * (double)arg0.cfr_renamed_1145() + 0.11 * (double)arg0.cfr_renamed_1997()) / 255.0;
        Object[] objectArray = new Object[1];
        objectArray[0] = spryjn.cfr_renamed_14078((float)d);
        return sprraia.cfr_renamed_11562("{0}", objectArray);
    }

    @sprtea
    public void cfr_renamed_14316(sprpsn arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14070(int n) {
        void arg0;
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_14071((byte)(arg0 >> 8));
        spryjn2.cfr_renamed_14071((byte)n);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14081(boolean[] blArray) {
        void arg0;
        int n;
        this.cfr_renamed_11835("[");
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n;
            this.cfr_renamed_11835(spryjn.cfr_renamed_14074((boolean)arg0[n3]));
            if (n3 < ((void)arg0).length - 1) {
                this.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        this.cfr_renamed_11835("]");
    }

    public void cfr_renamed_14077(String arg0, float arg1) {
        this.cfr_renamed_14057(arg0, spryjn.cfr_renamed_14078(arg1));
    }

    private static /* synthetic */ boolean cfr_renamed_14308(int arg0) {
        return arg0 <= 33 || arg0 == 127 || arg0 == 35 || arg0 == 40 || arg0 == 41 || arg0 == 60 || arg0 == 62 || arg0 == 91 || arg0 == 93 || arg0 == 123 || arg0 == 125 || arg0 == 47 || arg0 == 37;
    }

    public void cfr_renamed_14317(String arg0, String arg1) {
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835(arg0);
        spryjn2.cfr_renamed_14055();
        this.cfr_renamed_12304(arg1);
    }

    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14318(byte[] byArray) {
        void arg0;
        spryjn spryjn2 = this;
        this.cfr_renamed_11835("<");
        spryjn2.cfr_renamed_11835(sprznp.cfr_renamed_14312((byte[])arg0));
        spryjn2.cfr_renamed_11835(">");
    }

    public void cfr_renamed_14319(String arg0, String arg1, String arg2) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg1;
        objectArray[1] = arg2;
        this.cfr_renamed_11835(sprraia.cfr_renamed_11562(arg0, objectArray));
    }

    public void cfr_renamed_2637() {
        this.cfr_renamed_3.cfr_renamed_2637();
    }

    public void cfr_renamed_14057(String arg0, String arg1) {
        if (!sprznp.cfr_renamed_12328(arg1)) {
            return;
        }
        spryjn spryjn2 = this;
        spryjn2.cfr_renamed_11835(arg0);
        spryjn2.cfr_renamed_14055();
        this.cfr_renamed_11835(arg1);
    }
}

