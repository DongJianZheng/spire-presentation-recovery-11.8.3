/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spregf;
import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjbm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjxe;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkhf;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sprodf;
import com.spire.presentation.packages.sprofg;
import com.spire.presentation.packages.sproim;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruef;
import com.spire.presentation.packages.sprvgp;
import com.spire.presentation.packages.sprzhm;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class sprycf {
    private final sproim cfr_renamed_119;
    private final sprrgm cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final sprjj cfr_renamed_1;
    private final sprlj cfr_renamed_2;
    private final sprbff cfr_renamed_3;
    private final sprbff cfr_renamed_4;

    public void cfr_renamed_5337(spren arg0, Date arg1) throws spruef {
        this.cfr_renamed_4.cfr_renamed_5337(arg0, arg1);
    }

    public boolean cfr_renamed_5338(sprycf arg0) {
        return this.cfr_renamed_91.cfr_renamed_5339().equals(arg0.cfr_renamed_91.cfr_renamed_5339());
    }

    public byte[] cfr_renamed_5340() throws sprahf, spruef {
        sprlvm sprlvm2 = this.cfr_renamed_91.cfr_renamed_5339();
        if (sprlvm2.cfr_renamed_696().cfr_renamed_5078(sprgz.cfr_renamed_105)) {
            return this.cfr_renamed_5341(sprlvm2).cfr_renamed_592().cfr_renamed_595();
        }
        throw new spruef(sprvgp.cfr_renamed_9("\r\u000b\u0000\u0004\u0001\u001eN\u0003\n\u000f\u0000\u001e\u0007\f\u0017J:9:#\u0000\f\u0001J\b\u0005\u001cJ\n\u0003\t\u000f\u001d\u001e"));
    }

    public sproim cfr_renamed_568() {
        return this.cfr_renamed_119;
    }

    public sprycf(InputStream arg0, sprlj arg1) throws sprahf, spruef, IOException {
        this(sproim.cfr_renamed_23(sprkqe.cfr_renamed_471(arg0)), arg1);
    }

    public sprycf(byte[] arg0, sprlj arg1) throws sprahf, spruef {
        this(sproim.cfr_renamed_23(arg0), arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprycf cfr_renamed_5342(sprjj arg0, spren arg1, sprjze arg2) throws spruef, sprahf {
        try {
            this.cfr_renamed_4.cfr_renamed_5337(arg1, new Date());
        }
        catch (Exception exception) {
            throw new spruef(sprofg.cfr_renamed_9("\tg\u001cv\u0005c\u001c3\u001c|H{\t`\u00003\u001av\u0006v\u001f3\u0007}Hz\u0006e\t\u007f\u0001wHw\tg\t"));
        }
        try {
            sprkhf sprkhf2;
            sprkhf sprkhf3 = sprkhf2 = new sprkhf(arg0);
            sprkhf2.cfr_renamed_5343(arg1);
            sprkhf3.cfr_renamed_5344(this.cfr_renamed_119.cfr_renamed_5345());
            sprrgm sprrgm2 = sprkhf3.cfr_renamed_5346(arg2).cfr_renamed_568();
            return new sprycf(this.cfr_renamed_119.cfr_renamed_5347(sprrgm2, true), this.cfr_renamed_2);
        }
        catch (IOException iOException) {
            throw new spruef(iOException.getMessage(), iOException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new spruef(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprfbf cfr_renamed_5348(spregf arg0, BigInteger arg1) throws spruef, sprahf {
        sprkhf sprkhf2 = this.cfr_renamed_5349();
        try {
            return sprkhf2.cfr_renamed_5350(arg0, arg1);
        }
        catch (IOException iOException) {
            throw new spruef(iOException.getMessage(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprfbf cfr_renamed_5351(sprjj arg0, spren arg1, spregf arg2, BigInteger arg3) throws spruef, sprahf, IOException {
        sprkhf sprkhf2;
        try {
            this.cfr_renamed_4.cfr_renamed_5337(arg1, new Date());
        }
        catch (Exception exception) {
            throw new spruef(sprvgp.cfr_renamed_9("\u000b\u001a\u001e\u000b\u0007\u001e\u001eN\u001e\u0001J\u0006\u000b\u001d\u0002N\u0018\u000b\u0004\u000b\u001dN\u0005\u0000J\u0007\u0004\u0018\u000b\u0002\u0003\nJ\n\u000b\u001a\u000b"));
        }
        sprkhf sprkhf3 = sprkhf2 = new sprkhf(arg0);
        sprkhf2.cfr_renamed_5343(arg1);
        sprkhf3.cfr_renamed_5344(this.cfr_renamed_119.cfr_renamed_5345());
        return sprkhf3.cfr_renamed_5350(arg2, arg3);
    }

    public sprtpl cfr_renamed_5352() {
        return this.cfr_renamed_3.cfr_renamed_5352();
    }

    public sprrgm[] cfr_renamed_5329() {
        sprjbm[] sprjbmArray = this.cfr_renamed_119.cfr_renamed_5345().cfr_renamed_5353();
        return sprjbmArray[sprjbmArray.length - 1].cfr_renamed_5354();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprkhf cfr_renamed_5349() throws spruef {
        int n;
        sprjj sprjj2;
        try {
            sprycf sprycf2 = this;
            sprjj2 = sprycf2.cfr_renamed_2.cfr_renamed_5279(sprycf2.cfr_renamed_3.cfr_renamed_1479());
        }
        catch (sprhjg sprhjg2) {
            throw new spruef(sprhjg2.getMessage(), sprhjg2);
        }
        sprrgm[] sprrgmArray = this.cfr_renamed_5329();
        if (!sprjj2.cfr_renamed_615().equals(sprrgmArray[0].cfr_renamed_1479())) {
            throw new spruef(sprofg.cfr_renamed_9("\fz\u000fv\u001bgH~\u0001`\u0005r\u001cp\u00003\u000e|\u001a3\u001cz\u0005v\u001bg\t~\u00183\u001av\u0006v\u001fr\u0004"));
        }
        sprkhf sprkhf2 = new sprkhf(sprjj2);
        ArrayList<spren> arrayList = new ArrayList<spren>(sprrgmArray.length);
        int n2 = n = 0;
        while (true) {
            if (n2 == sprrgmArray.length) {
                sprodf sprodf2 = new sprodf(arrayList);
                sprkhf sprkhf3 = sprkhf2;
                sprkhf3.cfr_renamed_5343(sprodf2);
                return sprkhf3;
            }
            try {
                arrayList.add(new sprjxe(sprrgmArray[n].cfr_renamed_5339().cfr_renamed_104("DER")));
            }
            catch (IOException iOException) {
                throw new spruef(sprvgp.cfr_renamed_9("\u001b\u0004\u000f\b\u0002\u000fN\u001e\u0001J\u001e\u0018\u0001\t\u000b\u0019\u001dJ\u001e\u0018\u000b\u001c\u0007\u0005\u001b\u0019N+\u001c\t\u0006\u0003\u0018\u000f:\u0003\u0003\u000f=\u001e\u000f\u0007\u001e\u0019"), iOException);
            }
            n2 = ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprycf cfr_renamed_5355(sprjze arg0) throws spruef, sprahf {
        sprrgm sprrgm2 = this.cfr_renamed_5349().cfr_renamed_5346(arg0).cfr_renamed_568();
        try {
            return new sprycf(this.cfr_renamed_119.cfr_renamed_5347(sprrgm2, false), this.cfr_renamed_2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new spruef(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    private /* synthetic */ sprzhm cfr_renamed_5341(sprlvm arg0) throws sprahf {
        sprmnm sprmnm2 = sprmnm.cfr_renamed_23(arg0.cfr_renamed_480());
        if (sprmnm2.cfr_renamed_2589().cfr_renamed_696().cfr_renamed_5078(sprdl.cfr_renamed_1494)) {
            return sprzhm.cfr_renamed_23(sproug.cfr_renamed_23(sprmnm2.cfr_renamed_2589().cfr_renamed_480()).cfr_renamed_186());
        }
        throw new sprahf(sprofg.cfr_renamed_9("\u000br\u0006}\u0007gHc\ta\u001bvHg\u0001~\r3\u001bg\t~\u0018"));
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_119.cfr_renamed_91();
    }

    public boolean cfr_renamed_5356(spren arg0, Date arg1) throws spruef {
        return this.cfr_renamed_4.cfr_renamed_5356(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_5297(sprsvl arg0) throws sprahf {
        sprycf sprycf2 = this;
        if (sprycf2.cfr_renamed_4 != sprycf2.cfr_renamed_3) {
            int n;
            sprrgm[] sprrgmArray = this.cfr_renamed_5329();
            int n2 = n = 0;
            while (n2 != sprrgmArray.length - 1) {
                try {
                    this.cfr_renamed_3.cfr_renamed_5337(new sprjxe(sprrgmArray[n].cfr_renamed_5339().cfr_renamed_104("DER")), this.cfr_renamed_3.cfr_renamed_588());
                }
                catch (Exception exception) {
                    throw new sprahf(sprvgp.cfr_renamed_9("\u001b\u0004\u000f\b\u0002\u000fN\u001e\u0001J\u001e\u0018\u0001\t\u000b\u0019\u001dJ\u001e\u0018\u000b\u001c\u0007\u0005\u001b\u0019N+\u001c\t\u0006\u0003\u0018\u000f:\u0003\u0003\u000f=\u001e\u000f\u0007\u001e\u0019"), exception);
                }
                n2 = ++n;
            }
        }
        this.cfr_renamed_3.cfr_renamed_5297(arg0);
    }

    public sprfbf cfr_renamed_5357(sprjj arg0, spren arg1, spregf arg2) throws spruef, sprahf, IOException {
        return this.cfr_renamed_5351(arg0, arg1, arg2, null);
    }

    public void cfr_renamed_5358(boolean arg0, byte[] arg1, Date arg2) throws spruef {
        this.cfr_renamed_4.cfr_renamed_5358(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprycf(sproim sproim2, sprlj sprlj2) throws sprahf, spruef {
        sprycf sprycf2;
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_2 = arg1;
        sprjbm[] sprjbmArray = sproim2.cfr_renamed_5345().cfr_renamed_5353();
        this.cfr_renamed_91 = sprjbmArray[0].cfr_renamed_5354()[0];
        this.cfr_renamed_5359(sprjbmArray);
        sprrgm[] sprrgmArray = sprjbmArray[sprjbmArray.length - 1].cfr_renamed_5354();
        sprycf sprycf3 = this;
        sprycf3.cfr_renamed_3 = new sprbff(sprrgmArray[sprrgmArray.length - 1], (sprlj)arg1);
        if (sprjbmArray.length > 1) {
            try {
                int n;
                sprrvm sprrvm2 = new sprrvm();
                int n2 = n = 0;
                while (n2 != sprjbmArray.length - 1) {
                    sprrvm2.cfr_renamed_5004(sprjbmArray[n++]);
                    n2 = n;
                }
                sprycf sprycf4 = this;
                this.cfr_renamed_1 = arg1.cfr_renamed_5279(sprycf4.cfr_renamed_3.cfr_renamed_1479());
                OutputStream outputStream = sprycf4.cfr_renamed_1.cfr_renamed_470();
                outputStream.write(new sprcen(sprrvm2).cfr_renamed_104("DER"));
                outputStream.close();
                this.cfr_renamed_0 = this.cfr_renamed_1.cfr_renamed_580();
                sprycf2 = this;
            }
            catch (Exception exception) {
                throw new spruef(exception.getMessage(), exception);
            }
        } else {
            sprycf2 = this;
            sprycf sprycf5 = this;
            sprycf5.cfr_renamed_1 = null;
            sprycf5.cfr_renamed_0 = null;
        }
        sprycf2.cfr_renamed_4 = new sprbff(this.cfr_renamed_0, sprrgmArray[0], (sprlj)arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_5359(sprjbm[] arg0) throws spruef, sprahf {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3;
            sprrgm[] sprrgmArray = arg0[n].cfr_renamed_5354();
            sprrgm sprrgm2 = sprrgmArray[0];
            sprddm sprddm2 = sprrgmArray[0].cfr_renamed_1479();
            int n4 = n3 = 1;
            while (n4 != sprrgmArray.length) {
                sprrgm sprrgm3 = sprrgmArray[n3];
                if (!sprddm2.equals(sprrgm3.cfr_renamed_1479())) {
                    throw new spruef(sprofg.cfr_renamed_9("\u0001}\u001er\u0004z\f3\fz\u000fv\u001bgHr\u0004t\u0007a\u0001g\u0000~Hz\u00063\u000b{\tz\u0006"));
                }
                sprlvm sprlvm2 = sprrgm3.cfr_renamed_5339();
                if (!sprlvm2.cfr_renamed_696().cfr_renamed_5078(sprgz.cfr_renamed_105)) {
                    throw new sprahf(sprvgp.cfr_renamed_9("\t\u000f\u0004\u0000\u0005\u001aJ\u0007\u000e\u000b\u0004\u001a\u0003\b\u0013N>=>'\u0004\b\u0005"));
                }
                sprycf sprycf2 = this;
                sprzhm sprzhm2 = sprycf2.cfr_renamed_5341(sprlvm2);
                {
                    sprjj sprjj2 = sprycf2.cfr_renamed_2.cfr_renamed_5279(sprddm2);
                    sprbff sprbff2 = new sprbff(sprrgm3, sprjj2);
                    sprbff2.cfr_renamed_5337(new sprjxe(sprrgm2.cfr_renamed_5339().cfr_renamed_104("DER")), sprzhm2.cfr_renamed_588().cfr_renamed_110());
                }
                sprrgm2 = sprrgm3;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return;
    }

    public sprfbf cfr_renamed_5360(spregf arg0) throws sprahf, spruef {
        return this.cfr_renamed_5348(arg0, null);
    }

    public sprlj cfr_renamed_5330() {
        return this.cfr_renamed_2;
    }
}

