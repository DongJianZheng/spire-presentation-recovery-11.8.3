/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragm;
import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprcbh;
import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprehm;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfcm;
import com.spire.presentation.packages.sprfjm;
import com.spire.presentation.packages.sprgcm;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprhbh;
import com.spire.presentation.packages.sprhbm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprkfm;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlam;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfm;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.spronk;
import com.spire.presentation.packages.sproyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprqah;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprrd;
import com.spire.presentation.packages.sprrim;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprtem;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprueaa;
import com.spire.presentation.packages.spruvg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprvik;
import com.spire.presentation.packages.sprvzg;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprwqg;
import com.spire.presentation.packages.sprzkl;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class sprarg {
    private final List<spruvg> cfr_renamed_3;
    private final spronk cfr_renamed_4;

    private /* synthetic */ sprvbh cfr_renamed_8029(spronk arg0, sprrk arg1) throws sprtqg {
        Object object;
        sprifm sprifm2;
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = null;
        BigInteger bigInteger4 = null;
        for (Object object2 : arg0.cfr_renamed_205()) {
            if (!(object2 instanceof spronk)) continue;
            spronk spronk2 = (spronk)object2;
            if (spronk2.cfr_renamed_8030("p")) {
                bigInteger = sprhdf.cfr_renamed_515(spronk2.cfr_renamed_4491(1));
                continue;
            }
            if (spronk2.cfr_renamed_8030(sprueaa.cfr_renamed_9("x"))) {
                bigInteger2 = sprhdf.cfr_renamed_515(spronk2.cfr_renamed_4491(1));
                continue;
            }
            spronk spronk3 = spronk2;
            if (spronk2.cfr_renamed_8030("g")) {
                bigInteger3 = sprhdf.cfr_renamed_515(spronk3.cfr_renamed_4491(1));
                continue;
            }
            if (!spronk3.cfr_renamed_8030("y")) continue;
            bigInteger4 = sprhdf.cfr_renamed_515(spronk2.cfr_renamed_4491(1));
        }
        if (bigInteger == null || !arg0.cfr_renamed_8030(sprqwg.cfr_renamed_9("2~0")) && bigInteger2 == null || bigInteger3 == null || bigInteger4 == null) {
            return null;
        }
        if (arg0.cfr_renamed_8030(sprueaa.cfr_renamed_9("l n"))) {
            sprifm2 = new sprifm(20, new Date(), new sprehm(bigInteger, bigInteger3, bigInteger4));
            object = sprifm2;
        } else {
            sprifm2 = new sprifm(17, new Date(), new sprfjm(bigInteger, bigInteger2, bigInteger3, bigInteger4));
            object = sprifm2;
        }
        return new sprvbh((sprifm)object, arg1);
    }

    public String cfr_renamed_8031() {
        return null;
    }

    private /* synthetic */ sprvbh cfr_renamed_8032(spronk arg0, sprrk arg1) throws sprtqg {
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        for (Object object : arg0.cfr_renamed_205()) {
            if (!(object instanceof spronk)) continue;
            spronk spronk2 = (spronk)object;
            if (spronk2.cfr_renamed_8030("e")) {
                bigInteger2 = sprhdf.cfr_renamed_515(spronk2.cfr_renamed_4491(1));
                continue;
            }
            if (!spronk2.cfr_renamed_8030("n")) continue;
            bigInteger = sprhdf.cfr_renamed_515(spronk2.cfr_renamed_4491(1));
        }
        if (bigInteger == null || bigInteger2 == null) {
            return null;
        }
        sprifm sprifm2 = new sprifm(1, new Date(), new sprwcm(bigInteger, bigInteger2));
        return new sprvbh(sprifm2, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvik cfr_renamed_8033(sprvbh arg0, sprvik arg1) throws sprtqg {
        sprifm sprifm2 = arg0.cfr_renamed_7735();
        try {
            switch (sprifm2.cfr_renamed_593()) {
                case 17: {
                    sprfjm sprfjm2 = (sprfjm)sprifm2.cfr_renamed_1521();
                    return arg1.cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034("p").cfr_renamed_8034(sprfjm2.cfr_renamed_1155().toByteArray()).cfr_renamed_1451()).cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034(sprqwg.cfr_renamed_9("&")).cfr_renamed_8034(sprfjm2.cfr_renamed_1604().toByteArray()).cfr_renamed_1451()).cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034("g").cfr_renamed_8034(sprfjm2.cfr_renamed_1145().toByteArray()).cfr_renamed_1451()).cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034("y").cfr_renamed_8034(sprfjm2.spr\u3181().toByteArray()).cfr_renamed_1451());
                }
                case 18: {
                    sprifm sprifm3 = sprifm2;
                    sprar sprar2 = sprifm3.cfr_renamed_1521();
                    sprvdm sprvdm2 = (sprvdm)sprifm3.cfr_renamed_1521();
                    if (!sprvdm2.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) {
                        throw new IllegalStateException(sprueaa.cfr_renamed_9("g#}l`!y l!l\"})m"));
                    }
                    byte[] byArray = sprhdf.cfr_renamed_514(sprvdm2.cfr_renamed_7976());
                    if (byArray.length >= 1 && 64 == byArray[0]) {
                        throw new IllegalStateException(sprqwg.cfr_renamed_9("9}#2>\u007f'~2\u007f2|#w3"));
                    }
                    throw new IllegalArgumentException(sprueaa.cfr_renamed_9("@\"\u007f-e%mlJ9{:l~<y8u)<|.e%jlb)p"));
                }
                case 19: {
                    sprrim sprrim2 = (sprrim)sprifm2.cfr_renamed_1521();
                    byte[] byArray = sprhdf.cfr_renamed_514(sprrim2.cfr_renamed_7976());
                    return arg1.cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034(sprqwg.cfr_renamed_9("&")).cfr_renamed_8034(byArray).cfr_renamed_1451());
                }
                case 22: {
                    sprfcm sprfcm2 = (sprfcm)sprifm2.cfr_renamed_1521();
                    byte[] byArray = sprhdf.cfr_renamed_514(sprfcm2.cfr_renamed_7976());
                    if (byArray.length >= 1 && 64 == byArray[0]) {
                        return arg1.cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034(sprqwg.cfr_renamed_9("&")).cfr_renamed_8034(byArray).cfr_renamed_1451());
                    }
                    throw new IllegalArgumentException(sprueaa.cfr_renamed_9("\u0005g:h `()\tm~<y8u)<|.e%jlb)p"));
                }
                case 16: 
                case 20: {
                    sprehm sprehm2 = (sprehm)sprifm2.cfr_renamed_1521();
                    throw new IllegalStateException(sprueaa.cfr_renamed_9("g#}l`!y l!l\"})m"));
                }
                case 1: 
                case 2: 
                case 3: {
                    sprwcm sprwcm2 = (sprwcm)sprifm2.cfr_renamed_1521();
                    return arg1.cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034("n").cfr_renamed_8034(sprwcm2.cfr_renamed_2295().toByteArray()).cfr_renamed_1451()).cfr_renamed_8034(spronk.cfr_renamed_7843().cfr_renamed_8034("e").cfr_renamed_8034(sprwcm2.cfr_renamed_2296().toByteArray()).cfr_renamed_1451());
                }
            }
            throw new sprtqg(sprqwg.cfr_renamed_9("g9y9} |wb\"p;{42<w.26~0}%{#z:22|4}\"|#w%w3"));
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprueaa.cfr_renamed_9("l4j)y8`#glj#g?}>|/}%g+)<|.e%jlb)p"), exception);
        }
    }

    private /* synthetic */ sprvzg cfr_renamed_8035(String arg0, sprvbh arg1, int arg2, spronk arg3, spronk arg4, sprrd arg5) throws sprtqg, IOException {
        if (arg0.equals(sprqwg.cfr_renamed_9("8b2|'u'?$ <!za?sf?6w$?4p4"))) {
            throw new IllegalArgumentException(sprueaa.cfr_renamed_9("f<l\"y+yaz~b\u007f$?a-8ah)zaj.jlg#}lz9y<f>})mlf\")\"l;l>)'l5)8p<l"));
        }
        if (arg0.equals(sprqwg.cfr_renamed_9("}'w9b0bzaeyd?8q5?6w$"))) {
            sprvik sprvik2 = spronk.cfr_renamed_7843().cfr_renamed_8034(sprueaa.cfr_renamed_9("{?h"));
            this.cfr_renamed_8033(arg1, sprvik2);
            String[] stringArray = new String[4];
            stringArray[0] = sprqwg.cfr_renamed_9("%a6");
            stringArray[1] = "e";
            stringArray[2] = "n";
            stringArray[3] = "protected";
            sprvik2.cfr_renamed_8036(arg3.cfr_renamed_8037(stringArray));
            byte[] byArray = sprvik2.cfr_renamed_1451().cfr_renamed_8038();
            spronk spronk2 = arg4;
            spronk spronk3 = spronk2.cfr_renamed_8039(2);
            spronk spronk4 = spronk3.cfr_renamed_8039(0);
            sprpik sprpik2 = new sprpik(sprmxg.cfr_renamed_7560(spronk4.cfr_renamed_8040(0)), spronk4.cfr_renamed_4491(1), spronk4.cfr_renamed_8041(2));
            byte[] byArray2 = spronk3.cfr_renamed_4491(1);
            sprgwg sprgwg2 = arg5.cfr_renamed_2776(sprueaa.cfr_renamed_9("f/k"));
            byte[] byArray3 = sprgwg2.cfr_renamed_7761(7, sprpik2);
            byte[] byArray4 = spronk2.cfr_renamed_4491(3);
            return new sprvzg(spronk.cfr_renamed_8042(((sprwqg)sprgwg2).cfr_renamed_7900(7, byArray3, byArray2, byArray, byArray4, 0, byArray4.length), arg2).cfr_renamed_8039(0), sprpik2, sproze.cfr_renamed_158(byArray2));
        }
        throw new sprtqg(new StringBuilder().insert(0, sprqwg.cfr_renamed_9("g9z6|3~2vwb%}#w4f>}92#k'ww")).append(arg0).toString());
    }

    public static sprcbh cfr_renamed_7843() {
        return new sprcbh();
    }

    /*
     * WARNING - void declaration
     */
    public sprarg(List<spruvg> list, spronk spronk2) {
        void arg0;
        sprarg sprarg2 = this;
        sprarg2.cfr_renamed_3 = Collections.unmodifiableList(arg0);
        sprarg2.cfr_renamed_4 = spronk2;
    }

    private /* synthetic */ sprvzg cfr_renamed_8043(String arg0, sprvbh arg1, int arg2, spronk arg3, spronk arg4, sprrd arg5) throws sprtqg, IOException {
        if (arg0.equals(sprueaa.cfr_renamed_9("f<l\"y+yaz~b\u007f$?a-8ah)zaj.j"))) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("8b2|'u'?$ <!za?sf?6w$?4p429}#2$g'b8`#w328|w|2e2`wy2kwf.b2"));
        }
        if (arg0.equals(sprueaa.cfr_renamed_9("#y)g<n<$?;':af/kah)z"))) {
            sprvik sprvik2 = spronk.cfr_renamed_7843().cfr_renamed_8034(sprqwg.cfr_renamed_9("2q4"));
            String[] stringArray = new String[2];
            stringArray[0] = "curve";
            stringArray[1] = sprueaa.cfr_renamed_9("o h+z");
            sprvik2.cfr_renamed_8036(arg3.cfr_renamed_8044(stringArray));
            this.cfr_renamed_8033(arg1, sprvik2);
            String[] stringArray2 = new String[5];
            stringArray2[0] = sprqwg.cfr_renamed_9("2q4");
            stringArray2[1] = sprueaa.cfr_renamed_9("o h+z");
            stringArray2[2] = "curve";
            stringArray2[3] = sprqwg.cfr_renamed_9("&");
            stringArray2[4] = "protected";
            sprvik2.cfr_renamed_8036(arg3.cfr_renamed_8037(stringArray2));
            byte[] byArray = sprvik2.cfr_renamed_1451().cfr_renamed_8038();
            spronk spronk2 = arg3.cfr_renamed_8045("curve");
            if (spronk2 == null) {
                throw new IllegalStateException(sprueaa.cfr_renamed_9("g#)/|>\u007f)))q<{)z?`#g"));
            }
            String string = spronk2.cfr_renamed_8040(1);
            spronk spronk3 = arg4.cfr_renamed_8039(2);
            spronk spronk4 = spronk3.cfr_renamed_8039(0);
            sprpik sprpik2 = new sprpik(sprmxg.cfr_renamed_7560(spronk4.cfr_renamed_8040(0)), spronk4.cfr_renamed_4491(1), spronk4.cfr_renamed_8041(2));
            byte[] byArray2 = spronk3.cfr_renamed_4491(1);
            sprgwg sprgwg2 = arg5.cfr_renamed_2776(sprqwg.cfr_renamed_9("8q5"));
            byte[] byArray3 = sprgwg2.cfr_renamed_7761(7, sprpik2);
            byte[] byArray4 = arg4.cfr_renamed_4491(3);
            return new sprvzg(spronk.cfr_renamed_8042(((sprwqg)sprgwg2).cfr_renamed_7900(7, byArray3, byArray2, byArray, byArray4, 0, byArray4.length), arg2).cfr_renamed_8039(0), sprpik2, sproze.cfr_renamed_158(byArray2), string);
        }
        throw new sprtqg(new StringBuilder().insert(0, sprueaa.cfr_renamed_9("9g$h\"m l()<{#})j8`#gl}5y))")).append(arg0).toString());
    }

    private /* synthetic */ sprvzg cfr_renamed_8046(String arg0, sprvbh arg1, int arg2, spronk arg3, spronk arg4, sprrd arg5) throws sprtqg, IOException {
        if (arg0.equals(sprqwg.cfr_renamed_9("8b2|'u'?$ <!za?sf?6w$?4p4"))) {
            throw new IllegalArgumentException(sprueaa.cfr_renamed_9("f<l\"y+yaz~b\u007f$?a-8ah)zaj.jlg#}lz9y<f>})mlf\")\"l;l>)'l5)8p<l"));
        }
        if (arg0.equals(sprqwg.cfr_renamed_9("}'w9b0bzaeyd?8q5?6w$"))) {
            sprvik sprvik2 = spronk.cfr_renamed_7843().cfr_renamed_8034(sprueaa.cfr_renamed_9("m?h"));
            this.cfr_renamed_8033(arg1, sprvik2);
            String[] stringArray = new String[6];
            stringArray[0] = sprqwg.cfr_renamed_9("3a6");
            stringArray[1] = "p";
            stringArray[2] = sprueaa.cfr_renamed_9("x");
            stringArray[3] = "g";
            stringArray[4] = "y";
            stringArray[5] = "protected";
            sprvik2.cfr_renamed_8036(arg3.cfr_renamed_8037(stringArray));
            byte[] byArray = sprvik2.cfr_renamed_1451().cfr_renamed_8038();
            spronk spronk2 = arg4;
            spronk spronk3 = spronk2.cfr_renamed_8039(2);
            spronk spronk4 = spronk3.cfr_renamed_8039(0);
            sprpik sprpik2 = new sprpik(sprmxg.cfr_renamed_7560(spronk4.cfr_renamed_8040(0)), spronk4.cfr_renamed_4491(1), spronk4.cfr_renamed_8041(2));
            byte[] byArray2 = spronk3.cfr_renamed_4491(1);
            sprgwg sprgwg2 = arg5.cfr_renamed_2776(sprqwg.cfr_renamed_9("8q5"));
            byte[] byArray3 = sprgwg2.cfr_renamed_7761(7, sprpik2);
            byte[] byArray4 = spronk2.cfr_renamed_4491(3);
            return new sprvzg(spronk.cfr_renamed_8042(((sprwqg)sprgwg2).cfr_renamed_7900(7, byArray3, byArray2, byArray, byArray4, 0, byArray4.length), arg2).cfr_renamed_8039(0), sprpik2, sproze.cfr_renamed_158(byArray2));
        }
        throw new sprtqg(new StringBuilder().insert(0, sprueaa.cfr_renamed_9("9g$h\"m l()<{#})j8`#gl}5y))")).append(arg0).toString());
    }

    private /* synthetic */ sprvbh cfr_renamed_8047(spronk arg0, sprrk arg1) throws IOException, sprtqg {
        Object object;
        String string;
        Object object2;
        Object object32;
        byte[] byArray = null;
        String string2 = null;
        for (Object object32 : arg0.cfr_renamed_205()) {
            if (!(object32 instanceof spronk)) continue;
            object2 = (spronk)object32;
            if (((spronk)object2).cfr_renamed_8030("curve")) {
                string2 = ((spronk)object2).cfr_renamed_8040(1);
                continue;
            }
            if (!((spronk)object2).cfr_renamed_8030(sprqwg.cfr_renamed_9("&"))) continue;
            byArray = ((spronk)object2).cfr_renamed_4491(1);
        }
        if (string2 == null || byArray == null) {
            return null;
        }
        String string3 = string2;
        if (string2.startsWith(sprueaa.cfr_renamed_9("J9{:l"))) {
            string = string2 = sprkoe.cfr_renamed_425(string3);
        } else {
            if (string3.startsWith(sprqwg.cfr_renamed_9("\\\u001eA\u0003"))) {
                string2 = string2.substring(sprueaa.cfr_renamed_9("\u0002@\u001f]").length()).trim();
            }
            string = string2;
        }
        if (sprkoe.cfr_renamed_425(string).equals(sprqwg.cfr_renamed_9("2ve'b#n"))) {
            object32 = new sprfcm(sprtu.cfr_renamed_0, new BigInteger(1, byArray));
            object = new sprifm(22, new Date(), (sprar)object32);
        } else if (sprkoe.cfr_renamed_425(string2).equals(sprueaa.cfr_renamed_9("l(=x1"))) {
            object32 = new sprfcm(sprtu.cfr_renamed_2, new BigInteger(1, byArray));
            object = new sprifm(22, new Date(), (sprar)object32);
        } else {
            String string4 = string2;
            object32 = sprnhm.cfr_renamed_2103(string4);
            object2 = sprchl.cfr_renamed_8048(string4);
            if (object2 == null) {
                object2 = sprlfm.cfr_renamed_7814((sprlem)object32);
            }
            if (object2 == null) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprqwg.cfr_renamed_9("\"|6p;wwf82%w$};d22's%s:w#w%awt8`w")).append(string2).toString());
            }
            spreuh spreuh2 = ((sprzkl)object2).cfr_renamed_1769().cfr_renamed_2002(byArray);
            sprrim sprrim2 = new sprrim((sprlem)object32, spreuh2);
            object = new sprifm(19, new Date(), sprrim2);
        }
        return new sprvbh((sprifm)object, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 4 << 3 ^ (3 ^ 5);
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

    public spronk cfr_renamed_8049() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public sprqah cfr_renamed_8050(sprvbh arg0, sprth arg1, sprrd arg2, sprrk arg3, int arg4) throws sprtqg, IOException {
        Object object17;
        spronk spronk2;
        Object object2;
        Object object3;
        String string = this.cfr_renamed_4.cfr_renamed_8040(0);
        ArrayList<sprhbh> arrayList = new ArrayList<sprhbh>();
        if (!string.equals(sprueaa.cfr_renamed_9("?a-m#~)may>`:h8lab)p")) && !string.equals(sprqwg.cfr_renamed_9("'`8f2q#w3?'`>d6f2?<w.")) && !string.equals(sprueaa.cfr_renamed_9("y>`:h8lab)p"))) return null;
        spronk spronk3 = this.cfr_renamed_8049().cfr_renamed_8039(1);
        if (spronk3.cfr_renamed_8030(sprqwg.cfr_renamed_9("2q4"))) {
            Object object4;
            Object object5;
            Object object6;
            sprvbh sprvbh2 = this.cfr_renamed_8047(spronk3, arg3);
            if (arg0 != null && sprvbh2 != null) {
                object6 = (sprtem)arg0.cfr_renamed_7735().cfr_renamed_1521();
                object5 = (sprtem)sprvbh2.cfr_renamed_7735().cfr_renamed_1521();
                if (!((sprtem)object6).cfr_renamed_7813().cfr_renamed_5078(((sprtem)object5).cfr_renamed_7813()) || !((sprtem)object6).cfr_renamed_7976().equals(((sprtem)object5).cfr_renamed_7976())) {
                    throw new sprtqg(sprueaa.cfr_renamed_9("<h?z)ml`\")<|.e%jlb)plm#l?)\"f8)!h8j$)?l/{)}lb)p"));
                }
            }
            arg0 = sprvbh2;
            if (string.equals(sprqwg.cfr_renamed_9("a?s3} w3?'`>d6f2?<w."))) {
                object6 = null;
            } else if (string.equals(sprueaa.cfr_renamed_9("y>f8l/})may>`:h8lab)p"))) {
                object5 = spronk3.cfr_renamed_8045("protected");
                if (object5 == null) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, string).append(sprqwg.cfr_renamed_9("23}2aw|8fwz6d22'`8f2q#w325~8q<")).toString());
                }
                object4 = ((spronk)object5).cfr_renamed_8040(1);
                if (((String)object4).indexOf(sprueaa.cfr_renamed_9("h)z")) < 0) throw new sprtqg(sprqwg.cfr_renamed_9("\"|$g'b8`#w32'`8f2q#{8|wf.b2"));
                object6 = this.cfr_renamed_8043((String)object4, arg0, arg4, spronk3, (spronk)object5, arg2);
            } else {
                object4 = spronk3.cfr_renamed_8045("curve");
                if (object4 == null) {
                    throw new IllegalStateException(sprueaa.cfr_renamed_9("g#)/|>\u007f)))q<{)z?`#g"));
                }
                object5 = ((spronk)object4).cfr_renamed_8040(1);
                object6 = new sprvzg(spronk3, null, null, object5);
            }
            object5 = new BigInteger(1, ((sprvzg)object6).cfr_renamed_2.cfr_renamed_8051("d").cfr_renamed_4491(1));
            if (((sprvzg)object6).cfr_renamed_1 == null) {
                throw new IllegalStateException(sprqwg.cfr_renamed_9("w/b2q#{9uwg9e%s'2%w$g;fwf82?s!ww\u007f2f623s#swv2t>|>|02#z224g%d2"));
            }
            object4 = ((sprvzg)object6).cfr_renamed_1.toString();
            sprklk sprklk2 = ((String)object4).startsWith(sprueaa.cfr_renamed_9("\u0002@\u001f]")) || ((String)object4).startsWith(sprqwg.cfr_renamed_9("5`6{9")) ? new sprgcm((BigInteger)object5) : new spragm((BigInteger)object5);
            Object object7 = object6;
            return new sprqah(this.cfr_renamed_3, arrayList, new sprkfm(arg0.cfr_renamed_7735(), 0, ((sprvzg)object7).cfr_renamed_4, ((sprvzg)object7).cfr_renamed_3, sprklk2.cfr_renamed_91()), arg0);
        }
        if (spronk3.cfr_renamed_8030(sprueaa.cfr_renamed_9("l n"))) {
            Object object8;
            Object object9;
            Object object10;
            sprvbh sprvbh3 = this.cfr_renamed_8029(spronk3, arg3);
            if (arg0 != null && sprvbh3 != null) {
                object10 = (sprehm)arg0.cfr_renamed_7735().cfr_renamed_1521();
                object9 = (sprehm)sprvbh3.cfr_renamed_7735().cfr_renamed_1521();
                if (!(((sprehm)object10).cfr_renamed_1155().equals(((sprehm)object9).cfr_renamed_1155()) && ((sprehm)object10).cfr_renamed_1145().equals(((sprehm)object9).cfr_renamed_1145()) && ((sprehm)object10).spr\u3181().equals(((sprehm)object9).spr\u3181()))) {
                    throw new sprtqg(sprqwg.cfr_renamed_9("b6a$w32>|wb\"p;{42<w.23}2aw|8fw\u007f6f4zwa2q%w#2<w."));
                }
            }
            arg0 = sprvbh3;
            if (string.equals(sprueaa.cfr_renamed_9("?a-m#~)may>`:h8lab)p"))) {
                object8 = object10 = null;
            } else {
                if (string.equals(sprqwg.cfr_renamed_9("'`8f2q#w3?'`>d6f2?<w."))) {
                    object9 = spronk3.cfr_renamed_8045("protected");
                    if (object9 == null) {
                        throw new IllegalArgumentException(new StringBuilder().insert(0, string).append(sprueaa.cfr_renamed_9("lm#l?)\"f8)$h:lly>f8l/})mlk f/b")).toString());
                    }
                    String string2 = ((spronk)object9).cfr_renamed_8040(1);
                    if (string2.indexOf(sprqwg.cfr_renamed_9("6w$")) < 0) throw new sprtqg(sprqwg.cfr_renamed_9("\"|$g'b8`#w32'`8f2q#{8|wf.b2"));
                    throw new IllegalStateException(sprueaa.cfr_renamed_9("\"flm)j>p<}%f\")?|<y#{8)*f>)<{#})j8l())e+h!h )'l5z"));
                }
                object8 = object10 = new sprvzg(spronk3, null, null);
            }
            object9 = sprhdf.cfr_renamed_515(((sprvzg)object8).cfr_renamed_2.cfr_renamed_8051("x").cfr_renamed_4491(1));
            if (spronk3.cfr_renamed_8030(sprueaa.cfr_renamed_9("l n"))) {
                Object object11 = object10;
                return new sprqah(this.cfr_renamed_3, arrayList, new sprkfm(arg0.cfr_renamed_7735(), 0, ((sprvzg)object11).cfr_renamed_4, ((sprvzg)object11).cfr_renamed_3, new sprlam((BigInteger)object9).cfr_renamed_91()), arg0);
            }
            Object object12 = object10;
            return new sprqah(this.cfr_renamed_3, arrayList, new sprkfm(arg0.cfr_renamed_7735(), 0, ((sprvzg)object12).cfr_renamed_4, ((sprvzg)object12).cfr_renamed_3, new sproyl((BigInteger)object9).cfr_renamed_91()), arg0);
        }
        if (spronk3.cfr_renamed_8030(sprqwg.cfr_renamed_9("3a6"))) {
            Object object13;
            Object object14;
            Object object15;
            sprvbh sprvbh4 = this.cfr_renamed_8029(spronk3, arg3);
            if (arg0 != null && sprvbh4 != null) {
                object15 = (sprfjm)arg0.cfr_renamed_7735().cfr_renamed_1521();
                object14 = (sprfjm)sprvbh4.cfr_renamed_7735().cfr_renamed_1521();
                if (!(((sprfjm)object15).cfr_renamed_1155().equals(((sprfjm)object14).cfr_renamed_1155()) && ((sprfjm)object15).cfr_renamed_1604().equals(((sprfjm)object14).cfr_renamed_1604()) && ((sprfjm)object15).cfr_renamed_1145().equals(((sprfjm)object14).cfr_renamed_1145()) && ((sprfjm)object15).spr\u3181().equals(((sprfjm)object14).spr\u3181()))) {
                    throw new sprtqg(sprueaa.cfr_renamed_9("<h?z)ml`\")<|.e%jlb)plm#l?)\"f8)!h8j$)?l/{)}lb)p"));
                }
            }
            arg0 = sprvbh4;
            if (string.equals(sprqwg.cfr_renamed_9("a?s3} w3?'`>d6f2?<w."))) {
                object13 = object15 = null;
            } else {
                if (string.equals(sprueaa.cfr_renamed_9("y>f8l/})may>`:h8lab)p"))) {
                    object14 = spronk3.cfr_renamed_8045("protected");
                    if (object14 == null) {
                        throw new IllegalArgumentException(new StringBuilder().insert(0, string).append(sprqwg.cfr_renamed_9("23}2aw|8fwz6d22'`8f2q#w325~8q<")).toString());
                    }
                    String string3 = ((spronk)object14).cfr_renamed_8040(1);
                    if (string3.indexOf(sprueaa.cfr_renamed_9("h)z")) < 0) throw new sprtqg(sprqwg.cfr_renamed_9("\"|$g'b8`#w32'`8f2q#{8|wf.b2"));
                    object15 = this.cfr_renamed_8046(string3, arg0, arg4, spronk3, (spronk)object14, arg2);
                } else {
                    object15 = new sprvzg(spronk3, null, null);
                }
                object13 = object15;
            }
            object14 = sprhdf.cfr_renamed_515(((sprvzg)object13).cfr_renamed_2.cfr_renamed_8051("x").cfr_renamed_4491(1));
            Object object16 = object15;
            return new sprqah(this.cfr_renamed_3, arrayList, new sprkfm(arg0.cfr_renamed_7735(), 0, ((sprvzg)object16).cfr_renamed_4, ((sprvzg)object16).cfr_renamed_3, new sproyl((BigInteger)object14).cfr_renamed_91()), arg0);
        }
        if (!spronk3.cfr_renamed_8030(sprueaa.cfr_renamed_9("{?h"))) return null;
        sprvbh sprvbh5 = this.cfr_renamed_8032(spronk3, arg3);
        if (arg0 != null && sprvbh5 != null) {
            object3 = (sprwcm)arg0.cfr_renamed_7735().cfr_renamed_1521();
            object2 = (sprwcm)sprvbh5.cfr_renamed_7735().cfr_renamed_1521();
            if (!((sprwcm)object3).cfr_renamed_2295().equals(((sprwcm)object2).cfr_renamed_2295()) || !((sprwcm)object3).cfr_renamed_2296().equals(((sprwcm)object2).cfr_renamed_2296())) {
                throw new sprtqg(sprqwg.cfr_renamed_9("b6a$w32>|wb\"p;{42<w.23}2aw|8fw\u007f6f4zwa2q%w#2<w."));
            }
        }
        arg0 = sprvbh5;
        if (string.equals(sprueaa.cfr_renamed_9("?a-m#~)may>`:h8lab)p"))) {
            object3 = null;
            spronk2 = spronk3;
        } else {
            if (string.equals(sprqwg.cfr_renamed_9("'`8f2q#w3?'`>d6f2?<w."))) {
                object2 = spronk3.cfr_renamed_8045("protected");
                if (object2 == null) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, string).append(sprueaa.cfr_renamed_9("lm#l?)\"f8)$h:lly>f8l/})mlk f/b")).toString());
                }
                object17 = ((spronk)object2).cfr_renamed_8040(1);
                if (((String)object17).indexOf(sprqwg.cfr_renamed_9("6w$")) < 0) throw new sprtqg(sprueaa.cfr_renamed_9("|\"z9y<f>})mly>f8l/}%f\")8p<l"));
                object3 = this.cfr_renamed_8035((String)object17, arg0, arg4, spronk3, (spronk)object2, arg2);
            } else {
                object3 = new sprvzg(spronk3, null, null);
            }
            spronk2 = spronk3;
        }
        String[] stringArray = new String[8];
        stringArray[0] = sprqwg.cfr_renamed_9("%a6");
        stringArray[1] = "e";
        stringArray[2] = "n";
        stringArray[3] = "d";
        stringArray[4] = "p";
        stringArray[5] = sprueaa.cfr_renamed_9("x");
        stringArray[6] = "u";
        stringArray[7] = "protected";
        for (Object object17 : spronk2.cfr_renamed_8037(stringArray).cfr_renamed_205()) {
            ArrayList<sprhbh> arrayList2 = arrayList;
            if (object17 instanceof spronk) {
                arrayList2.add(((spronk)object17).cfr_renamed_8052());
                continue;
            }
            arrayList2.add(sprhbh.cfr_renamed_7843().cfr_renamed_8053(object17).cfr_renamed_1451());
        }
        if (object3 == null) {
            return new sprqah(this.cfr_renamed_3, arrayList, null, arg0);
        }
        Object object18 = object3;
        object2 = sprhdf.cfr_renamed_515(((sprvzg)object18).cfr_renamed_2.cfr_renamed_8051("d").cfr_renamed_4491(1));
        object17 = sprhdf.cfr_renamed_515(((sprvzg)object18).cfr_renamed_2.cfr_renamed_8051("p").cfr_renamed_4491(1));
        BigInteger bigInteger = sprhdf.cfr_renamed_515(((sprvzg)object18).cfr_renamed_2.cfr_renamed_8051(sprqwg.cfr_renamed_9("&")).cfr_renamed_4491(1));
        Object object19 = object3;
        return new sprqah(this.cfr_renamed_3, arrayList, new sprkfm(arg0.cfr_renamed_7735(), 0, ((sprvzg)object19).cfr_renamed_4, ((sprvzg)object19).cfr_renamed_3, new sprhbm((BigInteger)object2, (BigInteger)object17, bigInteger).cfr_renamed_91()), arg0);
    }

    public List<spruvg> cfr_renamed_8054() {
        return this.cfr_renamed_3;
    }
}

