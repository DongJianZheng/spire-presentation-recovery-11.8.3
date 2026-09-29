/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.spraqa;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreva;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhsa;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmje;
import com.spire.presentation.packages.sprnkha;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprqie;
import com.spire.presentation.packages.sprqnja;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.spryae;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sprpua {
    private static final Map cfr_renamed_2;
    private static List cfr_renamed_3;
    private static final Map cfr_renamed_4;

    public static void cfr_renamed_567(sprcyd arg0) throws spreva {
        if (arg0.cfr_renamed_568().cfr_renamed_569() != 3) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("F\u0016w\u0007l\u0015l\u0010d\u0007`Sh\u0006v\u0007%\u001bd\u0005`Sd\u001d%6}\u0007`\u001da\u0016a8`\nP\u0000d\u0014`S`\u000bq\u0016k\u0000l\u001ck]"));
        }
        sprtie sprtie2 = arg0.cfr_renamed_100(sprtie.cfr_renamed_145);
        if (sprtie2 == null) {
            throw new spreva(sprnkha.cfr_renamed_9("\u001bi*x1j1o9x=,5y+xxd9z=,9bxI x=b<i<G=u\r\u007f9k=,=t,i6\u007f1c6\""));
        }
        if (!sprtie2.cfr_renamed_101()) {
            throw new spreva(sprqnja.cfr_renamed_9("0`\u0001q\u001ac\u001af\u0012q\u0016%\u001ep\u0000qSm\u0012s\u0016%\u0012kS@\u000bq\u0016k\u0017`\u0017N\u0016|&v\u0012b\u0016%\u0016}\u0007`\u001dv\u001aj\u001d%\u001ed\u0001n\u0016aSd\u0000%\u0010w\u001aq\u001af\u0012i]"));
        }
        sprmje sprmje2 = sprmje.cfr_renamed_23(sprtie2.cfr_renamed_372());
        if (!sprmje2.cfr_renamed_570(sprqie.cfr_renamed_107) || sprmje2.cfr_renamed_84() != 1) {
            throw new spreva(sprnkha.cfr_renamed_9("\u001dt,i6h=h\u0013i!Y+m?ixb7xx\u007f7`=`!,,e5ix\u007f,m5|1b?\""));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_571(spryae arg0, sprtzd arg1, boolean arg2, spra arg3) throws spraqa {
        try {
            arg0.cfr_renamed_6(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new spraqa(new StringBuilder().insert(0, sprqnja.cfr_renamed_9("\u0010d\u001dk\u001cqS`\u001df\u001ca\u0016%\u0016}\u0007`\u001dv\u001aj\u001d?S")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static int cfr_renamed_572(String arg0) throws sprrua {
        Integer n = (Integer)cfr_renamed_4.get(arg0);
        if (n != null) {
            return n;
        }
        throw new sprrua(sprnkha.cfr_renamed_9("h1k=\u007f,,9`?c*e,d5,;m6b7xxn=,>c-b<\""));
    }

    static {
        cfr_renamed_3 = Collections.unmodifiableList(new ArrayList());
        cfr_renamed_4 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_4.put(sprm.cfr_renamed_102.cfr_renamed_19(), spriwa.cfr_renamed_279(16));
        cfr_renamed_4.put(sprdh.cfr_renamed_86.cfr_renamed_19(), spriwa.cfr_renamed_279(20));
        cfr_renamed_4.put(sprdg.spr\ufe34.cfr_renamed_19(), spriwa.cfr_renamed_279(28));
        cfr_renamed_4.put(sprdg.cfr_renamed_119.cfr_renamed_19(), spriwa.cfr_renamed_279(32));
        cfr_renamed_4.put(sprdg.cfr_renamed_112.cfr_renamed_19(), spriwa.cfr_renamed_279(48));
        cfr_renamed_4.put(sprdg.cfr_renamed_107.cfr_renamed_19(), spriwa.cfr_renamed_279(64));
        cfr_renamed_4.put(spryk.cfr_renamed_126.cfr_renamed_19(), spriwa.cfr_renamed_279(16));
        cfr_renamed_4.put(spryk.cfr_renamed_91.cfr_renamed_19(), spriwa.cfr_renamed_279(20));
        cfr_renamed_4.put(spryk.cfr_renamed_3.cfr_renamed_19(), spriwa.cfr_renamed_279(32));
        cfr_renamed_4.put(sprji.cfr_renamed_31.cfr_renamed_19(), spriwa.cfr_renamed_279(32));
        cfr_renamed_2.put(sprm.cfr_renamed_102.cfr_renamed_19(), "MD5");
        cfr_renamed_2.put(sprdh.cfr_renamed_86.cfr_renamed_19(), "SHA1");
        cfr_renamed_2.put(sprdg.spr\ufe34.cfr_renamed_19(), sprqnja.cfr_renamed_9("V;DA7G"));
        cfr_renamed_2.put(sprdg.cfr_renamed_119.cfr_renamed_19(), "SHA256");
        cfr_renamed_2.put(sprdg.cfr_renamed_112.cfr_renamed_19(), "SHA384");
        cfr_renamed_2.put(sprdg.cfr_renamed_107.cfr_renamed_19(), "SHA512");
        cfr_renamed_2.put(sprm.cfr_renamed_127.cfr_renamed_19(), "SHA1");
        cfr_renamed_2.put(sprm.cfr_renamed_128.cfr_renamed_19(), sprnkha.cfr_renamed_9("\u000bD\u0019>j8"));
        cfr_renamed_2.put(sprm.cfr_renamed_129.cfr_renamed_19(), "SHA256");
        cfr_renamed_2.put(sprm.cfr_renamed_130.cfr_renamed_19(), "SHA384");
        cfr_renamed_2.put(sprm.cfr_renamed_107.cfr_renamed_19(), "SHA512");
        cfr_renamed_2.put(spryk.cfr_renamed_126.cfr_renamed_19(), sprqnja.cfr_renamed_9("!L#@>AB7K"));
        cfr_renamed_2.put(spryk.cfr_renamed_91.cfr_renamed_19(), "RIPEMD160");
        cfr_renamed_2.put(spryk.cfr_renamed_3.cfr_renamed_19(), sprnkha.cfr_renamed_9("^\u0011\\\u001dA\u001c>m:"));
        cfr_renamed_2.put(sprji.cfr_renamed_31.cfr_renamed_19(), sprqnja.cfr_renamed_9("B<V'6G4B"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_573(sprpod arg0, spraa arg1) throws spreva {
        ArrayList<sprbva> arrayList = new ArrayList<sprbva>();
        sprvte sprvte2 = arg0.cfr_renamed_574();
        if (sprvte2 != null) {
            int n;
            sprlre sprlre2 = sprvte2.cfr_renamed_575(sprm.cfr_renamed_2);
            int n2 = n = 0;
            while (n2 < sprlre2.cfr_renamed_84()) {
                int n3;
                sprere sprere2 = ((sprche)sprlre2.cfr_renamed_576(n)).cfr_renamed_206();
                int n4 = n3 = 0;
                while (n4 < sprere2.cfr_renamed_84()) {
                    try {
                        sprnte sprnte2 = sprnte.cfr_renamed_23(sprere2.cfr_renamed_85(n3));
                        sprbva sprbva2 = new sprbva(sprnte2);
                        sprhsa sprhsa2 = sprbva2.cfr_renamed_577();
                        sprpa sprpa2 = arg1.cfr_renamed_578(sprhsa2.cfr_renamed_579());
                        OutputStream outputStream = sprpa2.cfr_renamed_470();
                        outputStream.write(arg0.cfr_renamed_79());
                        outputStream.close();
                        if (!sprzra.cfr_renamed_559(sprpa2.cfr_renamed_580(), sprhsa2.cfr_renamed_581())) {
                            throw new spreva(sprnkha.cfr_renamed_9("E6o7~*i;xxh1k=\u007f,,1bxa=\u007f+m?ixe5|*e6x"));
                        }
                        arrayList.add(sprbva2);
                    }
                    catch (sprfya sprfya2) {
                        throw new spreva(sprqnja.cfr_renamed_9("&k\u0018k\u001cr\u001d%\u001bd\u0000mSd\u001fb\u001cw\u001aq\u001bhSv\u0003`\u0010l\u0015l\u0016aSl\u001d%\u0007l\u001e`\u0000q\u0012h\u0003"));
                    }
                    catch (Exception exception) {
                        throw new spreva(sprnkha.cfr_renamed_9("X1a=\u007f,m5|xo7y4hxb7xxn=,(m*\u007f=h"));
                    }
                    n4 = ++n3;
                }
                n2 = ++n;
            }
        }
        return arrayList;
    }

    public static List cfr_renamed_582(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }
}

