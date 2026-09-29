/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcdj;
import com.spire.presentation.packages.spredj;
import com.spire.presentation.packages.sprfbj;
import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprifj;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjgj;
import com.spire.presentation.packages.sprkgj;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnpk;
import com.spire.presentation.packages.sprnzi;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsdj;
import com.spire.presentation.packages.sprvqfa;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.spryaj;
import com.spire.presentation.packages.spryej;
import com.spire.presentation.packages.sprzcj;
import java.net.URL;
import java.security.AccessController;
import java.security.SecureRandom;
import java.security.Security;

public class sprvcj {
    private static final String[][] cfr_renamed_1;
    private static sprifj cfr_renamed_2;
    private static final String cfr_renamed_3;
    private static Thread cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final /* synthetic */ Object[] cfr_renamed_9322() {
        int n;
        int n2 = n = 0;
        while (n2 < cfr_renamed_1.length) {
            String[] stringArray = cfr_renamed_1[n];
            try {
                Object[] objectArray = new Object[2];
                objectArray[0] = Class.forName(stringArray[0]).newInstance();
                objectArray[1] = Class.forName(stringArray[1]).newInstance();
                return objectArray;
            }
            catch (Throwable throwable) {
                n2 = ++n;
                continue;
            }
            break;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ SecureRandom cfr_renamed_9323(boolean arg0) {
        spryej spryej2;
        if (sprjcf.cfr_renamed_5153(sprhsh.cfr_renamed_9("0.>o 1:36o#2>.7$?o $04!('8}%!#4o6/'3<1*2<4!\"6")) != null) {
            sprgo sprgo2 = sprvcj.cfr_renamed_9324();
            sprwj sprwj2 = sprgo2.cfr_renamed_576(128);
            byte[] byArray = arg0 ? sprvcj.cfr_renamed_9325(sprwj2.cfr_renamed_3300()) : sprvcj.cfr_renamed_9326(sprwj2.cfr_renamed_3300());
            return new sprnpk(sprgo2).cfr_renamed_3291(byArray).cfr_renamed_9327(new sprocl(), sprwj2.cfr_renamed_3300(), arg0);
        }
        if (sprjcf.cfr_renamed_5159(sprvqfa.cfr_renamed_9("1\n?K!\u0015;\u00177K\"\u0016?\n6\u0000>K!\u00001\u0010 \f&\u001c|\u0001 \u00075K7\u000b&\u0017=\u0015+:&\r \u00003\u0001"))) {
            Object object = cfr_renamed_2;
            synchronized (object) {
                if (cfr_renamed_4 == null) {
                    cfr_renamed_4 = new Thread((Runnable)cfr_renamed_2, sprhsh.cfr_renamed_9("\u0011\u0002s\u0004=5!.#8s\u00052$>.="));
                    cfr_renamed_4.setDaemon(true);
                    cfr_renamed_4.start();
                }
            }
            Object object2 = object = new sprjgj(cfr_renamed_2, 256);
            byte[] byArray = arg0 ? sprvcj.cfr_renamed_9325(object2.cfr_renamed_3300()) : sprvcj.cfr_renamed_9326(object2.cfr_renamed_3300());
            return new sprnpk(new sprfbj()).cfr_renamed_3291(byArray).cfr_renamed_9327(new sprocl(), object.cfr_renamed_3300(), arg0);
        }
        spryej spryej3 = spryej2 = new spryej(256);
        byte[] byArray = arg0 ? sprvcj.cfr_renamed_9325(spryej3.cfr_renamed_3300()) : sprvcj.cfr_renamed_9326(spryej3.cfr_renamed_3300());
        return new sprnpk(new sprkgj()).cfr_renamed_3291(byArray).cfr_renamed_9327(new sprocl(), spryej2.cfr_renamed_3300(), arg0);
    }

    public static /* synthetic */ void cfr_renamed_9328(long arg0) throws InterruptedException {
        sprvcj.cfr_renamed_9317(arg0);
    }

    private static /* synthetic */ byte[] cfr_renamed_9325(byte[] arg0) {
        return sproze.cfr_renamed_526(sprkoe.cfr_renamed_433("Default"), arg0, sprpxe.cfr_renamed_451(Thread.currentThread().getId()), sprpxe.cfr_renamed_451(System.currentTimeMillis()));
    }

    public static /* synthetic */ sprgo cfr_renamed_9329() {
        return sprvcj.cfr_renamed_9330();
    }

    private static /* synthetic */ sprgo cfr_renamed_9324() {
        String string = sprjcf.cfr_renamed_5153(sprvqfa.cfr_renamed_9("\u0006=\b|\u0016\"\f \u0000|\u0015!\b=\u00017\t|\u00167\u0006'\u0017;\u0011+K6\u00170\u0002|\u0000<\u0011 \n\"\u001c!\n'\u00171\u0000"));
        return AccessController.doPrivileged(new sprsdj(string));
    }

    public static /* synthetic */ Object[] cfr_renamed_3555() {
        return sprvcj.cfr_renamed_9322();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprgo cfr_renamed_9330() {
        if (Security.getProperty(sprhsh.cfr_renamed_9(" $04!$! =%<,}2<4!\"6")) == null) {
            return sprvcj.cfr_renamed_9331();
        }
        try {
            String string = Security.getProperty(sprvqfa.cfr_renamed_9("\u00167\u0006'\u00177\u00173\u000b6\n?K!\n'\u00171\u0000"));
            return new spryaj(new URL(string));
        }
        catch (Exception exception) {
            return sprvcj.cfr_renamed_9331();
        }
    }

    public static /* synthetic */ sprifj cfr_renamed_2444() {
        return cfr_renamed_2;
    }

    public static /* synthetic */ String cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    static {
        cfr_renamed_3 = sprvcj.class.getName();
        String[][] stringArrayArray = new String[4][];
        String[] stringArray = new String[2];
        stringArray[0] = sprhsh.cfr_renamed_9(" 4=o $04!('8}1!.%(7$!o\u00004=");
        stringArray[1] = sprvqfa.cfr_renamed_9("!\u0010<K!\u00001\u0010 \f&\u001c|\u0015 \n$\f6\u0000 K\u0001\u00001\u0010 \u0000\u0000\u0004<\u0001=\b");
        stringArrayArray[0] = stringArray;
        String[] stringArray2 = new String[2];
        stringArray2[0] = sprhsh.cfr_renamed_9(".!&} # 0)6o; !,</*o $04!('8}1!.%(7$!o03*1'.}\u0002!8#5<\u0011!.%(7$!");
        stringArray2[1] = sprvqfa.cfr_renamed_9("\n \u0002|\u0004\"\u00041\r7K:\u0004 \b=\u000b+K!\u00001\u0010 \f&\u001c|\u0015 \n$\f6\u0000 K1\u0017+\u0015&\n|6\u001a$c5\u0000+\u0015:\u0001\u00001\u0010 \u0000\u0000\u0004<\u0001=\b\u001b\b\"\t");
        stringArrayArray[1] = stringArray2;
        String[] stringArray3 = new String[2];
        stringArray3[0] = sprhsh.cfr_renamed_9("0.>o2/73<(7o<34o0.=203*1'o\u001c16/\u0000\u0012\u001f\u0011!.%(7$!");
        stringArray3[1] = sprvqfa.cfr_renamed_9("\u0006=\b|\u0004<\u0001 \n;\u0001|\n \u0002|\u0006=\u000b!\u0006 \u001c\"\u0011|*\"\u0000<6\u0001)\u0000\u0004<\u0001=\b");
        stringArrayArray[2] = stringArray3;
        String[] stringArray4 = new String[2];
        stringArray4[0] = sprhsh.cfr_renamed_9("<34o0.=203*1'o\u001c16/\u0000\u0012\u001f\u0011!.%(7$!");
        stringArray4[1] = sprvqfa.cfr_renamed_9("\n \u0002|\u0006=\u000b!\u0006 \u001c\"\u0011|*\"\u0000<6\u0001)\u0000\u0004<\u0001=\b");
        stringArrayArray[3] = stringArray4;
        cfr_renamed_1 = stringArrayArray;
        cfr_renamed_2 = null;
        cfr_renamed_4 = null;
        cfr_renamed_2 = new sprifj();
    }

    private static /* synthetic */ sprgo cfr_renamed_9331() {
        if (AccessController.doPrivileged(new sprnzi()).booleanValue()) {
            SecureRandom secureRandom = AccessController.doPrivileged(new spredj());
            return new sprcdj(secureRandom, true);
        }
        return new sprcdj(new sprzcj(sprvcj.cfr_renamed_9322()), true);
    }

    public static /* synthetic */ SecureRandom cfr_renamed_9332(boolean arg0) {
        return sprvcj.cfr_renamed_9323(arg0);
    }

    private static /* synthetic */ byte[] cfr_renamed_9326(byte[] arg0) {
        return sproze.cfr_renamed_526(sprkoe.cfr_renamed_433(sprhsh.cfr_renamed_9("\u001d.=\"6")), arg0, sprpxe.cfr_renamed_452(Thread.currentThread().getId()), sprpxe.cfr_renamed_452(System.currentTimeMillis()));
    }

    private static /* synthetic */ void cfr_renamed_9317(long arg0) throws InterruptedException {
        if (arg0 != 0L) {
            Thread.sleep(arg0);
        }
    }
}

