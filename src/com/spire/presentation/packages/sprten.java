/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprcip;
import com.spire.presentation.packages.sprdu;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfbn;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgmga;
import com.spire.presentation.packages.sprkfha;
import com.spire.presentation.packages.sprkgr;
import com.spire.presentation.packages.sprlnga;
import com.spire.presentation.packages.sprlqha;
import com.spire.presentation.packages.sprmcja;
import com.spire.presentation.packages.sprniga;
import com.spire.presentation.packages.sprnmga;
import com.spire.presentation.packages.sprnxga;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpiga;
import com.spire.presentation.packages.sprqwq;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprscha;
import com.spire.presentation.packages.sprsuga;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtbja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvmga;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvz;
import com.spire.presentation.packages.sprwtga;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprylha;
import com.spire.presentation.packages.sprywq;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;
import java.util.Map;

@sprtea
public class sprten {
    private static sprvrx cfr_renamed_4 = new sprvrx();

    public static void cfr_renamed_12270(sprlnga arg0) {
        if (arg0.cfr_renamed_12271() == 1) {
            return;
        }
        sprlnga sprlnga2 = arg0;
        while (sprlnga2.cfr_renamed_12271() == 13) {
            sprlnga sprlnga3 = arg0;
            sprlnga2 = sprlnga3;
            sprlnga3.cfr_renamed_137();
        }
    }

    public static sprnmga cfr_renamed_12272(sprtbja arg0, boolean arg1) {
        sprvmga sprvmga2;
        sprvmga sprvmga3 = sprvmga2 = new sprvmga();
        sprvmga3.cfr_renamed_12273(arg1);
        return sprnmga.cfr_renamed_12274(arg0, sprvmga3);
    }

    public static sprnmga cfr_renamed_12275(spreen arg0, sprszca arg1) {
        sprvmga sprvmga2;
        sprvmga sprvmga3 = sprvmga2 = new sprvmga();
        sprvmga3.cfr_renamed_12276(arg1);
        return sprnmga.cfr_renamed_12277(arg0, sprvmga3);
    }

    private static /* synthetic */ void cfr_renamed_12278(sprniga arg0, StringBuilder arg1, sprfbn arg2, sprdu arg3) {
        sprghha.cfr_renamed_12279(arg1, "<");
        sprghha.cfr_renamed_12279(arg1, arg0.cfr_renamed_313());
        spravp spravp2 = new spravp();
        if (!sprraia.cfr_renamed_12280(arg0.cfr_renamed_12281()) && !arg2.cfr_renamed_12282(arg0.cfr_renamed_12281())) {
            arg2.cfr_renamed_12283().cfr_renamed_12160(arg0.cfr_renamed_12281(), arg0.cfr_renamed_12284());
        }
        if (arg0.cfr_renamed_12285()) {
            sprniga sprniga2;
            do {
                if ("xmlns".equals(arg0.cfr_renamed_12281())) {
                    if (!arg2.cfr_renamed_12282(arg0.cfr_renamed_12286())) {
                        sprniga sprniga3 = arg0;
                        sprniga2 = sprniga3;
                        arg2.cfr_renamed_12283().cfr_renamed_12160(arg0.cfr_renamed_12286(), sprniga3.cfr_renamed_97());
                        continue;
                    }
                } else {
                    if ("xmlns".equals(arg0.cfr_renamed_313()) && !arg2.cfr_renamed_12282("")) {
                        sprniga sprniga4 = arg0;
                        sprniga2 = sprniga4;
                        arg2.cfr_renamed_12283().cfr_renamed_12160("", sprniga4.cfr_renamed_97());
                        continue;
                    }
                    spravp2.cfr_renamed_12160(arg0.cfr_renamed_313(), arg0.cfr_renamed_97());
                    if (!sprraia.cfr_renamed_12280(arg0.cfr_renamed_12281()) && !arg2.cfr_renamed_12282(arg0.cfr_renamed_12281())) {
                        arg2.cfr_renamed_12283().cfr_renamed_12160(arg0.cfr_renamed_12281(), arg0.cfr_renamed_12284());
                    }
                }
                sprniga2 = arg0;
            } while (sprniga2.cfr_renamed_12287());
        }
        if (spravp2.size() > 0) {
            Iterator iterator;
            Iterator iterator2 = iterator = spravp2.iterator();
            while (iterator2.hasNext()) {
                sprnyja sprnyja2 = (sprnyja)iterator.next();
                Object[] objectArray = new Object[2];
                objectArray[0] = sprnyja2.getKey();
                objectArray[1] = sprten.cfr_renamed_12288((String)sprnyja2.getValue());
                sprghha.cfr_renamed_12289(arg1, spruzf.cfr_renamed_9(".\f>\n3UuFsU"), objectArray);
                iterator2 = iterator;
            }
        }
        if (arg2.cfr_renamed_12283().size() > 0) {
            for (sprnyja sprnyja2 : arg2.cfr_renamed_12283()) {
                String string = arg3 != null ? arg3.cfr_renamed_12290((String)sprnyja2.getValue()) : (String)sprnyja2.getValue();
                StringBuilder stringBuilder = arg1;
                if (sprraia.cfr_renamed_12280((String)sprnyja2.getKey())) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = sprten.cfr_renamed_12288(string);
                    sprghha.cfr_renamed_12289(stringBuilder, sprawc.cfr_renamed_9("\u0003yNmMr\u001e#X1^#"), objectArray);
                    continue;
                }
                Object[] objectArray = new Object[2];
                objectArray[0] = sprnyja2.getKey();
                objectArray[1] = sprten.cfr_renamed_12288(string);
                sprghha.cfr_renamed_12289(stringBuilder, spruzf.cfr_renamed_9(".\u000fc\u001b`\u00044\f>\n3UuFsU"), objectArray);
            }
        }
        sprniga sprniga5 = arg0;
        sprniga5.cfr_renamed_12291();
        StringBuilder stringBuilder = arg1;
        if (sprniga5.cfr_renamed_12292()) {
            sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("!\f?"));
            return;
        }
        sprghha.cfr_renamed_12279(stringBuilder, ">");
    }

    @sprtea
    public static sprniga cfr_renamed_12293(spreen arg0, sprcip arg1) {
        Object object;
        Object object2;
        sprylha sprylha2 = new sprylha();
        sprpiga sprpiga2 = new sprpiga(sprylha2);
        if (arg1 != null) {
            object2 = arg1.cfr_renamed_6507().iterator();
            block0: while (true) {
                Object object3 = object2;
                while (object3.hasNext()) {
                    object = (String)object2.next();
                    if (sprten.cfr_renamed_12294((String)object)) {
                        object3 = object2;
                        continue;
                    }
                    if (sprpiga2.cfr_renamed_12295((String)object)) continue block0;
                    Object object4 = object;
                    sprpiga2.cfr_renamed_12296((String)object4, arg1.cfr_renamed_1600((String)object4));
                    continue block0;
                }
                break;
            }
        }
        object2 = new sprscha(sprylha2, sprpiga2, null, 1);
        object = new sprniga(arg0, 9, (sprscha)object2);
        ((sprniga)object).cfr_renamed_12297(null);
        return object;
    }

    public static sprlnga cfr_renamed_12298(spreen arg0, boolean arg1) {
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(0L);
        sprlnga sprlnga2 = sprlnga.cfr_renamed_12299(spreen2);
        if (arg1) {
            sprlnga sprlnga3 = sprlnga2;
            while (sprlnga3.cfr_renamed_12271() != 1) {
                sprlnga sprlnga4 = sprlnga2;
                sprlnga3 = sprlnga4;
                sprlnga4.cfr_renamed_137();
            }
        }
        return sprlnga2;
    }

    public static sprlnga cfr_renamed_12300(spreen arg0) {
        return sprten.cfr_renamed_12298(arg0, true);
    }

    @sprtea
    public static sprniga cfr_renamed_12301(spreen arg0, spralq arg1) {
        Object object2;
        sprylha sprylha2 = new sprylha();
        sprpiga sprpiga2 = new sprpiga(sprylha2);
        if (arg1 != null) {
            for (Object object2 : arg1.keySet()) {
                if (sprpiga2.cfr_renamed_12295((String)object2)) continue;
                Object object3 = object2;
                sprpiga2.cfr_renamed_12296((String)object3, (String)arg1.get(object3));
            }
        }
        sprscha sprscha2 = new sprscha(sprylha2, sprpiga2, null, 1);
        object2 = new sprniga(arg0, 9, sprscha2);
        ((sprniga)object2).cfr_renamed_12297(null);
        return object2;
    }

    public static sprqwq cfr_renamed_12302(sprkgr arg0, String arg1) {
        sprkgr sprkgr2;
        sprkgr sprkgr3 = sprkgr2 = arg0.cfr_renamed_12303();
        while (sprkgr3 != null) {
            if (sprkgr2.cfr_renamed_12271() == 1 && sprraia.cfr_renamed_11730(sprkgr2.cfr_renamed_313(), arg1)) {
                return (sprqwq)sprkgr2;
            }
            sprkgr3 = sprkgr2.cfr_renamed_12304();
        }
        return null;
    }

    public static String cfr_renamed_12305(sprniga arg0) {
        return sprten.cfr_renamed_12306(arg0, null, null);
    }

    public static boolean cfr_renamed_12307(int arg0, sprkgr arg1) {
        return arg1.cfr_renamed_12271() == arg0;
    }

    public static sprpdja cfr_renamed_12308(sprlnga arg0) {
        sprnmga sprnmga2;
        sprpdja sprpdja2 = new sprpdja();
        sprnmga sprnmga3 = sprnmga2 = sprten.cfr_renamed_12275(sprpdja2, sprszca.cfr_renamed_11605());
        sprnmga3.cfr_renamed_12309(arg0, false);
        sprnmga3.cfr_renamed_2947();
        sprpdja2.cfr_renamed_11548(0L);
        return sprpdja2;
    }

    private static /* synthetic */ String cfr_renamed_12310(sprkgr arg0) {
        sprsuga sprsuga2;
        if (arg0.cfr_renamed_82() != null && (sprsuga2 = (sprsuga)arg0.cfr_renamed_82().cfr_renamed_12311("xmlns")) != null) {
            return sprsuga2.cfr_renamed_97();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12312(String arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            char c = arg0.charAt(n);
            switch (c) {
                case '&': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("Qo\u001a~L"));
                    break;
                }
                case '\u00a0': {
                    sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("\u0005\"[`\u0013:"));
                    break;
                }
                case '<': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("(\u001bzL"));
                    break;
                }
                case '>': {
                    sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("\u0005fW:"));
                    break;
                }
                default: {
                    stringBuilder.append(c);
                }
            }
            n2 = ++n;
        }
        return stringBuilder.toString();
    }

    public static String cfr_renamed_12306(sprniga arg0, sprdu arg1, sprfbn arg2) {
        if (arg0.cfr_renamed_12271() != 1) {
            return "";
        }
        if (arg2 == null) {
            arg2 = new sprfbn(null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        sprniga sprniga2 = arg0;
        StringBuilder stringBuilder2 = stringBuilder;
        sprten.cfr_renamed_12313(sprniga2, stringBuilder2, arg1, arg2);
        sprniga2.cfr_renamed_137();
        return stringBuilder2.toString();
    }

    public static sprnmga cfr_renamed_12314(sprtbja arg0) {
        sprvmga sprvmga2 = new sprvmga();
        return sprnmga.cfr_renamed_12274(arg0, sprvmga2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_12288(String arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            char c = arg0.charAt(n);
            switch (c) {
                case '&': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("Qo\u001a~L"));
                    break;
                }
                case '<': {
                    sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("\u0005mW:"));
                    break;
                }
                case '>': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("(\u0010zL"));
                    break;
                }
                case '\'': {
                    sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("\u0005`SnP:"));
                    break;
                }
                case '\"': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("(\u0006{\u0018zL"));
                    break;
                }
                case '\r': {
                    sprghha.cfr_renamed_12279(stringBuilder, sprawc.cfr_renamed_9("'\u0000yg:"));
                    break;
                }
                case '\n': {
                    sprghha.cfr_renamed_12279(stringBuilder, spruzf.cfr_renamed_9("Q-\u000fOL"));
                    break;
                }
                default: {
                    stringBuilder.append(c);
                }
            }
            n2 = ++n;
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ void cfr_renamed_12315(sprpiga arg0, sprqwq arg1, String arg2) {
        int n;
        int n2 = 0;
        sprten.cfr_renamed_12316(arg0, arg1, n2);
        ++n2;
        String string = sprawc.cfr_renamed_9("\u000boP]G*\u0019(_)\u007fZ\u007fe\b]~(");
        char[] cArray = new char[1];
        cArray[0] = 47;
        String[] stringArray = sprraia.cfr_renamed_12317(sprruha.cfr_renamed_12318(arg2, string, ""), cArray, (short)1);
        int n3 = stringArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            String string2 = stringArray[n];
            sprnxga sprnxga2 = arg1.cfr_renamed_12319(string2);
            if (sprnxga2.cfr_renamed_11861() != 0) {
                sprten.cfr_renamed_12316(arg0, sprnxga2.cfr_renamed_12320(0), n2);
                ++n2;
            }
            n4 = ++n;
        }
    }

    public static void cfr_renamed_12321(sprqwq arg0, spreen arg1) {
        sprgmga sprgmga2 = new sprgmga(arg1, (sprszca)new sprkfha(false));
        if (arg0.cfr_renamed_12322() != null && arg0.cfr_renamed_12322().cfr_renamed_12303() instanceof sprwtga) {
            ((sprwtga)arg0.cfr_renamed_12322().cfr_renamed_12303()).cfr_renamed_12323(sprgmga2);
        }
        arg0.cfr_renamed_12323(sprgmga2);
        sprgmga2.cfr_renamed_2947();
    }

    private static /* synthetic */ void cfr_renamed_12313(sprniga arg0, StringBuilder arg1, sprdu arg2, sprfbn arg3) {
        sprniga sprniga2 = arg0;
        sprten.cfr_renamed_12278(sprniga2, arg1, arg3, arg2);
        if (sprniga2.cfr_renamed_12292()) {
            return;
        }
        block8: while (true) {
            sprniga sprniga3 = arg0;
            block9: while (true) {
                sprniga3.cfr_renamed_137();
                switch (arg0.cfr_renamed_12271()) {
                    case 1: {
                        sprniga sprniga4 = arg0;
                        while (false) {
                        }
                        sprniga3 = sprniga4;
                        sprten.cfr_renamed_12313(sprniga4, arg1, arg2, new sprfbn(arg3));
                        continue block9;
                    }
                    case 15: {
                        sprghha.cfr_renamed_12279(sprghha.cfr_renamed_12279(sprghha.cfr_renamed_12279(arg1, spruzf.cfr_renamed_9("2X")), arg0.cfr_renamed_313()), ">");
                        return;
                    }
                    case 13: 
                    case 14: {
                        sprghha.cfr_renamed_12279(arg1, arg0.cfr_renamed_97());
                        sprniga3 = arg0;
                        continue block9;
                    }
                    case 3: {
                        sprghha.cfr_renamed_12279(arg1, sprlqha.cfr_renamed_12324(arg0.cfr_renamed_97()));
                        sprniga3 = arg0;
                        continue block9;
                    }
                    case 8: {
                        continue block8;
                    }
                    case 4: {
                        sprghha.cfr_renamed_12279(sprghha.cfr_renamed_12279(sprghha.cfr_renamed_12279(arg1, sprawc.cfr_renamed_9("=\u0002Z`EbUbZ")), arg0.cfr_renamed_97()), spruzf.cfr_renamed_9("*SI"));
                        sprniga3 = arg0;
                        continue block9;
                    }
                }
                break;
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("voFySd@uFe\u0003YnM\u0003oLeF!WxSd\u0019!")).append(arg0.cfr_renamed_12271()).append(spruzf.cfr_renamed_9("\u0003}^\u0016|\u0016c\u0012z\u0012|W`\u0016c\u00124W")).append((Object)null).toString());
    }

    private /* synthetic */ sprten() {
        cfr_renamed_4.add("xmlns");
    }

    public static void cfr_renamed_12325(sprywq arg0, spreen arg1) {
        arg0.cfr_renamed_11631(arg1);
    }

    public static void cfr_renamed_12326(String arg0) {
        sprywq sprywq2;
        sprywq sprywq3 = sprywq2 = new sprywq();
        sprywq3.cfr_renamed_12297(null);
        sprywq3.cfr_renamed_12327(arg0);
    }

    private static /* synthetic */ void cfr_renamed_12316(sprpiga arg0, sprkgr arg1, int arg2) {
        String string = sprten.cfr_renamed_12310(arg1);
        if (sprznp.cfr_renamed_12328(string)) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg2;
            String string2 = sprraia.cfr_renamed_11562(sprawc.cfr_renamed_9("oPz\u0013|"), objectArray);
            arg0.cfr_renamed_12296(string2, string);
        }
    }

    public static sprywq cfr_renamed_12329(spreen arg0, boolean arg1) {
        sprywq sprywq2;
        sprywq sprywq3 = sprywq2 = new sprywq();
        sprywq3.cfr_renamed_12330(arg1);
        sprywq3.cfr_renamed_12331(arg0);
        return sprywq3;
    }

    public static sprywq cfr_renamed_12332(String arg0, boolean arg1) {
        sprywq sprywq2;
        sprywq sprywq3 = sprywq2 = new sprywq();
        sprywq3.cfr_renamed_12330(arg1);
        sprywq3.cfr_renamed_12333(arg0);
        return sprywq3;
    }

    public static String cfr_renamed_12334(sprywq arg0) {
        return arg0.cfr_renamed_12335();
    }

    public static sprvz cfr_renamed_12336(sprqwq arg0, String arg1, spralq arg2) {
        Iterator iterator;
        Object object;
        Object object2;
        sprpiga sprpiga2 = new sprpiga(new sprylha());
        if (arg2 != null) {
            Object object3 = object2 = arg2.entrySet().iterator();
            while (object3.hasNext()) {
                object = (sprnyja)object2.next();
                sprpiga2.cfr_renamed_12296((String)((sprnyja)object).getKey(), (String)((sprnyja)object).getValue());
                object3 = object2;
            }
        } else {
            sprten.cfr_renamed_12315(sprpiga2, arg0, arg1);
        }
        object2 = arg0.cfr_renamed_12337(arg1, sprpiga2);
        object = new sprwvn();
        Iterator iterator2 = iterator = object2.iterator();
        while (iterator2.hasNext()) {
            sprkgr sprkgr2 = (sprkgr)iterator.next();
            iterator2 = iterator;
            sprovja.cfr_renamed_11658((sprwvn)object, sprkgr2);
        }
        return object;
    }

    public static sprgmga cfr_renamed_12338(spreen arg0, sprszca arg1) {
        sprmcja sprmcja2 = new sprmcja(arg0, arg1);
        sprmcja2.cfr_renamed_12339("\r\n");
        return new sprgmga(sprmcja2);
    }

    public static sprniga cfr_renamed_12340(String arg0, spralq arg1) {
        Object object;
        Object object2;
        sprylha sprylha2 = new sprylha();
        sprpiga sprpiga2 = new sprpiga(sprylha2);
        if (arg1 != null) {
            Object object3 = object2 = arg1.entrySet().iterator();
            while (object3.hasNext()) {
                object = (Map.Entry)object2.next();
                sprpiga2.cfr_renamed_12296((String)object.getKey(), (String)object.getValue());
                object3 = object2;
            }
        }
        object2 = new sprscha(sprylha2, sprpiga2, null, 1);
        object = new sprniga(arg0, 9, (sprscha)object2);
        ((sprniga)object).cfr_renamed_12297(null);
        return object;
    }

    public static sprniga cfr_renamed_12341(spreen arg0) {
        sprniga sprniga2 = new sprniga(arg0);
        sprniga2.cfr_renamed_12297(null);
        return sprniga2;
    }

    @sprtea
    public static boolean cfr_renamed_12294(String arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    public static sprkgr cfr_renamed_12342(sprqwq arg0, String arg1, spralq arg2) {
        if (arg2 != null) {
            Iterator iterator;
            sprpiga sprpiga2 = new sprpiga(new sprylha());
            Iterator iterator2 = iterator = arg2.entrySet().iterator();
            while (iterator2.hasNext()) {
                sprnyja sprnyja2 = (sprnyja)iterator.next();
                sprpiga2.cfr_renamed_12296((String)sprnyja2.getKey(), (String)sprnyja2.getValue());
                iterator2 = iterator;
            }
            sprkgr sprkgr2 = arg0.cfr_renamed_12343(arg1, sprpiga2);
            return sprkgr2;
        }
        sprkgr sprkgr3 = arg0.cfr_renamed_12344(arg1);
        return sprkgr3;
    }

    public static void cfr_renamed_12345(sprqwq arg0, spreen arg1) {
        sprgmga sprgmga2;
        sprgmga sprgmga3 = sprgmga2 = new sprgmga(arg1, (sprszca)new sprkfha(false));
        arg0.cfr_renamed_12323(sprgmga3);
        sprgmga3.cfr_renamed_2947();
    }
}

