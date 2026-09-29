/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.spridf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.spriye;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsff;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprwr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sprkye {
    private static final Map cfr_renamed_2;
    private static final Map cfr_renamed_3;
    private static List cfr_renamed_4;

    public static List cfr_renamed_5274(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_4;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }

    public static void cfr_renamed_5275(sprtpl arg0) throws sprsff {
        if (arg0.cfr_renamed_568().cfr_renamed_569() != 3) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("8\u0001\t\u0010\u0012\u0002\u0012\u0007\u001a\u0010\u001eD\u0016\u0011\b\u0010[\f\u001a\u0012\u001eD\u001a\n[!\u0003\u0010\u001e\n\u001f\u0001\u001f/\u001e\u001d.\u0017\u001a\u0003\u001eD\u001e\u001c\u000f\u0001\u0015\u0017\u0012\u000b\u0015J"));
        }
        sprrdm sprrdm2 = arg0.cfr_renamed_5024(sprrdm.cfr_renamed_114);
        if (sprrdm2 == null) {
            throw new sprsff(sprjod.cfr_renamed_9("\u0010\u0015!\u0004:\u0016:\u00132\u00046P>\u0005 \u0004s\u00182\u00066P2\u001es5+\u00046\u001e7\u00157;6\t\u0006\u00032\u00176P6\b'\u0015=\u0003:\u001f=^"));
        }
        if (!sprrdm2.cfr_renamed_101()) {
            throw new sprsff(sprtpa.cfr_renamed_9("'\u001e\u0016\u000f\r\u001d\r\u0018\u0005\u000f\u0001[\t\u000e\u0017\u000fD\u0013\u0005\r\u0001[\u0005\u0015D>\u001c\u000f\u0001\u0015\u0000\u001e\u00000\u0001\u00021\b\u0005\u001c\u0001[\u0001\u0003\u0010\u001e\n\b\r\u0014\n[\t\u001a\u0016\u0010\u0001\u001fD\u001a\u0017[\u0007\t\r\u000f\r\u0018\u0005\u0017J"));
        }
        sprnyl sprnyl2 = sprnyl.cfr_renamed_23(sprrdm2.cfr_renamed_372());
        if (!sprnyl2.cfr_renamed_5276(sprpdm.cfr_renamed_3) || sprnyl2.cfr_renamed_84() != 1) {
            throw new sprsff(sprjod.cfr_renamed_9("\u0016\b'\u0015=\u00146\u0014\u0018\u0015*% \u00114\u0015s\u001e<\u0004s\u0003<\u001c6\u001c*P'\u0019>\u0015s\u0003'\u0011>\u0000:\u001e4^"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_5277(sprrpl arg0, sprlj arg1) throws sprsff {
        ArrayList<sprqxe> arrayList = new ArrayList<sprqxe>();
        sprjpm sprjpm2 = arg0.cfr_renamed_574();
        if (sprjpm2 != null) {
            int n;
            sprrvm sprrvm2 = sprjpm2.cfr_renamed_5278(sprdl.cfr_renamed_813);
            int n2 = n = 0;
            while (n2 < sprrvm2.cfr_renamed_84()) {
                int n3;
                spridn spridn2 = ((spruem)sprrvm2.cfr_renamed_576(n)).cfr_renamed_206();
                int n4 = n3 = 0;
                while (n4 < spridn2.cfr_renamed_84()) {
                    try {
                        sprlvm sprlvm2 = sprlvm.cfr_renamed_23(spridn2.cfr_renamed_85(n3));
                        sprqxe sprqxe2 = new sprqxe(sprlvm2);
                        spridf spridf2 = sprqxe2.cfr_renamed_577();
                        sprjj sprjj2 = arg1.cfr_renamed_5279(spridf2.cfr_renamed_579());
                        OutputStream outputStream = sprjj2.cfr_renamed_470();
                        outputStream.write(arg0.cfr_renamed_79());
                        outputStream.close();
                        if (!sproze.cfr_renamed_559(sprjj2.cfr_renamed_580(), spridf2.cfr_renamed_581())) {
                            throw new sprsff(sprtpa.cfr_renamed_9("-\u0015\u0007\u0014\u0016\t\u0001\u0018\u0010[\u0000\u0012\u0003\u001e\u0017\u000fD\u0012\n[\t\u001e\u0017\b\u0005\u001c\u0001[\r\u0016\u0014\t\r\u0015\u0010"));
                        }
                        arrayList.add(sprqxe2);
                    }
                    catch (sprhjg sprhjg2) {
                        throw new sprsff(sprjod.cfr_renamed_9("%=\u001b=\u001f$\u001es\u00182\u0003;P2\u001c4\u001f!\u0019'\u0018>P \u00006\u0013:\u0016:\u00157P:\u001es\u0004:\u001d6\u0003'\u0011>\u0000"));
                    }
                    catch (Exception exception) {
                        throw new sprsff(sprtpa.cfr_renamed_9("0\u0012\t\u001e\u0017\u000f\u0005\u0016\u0014[\u0007\u0014\u0011\u0017\u0000[\n\u0014\u0010[\u0006\u001eD\u000b\u0005\t\u0017\u001e\u0000"));
                    }
                    n4 = ++n3;
                }
                n2 = ++n;
            }
        }
        return arrayList;
    }

    static {
        cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());
        cfr_renamed_3 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_3.put(sprdl.cfr_renamed_1540.cfr_renamed_19(), spruaf.cfr_renamed_279(16));
        cfr_renamed_3.put(sprgt.cfr_renamed_0.cfr_renamed_19(), spruaf.cfr_renamed_279(20));
        cfr_renamed_3.put(sprwr.cfr_renamed_957.cfr_renamed_19(), spruaf.cfr_renamed_279(28));
        cfr_renamed_3.put(sprwr.cfr_renamed_1226.cfr_renamed_19(), spruaf.cfr_renamed_279(32));
        cfr_renamed_3.put(sprwr.cfr_renamed_112.cfr_renamed_19(), spruaf.cfr_renamed_279(48));
        cfr_renamed_3.put(sprwr.cfr_renamed_272.cfr_renamed_19(), spruaf.cfr_renamed_279(64));
        cfr_renamed_3.put(spris.cfr_renamed_91.cfr_renamed_19(), spruaf.cfr_renamed_279(16));
        cfr_renamed_3.put(spris.cfr_renamed_272.cfr_renamed_19(), spruaf.cfr_renamed_279(20));
        cfr_renamed_3.put(spris.cfr_renamed_102.cfr_renamed_19(), spruaf.cfr_renamed_279(32));
        cfr_renamed_3.put(sprqo.cfr_renamed_112.cfr_renamed_19(), spruaf.cfr_renamed_279(32));
        cfr_renamed_3.put(sprdt.cfr_renamed_4.cfr_renamed_19(), spruaf.cfr_renamed_279(32));
        cfr_renamed_3.put(sprdt.cfr_renamed_3.cfr_renamed_19(), spruaf.cfr_renamed_279(64));
        cfr_renamed_3.put(sprrq.cfr_renamed_1344.cfr_renamed_19(), spruaf.cfr_renamed_279(32));
        cfr_renamed_2.put(sprdl.cfr_renamed_1540.cfr_renamed_19(), "MD5");
        cfr_renamed_2.put(sprgt.cfr_renamed_0.cfr_renamed_19(), "SHA1");
        cfr_renamed_2.put(sprwr.cfr_renamed_957.cfr_renamed_19(), sprjod.cfr_renamed_9("\u00008\u0012BaD"));
        cfr_renamed_2.put(sprwr.cfr_renamed_1226.cfr_renamed_19(), "SHA256");
        cfr_renamed_2.put(sprwr.cfr_renamed_112.cfr_renamed_19(), "SHA384");
        cfr_renamed_2.put(sprwr.cfr_renamed_272.cfr_renamed_19(), "SHA512");
        cfr_renamed_2.put(sprdl.cfr_renamed_3051.cfr_renamed_19(), "SHA1");
        cfr_renamed_2.put(sprdl.cfr_renamed_1262.cfr_renamed_19(), sprtpa.cfr_renamed_9("(,:VIP"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1601.cfr_renamed_19(), "SHA256");
        cfr_renamed_2.put(sprdl.cfr_renamed_1572.cfr_renamed_19(), "SHA384");
        cfr_renamed_2.put(sprdl.cfr_renamed_84.cfr_renamed_19(), "SHA512");
        cfr_renamed_2.put(spris.cfr_renamed_91.cfr_renamed_19(), sprjod.cfr_renamed_9("\"\u001a \u0016=\u0017AaH"));
        cfr_renamed_2.put(spris.cfr_renamed_272.cfr_renamed_19(), "RIPEMD160");
        cfr_renamed_2.put(spris.cfr_renamed_102.cfr_renamed_19(), sprtpa.cfr_renamed_9("624>)?VNR"));
        cfr_renamed_2.put(sprqo.cfr_renamed_112.cfr_renamed_19(), sprjod.cfr_renamed_9("\u0014?\u0000$`DbA"));
        cfr_renamed_2.put(sprdt.cfr_renamed_4.cfr_renamed_19(), sprtpa.cfr_renamed_9("#47/WOUJIITJVVVNR"));
        cfr_renamed_2.put(sprdt.cfr_renamed_3.cfr_renamed_19(), sprjod.cfr_renamed_9("7\u001c#\u0007CgAb]a@bB~EbB"));
        cfr_renamed_2.put(sprrq.cfr_renamed_1344.cfr_renamed_19(), sprtpa.cfr_renamed_9("76W"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5280(sprgem arg0, sprlem arg1, boolean arg2, sprco arg3) throws spriye {
        try {
            arg0.cfr_renamed_4998(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new spriye(new StringBuilder().insert(0, sprjod.cfr_renamed_9("\u00132\u001e=\u001f'P6\u001e0\u001f7\u0015s\u0015+\u00046\u001e \u0019<\u001eiP")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static int cfr_renamed_572(String arg0) throws sprahf {
        Integer n = (Integer)cfr_renamed_3.get(arg0);
        if (n != null) {
            return n;
        }
        throw new sprahf(sprtpa.cfr_renamed_9("\u0000\u0012\u0003\u001e\u0017\u000fD\u001a\b\u001c\u000b\t\r\u000f\f\u0016D\u0018\u0005\u0015\n\u0014\u0010[\u0006\u001eD\u001d\u000b\u000e\n\u001fJ"));
    }
}

