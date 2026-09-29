/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravha;
import com.spire.presentation.packages.sprbtha;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprefp;
import com.spire.presentation.packages.spregf;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkmp;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmul;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprprn;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtaia;
import com.spire.presentation.packages.sprte;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.spruyda;
import com.spire.presentation.packages.sprvrha;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprywl;
import java.util.Hashtable;

@sprtea
public class sprjmn {
    @sprtea
    public static final int cfr_renamed_0 = 32000;
    @sprtea
    public static final int cfr_renamed_1 = 8000;
    @sprtea
    public static final int cfr_renamed_2 = 16000;
    @sprtea
    public static final int cfr_renamed_3 = 30;
    @sprtea
    public static final int cfr_renamed_4 = 8;

    private static /* synthetic */ sprgeja cfr_renamed_14248(spreen arg0, int arg1) {
        int n;
        int n2;
        long l;
        block3: {
            int n3;
            spreen spreen2 = arg0;
            l = spreen2.cfr_renamed_3274();
            spreen2.cfr_renamed_11548(0L);
            Object[] objectArray = new Object[1];
            objectArray[0] = arg1;
            String string = sprraia.cfr_renamed_11562(sprhah.cfr_renamed_9("]m+W-G`G?\u0005:jZ"), objectArray);
            byte[] byArray = new byte[8];
            byte[] byArray2 = sprszca.cfr_renamed_14249().cfr_renamed_11606(spruyda.cfr_renamed_9("lgA|Jf[{"));
            byte[] byArray3 = sprszca.cfr_renamed_14249().cfr_renamed_11606(string);
            int n4 = byArray3.length;
            n2 = 0;
            byte[] byArray4 = new byte[n4];
            int n5 = n3 = 0;
            while ((long)n5 < arg0.cfr_renamed_806() - (long)n4) {
                spreen spreen3 = arg0;
                spreen3.cfr_renamed_11548(n3);
                spreen3.cfr_renamed_11556(byArray4, 0, n4);
                if (byArray3.length == byArray4.length && sprkpp.cfr_renamed_14250(byArray3, byArray4, byArray3.length)) {
                    int n6 = sprraia.cfr_renamed_11562(sprhah.cfr_renamed_9("p[lH\u0012\u001e$\u0002\u0002\u0006>\u00005"), new Object[0]).length();
                    int n7 = n3 + n4 + n6 + 30 + 1;
                    spreen spreen4 = arg0;
                    spreen4.cfr_renamed_11548(n7);
                    spreen4.cfr_renamed_11556(byArray, 0, 8);
                    if (byArray2.length == byArray.length && sprkpp.cfr_renamed_14250(byArray2, byArray, byArray2.length)) {
                        n = n2 = (n7 += 9);
                        break block3;
                    }
                    arg0.cfr_renamed_11548(n3);
                }
                n5 = ++n3;
            }
            n = n2;
        }
        float f = n + 32000 + 2;
        spreen spreen5 = arg0;
        float f2 = (float)spreen5.cfr_renamed_806() - f;
        sprgeja sprgeja2 = new sprgeja(0.0f, n2, f, f2);
        spreen5.cfr_renamed_11548(l);
        return sprgeja2;
    }

    private static /* synthetic */ byte[] cfr_renamed_14251(spreen arg0, sprkmp arg1, int arg2, sprprn arg3) throws Exception {
        byte[] byArray = sprsfp.cfr_renamed_14252(1, sprmvo.cfr_renamed_12452(arg0));
        sprbtha sprbtha2 = new sprbtha(byArray);
        sprtaia sprtaia2 = new sprtaia(sprbtha2, false);
        sprvrha sprvrha2 = new sprvrha(arg1.cfr_renamed_2141());
        sprtaia sprtaia3 = sprtaia2;
        sprvrha sprvrha3 = sprvrha2;
        sprvrha3.cfr_renamed_14253(2);
        sprvrha3.cfr_renamed_14254(sprjmn.cfr_renamed_14255(arg2));
        sprtaia3.cfr_renamed_14256(sprvrha2, false);
        byte[] byArray2 = sprtaia3.cfr_renamed_14257();
        if (arg3 != null) {
            byArray2 = sprjmn.cfr_renamed_14258(byArray2, arg3);
        }
        if (byArray2.length > 16000) {
            throw new IllegalStateException(spruyda.cfr_renamed_9("liA/[(Ff\\m]|\u000flFoF|Nd\u000f{FoAi[}]m\u000f|@([`J(\u007fLi(KgL}BmA|\u0001({`J(\\aUm\u000fgI([`J(KaHa[iC(\\aHfN|ZzJ(JpLmJl\\(NdCgLi[mK(\\xNkJ&"));
        }
        byte[] byArray3 = new byte[16000];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray2.length);
        return byArray3;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ spreen cfr_renamed_14259(spreen spreen2, sprgeja sprgeja2) {
        void arg1;
        spreen arg0;
        spreen spreen3 = arg0;
        long l = spreen3.cfr_renamed_3274();
        void v1 = arg1;
        byte[] byArray = new byte[(int)v1.spr\u3181()];
        byte[] byArray2 = new byte[(int)v1.cfr_renamed_1452()];
        spreen3.cfr_renamed_11548((int)sprgeja2.cfr_renamed_1980());
        spreen3.cfr_renamed_11556(byArray, 0, byArray.length);
        arg0.cfr_renamed_11548((int)arg1.cfr_renamed_1942());
        arg0.cfr_renamed_11556(byArray2, 0, byArray2.length);
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        sprpdja sprpdja2 = new sprpdja(byArray3);
        arg0.cfr_renamed_11548(l);
        return sprpdja2;
    }

    private static /* synthetic */ void cfr_renamed_14260(spreen arg0, byte[] arg1, sprgeja arg2) {
        int n;
        String string = sprtzja.cfr_renamed_14261(arg1).replace("-", "");
        byte[] byArray = new byte[32000];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)string.charAt(n3);
            n2 = n;
        }
        spreen spreen2 = arg0;
        long l = arg0.cfr_renamed_3274();
        spreen2.cfr_renamed_11548((int)arg2.spr\u3181() + 1);
        spreen2.cfr_renamed_4924(byArray, 0, byArray.length);
        arg0.cfr_renamed_11548(l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprqxe cfr_renamed_14262(byte[] arg0, sprprn arg1) throws Exception {
        byte[] byArray = sprsfp.cfr_renamed_14252(3, arg0);
        spregf spregf2 = new spregf();
        spregf2.cfr_renamed_654(true);
        sprfbf sprfbf2 = spregf2.cfr_renamed_5309(sprte.cfr_renamed_152, byArray);
        spreen spreen2 = sprefp.cfr_renamed_14263(sprfbf2.cfr_renamed_91(), arg1.cfr_renamed_14264(), sprhah.cfr_renamed_9("1\u0017 \u000b9\u00041\u00139\b>H$\u000e=\u0002#\u00131\n J!\u00125\u0015)"), arg1.cfr_renamed_14265(), arg1.cfr_renamed_1601(), arg1.cfr_renamed_14266());
        try {
            sprjze sprjze2 = new sprjze(spreen2.cfr_renamed_4931());
            sprjze2.cfr_renamed_5304(sprfbf2);
            sprqxe sprqxe2 = sprjze2.cfr_renamed_652();
            return sprqxe2;
        }
        finally {
            if (spreen2 != null) {
                spreen2.cfr_renamed_2637();
            }
        }
    }

    private static /* synthetic */ spravha cfr_renamed_14255(int arg0) {
        switch (arg0) {
            case 4: {
                return new spravha("MD5");
            }
            case 0: {
                return new spravha("SHA1");
            }
            case 1: {
                return new spravha("SHA256");
            }
            case 2: {
                return new spravha("SHA384");
            }
            case 3: {
                return new spravha("SHA512");
            }
        }
        throw new IllegalArgumentException(spruyda.cfr_renamed_9("AA~NdFl\u000f`N{G(NdHg]a[`B&"));
    }

    public static void cfr_renamed_14267(spreen arg0, int arg1, sprkmp arg2, int arg3, sprprn arg4) throws Exception {
        spreen spreen2 = arg0;
        sprgeja sprgeja2 = sprjmn.cfr_renamed_14248(spreen2, arg1);
        sprjmn.cfr_renamed_14268(spreen2, sprgeja2);
        sprjmn.cfr_renamed_14260(spreen2, sprjmn.cfr_renamed_14251(sprjmn.cfr_renamed_14259(spreen2, sprgeja2), arg2, arg3, arg4), sprgeja2);
    }

    private static /* synthetic */ byte[] cfr_renamed_14258(byte[] arg0, sprprn arg1) throws Exception {
        Object object;
        sprywl sprywl2 = new sprywl(arg0);
        sprwvn sprwvn2 = new sprwvn();
        Object object2 = object = sprywl2.cfr_renamed_621().cfr_renamed_622().iterator();
        while (object2.hasNext()) {
            sprrpl sprrpl2 = object.next();
            sprqxe sprqxe2 = sprjmn.cfr_renamed_14262(sprrpl2.cfr_renamed_79(), arg1);
            object2 = object;
            sprovja.cfr_renamed_11658(sprwvn2, sprjmn.cfr_renamed_14269(sprrpl2, sprqxe2));
        }
        object = sprywl.cfr_renamed_10789(sprywl2, new sprmul(sprwvn2));
        return ((sprywl)object).cfr_renamed_91();
    }

    private static /* synthetic */ sprrpl cfr_renamed_14269(sprrpl arg0, sprqxe arg1) throws Exception {
        spruem spruem2 = new spruem(sprdl.cfr_renamed_813, new sprocn(arg1.cfr_renamed_637().cfr_renamed_568()));
        Hashtable<sprlem, spruem> hashtable = new Hashtable<sprlem, spruem>();
        hashtable.put(sprdl.cfr_renamed_813, spruem2);
        return sprrpl.cfr_renamed_10648(arg0, new sprjpm(hashtable));
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_14268(spreen spreen2, sprgeja sprgeja2) {
        spreen arg0;
        int n;
        void arg1;
        int n2 = (int)arg1.spr\u3181();
        long l = spreen2.cfr_renamed_3274();
        n2 -= 40;
        Object[] objectArray = new Object[4];
        objectArray[0] = (int)arg1.cfr_renamed_1980();
        objectArray[1] = (int)arg1.spr\u3181();
        objectArray[2] = (int)arg1.cfr_renamed_1942();
        objectArray[3] = (int)arg1.cfr_renamed_1452();
        String string = sprraia.cfr_renamed_11562(sprhah.cfr_renamed_9("\u000b\u001c`\u001ap\u001ca\u001ap\u001cb\u001ap\u001cc\u001a\r"), objectArray);
        string = sprraia.cfr_renamed_14270(string, 30);
        byte[] byArray = new byte[string.length()];
        int n3 = n = 0;
        while (n3 < string.length()) {
            int n4 = n++;
            byArray[n4] = (byte)string.charAt(n4);
            n3 = n;
        }
        arg0.cfr_renamed_11548(n2);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        arg0.cfr_renamed_11548(l);
    }
}

