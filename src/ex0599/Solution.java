package ex0599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();
		String[] list1 = { "pkwenkodtlbbdgvopqaeygphtlrmo", "agfqdph", "vagpvsdzqhwnlogzyje",
				"lfsxwnhweveaaekybglvcluyeb", "gpgbqii", "fboaiwtlfccdolpqutf", "swgsvdptrtepv", "nqmgha",
				"rfbmlfacpec", "mjgmpewjnlwijzx", "fxtsgerpchszrkfjpwwigy", "yvizbmradwgxedumcbcktxublw", "p",
				"ijrbjrqopmbveayra", "ckhb", "fhjbrzhroorglgbltarrvtjnkz", "bsmqkkfmzszgtffpkpjouoxdmofivm",
				"vbqhjdqajtvy", "eelflqtsplanaahmxssqe", "gwurhajbnavidhipzhxvlf", "lfgztikdpethoionvs", "ywqhjouxx",
				"zegpdvbmdgslagpvsjnmchspix", "rooillldcagevixecdxffz", "huhwnjqriyiweilhjzijuftlzp", "lha",
				"ashrazctgqgwrm", "geg", "nkmofftbapqitraxtfnilsfvwvpas", "cblx", "xhc", "ykiatwmdigjxmxevdbd",
				"alzzxhra", "zcxbycuiqlvfpuslvv", "ufolcgdeo", "wnnhai", "eypstxtyxnnqnkmqptekdgpdqcdqn",
				"zosncavdfjcsdnrxdp", "ptopwfkziuttfeazrrglqdbszvr", "qlewoezxzmlhgypikhdl", "ykoyilcm",
				"fmgqdzvdtyethyynjjpbl", "dxeyeyejkosdpnub", "ymlznwinj", "qyfopqgmglfiofw",
				"wwqbevusanvcdzeshcglrzlarer", "tmsfjgfjdjdbczcseznowpptr", "zkrcckbowwjxmfmdikfsbpyxrmgg",
				"aooilovrtwqoaremskb", "acqnnodwqzwlqnynvb", "xinbdvhzfykpmzpecgngelczoukzd", "ugjnsgqlp",
				"vdztloyrjpzzylesddiewfemmbgfwe", "ucnfeysd", "cywlrzkl", "rezogqmazduvkcypiupyitmhrfmzki",
				"hydpvnbhqpkvrcc", "axdaqveyksrmpc", "l", "zuzgiuonhoaaqmafflrnsamdkefoki", "wbtrhqdbwqyrvjizkgj",
				"hyxexwoosybkpifyohasxtk", "kexssggfp", "eblxqnyke", "etwelbjtxilczjudlyziyosp",
				"coxufsaunxexcshrcqyjz", "hlcyxndydrxgebcjtgrjlfhhiqeh", "vlhyfvzcuuqrqymnzlbqwlwyk", "xo", "n",
				"hytiwcsrbwyj", "kbsglfxut", "mducxmhhvuuoaxazhwpsuisush", "fqoxrbegbqfseoiqvevfjua",
				"cugcsdfdgggnxbsrloqynmjisfxqcf", "gwmoxooqbgkuqhitqndhjknpoi", "tvwhfeoxshl",
				"ltvkvjigjqdjmfqihssvnnmxke", "tvhkudu", "utwqphdxvmtvtjw", "npjohbkidogcjbkpairnmmgslk", "xtzyn",
				"shufzxmpntnwkljqlayypynmnsvjnq", "iwmovzzkfpvixarqckonwqhb", "bdjntlktemditgnn", "tphnrrekc",
				"jbtpcxbxdbdpjztbvp", "jxejmmiwfrrknjyek", "jzfkmowocsuhipwvyavcimgslsa", "pgsbqvig", "fnxfo", "ys",
				"jovaimqzyyputxnatlgvtflxmjwrgy", "fndfnvpnmgcxjbfydgwiwpvst", "eikqjjhbfnabekalchmoigbsvj",
				"esvmtdtyojpoccpnhmweleclk", "idrkmks", "ucxqf", "qaaoyjczafkqyncmmuqfj", "xfhfqdqnklxq",
				"krtfunvglmtcwasqlvhq", "uilnponlhvulz", "hpzca", "fhukhpkax", "bv", "xxfrzciifwxwzkqlhzi",
				"upmawfjrcvyqphcgznqvlunehgm", "stbyc", "klgybdvijbdraoveascq", "zhcnue", "njnpajotnwihwedlefrukx",
				"mtndwtean", "oblhinaeguymmkleqeogwrzmbltl", "htjlnvbdfuzsjypkanhzg", "zhjn", "pjgfwoikxbybblja",
				"ljdkfxvylzmspudjqqugddxrnhn", "isl", "azusu", "ymyzwmsxcirfwhsafs", "uvpjsrqhwxdoeuc", "bl", "gfubyw",
				"sfxkoexlvpihhfhfq", "jsmzeshdnugttvppha", "vdvhdvfztaxcyhjdugctrvkgulmbj", "knwvl", "xengrpxq",
				"qggmtusbpnypjbxcisnoy", "rhehzhnlk", "ztanalcvncvm", "favfgqwpedkohfkoakisbmbxbxf", "mofdl",
				"fyfiwcckdrjjpqfyrldhdyvu", "fuosbwciqqzosy", "chnbkhdgyjoxeglvfc", "xflneeeaomxjphvgyohoakxhj",
				"stpuhrfbhoxf", "czoepwnymcz", "rvscpckcpjwgulnfnelspis", "frtrodsnrmsmaaws", "sykhquipjd", "rrwyr",
				"oglbicrgqvradxwtghghppnzznq", "lhaijmcqlnrgimhbptwmkwt", "lwdhpatigvhypgzrertalatqspohi",
				"leyshdfdlagoalvfbegapxregtuh", "occgkf", "gscljupcrmbbeobwvdht", "kiul", "syc", "uoejbnenp",
				"takqafyujrchibalhi", "gjcgpxz", "jiuiut", "faegljhiknwlygwhlu", "yxsybpiprmuhzplfphfeqazzyndtv",
				"ktbjtqyvuuxqajcesnaw", "huuftubpzskytmniladxkkgczftxp", "hjiq", "d", "udqooeglslqpajnip",
				"lztmnoajehsvz", "ybvtkizlmyfngyjwwowgsm", "xgvvsydndmgs", "smbvogzsmbaxktmqwleprmbdxqf", "izdo",
				"sdvhj", "qyn", "framwuszazkwdilvtylmkru", "jmbefcplwqosvfx", "kgsptbnifrvczouohrrprli",
				"gcydrneexbcuqopkpcmd", "tewapttno", "lmhuzhpzmym", "yqzblljae", "pgxnwszovqgqtcqpzmssneqejgjs",
				"xwetnsmpotlpn", "utraamepcsomyxsqbkshgyraleekxw", "dvjhqppvoowntco", "yohsoxdaubemaogltuk",
				"nasrnrizinuypjdnjehqqoitmvk", "xerymxgwvzcb", "ouzklsdedbvwwketdhcfeuluvckf",
				"ztindosdnqsyquuhzjzpxkbeefun", "kfjirgxu", "ypmskmp", "wsi", "pcfbmtafjvrurtrvjsumfjfttu",
				"aqlwxsrxggtfnz", "vbvbde", "ceyogdjazwskvjbdwrvufpqcjrxpws", "vfhpldeneeqxykmum", "vuqxhsrspvqath",
				"tloeehsq", "zo", "hsxjfwgbuorfznekqdvahrxgui", "ctsetmijpnp", "jjdizlchlorva", "rvrfcepmxpeofenooth",
				"qojwwpjt", "gtdq", "rbdbetwubqjppupythw", "ccdllhhubyjxfmvmxdcmpzdwy", "vs", "ndfm", "selamkurrltpjkt",
				"whxez", "woryubernrrwthyce", "ozzcx", "abtsca", "nqyxdju", "phuolroyieomapmirpvaldtksgl",
				"yaqhaymtozosbacorzavpgdgl", "dbzlkbdgrtavnorpfvuvnxwnzeoc", "user", "dbtfwbavxuxqzjtycorez",
				"hhemkmkwuikfasranjgsjtug", "obsskhdangnyiok", "ikkzxhjapdmkyiutryhzvsijxzeo", "hvbgprgostxbh",
				"ecnzsirsqqqwldmzsat", "pewwoxivlouurvfsadrc", "lbujpsqpfk", "eqjukrlgnbpuesgea", "sgsnxtsznntdptmxjg",
				"bpkwyfwccmnjqwdyhxrjaaxjcw", "omvzwyrzlwstnwhwhssajzhbsd", "ux", "exlyaiolmjrca",
				"zpdbagmcdfltcoiobkdrticgzeyn", "bqbebomqulgwltbortyu", "ihgevtuipgkvqgpkhlui", "tvrippfy",
				"pdbmjihtodwwa", "siucrhynh", "izvwi", "bxhsxqhtbdsgpfeiqpdjumcjm", "zrnnxdcd",
				"mfpobuitnnxmkddwwzlfauosuzd", "utolwmietafptpdnb", "mkointotmaled", "likkuxoyubyandcnm", "mszirwc",
				"qp", "dhvshmxnljtsozhsjugbokxjiiapmb", "jxibbfteyfqh", "strbmsndazagstxvojxc", "tpyrljqdhatboqrnnnq",
				"whjktettjhafcviiivw", "pqcetglnhibyhmveyblnlrymw", "fdrcqutgrpfdaec", "cyfypt", "iezxlfmnhwlvpgzensnq",
				"iznzwltutyxd", "dlwbfch", "qyxaibavemizoahxwhtjexaujzbm", "nrqifrrhcxkuny", "yymgcbawh", "wd",
				"ztuolqf", "slrdlcqyevsjvobfd", "glotjh", "dsbds", "tpetl", "fryosmcawjsvbutg", "hudmoskbkakhsjqyuhrrt",
				"aww", "xjluxthorodhosxkrn", "fkyhahxbisvfjxj", "vkslygnbphhvdpauxjnfn", "vvxoqmsatgqanusjbyrxwdshvven",
				"hyb", "qxxowalutfwwpv", "sntazpdaodhdaid", "ws", "tsg", "crpwxtfukvethkwhtisxqmvohsx",
				"qfcpjzokpxxhgqajgq", "svzaumwyydtuveq", "inmwdmzejyl", "aexhlovhykxeoyxfi", "zswuf", "hiuxr",
				"fcxnirvfxzevmveemo", "cffdctpjzpgvuinotvnywxqph", "yzjbscqhtfyuubljpkjmxt" };
		String[] list2 = { "yzjbscqhtfyuubljpkjmxt", "cffdctpjzpgvuinotvnywxqph", "fcxnirvfxzevmveemo", "hiuxr",
				"zswuf", "aexhlovhykxeoyxfi", "inmwdmzejyl", "svzaumwyydtuveq", "qfcpjzokpxxhgqajgq",
				"crpwxtfukvethkwhtisxqmvohsx", "tsg", "ws", "sntazpdaodhdaid", "qxxowalutfwwpv", "hyb",
				"vvxoqmsatgqanusjbyrxwdshvven", "vkslygnbphhvdpauxjnfn", "fkyhahxbisvfjxj", "xjluxthorodhosxkrn", "aww",
				"hudmoskbkakhsjqyuhrrt", "fryosmcawjsvbutg", "tpetl", "dsbds", "glotjh", "slrdlcqyevsjvobfd", "ztuolqf",
				"wd", "yymgcbawh", "nrqifrrhcxkuny", "qyxaibavemizoahxwhtjexaujzbm", "dlwbfch", "iznzwltutyxd",
				"iezxlfmnhwlvpgzensnq", "cyfypt", "fdrcqutgrpfdaec", "pqcetglnhibyhmveyblnlrymw", "whjktettjhafcviiivw",
				"tpyrljqdhatboqrnnnq", "strbmsndazagstxvojxc", "jxibbfteyfqh", "dhvshmxnljtsozhsjugbokxjiiapmb", "qp",
				"mszirwc", "likkuxoyubyandcnm", "mkointotmaled", "utolwmietafptpdnb", "mfpobuitnnxmkddwwzlfauosuzd",
				"zrnnxdcd", "bxhsxqhtbdsgpfeiqpdjumcjm", "izvwi", "siucrhynh", "pdbmjihtodwwa", "tvrippfy",
				"ihgevtuipgkvqgpkhlui", "bqbebomqulgwltbortyu", "zpdbagmcdfltcoiobkdrticgzeyn", "exlyaiolmjrca", "ux",
				"omvzwyrzlwstnwhwhssajzhbsd", "bpkwyfwccmnjqwdyhxrjaaxjcw", "sgsnxtsznntdptmxjg", "eqjukrlgnbpuesgea",
				"lbujpsqpfk", "pewwoxivlouurvfsadrc", "ecnzsirsqqqwldmzsat", "hvbgprgostxbh",
				"ikkzxhjapdmkyiutryhzvsijxzeo", "obsskhdangnyiok", "hhemkmkwuikfasranjgsjtug", "dbtfwbavxuxqzjtycorez",
				"user", "dbzlkbdgrtavnorpfvuvnxwnzeoc", "yaqhaymtozosbacorzavpgdgl", "phuolroyieomapmirpvaldtksgl",
				"nqyxdju", "abtsca", "ozzcx", "woryubernrrwthyce", "whxez", "selamkurrltpjkt", "ndfm", "vs",
				"ccdllhhubyjxfmvmxdcmpzdwy", "rbdbetwubqjppupythw", "gtdq", "qojwwpjt", "rvrfcepmxpeofenooth",
				"jjdizlchlorva", "ctsetmijpnp", "hsxjfwgbuorfznekqdvahrxgui", "zo", "tloeehsq", "vuqxhsrspvqath",
				"vfhpldeneeqxykmum", "ceyogdjazwskvjbdwrvufpqcjrxpws", "vbvbde", "aqlwxsrxggtfnz",
				"pcfbmtafjvrurtrvjsumfjfttu", "wsi", "ypmskmp", "kfjirgxu", "ztindosdnqsyquuhzjzpxkbeefun",
				"ouzklsdedbvwwketdhcfeuluvckf", "xerymxgwvzcb", "nasrnrizinuypjdnjehqqoitmvk", "yohsoxdaubemaogltuk",
				"dvjhqppvoowntco", "utraamepcsomyxsqbkshgyraleekxw", "xwetnsmpotlpn", "pgxnwszovqgqtcqpzmssneqejgjs",
				"yqzblljae", "lmhuzhpzmym", "tewapttno", "gcydrneexbcuqopkpcmd", "kgsptbnifrvczouohrrprli",
				"jmbefcplwqosvfx", "framwuszazkwdilvtylmkru", "qyn", "sdvhj", "izdo", "smbvogzsmbaxktmqwleprmbdxqf",
				"xgvvsydndmgs", "ybvtkizlmyfngyjwwowgsm", "lztmnoajehsvz", "udqooeglslqpajnip", "d", "hjiq",
				"huuftubpzskytmniladxkkgczftxp", "ktbjtqyvuuxqajcesnaw", "yxsybpiprmuhzplfphfeqazzyndtv",
				"faegljhiknwlygwhlu", "jiuiut", "gjcgpxz", "takqafyujrchibalhi", "uoejbnenp", "syc", "kiul",
				"gscljupcrmbbeobwvdht", "occgkf", "leyshdfdlagoalvfbegapxregtuh", "lwdhpatigvhypgzrertalatqspohi",
				"lhaijmcqlnrgimhbptwmkwt", "oglbicrgqvradxwtghghppnzznq", "rrwyr", "sykhquipjd", "frtrodsnrmsmaaws",
				"rvscpckcpjwgulnfnelspis", "czoepwnymcz", "stpuhrfbhoxf", "xflneeeaomxjphvgyohoakxhj",
				"chnbkhdgyjoxeglvfc", "fuosbwciqqzosy", "fyfiwcckdrjjpqfyrldhdyvu", "mofdl",
				"favfgqwpedkohfkoakisbmbxbxf", "ztanalcvncvm", "rhehzhnlk", "qggmtusbpnypjbxcisnoy", "xengrpxq",
				"knwvl", "vdvhdvfztaxcyhjdugctrvkgulmbj", "jsmzeshdnugttvppha", "sfxkoexlvpihhfhfq", "gfubyw", "bl",
				"uvpjsrqhwxdoeuc", "ymyzwmsxcirfwhsafs", "azusu", "isl", "ljdkfxvylzmspudjqqugddxrnhn",
				"pjgfwoikxbybblja", "zhjn", "htjlnvbdfuzsjypkanhzg", "oblhinaeguymmkleqeogwrzmbltl", "mtndwtean",
				"njnpajotnwihwedlefrukx", "zhcnue", "klgybdvijbdraoveascq", "stbyc", "upmawfjrcvyqphcgznqvlunehgm",
				"xxfrzciifwxwzkqlhzi", "bv", "fhukhpkax", "hpzca", "uilnponlhvulz", "krtfunvglmtcwasqlvhq",
				"xfhfqdqnklxq", "qaaoyjczafkqyncmmuqfj", "ucxqf", "idrkmks", "esvmtdtyojpoccpnhmweleclk",
				"eikqjjhbfnabekalchmoigbsvj", "fndfnvpnmgcxjbfydgwiwpvst", "jovaimqzyyputxnatlgvtflxmjwrgy", "ys",
				"fnxfo", "pgsbqvig", "jzfkmowocsuhipwvyavcimgslsa", "jxejmmiwfrrknjyek", "jbtpcxbxdbdpjztbvp",
				"tphnrrekc", "bdjntlktemditgnn", "iwmovzzkfpvixarqckonwqhb", "shufzxmpntnwkljqlayypynmnsvjnq", "xtzyn",
				"npjohbkidogcjbkpairnmmgslk", "utwqphdxvmtvtjw", "tvhkudu", "ltvkvjigjqdjmfqihssvnnmxke", "tvwhfeoxshl",
				"gwmoxooqbgkuqhitqndhjknpoi", "cugcsdfdgggnxbsrloqynmjisfxqcf", "fqoxrbegbqfseoiqvevfjua",
				"mducxmhhvuuoaxazhwpsuisush", "kbsglfxut", "hytiwcsrbwyj", "n", "xo", "vlhyfvzcuuqrqymnzlbqwlwyk",
				"hlcyxndydrxgebcjtgrjlfhhiqeh", "coxufsaunxexcshrcqyjz", "etwelbjtxilczjudlyziyosp", "eblxqnyke",
				"kexssggfp", "hyxexwoosybkpifyohasxtk", "wbtrhqdbwqyrvjizkgj", "zuzgiuonhoaaqmafflrnsamdkefoki", "l",
				"axdaqveyksrmpc", "hydpvnbhqpkvrcc", "rezogqmazduvkcypiupyitmhrfmzki", "cywlrzkl", "ucnfeysd",
				"vdztloyrjpzzylesddiewfemmbgfwe", "ugjnsgqlp", "xinbdvhzfykpmzpecgngelczoukzd", "acqnnodwqzwlqnynvb",
				"aooilovrtwqoaremskb", "zkrcckbowwjxmfmdikfsbpyxrmgg", "tmsfjgfjdjdbczcseznowpptr",
				"wwqbevusanvcdzeshcglrzlarer", "qyfopqgmglfiofw", "ymlznwinj", "dxeyeyejkosdpnub",
				"fmgqdzvdtyethyynjjpbl", "ykoyilcm", "qlewoezxzmlhgypikhdl", "ptopwfkziuttfeazrrglqdbszvr",
				"zosncavdfjcsdnrxdp", "eypstxtyxnnqnkmqptekdgpdqcdqn", "wnnhai", "ufolcgdeo", "zcxbycuiqlvfpuslvv",
				"alzzxhra", "ykiatwmdigjxmxevdbd", "xhc", "cblx", "nkmofftbapqitraxtfnilsfvwvpas", "geg",
				"ashrazctgqgwrm", "lha", "huhwnjqriyiweilhjzijuftlzp", "rooillldcagevixecdxffz",
				"zegpdvbmdgslagpvsjnmchspix", "ywqhjouxx", "lfgztikdpethoionvs", "gwurhajbnavidhipzhxvlf",
				"eelflqtsplanaahmxssqe", "vbqhjdqajtvy", "bsmqkkfmzszgtffpkpjouoxdmofivm", "fhjbrzhroorglgbltarrvtjnkz",
				"ckhb", "ijrbjrqopmbveayra", "p", "yvizbmradwgxedumcbcktxublw", "fxtsgerpchszrkfjpwwigy",
				"mjgmpewjnlwijzx", "rfbmlfacpec", "nqmgha", "swgsvdptrtepv", "fboaiwtlfccdolpqutf", "gpgbqii",
				"lfsxwnhweveaaekybglvcluyeb", "vagpvsdzqhwnlogzyje", "agfqdph", "pkwenkodtlbbdgvopqaeygphtlrmo" };
		System.out.println(Arrays.toString(m.findRestaurant(list1, list2)));

	}

	public String[] findRestaurant(String[] list1, String[] list2) {

		Map<String, Integer> l1 = new HashMap<String, Integer>();
		Map<String, Integer> coincidences = new HashMap<String, Integer>();

		for (int i = 0; i < list1.length; i++) {
			l1.put(list1[i], i);
		}

		for (int i = 0; i < list2.length; i++) {
			Integer indexAt1 = l1.get(list2[i]);

			if (indexAt1 != null) {
				coincidences.put(list2[i], indexAt1 + i);
			}
		}

		Integer min = Integer.MAX_VALUE;
		List<String> response = new ArrayList<>();

		for (String entry : coincidences.keySet()) {
			Integer value = coincidences.get(entry);
			if (value.equals(min)) {
				response.add(entry);
			} else if (value < min) {
				response = new ArrayList<>();
				min = value;
				response.add(entry);
			}
		}

		return (String[]) response.toArray(new String[response.size()]);

	}

}
