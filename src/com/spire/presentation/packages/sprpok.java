/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprekk;
import com.spire.presentation.packages.sprfpk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprix;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprmnk;
import com.spire.presentation.packages.sprpro;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprvnk;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprynk;
import com.spire.presentation.packages.sprzbp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprpok
implements sprix {
    private final char[] cfr_renamed_119;
    private final String cfr_renamed_91;
    private static final sprve cfr_renamed_0 = new sprcog();
    private final sprlj cfr_renamed_1;
    private final String cfr_renamed_2;
    private final SecureRandom cfr_renamed_3;
    private static final Set<String> cfr_renamed_4;

    public static /* synthetic */ sprfpk cfr_renamed_9750(sprpok arg0, sprfpk arg1) throws IOException {
        return arg0.cfr_renamed_9751(arg1);
    }

    private /* synthetic */ sprddm cfr_renamed_9752(String arg0) {
        if (arg0.endsWith(sprzbp.cfr_renamed_9(")~A~W"))) {
            String string = arg0;
            arg0 = string.substring(0, string.length() - sprpro.cfr_renamed_9("o(\u0007(\u0011").length());
        }
        if (arg0.equals(sprzbp.cfr_renamed_9("WeE\u00001\u001c6\u00006\u00182"))) {
            return cfr_renamed_0.cfr_renamed_5307(sprwr.cfr_renamed_499);
        }
        return cfr_renamed_0.cfr_renamed_1494(arg0);
    }

    private /* synthetic */ void cfr_renamed_9753(OutputStream arg0, char[] arg1) throws IOException {
        arg0.write(sprkoe.cfr_renamed_432(arg1));
    }

    public sprpok(String arg0, char[] arg1) {
        this(null, arg0, arg1, null, null);
    }

    public sprpok(String arg0, String arg1, char[] arg2) {
        this(arg0, arg1, arg2, null, null);
    }

    static {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(sprpro.cfr_renamed_9("0\u001e#\u0017/"));
        hashSet.add(sprzbp.cfr_renamed_9("jBjNa"));
        hashSet.add(sprpro.cfr_renamed_9("\u00142\u001a3\u000e'"));
        hashSet.add("algorithm");
        hashSet.add(sprzbp.cfr_renamed_9("uBt"));
        cfr_renamed_4 = Collections.unmodifiableSet(hashSet);
    }

    private /* synthetic */ String cfr_renamed_9754(int arg0) {
        byte[] byArray = new byte[arg0];
        this.cfr_renamed_3.nextBytes(byArray);
        return sprfqe.cfr_renamed_503(byArray);
    }

    public static /* synthetic */ String cfr_renamed_9755(sprpok arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprjj cfr_renamed_9756(String arg0, sprddm arg1) throws IOException {
        try {
            return this.cfr_renamed_1.cfr_renamed_5279(arg1);
        }
        catch (sprhjg sprhjg2) {
            throw new IOException(new StringBuilder().insert(0, sprpro.cfr_renamed_9("\u0018#\u0015,\u00146[!\t'\u001a6\u001eb\u001f+\u001c'\b6[!\u001a.\u00187\u0017#\u000f-\tb\u001d-\tb")).append(arg0).append(": ").append(sprhjg2.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprfpk cfr_renamed_9751(sprfpk arg0) throws IOException {
        HashMap<String, String> hashMap;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        int n;
        String string3;
        sprfpk sprfpk2 = arg0;
        sprfpk2.cfr_renamed_2637();
        sprvnk sprvnk2 = sprfpk2.cfr_renamed_9734();
        Map<String, String> map = null;
        try {
            map = sprynk.cfr_renamed_9748(sprzbp.cfr_renamed_9("imJa^p"), arg0.cfr_renamed_9733(sprpro.cfr_renamed_9(",\u0015,o:7\u000f*\u001e,\u000f+\u0018#\u000f'")));
        }
        catch (Throwable throwable) {
            throw new sprkfk(new StringBuilder().insert(0, sprzbp.cfr_renamed_9("TLv^mCc\rSzS\u0000EXpEaCpDgLpDkC$EaL`Hv\u0017$")).append(throwable.getMessage()).toString(), throwable, arg0.cfr_renamed_9732(), new ByteArrayInputStream(arg0.cfr_renamed_9733(sprpro.cfr_renamed_9(",\u0015,o:7\u000f*\u001e,\u000f+\u0018#\u000f'")).getBytes()));
        }
        String string2 = null;
        try {
            string2 = sprvnk2.cfr_renamed_2627().toURI().getPath();
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprzbp.cfr_renamed_9("XjLfAa\rpB$]vBgHw^$xVa$Dj\rvHuXa^p\u0017$")).append(exception.getMessage()).toString());
        }
        for (String string3 : map.keySet()) {
            if (cfr_renamed_4.contains(string3)) continue;
            throw new sprkfk(new StringBuilder().insert(0, sprpro.cfr_renamed_9(".,\t'\u0018-\u001c,\u00121\u001e&['\u00156\t;[+\u0015b,\u0015,o:7\u000f*\u001e,\u000f+\u0018#\u000f'[*\u001e#\u001f'\tx[e")).append((Object)string3).append(sprzbp.cfr_renamed_9("#")).toString());
        }
        String string4 = sprvnk2.cfr_renamed_9742();
        string3 = map.get(sprpro.cfr_renamed_9("0\u001e#\u0017/"));
        String string5 = map.get(sprzbp.cfr_renamed_9("jBjNa"));
        String string6 = map.get(sprpro.cfr_renamed_9("\u00142\u001a3\u000e'"));
        String string7 = map.get("algorithm");
        String string8 = map.get(sprzbp.cfr_renamed_9("uBt"));
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.cfr_renamed_2 != null && !this.cfr_renamed_2.equals(string3)) {
            throw new sprkfk(new StringBuilder().insert(0, sprpro.cfr_renamed_9("(7\u000b2\u0017+\u001e&[0\u001e#\u0017/[e")).append(this.cfr_renamed_2).append(sprzbp.cfr_renamed_9("#\r`Ba^$CkY$@eYgE$^a_rHv\rvHeAi\r#")).append(string3).append(sprpro.cfr_renamed_9("e")).toString(), null, 401, null);
        }
        if (string7 == null) {
            string7 = "MD5";
        }
        if (string7.length() == 0) {
            throw new sprkfk(sprzbp.cfr_renamed_9("zSz)lqYlHjYmNeYa\rjB$LhJk_mYl@$IaKmCaI*"));
        }
        string7 = sprkoe.cfr_renamed_116(string7);
        if (string8 == null) {
            throw new sprkfk(sprzbp.cfr_renamed_9("|k]$Dw\rjBp\r`HbDjH`\rmC$zSz)lqYlHjYmNeYa\rlHeIa_*"));
        }
        if (string8.length() == 0) {
            throw new sprkfk(sprpro.cfr_renamed_9("\u0013\u0014\u0012[4\u001a.\u000e'[+\bb\u001e/\u000b6\u0002l"));
        }
        string8 = sprkoe.cfr_renamed_425(string8);
        Object object10 = string8.split(",");
        int n2 = n = 0;
        while (n2 != ((String[])object10).length) {
            if (!object10[n].equals(sprzbp.cfr_renamed_9("LqYl")) && !((String)object10[n]).equals(sprpro.cfr_renamed_9("\u001a7\u000f*V+\u00156"))) {
                throw new sprkfk(new StringBuilder().insert(0, sprzbp.cfr_renamed_9("|k}$[eAqH$XjFjBsC>\r#")).append(n).append(sprpro.cfr_renamed_9("e")).toString());
            }
            object9 = ((String)object10[n]).trim();
            if (!arrayList.contains(object9)) {
                arrayList.add((String)object9);
            }
            n2 = ++n;
        }
        object10 = this.cfr_renamed_9752(string7);
        if (object10 == null || ((sprddm)object10).cfr_renamed_593() == null) {
            throw new IOException(new StringBuilder().insert(0, sprpro.cfr_renamed_9("#\u000e6\u0013b\u001f+\u001c'\b6[#\u0017%\u00140\u00126\u0013/[7\u0015)\u0015-\f,Ab")).append(string7).toString());
        }
        sprpok sprpok2 = this;
        sprjj sprjj2 = sprpok2.cfr_renamed_9756(string7, (sprddm)object10);
        object9 = sprjj2.cfr_renamed_470();
        String string9 = sprpok2.cfr_renamed_9754(10);
        sprpok sprpok3 = this;
        sprpok3.cfr_renamed_9757((OutputStream)object9, sprpok3.cfr_renamed_91);
        sprpok2.cfr_renamed_9757((OutputStream)object9, ":");
        sprpok2.cfr_renamed_9757((OutputStream)object9, string3);
        sprpok2.cfr_renamed_9757((OutputStream)object9, ":");
        sprpok2.cfr_renamed_9753((OutputStream)object9, this.cfr_renamed_119);
        ((OutputStream)object9).close();
        byte[] byArray = sprjj2.cfr_renamed_580();
        if (string7.endsWith(sprzbp.cfr_renamed_9(")~A~W"))) {
            sprpok sprpok4 = this;
            object8 = sprpok4.cfr_renamed_9756(string7, (sprddm)object10);
            object7 = object8.cfr_renamed_470();
            object6 = sprfqe.cfr_renamed_503(byArray);
            sprpok4.cfr_renamed_9757((OutputStream)object7, (String)object6);
            sprpok4.cfr_renamed_9757((OutputStream)object7, ":");
            sprpok4.cfr_renamed_9757((OutputStream)object7, string5);
            sprpok4.cfr_renamed_9757((OutputStream)object7, ":");
            sprpok4.cfr_renamed_9757((OutputStream)object7, string9);
            ((OutputStream)object7).close();
            byArray = object8.cfr_renamed_580();
        }
        object8 = sprfqe.cfr_renamed_503(byArray);
        object7 = this.cfr_renamed_9756(string7, (sprddm)object10);
        object6 = object7.cfr_renamed_470();
        if (((String)arrayList.get(0)).equals(sprpro.cfr_renamed_9("\u001a7\u000f*V+\u00156"))) {
            sprpok sprpok5 = this;
            object5 = sprpok5.cfr_renamed_9756(string7, (sprddm)object10);
            object4 = object5.cfr_renamed_470();
            OutputStream outputStream = object4;
            sprvnk2.cfr_renamed_9743(outputStream);
            outputStream.close();
            object3 = object5.cfr_renamed_580();
            sprpok5.cfr_renamed_9757((OutputStream)object6, string4);
            sprpok5.cfr_renamed_9757((OutputStream)object6, ":");
            sprpok5.cfr_renamed_9757((OutputStream)object6, string2);
            sprpok5.cfr_renamed_9757((OutputStream)object6, ":");
            sprpok5.cfr_renamed_9757((OutputStream)object6, sprfqe.cfr_renamed_503((byte[])object3));
            object2 = object6;
        } else {
            if (((String)arrayList.get(0)).equals(sprzbp.cfr_renamed_9("LqYl"))) {
                sprpok sprpok6 = this;
                Object object11 = object6;
                this.cfr_renamed_9757((OutputStream)object11, string4);
                sprpok6.cfr_renamed_9757((OutputStream)object11, ":");
                sprpok6.cfr_renamed_9757((OutputStream)object6, string2);
            }
            object2 = object6;
        }
        ((OutputStream)object2).close();
        object5 = sprfqe.cfr_renamed_503(object7.cfr_renamed_580());
        object4 = this.cfr_renamed_9756(string7, (sprddm)object10);
        object3 = object4.cfr_renamed_470();
        sprpok sprpok7 = this;
        if (arrayList.contains(sprpro.cfr_renamed_9("/\u00121\b+\u0015%"))) {
            sprpok7.cfr_renamed_9757((OutputStream)object3, (String)object8);
            Object object12 = object3;
            object = object12;
            sprpok sprpok8 = this;
            Object object13 = object3;
            this.cfr_renamed_9757((OutputStream)object13, ":");
            sprpok8.cfr_renamed_9757((OutputStream)object13, string5);
            sprpok8.cfr_renamed_9757((OutputStream)object3, ":");
            this.cfr_renamed_9757((OutputStream)object12, (String)object5);
        } else {
            sprpok sprpok9;
            sprpok7.cfr_renamed_9757((OutputStream)object3, (String)object8);
            sprpok sprpok10 = this;
            Object object14 = object3;
            sprpok sprpok11 = this;
            Object object15 = object3;
            this.cfr_renamed_9757((OutputStream)object3, ":");
            this.cfr_renamed_9757((OutputStream)object15, string5);
            sprpok11.cfr_renamed_9757((OutputStream)object15, ":");
            sprpok11.cfr_renamed_9757((OutputStream)object3, sprzbp.cfr_renamed_9("\u001d4\u001d4\u001d4\u001d5"));
            this.cfr_renamed_9757((OutputStream)object14, ":");
            sprpok10.cfr_renamed_9757((OutputStream)object14, string9);
            sprpok10.cfr_renamed_9757((OutputStream)object3, ":");
            sprpok sprpok12 = this;
            if (((String)arrayList.get(0)).equals(sprpro.cfr_renamed_9("\u001a7\u000f*V+\u00156"))) {
                sprpok12.cfr_renamed_9757((OutputStream)object3, sprzbp.cfr_renamed_9("LqYl\u0000mCp"));
                sprpok9 = this;
            } else {
                sprpok12.cfr_renamed_9757((OutputStream)object3, sprpro.cfr_renamed_9("\u001a7\u000f*"));
                sprpok9 = this;
            }
            sprpok9.cfr_renamed_9757((OutputStream)object3, ":");
            Object object16 = object3;
            object = object16;
            this.cfr_renamed_9757((OutputStream)object16, (String)object5);
        }
        ((OutputStream)object).close();
        String string10 = sprfqe.cfr_renamed_503(object4.cfr_renamed_580());
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put(sprzbp.cfr_renamed_9("XwHvCe@a"), this.cfr_renamed_91);
        hashMap2.put(sprpro.cfr_renamed_9("0\u001e#\u0017/"), string3);
        hashMap2.put(sprzbp.cfr_renamed_9("jBjNa"), string5);
        hashMap2.put("uri", string2);
        hashMap2.put(sprpro.cfr_renamed_9("\t'\b2\u0014,\b'"), string10);
        if (((String)arrayList.get(0)).equals(sprzbp.cfr_renamed_9("LqYl\u0000mCp"))) {
            String string11 = hashMap2.put(sprpro.cfr_renamed_9("3\u00142"), sprzbp.cfr_renamed_9("LqYl\u0000mCp"));
            HashMap<String, String> hashMap3 = hashMap2;
            hashMap2.put("nc", sprpro.cfr_renamed_9("KrKrKrKs"));
            hashMap = hashMap3;
            hashMap3.put(sprzbp.cfr_renamed_9("NjBjNa"), string9);
        } else {
            if (((String)arrayList.get(0)).equals(sprpro.cfr_renamed_9("\u001a7\u000f*"))) {
                hashMap2.put(sprzbp.cfr_renamed_9("uBt"), sprpro.cfr_renamed_9("\u001a7\u000f*"));
                hashMap2.put("nc", sprzbp.cfr_renamed_9("\u001d4\u001d4\u001d4\u001d5"));
                hashMap2.put(sprpro.cfr_renamed_9("\u0018,\u0014,\u0018'"), string9);
            }
            hashMap = hashMap2;
        }
        hashMap.put("algorithm", string7);
        if (string6 == null || string6.length() == 0) {
            hashMap2.put(sprzbp.cfr_renamed_9("BtLuXa"), this.cfr_renamed_9754(20));
        }
        sprmnk sprmnk2 = new sprmnk(sprvnk2).cfr_renamed_9758(null);
        sprmnk2.cfr_renamed_9741(sprpro.cfr_renamed_9("\u0003\u000e6\u0013-\t+\u0001#\u000f+\u0014,"), sprynk.cfr_renamed_9747(sprzbp.cfr_renamed_9("imJa^p"), hashMap2));
        return sprvnk2.cfr_renamed_9759().cfr_renamed_9746(sprmnk2.cfr_renamed_1451());
    }

    private /* synthetic */ void cfr_renamed_9757(OutputStream arg0, String arg1) throws IOException {
        arg0.write(sprkoe.cfr_renamed_431(arg1));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_9760(sprmnk sprmnk2) {
        void arg0;
        arg0.cfr_renamed_9758(new sprekk(this));
    }

    public sprpok(String arg0, char[] arg1, SecureRandom arg2, sprlj arg3) {
        this(null, arg0, arg1, arg2, arg3);
    }

    public static /* synthetic */ char[] cfr_renamed_9761(sprpok arg0) {
        return arg0.cfr_renamed_119;
    }

    public static /* synthetic */ String cfr_renamed_9762(sprpok arg0) {
        return arg0.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprpok(String string, String string2, char[] cArray, SecureRandom secureRandom, sprlj sprlj2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprpok sprpok2 = this;
        sprpok sprpok3 = this;
        this.cfr_renamed_2 = arg0;
        sprpok3.cfr_renamed_91 = arg1;
        sprpok3.cfr_renamed_119 = arg2;
        sprpok2.cfr_renamed_3 = arg3;
        sprpok2.cfr_renamed_1 = sprlj2;
    }
}

