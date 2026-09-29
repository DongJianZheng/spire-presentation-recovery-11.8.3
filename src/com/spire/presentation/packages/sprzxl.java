/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprito;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmfm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprypl;
import com.spire.presentation.packages.sprzdq;
import com.spire.presentation.packages.sprznl;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprzxl {
    private static Set cfr_renamed_3 = Collections.unmodifiableSet(new HashSet());
    private static List cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());

    private static /* synthetic */ sprffm cfr_renamed_10858(sprtfm arg0, sprddm arg1, byte[] arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg2));
        return sprffm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public static Set cfr_renamed_10879(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(arg0.cfr_renamed_665())));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5280(sprgem arg0, sprlem arg1, boolean arg2, sprco arg3) throws sprznl {
        try {
            arg0.cfr_renamed_4998(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new sprznl(new StringBuilder().insert(0, sprzdq.cfr_renamed_9("xCuLtV;GuAtF~\u0002~ZoGuQrMu\u0018;")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static boolean cfr_renamed_9062(sprddm arg0, sprddm arg1) {
        if (!arg0.cfr_renamed_593().cfr_renamed_5078(arg1.cfr_renamed_593())) {
            return false;
        }
        if (sprjcf.cfr_renamed_5159(sprito.cfr_renamed_9("a4ouq+k)gur(o4f>nuq>a.p2v\",#7k;uc7n4u\u0004c9q>l/]>s.k-]\u0015W\u0017N"))) {
            if (arg0.cfr_renamed_284() == null) {
                return arg1.cfr_renamed_284() == null || arg1.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
            }
            if (arg1.cfr_renamed_284() == null) {
                return arg0.cfr_renamed_284() == null || arg0.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
            }
        }
        if (arg0.cfr_renamed_284() != null) {
            return arg0.cfr_renamed_284().equals(arg1.cfr_renamed_284());
        }
        if (arg1.cfr_renamed_284() != null) {
            return arg1.cfr_renamed_284().equals(arg0.cfr_renamed_284());
        }
        return true;
    }

    private static /* synthetic */ byte[] cfr_renamed_10848(sprcf arg0, sprqqe arg1) throws IOException {
        OutputStream outputStream;
        sprcf sprcf2 = arg0;
        OutputStream outputStream2 = outputStream = sprcf2.cfr_renamed_470();
        arg1.cfr_renamed_8489(outputStream2, "DER");
        outputStream2.close();
        return sprcf2.cfr_renamed_79();
    }

    public static sprdye cfr_renamed_27(boolean[] arg0) {
        int n;
        byte[] byArray = new byte[(arg0.length + 7) / 8];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n / 8;
            byArray[n3] = (byte)(byArray[n3] | (arg0[n] ? 1 << 7 - n % 8 : 0));
            n2 = ++n;
        }
        n = arg0.length % 8;
        if (n == 0) {
            return new sprdye(byArray);
        }
        return new sprdye(byArray, 8 - n);
    }

    public static Set cfr_renamed_10880(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(arg0.cfr_renamed_662())));
    }

    public static List cfr_renamed_5274(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_4;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }

    public static sprxgf cfr_renamed_10882(byte[] arg0) throws IOException {
        sprxgf sprxgf2 = sprxgf.cfr_renamed_184(arg0);
        if (sprxgf2 == null) {
            throw new IOException(sprzdq.cfr_renamed_9("Lt\u0002xMuV~Lo\u0002}MnL\u007f"));
        }
        return sprxgf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_10883(sprjfn arg0) {
        try {
            return arg0.cfr_renamed_110();
        }
        catch (ParseException parseException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprito.cfr_renamed_9(".l:`7g{v4\")g8m-g)\"?c/ga\"")).append(parseException.getMessage()).toString());
        }
    }

    private static /* synthetic */ sprndm cfr_renamed_10843(sprdzl arg0, sprddm arg1, byte[] arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg2));
        return sprndm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprypl cfr_renamed_10866(sprcf arg0, sprmfm arg1) {
        try {
            sprmfm sprmfm2 = arg1;
            return new sprypl(sprzxl.cfr_renamed_10842(sprmfm2, arg0.cfr_renamed_615(), sprzxl.cfr_renamed_10848(arg0, sprmfm2)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprzdq.cfr_renamed_9("AzLuMo\u0002kPtFnA~\u0002zVoPr@nV~\u0002xGiVrDrAzV~\u0002hK|LzVnP~"));
        }
    }

    public static boolean[] cfr_renamed_10884(sprgbf arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = arg0.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - arg0.cfr_renamed_106()];
            int n2 = n = 0;
            while (n2 != blArray.length) {
                int n3 = n;
                blArray[n3] = (byArray[n / 8] & 128 >>> n3 % 8) != 0;
                n2 = ++n;
            }
            return blArray;
        }
        return null;
    }

    public static sprgem cfr_renamed_10856(sprgem arg0, sprlem arg1) {
        boolean bl = false;
        sprhgm sprhgm2 = arg0.cfr_renamed_31();
        arg0 = new sprgem();
        Enumeration enumeration = sprhgm2.cfr_renamed_99();
        while (enumeration.hasMoreElements()) {
            sprlem sprlem2 = (sprlem)enumeration.nextElement();
            if (sprlem2.cfr_renamed_5078(arg1)) {
                bl = true;
                continue;
            }
            arg0.cfr_renamed_5283(sprhgm2.cfr_renamed_5024(sprlem2));
        }
        if (!bl) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprito.cfr_renamed_9(")g6m-g{/{g#v>l(k4l{*\u0014K\u001f\"f\"")).append(arg1).append(sprzdq.cfr_renamed_9("2\u0002uMo\u0002}MnL\u007f")).toString());
        }
        return arg0;
    }

    public static sprgem cfr_renamed_10845(sprgem arg0, sprrdm arg1) {
        boolean bl = false;
        sprhgm sprhgm2 = arg0.cfr_renamed_31();
        arg0 = new sprgem();
        Enumeration enumeration = sprhgm2.cfr_renamed_99();
        while (enumeration.hasMoreElements()) {
            sprlem sprlem2 = (sprlem)enumeration.nextElement();
            if (sprlem2.cfr_renamed_5078(arg1.cfr_renamed_4521())) {
                bl = true;
                arg0.cfr_renamed_5283(arg1);
                continue;
            }
            arg0.cfr_renamed_5283(sprhgm2.cfr_renamed_5024(sprlem2));
        }
        if (!bl) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprito.cfr_renamed_9(")g+n:a>\"v\"4p2e2l:n{g#v>l(k4l{*\u0014K\u001f\"f\"")).append(arg1.cfr_renamed_4521()).append(sprzdq.cfr_renamed_9("2\u0002uMo\u0002}MnL\u007f")).toString());
        }
        return arg0;
    }

    private static /* synthetic */ sprkim cfr_renamed_10842(sprmfm arg0, sprddm arg1, byte[] arg2) {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg2));
        return sprkim.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public static sprnvm cfr_renamed_10878(int arg0, sprhgm arg1) {
        int n;
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg1.cfr_renamed_119());
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            sprszm sprszm3 = sprszm.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
            if (!sprrdm.cfr_renamed_112.cfr_renamed_7476(sprszm3.cfr_renamed_85(0))) {
                sprrvm2.cfr_renamed_5004(sprszm3);
            }
            n2 = ++n;
        }
        return new sprycn(true, arg0, (sprco)new sprcen(sprrvm2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprtpl cfr_renamed_10867(sprcf arg0, sprdzl arg1) {
        try {
            sprdzl sprdzl2 = arg1;
            return new sprtpl(sprzxl.cfr_renamed_10843(sprdzl2, arg0.cfr_renamed_615(), sprzxl.cfr_renamed_10848(arg0, sprdzl2)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprito.cfr_renamed_9("8c5l4v{r)m?w8g{a>p/k=k8c/g{q2e5c/w)g"));
        }
    }
}

