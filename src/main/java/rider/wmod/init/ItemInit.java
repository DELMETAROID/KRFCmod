package rider.wmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import rider.wmod.Wmod;
import rider.wmod.items.ItemBase;
import rider.wmod.items.ItemBase2;
import rider.wmod.items.ItemBase3;
import rider.wmod.items.ItemBase4;
import rider.wmod.items.ItemHenshinTrigger;
import rider.wmod.items.action.ItemAgitoHenshin;
import rider.wmod.items.action.ItemCastOff;
import rider.wmod.items.action.ItemFourzeHenshin;
import rider.wmod.items.action.ItemRevolveOn;
import rider.wmod.items.action.ItemSwordriverBattou;
import rider.wmod.items.action.ItemTurnUp;
import rider.wmod.items.armor.agito.ArmorAgitoFlame;
import rider.wmod.items.armor.agito.ArmorAgitoGround;
import rider.wmod.items.armor.agito.ArmorAgitoStorm;
import rider.wmod.items.armor.agito.ArmorAgitoTrinity;
import rider.wmod.items.armor.agito.ArmorAltering;
import rider.wmod.items.armor.blade.ArmorBlabuckle;
import rider.wmod.items.armor.blade.ArmorBlade;
import rider.wmod.items.armor.blade.ArmorChalice;
import rider.wmod.items.armor.blade.ArmorChaliceSpirit;
import rider.wmod.items.armor.blade.ArmorGarren;
import rider.wmod.items.armor.blade.ArmorGarrenBuckle;
import rider.wmod.items.armor.blade.ArmorRengel;
import rider.wmod.items.armor.blade.ArmorRouseAbsorber;
import rider.wmod.items.armor.build.ArmorBuildBat;
import rider.wmod.items.armor.build.ArmorBuildBeetle;
import rider.wmod.items.armor.build.ArmorBuildBike;
import rider.wmod.items.armor.build.ArmorBuildCake;
import rider.wmod.items.armor.build.ArmorBuildCamera;
import rider.wmod.items.armor.build.ArmorBuildCleaner;
import rider.wmod.items.armor.build.ArmorBuildComic;
import rider.wmod.items.armor.build.ArmorBuildDensya;
import rider.wmod.items.armor.build.ArmorBuildDiamond;
import rider.wmod.items.armor.build.ArmorBuildDog;
import rider.wmod.items.armor.build.ArmorBuildDragon;
import rider.wmod.items.armor.build.ArmorBuildDragonSilver;
import rider.wmod.items.armor.build.ArmorBuildDrier;
import rider.wmod.items.armor.build.ArmorBuildDriver;
import rider.wmod.items.armor.build.ArmorBuildEngine;
import rider.wmod.items.armor.build.ArmorBuildEraser;
import rider.wmod.items.armor.build.ArmorBuildFan;
import rider.wmod.items.armor.build.ArmorBuildFireRescue;
import rider.wmod.items.armor.build.ArmorBuildFreezer;
import rider.wmod.items.armor.build.ArmorBuildGatling;
import rider.wmod.items.armor.build.ArmorBuildGorilla;
import rider.wmod.items.armor.build.ArmorBuildHachi;
import rider.wmod.items.armor.build.ArmorBuildHedgehog;
import rider.wmod.items.armor.build.ArmorBuildHelicopter;
import rider.wmod.items.armor.build.ArmorBuildJet;
import rider.wmod.items.armor.build.ArmorBuildKaizoku;
import rider.wmod.items.armor.build.ArmorBuildKirin;
import rider.wmod.items.armor.build.ArmorBuildKujira;
import rider.wmod.items.armor.build.ArmorBuildKuma;
import rider.wmod.items.armor.build.ArmorBuildLight;
import rider.wmod.items.armor.build.ArmorBuildLion;
import rider.wmod.items.armor.build.ArmorBuildLock;
import rider.wmod.items.armor.build.ArmorBuildMagnet;
import rider.wmod.items.armor.build.ArmorBuildMic;
import rider.wmod.items.armor.build.ArmorBuildNinja;
import rider.wmod.items.armor.build.ArmorBuildObake;
import rider.wmod.items.armor.build.ArmorBuildOctopas;
import rider.wmod.items.armor.build.ArmorBuildPanda;
import rider.wmod.items.armor.build.ArmorBuildPenguin;
import rider.wmod.items.armor.build.ArmorBuildPhoenix;
import rider.wmod.items.armor.build.ArmorBuildPyramid;
import rider.wmod.items.armor.build.ArmorBuildRabbit;
import rider.wmod.items.armor.build.ArmorBuildRabbitGold;
import rider.wmod.items.armor.build.ArmorBuildRobot;
import rider.wmod.items.armor.build.ArmorBuildRocket;
import rider.wmod.items.armor.build.ArmorBuildRose;
import rider.wmod.items.armor.build.ArmorBuildSai;
import rider.wmod.items.armor.build.ArmorBuildSame;
import rider.wmod.items.armor.build.ArmorBuildSanta;
import rider.wmod.items.armor.build.ArmorBuildSika;
import rider.wmod.items.armor.build.ArmorBuildSkate;
import rider.wmod.items.armor.build.ArmorBuildSmapho;
import rider.wmod.items.armor.build.ArmorBuildSpider;
import rider.wmod.items.armor.build.ArmorBuildStag;
import rider.wmod.items.armor.build.ArmorBuildSubmarine;
import rider.wmod.items.armor.build.ArmorBuildTV;
import rider.wmod.items.armor.build.ArmorBuildTaka;
import rider.wmod.items.armor.build.ArmorBuildTank;
import rider.wmod.items.armor.build.ArmorBuildTankMetal;
import rider.wmod.items.armor.build.ArmorBuildTora;
import rider.wmod.items.armor.build.ArmorBuildTurtle;
import rider.wmod.items.armor.build.ArmorBuildUFO;
import rider.wmod.items.armor.build.ArmorBuildUnicorn;
import rider.wmod.items.armor.build.ArmorBuildWatch;
import rider.wmod.items.armor.build.ArmorBuildWolf;
import rider.wmod.items.armor.build.ArmorCrossZ;
import rider.wmod.items.armor.build.ArmorLMDetective;
import rider.wmod.items.armor.build.ArmorLMDoctor;
import rider.wmod.items.armor.build.ArmorLMDrum;
import rider.wmod.items.armor.build.ArmorLMFriendship;
import rider.wmod.items.armor.build.ArmorLMGame;
import rider.wmod.items.armor.build.ArmorLMMedal;
import rider.wmod.items.armor.build.ArmorLMMirror;
import rider.wmod.items.armor.build.ArmorLMOOPARTS;
import rider.wmod.items.armor.build.ArmorLMOgre;
import rider.wmod.items.armor.build.ArmorLMOrange;
import rider.wmod.items.armor.build.ArmorLMParka;
import rider.wmod.items.armor.build.ArmorLMPolice;
import rider.wmod.items.armor.build.ArmorLMRidercard;
import rider.wmod.items.armor.build.ArmorLMRuin;
import rider.wmod.items.armor.build.ArmorLMTrump;
import rider.wmod.items.armor.build.ArmorLMUSB;
import rider.wmod.items.armor.build.ArmorLMWizard;
import rider.wmod.items.armor.build.ArmorLMZector;
import rider.wmod.items.armor.decade.ArmorDecadriver;
import rider.wmod.items.armor.decade.ArmorDecadriverNeo;
import rider.wmod.items.armor.decade.ArmorKRAgito;
import rider.wmod.items.armor.decade.ArmorKRBlade;
import rider.wmod.items.armor.decade.ArmorKRBuild;
import rider.wmod.items.armor.decade.ArmorKRDecade;
import rider.wmod.items.armor.decade.ArmorKRDecadeRage;
import rider.wmod.items.armor.decade.ArmorKRDrive;
import rider.wmod.items.armor.decade.ArmorKRExaid;
import rider.wmod.items.armor.decade.ArmorKRFourze;
import rider.wmod.items.armor.decade.ArmorKRGaim;
import rider.wmod.items.armor.decade.ArmorKRGhost;
import rider.wmod.items.armor.decade.ArmorKRHibiki;
import rider.wmod.items.armor.decade.ArmorKRKabuto;
import rider.wmod.items.armor.decade.ArmorKRKuuga;
import rider.wmod.items.armor.decade.ArmorKROOO;
import rider.wmod.items.armor.decade.ArmorKRRyuki;
import rider.wmod.items.armor.decade.ArmorKRW;
import rider.wmod.items.armor.decade.ArmorKRWizard;
import rider.wmod.items.armor.drive.ArmorBannodriver;
import rider.wmod.items.armor.drive.ArmorBannodriverBronze;
import rider.wmod.items.armor.drive.ArmorBraindriver;
import rider.wmod.items.armor.drive.ArmorDriveDeadheat;
import rider.wmod.items.armor.drive.ArmorDriveNext;
import rider.wmod.items.armor.drive.ArmorDriveProto;
import rider.wmod.items.armor.drive.ArmorDriveSpeed;
import rider.wmod.items.armor.drive.ArmorDriveZero;
import rider.wmod.items.armor.drive.ArmorDrivedriver;
import rider.wmod.items.armor.drive.ArmorMachDriver;
import rider.wmod.items.armor.drive.ArmorShiftBraver;
import rider.wmod.items.armor.drive.ArmorShiftCab;
import rider.wmod.items.armor.drive.ArmorShiftDoctor;
import rider.wmod.items.armor.drive.ArmorShiftDump;
import rider.wmod.items.armor.drive.ArmorShiftFlare;
import rider.wmod.items.armor.drive.ArmorShiftGravity;
import rider.wmod.items.armor.drive.ArmorShiftHunter;
import rider.wmod.items.armor.drive.ArmorShiftMixer;
import rider.wmod.items.armor.drive.ArmorShiftMonster;
import rider.wmod.items.armor.drive.ArmorShiftShadow;
import rider.wmod.items.armor.drive.ArmorShiftSpike;
import rider.wmod.items.armor.drive.ArmorShiftVegas;
import rider.wmod.items.armor.drive.ArmorShiftWrecker;
import rider.wmod.items.armor.drive.ArmorSignalChaser;
import rider.wmod.items.armor.drive.ArmorSignalMach;
import rider.wmod.items.armor.exaid.ArmorBuggleDriver;
import rider.wmod.items.armor.exaid.ArmorBuggleDriverZwei;
import rider.wmod.items.armor.exaid.ArmorExaidAction;
import rider.wmod.items.armor.exaid.ArmorExaidActionLv1;
import rider.wmod.items.armor.exaid.ArmorExaidActionOrigin;
import rider.wmod.items.armor.exaid.ArmorExaidActionProto;
import rider.wmod.items.armor.exaid.ArmorExaidActionProtoLv1;
import rider.wmod.items.armor.exaid.ArmorExaidBeat;
import rider.wmod.items.armor.exaid.ArmorExaidBeatProto;
import rider.wmod.items.armor.exaid.ArmorExaidBike;
import rider.wmod.items.armor.exaid.ArmorExaidBikeCombi;
import rider.wmod.items.armor.exaid.ArmorExaidBikeProto;
import rider.wmod.items.armor.exaid.ArmorExaidBikeTurbo;
import rider.wmod.items.armor.exaid.ArmorExaidBrothers;
import rider.wmod.items.armor.exaid.ArmorExaidBurger;
import rider.wmod.items.armor.exaid.ArmorExaidChambara;
import rider.wmod.items.armor.exaid.ArmorExaidChambaraProto;
import rider.wmod.items.armor.exaid.ArmorExaidChronicle;
import rider.wmod.items.armor.exaid.ArmorExaidCombat;
import rider.wmod.items.armor.exaid.ArmorExaidCombatProto;
import rider.wmod.items.armor.exaid.ArmorExaidCrisis;
import rider.wmod.items.armor.exaid.ArmorExaidFantasy;
import rider.wmod.items.armor.exaid.ArmorExaidFighter;
import rider.wmod.items.armor.exaid.ArmorExaidFighter2;
import rider.wmod.items.armor.exaid.ArmorExaidFighterAnother;
import rider.wmod.items.armor.exaid.ArmorExaidFumetsu;
import rider.wmod.items.armor.exaid.ArmorExaidGOD;
import rider.wmod.items.armor.exaid.ArmorExaidHunterBlade;
import rider.wmod.items.armor.exaid.ArmorExaidHunterCraw;
import rider.wmod.items.armor.exaid.ArmorExaidHunterFang;
import rider.wmod.items.armor.exaid.ArmorExaidHunterFull;
import rider.wmod.items.armor.exaid.ArmorExaidHunterGun;
import rider.wmod.items.armor.exaid.ArmorExaidHunterProto;
import rider.wmod.items.armor.exaid.ArmorExaidLegacy;
import rider.wmod.items.armor.exaid.ArmorExaidMAX;
import rider.wmod.items.armor.exaid.ArmorExaidMinecraft;
import rider.wmod.items.armor.exaid.ArmorExaidMuteki;
import rider.wmod.items.armor.exaid.ArmorExaidNovel;
import rider.wmod.items.armor.exaid.ArmorExaidPuzzle;
import rider.wmod.items.armor.exaid.ArmorExaidPuzzleAnother;
import rider.wmod.items.armor.exaid.ArmorExaidQuest;
import rider.wmod.items.armor.exaid.ArmorExaidQuestProto;
import rider.wmod.items.armor.exaid.ArmorExaidRobot;
import rider.wmod.items.armor.exaid.ArmorExaidRobotProto;
import rider.wmod.items.armor.exaid.ArmorExaidSafari;
import rider.wmod.items.armor.exaid.ArmorExaidShooting;
import rider.wmod.items.armor.exaid.ArmorExaidShootingProto;
import rider.wmod.items.armor.exaid.ArmorExaidSimulation;
import rider.wmod.items.armor.exaid.ArmorExaidSports;
import rider.wmod.items.armor.exaid.ArmorExaidSportsProto;
import rider.wmod.items.armor.exaid.ArmorExaidTank;
import rider.wmod.items.armor.exaid.ArmorExaidZombie;
import rider.wmod.items.armor.exaid.ArmorExaidZombieMAX;
import rider.wmod.items.armor.exaid.ArmorGamerDriver;
import rider.wmod.items.armor.exaid.ArmorRidePlayer;
import rider.wmod.items.armor.fourze.ArmorFourzeBase;
import rider.wmod.items.armor.fourze.ArmorFourzeDriver;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBanana;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBloodOrange;
import rider.wmod.items.armor.gaim.ls.ArmorGaimBudou;
import rider.wmod.items.armor.gaim.ls.ArmorGaimDongri;
import rider.wmod.items.armor.gaim.ls.ArmorGaimDorian;
import rider.wmod.items.armor.gaim.ls.ArmorGaimHimawariLS;
import rider.wmod.items.armor.gaim.ls.ArmorGaimKurumi;
import rider.wmod.items.armor.gaim.ls.ArmorGaimMatsubokkuri;
import rider.wmod.items.armor.gaim.ls.ArmorGaimMelon;
import rider.wmod.items.armor.gaim.ls.ArmorGaimOrange;
import rider.wmod.items.armor.gaim.ls.ArmorGaimOrangeBlack;
import rider.wmod.items.armor.gaim.ls.ArmorGaimOrangeFresh;
import rider.wmod.items.armor.gaim.ls.ArmorGaimWaterMelon;
import rider.wmod.items.armor.gaim.ls.ArmorJimberBlack;
import rider.wmod.items.armor.gaim.ls.ArmorJimberCherry;
import rider.wmod.items.armor.gaim.ls.ArmorJimberDragon;
import rider.wmod.items.armor.gaim.ls.ArmorJimberLemon;
import rider.wmod.items.armor.gaim.ls.ArmorJimberMarron;
import rider.wmod.items.armor.gaim.ls.ArmorJimberMatsubokkuri;
import rider.wmod.items.armor.gaim.ls.ArmorJimberMelon;
import rider.wmod.items.armor.gaim.ls.ArmorJimberPeach;
import rider.wmod.items.armor.gaim.sengoku.ArmorGenesisCore;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriver;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBARON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBRAVO;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBlackBARON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverBujinGAIM;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverGAIM;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverGRIDON;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverKNUCKLE;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverKUROKAGE;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverMASS;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverRYUGEN;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverSTUDY;
import rider.wmod.items.armor.gaim.sengoku.ArmorSengokuDriverZANGETSU;
import rider.wmod.items.armor.geats.ArmorDesireDriver;
import rider.wmod.items.armor.geats.ArmorIDBrali;
import rider.wmod.items.armor.geats.ArmorIDBuchi;
import rider.wmod.items.armor.geats.ArmorIDBuffa;
import rider.wmod.items.armor.geats.ArmorIDDapaan;
import rider.wmod.items.armor.geats.ArmorIDDoomsGeats;
import rider.wmod.items.armor.geats.ArmorIDGeats;
import rider.wmod.items.armor.geats.ArmorIDGeatsOneness;
import rider.wmod.items.armor.geats.ArmorIDGinpen;
import rider.wmod.items.armor.geats.ArmorIDGroovy;
import rider.wmod.items.armor.geats.ArmorIDGyago;
import rider.wmod.items.armor.geats.ArmorIDHakubi;
import rider.wmod.items.armor.geats.ArmorIDKeilow;
import rider.wmod.items.armor.geats.ArmorIDLetter;
import rider.wmod.items.armor.geats.ArmorIDLopo;
import rider.wmod.items.armor.geats.ArmorIDMary;
import rider.wmod.items.armor.geats.ArmorIDNadgesparrow;
import rider.wmod.items.armor.geats.ArmorIDNago;
import rider.wmod.items.armor.geats.ArmorIDPunkjack;
import rider.wmod.items.armor.geats.ArmorIDSeeker;
import rider.wmod.items.armor.geats.ArmorIDShirowe;
import rider.wmod.items.armor.geats.ArmorIDSkumatter;
import rider.wmod.items.armor.geats.ArmorIDTurbon;
import rider.wmod.items.armor.geats.ArmorIDTycoon;
import rider.wmod.items.armor.geats.ArmorIDXGeats;
import rider.wmod.items.armor.geats.ArmorRaiseArrow2;
import rider.wmod.items.armor.geats.ArmorRaiseArrow_R;
import rider.wmod.items.armor.geats.ArmorRaiseAx;
import rider.wmod.items.armor.geats.ArmorRaiseAx_R;
import rider.wmod.items.armor.geats.ArmorRaiseBoost;
import rider.wmod.items.armor.geats.ArmorRaiseBoost_R;
import rider.wmod.items.armor.geats.ArmorRaiseBreaker;
import rider.wmod.items.armor.geats.ArmorRaiseBreaker_R;
import rider.wmod.items.armor.geats.ArmorRaiseChainarray;
import rider.wmod.items.armor.geats.ArmorRaiseChainarray_R;
import rider.wmod.items.armor.geats.ArmorRaiseCraw;
import rider.wmod.items.armor.geats.ArmorRaiseCraw_R;
import rider.wmod.items.armor.geats.ArmorRaiseDrill;
import rider.wmod.items.armor.geats.ArmorRaiseDrill_R;
import rider.wmod.items.armor.geats.ArmorRaiseDualer;
import rider.wmod.items.armor.geats.ArmorRaiseDualer_R;
import rider.wmod.items.armor.geats.ArmorRaiseHammer;
import rider.wmod.items.armor.geats.ArmorRaiseHammer_R;
import rider.wmod.items.armor.geats.ArmorRaiseKingOhger;
import rider.wmod.items.armor.geats.ArmorRaiseKingOhger_R;
import rider.wmod.items.armor.geats.ArmorRaiseMagnum;
import rider.wmod.items.armor.geats.ArmorRaiseMagnum_R;
import rider.wmod.items.armor.geats.ArmorRaisePropeller;
import rider.wmod.items.armor.geats.ArmorRaisePropeller_R;
import rider.wmod.items.armor.geats.ArmorRaiseSP;
import rider.wmod.items.armor.geats.ArmorRaiseSP_R;
import rider.wmod.items.armor.geats.ArmorRaiseShield2;
import rider.wmod.items.armor.geats.ArmorRaiseShield_R;
import rider.wmod.items.armor.geats.ArmorRaiseShooter;
import rider.wmod.items.armor.geats.ArmorRaiseShooter_R;
import rider.wmod.items.armor.geats.ArmorRaiseWater;
import rider.wmod.items.armor.geats.ArmorRaiseWater_R;
import rider.wmod.items.armor.ghost.ArmorGhostDark;
import rider.wmod.items.armor.ghost.ArmorGhostDriver;
import rider.wmod.items.armor.ghost.ArmorGhostMusashi;
import rider.wmod.items.armor.ghost.ArmorGhostOre;
import rider.wmod.items.armor.ghost.ArmorGhostZero;
import rider.wmod.items.armor.ghost.ArmorSpector;
import rider.wmod.items.armor.ghost.ArmorSpectorZero;
import rider.wmod.items.armor.gotchard.ArmorGotchardriver;
import rider.wmod.items.armor.gotchard.ArmorGotchardriverDaybreak;
import rider.wmod.items.armor.gotchard.ArmorLegendriver;
import rider.wmod.items.armor.hibiki.ArmorHibikiBody;
import rider.wmod.items.armor.hibiki.ArmorHibikiCrimson;
import rider.wmod.items.armor.hibiki.ArmorHibikiHead;
import rider.wmod.items.armor.kabuto.ArmorDarkKabutoBelt;
import rider.wmod.items.armor.kabuto.ArmorDarkKabutoRider;
import rider.wmod.items.armor.kabuto.ArmorGatackBelt;
import rider.wmod.items.armor.kabuto.ArmorKabutoBelt;
import rider.wmod.items.armor.kabuto.ArmorKabutoMasked;
import rider.wmod.items.armor.kabuto.ArmorKabutoRider;
import rider.wmod.items.armor.kuuga.ArmorArcle;
import rider.wmod.items.armor.kuuga.ArmorArcleAmazing;
import rider.wmod.items.armor.kuuga.ArmorArcleRising;
import rider.wmod.items.armor.kuuga.ArmorArcleUltimate;
import rider.wmod.items.armor.kuuga.ArmorKuugaDragon;
import rider.wmod.items.armor.kuuga.ArmorKuugaMighty;
import rider.wmod.items.armor.kuuga.ArmorKuugaPegasas;
import rider.wmod.items.armor.kuuga.ArmorKuugaTitan;
import rider.wmod.items.armor.ooo.ArmorOOOBatta;
import rider.wmod.items.armor.ooo.ArmorOOODriver;
import rider.wmod.items.armor.ooo.ArmorOOODriver2;
import rider.wmod.items.armor.ooo.ArmorOOOKamakiri;
import rider.wmod.items.armor.ooo.ArmorOOOKuwagata;
import rider.wmod.items.armor.ooo.ArmorOOOTaka;
import rider.wmod.items.armor.ooo.ArmorOOOTora;
import rider.wmod.items.armor.ryuki.ArmorAbiss;
import rider.wmod.items.armor.ryuki.ArmorFatale;
import rider.wmod.items.armor.ryuki.ArmorFemme;
import rider.wmod.items.armor.ryuki.ArmorGai;
import rider.wmod.items.armor.ryuki.ArmorImperror;
import rider.wmod.items.armor.ryuki.ArmorKnight;
import rider.wmod.items.armor.ryuki.ArmorKnightBlank;
import rider.wmod.items.armor.ryuki.ArmorKnightSurvive;
import rider.wmod.items.armor.ryuki.ArmorOdin;
import rider.wmod.items.armor.ryuki.ArmorOuja;
import rider.wmod.items.armor.ryuki.ArmorOujaBlank;
import rider.wmod.items.armor.ryuki.ArmorOujaSurvive;
import rider.wmod.items.armor.ryuki.ArmorRaia;
import rider.wmod.items.armor.ryuki.ArmorRyuga;
import rider.wmod.items.armor.ryuki.ArmorRyuki;
import rider.wmod.items.armor.ryuki.ArmorRyukiBlank;
import rider.wmod.items.armor.ryuki.ArmorRyukiSurvive;
import rider.wmod.items.armor.ryuki.ArmorScissors;
import rider.wmod.items.armor.ryuki.ArmorTiger;
import rider.wmod.items.armor.ryuki.ArmorVbuckle;
import rider.wmod.items.armor.ryuki.ArmorVelde;
import rider.wmod.items.armor.ryuki.ArmorZolda;
import rider.wmod.items.armor.saber.ArmorSaberArangina;
import rider.wmod.items.armor.saber.ArmorSaberBremen;
import rider.wmod.items.armor.saber.ArmorSaberCerberus;
import rider.wmod.items.armor.saber.ArmorSaberDragon;
import rider.wmod.items.armor.saber.ArmorSaberEagle;
import rider.wmod.items.armor.saber.ArmorSaberGenbu;
import rider.wmod.items.armor.saber.ArmorSaberHedgehog;
import rider.wmod.items.armor.saber.ArmorSaberHenzel;
import rider.wmod.items.armor.saber.ArmorSaberJaakuDragon;
import rider.wmod.items.armor.saber.ArmorSaberJackun;
import rider.wmod.items.armor.saber.ArmorSaberKobuta;
import rider.wmod.items.armor.saber.ArmorSaberLion;
import rider.wmod.items.armor.saber.ArmorSaberNinja;
import rider.wmod.items.armor.saber.ArmorSaberPegasas;
import rider.wmod.items.armor.saber.ArmorSaberPeter;
import rider.wmod.items.armor.saber.ArmorSaberPhoenix;
import rider.wmod.items.armor.saber.ArmorSaberSaiyuu;
import rider.wmod.items.armor.saber.ArmorSaberSiren;
import rider.wmod.items.armor.saber.ArmorSwordriverIkazuchi;
import rider.wmod.items.armor.saber.ArmorSwordriverNagare;
import rider.wmod.items.armor.saber.ArmorSwordriverRekka;
import rider.wmod.items.armor.saber.ArmorSwordriverShikkoku;
import rider.wmod.items.armor.w.ArmorBlackHat;
import rider.wmod.items.armor.w.ArmorLostDriver;
import rider.wmod.items.armor.w.ArmorWCyclone;
import rider.wmod.items.armor.w.ArmorWDriver;
import rider.wmod.items.armor.w.ArmorWHeat;
import rider.wmod.items.armor.w.ArmorWJoker;
import rider.wmod.items.armor.w.ArmorWLuna;
import rider.wmod.items.armor.w.ArmorWMetal;
import rider.wmod.items.armor.w.ArmorWTrigger;
import rider.wmod.items.armor.wizard.ArmorWiseDriver;
import rider.wmod.items.armor.wizard.ArmorWizarDriver;
import rider.wmod.items.armor.wizard.ArmorWizardBlack;
import rider.wmod.items.armor.wizard.ArmorWizardDark;
import rider.wmod.items.armor.wizard.ArmorWizardFlame;
import rider.wmod.items.armor.wizard.ArmorWizardHurricane;
import rider.wmod.items.armor.wizard.ArmorWizardLand;
import rider.wmod.items.armor.wizard.ArmorWizardWater;
import rider.wmod.items.armor.zeroone.ArmorZeroOneRealizing;
import rider.wmod.items.armor.zeztz.ArmorZeztzDriver;
import rider.wmod.items.armor.zeztz.ArmorZeztzImpact;
import rider.wmod.items.armor.zio.ArmorAgitoArmor;
import rider.wmod.items.armor.zio.ArmorBladeArmor;
import rider.wmod.items.armor.zio.ArmorBuildArmor;
import rider.wmod.items.armor.zio.ArmorDecadeArmor;
import rider.wmod.items.armor.zio.ArmorDriveArmor;
import rider.wmod.items.armor.zio.ArmorExaidArmor;
import rider.wmod.items.armor.zio.ArmorFourzeArmor;
import rider.wmod.items.armor.zio.ArmorGaimArmor;
import rider.wmod.items.armor.zio.ArmorGhostArmor;
import rider.wmod.items.armor.zio.ArmorHIbikiArmor;
import rider.wmod.items.armor.zio.ArmorHattari;
import rider.wmod.items.armor.zio.ArmorKabutoArmor;
import rider.wmod.items.armor.zio.ArmorKuugaArmor;
import rider.wmod.items.armor.zio.ArmorMiraiDriver;
import rider.wmod.items.armor.zio.ArmorOOOArmor;
import rider.wmod.items.armor.zio.ArmorQuiz;
import rider.wmod.items.armor.zio.ArmorQuizDriver;
import rider.wmod.items.armor.zio.ArmorRyukiArmor;
import rider.wmod.items.armor.zio.ArmorShinobi;
import rider.wmod.items.armor.zio.ArmorWArmor;
import rider.wmod.items.armor.zio.ArmorWizardArmor;
import rider.wmod.items.armor.zio.ArmorZikuDriver;
import rider.wmod.items.tools.ItemDriverSummoner;
import rider.wmod.items.tools.blade.ItemBlabuckle;
import rider.wmod.items.tools.build.ItemEmptyBottle;
import rider.wmod.items.tools.exaid.ItemGashaconBugviser;
import rider.wmod.items.tools.exaid.ItemGearDual;
import rider.wmod.items.tools.hibiki.ItemOngekiko;
import rider.wmod.items.tools.ooo.ItemOScanner;
import rider.wmod.items.tools.ryuki.ItemBlankDeck;
import rider.wmod.items.tools.wizard.ItemRingCopy;
import rider.wmod.items.tools.wizard.ItemRingFlower;
import rider.wmod.items.weapon.agito.ItemFlameSaber;
import rider.wmod.items.weapon.base.ItemBaseAx;
import rider.wmod.items.weapon.base.ItemBaseChainArray;
import rider.wmod.items.weapon.base.ItemBaseGun;
import rider.wmod.items.weapon.base.ItemBaseGunReloadable;
import rider.wmod.items.weapon.base.ItemBaseGunSword;
import rider.wmod.items.weapon.base.ItemBaseGunWeapon;
import rider.wmod.items.weapon.base.ItemBaseGunWithAmmo;
import rider.wmod.items.weapon.base.ItemBaseRod;
import rider.wmod.items.weapon.base.ItemBaseShield;
import rider.wmod.items.weapon.base.ItemBaseSword;
import rider.wmod.items.weapon.base.ItemBaseWeapon;
import rider.wmod.items.weapon.exaid.ItemGashaconBreaker;
import rider.wmod.items.weapon.exaid.ItemGashaconBreakerBlade;
import rider.wmod.items.weapon.exaid.ItemGashaconBugviserGun;
import rider.wmod.items.weapon.exaid.ItemGashaconBugviserSaw;
import rider.wmod.items.weapon.gaim.ItemBudouGun;
import rider.wmod.items.weapon.gaim.ItemWaterMelonGatling;
import rider.wmod.items.weapon.geats.ItemBeatAx;
import rider.wmod.items.weapon.geats.ItemMagnumShooter;
import rider.wmod.items.weapon.geats.ItemNinjadualer;
import rider.wmod.items.weapon.geats.ItemRaiseArrow;
import rider.wmod.items.weapon.geats.ItemRaiseCraw;
import rider.wmod.items.weapon.geats.ItemRaiseDrill;
import rider.wmod.items.weapon.geats.ItemRaisePropeller;
import rider.wmod.items.weapon.geats.ItemRaiseShield;
import rider.wmod.items.weapon.geats.ItemRaiseWater;
import rider.wmod.items.weapon.hibiki.ItemArmedSaber;
import rider.wmod.items.weapon.hibiki.ItemArmedSaberOpen;
import rider.wmod.items.weapon.hibiki.ItemOnsaken;
import rider.wmod.items.weapon.ooo.ItemGorirraSalvagion;
import rider.wmod.items.weapon.ooo.ItemMedajaribar;
import rider.wmod.items.weapon.ryuki.ItemStrikevent;
import rider.wmod.items.weapon.saber.ItemSeikenIkazuchi;
import rider.wmod.items.weapon.saber.ItemSeikenNagare;
import rider.wmod.items.weapon.saber.ItemSeikenRekka;
import rider.wmod.items.weapon.saber.ItemSeikenShikkoku;
import rider.wmod.items.weapon.w.ItemTriggerMagnum;
import rider.wmod.items.weapon.w.ItemTriggerMaximum;
import rider.wmod.util.Reference;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//kuuga
	public static final ArmorMaterial DRIVER_KUUGA = EnumHelper.addArmorMaterial("rint", Reference.MODID+":kuuga_growing", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RisingArcle = EnumHelper.addArmorMaterial("thunder_arcle", Reference.MODID+":kuuga_arcle_rising", 20, new int[]{0, 5, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial AmazingArcle = EnumHelper.addArmorMaterial("blackgold_arcle", Reference.MODID+":kuuga_arcle_amazing", 20, new int[]{0, 10, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial UltimateArcle = EnumHelper.addArmorMaterial("darkness_arcle", Reference.MODID+":kuuga_arcle_ultimate", 20, new int[]{0, 12, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial RedAmadam = EnumHelper.addArmorMaterial("red_amadam", Reference.MODID+":kuuga_mighty", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BlueAmadam = EnumHelper.addArmorMaterial("blue_amadam", Reference.MODID+":kuuga_dragon", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial GreenAmadam = EnumHelper.addArmorMaterial("green_amadam", Reference.MODID+":kuuga_pegasas", 20, new int[]{0, 0, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PurpleAmadam = EnumHelper.addArmorMaterial("purple_amadam", Reference.MODID+":kuuga_titan", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static final ToolMaterial KUUGA_ROD =EnumHelper.addToolMaterial("kuuga_rod",3, 800, 0F, 0F, 0);
	public static final ToolMaterial KUUGA_SWORD =EnumHelper.addToolMaterial("kuuga_sword",3, 800, 0F, 9.0F,0);
	public static final ToolMaterial KUUGA_ROD_R =EnumHelper.addToolMaterial("kuuga_rod_rising",3, 800, 0F, 0F,0);
	public static final ToolMaterial KUUGA_SWORD_R =EnumHelper.addToolMaterial("kuuga_sword_rising",3, 800, 0F, 12.0F,0);
	public static final ToolMaterial KUUGA_ROD_A =EnumHelper.addToolMaterial("kuuga_rod_amazsing",3, 800, 0F, 0F,0);
	public static final ToolMaterial KUUGA_SWORD_A =EnumHelper.addToolMaterial("kuuga_sword_amazing",3, 800, 0F, 16.0F,0);

	public static final Item ARCLE = new ArmorArcle("arcle",Wmod.TabKamenRiderKUUGA,DRIVER_KUUGA,EntityEquipmentSlot.LEGS,1);
	public static final Item ARCLE_RISING = new ArmorArcleRising("arcle_rising",Wmod.TabKamenRiderKUUGA,RisingArcle,EntityEquipmentSlot.LEGS,2);
	public static final Item ARCLE_AMAZING = new ArmorArcleAmazing("arcle_amazing",Wmod.TabKamenRiderKUUGA,AmazingArcle,EntityEquipmentSlot.LEGS);
	public static final Item ARCLE_ULTIMATE = new ArmorArcleUltimate("arcle_ultimate",Wmod.TabKamenRiderKUUGA,UltimateArcle,EntityEquipmentSlot.LEGS);

	public static final Item AMADAM_RED = new ArmorKuugaMighty("amadam_red",Wmod.TabKamenRiderKUUGA,RedAmadam,EntityEquipmentSlot.HEAD);
	public static final Item AMADAM_BLUE = new ArmorKuugaDragon("amadam_blue",Wmod.TabKamenRiderKUUGA,BlueAmadam,EntityEquipmentSlot.HEAD);
	public static final Item AMADAM_GREEN = new ArmorKuugaPegasas("amadam_green",Wmod.TabKamenRiderKUUGA,GreenAmadam,EntityEquipmentSlot.HEAD);
	public static final Item AMADAM_PURPLE = new ArmorKuugaTitan("amadam_purple",Wmod.TabKamenRiderKUUGA,PurpleAmadam,EntityEquipmentSlot.HEAD);
	public static final Item AMADAM_THUNDER = new ItemDriverSummoner("amadam_thunder",Wmod.TabKamenRiderKUUGA);
	public static final Item AMADAM_RED_THUNDER = new ItemDriverSummoner("amadam_red_thunder",Wmod.TabKamenRiderKUUGA);
	public static final Item AMADAM_BLUE_THUNDER = new ItemDriverSummoner("amadam_blue_thunder",Wmod.TabKamenRiderKUUGA);
	public static final Item AMADAM_GREEN_THUNDER = new ItemDriverSummoner("amadam_green_thunder",Wmod.TabKamenRiderKUUGA);
	public static final Item AMADAM_PURPLE_THUNDER = new ItemDriverSummoner("amadam_purple_thunder",Wmod.TabKamenRiderKUUGA);

	public static final Item DRAGON_ROD = new ItemBaseRod("dragon_rod", Wmod.TabKamenRiderKUUGA, 8, 2, KUUGA_ROD);
	public static final Item PEGASAS_BOWGUN = new ItemBaseGunReloadable("pegasas_bowgun", Wmod.TabKamenRiderKUUGA,1);
	public static final Item TITAN_SWORD = new ItemBaseSword("titan_sword",KUUGA_SWORD, Wmod.TabKamenRiderKUUGA);
	public static final Item DRAGON_ROD_RISING = new ItemBaseRod("dragon_rod_rising", Wmod.TabKamenRiderKUUGA, 12, 2, KUUGA_ROD_R);
	public static final Item PEGASAS_BOWGUN_RISING = new ItemBaseGunReloadable("pegasas_bowgun_rising", Wmod.TabKamenRiderKUUGA,5);
	public static final Item TITAN_SWORD_RISING = new ItemBaseSword("titan_sword_rising",KUUGA_SWORD_R, Wmod.TabKamenRiderKUUGA);
	public static final Item DRAGON_ROD_AMAZING = new ItemBaseRod("dragon_rod_amazing", Wmod.TabKamenRiderKUUGA, 12, 4, KUUGA_ROD_A);
	public static final Item PEGASAS_BOWGUN_AMAZING = new ItemBaseGunReloadable("pegasas_bowgun_amazing", Wmod.TabKamenRiderKUUGA,10);
	public static final Item TITAN_SWORD_AMAZING = new ItemBaseSword("titan_sword_amazing",KUUGA_SWORD_A, Wmod.TabKamenRiderKUUGA);

	//agito
	public static final ArmorMaterial DRIVER_AGITO = EnumHelper.addArmorMaterial("flame_elu", Reference.MODID+":agito_altering", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial GROUND_AGITO = EnumHelper.addArmorMaterial("exceed_body", Reference.MODID+":agito_ground", 30, new int[]{0, 0, 0, 17},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FLAME_AGITO = EnumHelper.addArmorMaterial("exceed_sense", Reference.MODID+":agito_flame", 30, new int[]{0, 2, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial STORM_AGITO = EnumHelper.addArmorMaterial("exceed_mind", Reference.MODID+":agito_storm", 30, new int[]{0, 2, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TRINITY_AGITO = EnumHelper.addArmorMaterial("exceed_trinity", Reference.MODID+":agito_trinity", 30, new int[]{0, 2, 4, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BURNING_AGITO = EnumHelper.addArmorMaterial("exceed_rage", Reference.MODID+":agito_burning", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial SHINING_AGITO = EnumHelper.addArmorMaterial("exceed_evolution", Reference.MODID+":agito_shining", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ToolMaterial AGITO_SWORD =EnumHelper.addToolMaterial("agito_sword",3, 600, 4.0F, 6.0F,0);
	public static final ToolMaterial AGITO_SWORD_AWAKEN =EnumHelper.addToolMaterial("agito_sword2",3, 10, 4.0F, 10.0F,0);
	public static final ToolMaterial AGITO_HALBERD =EnumHelper.addToolMaterial("agito_halberd",3, 800, 0F, 0F,0);

	public static final Item ALTERING = new ArmorAltering("altering",Wmod.TabKamenRiderAGITO,DRIVER_AGITO,EntityEquipmentSlot.LEGS);
	public static final Item ALTERING_HENSHIN = new ItemAgitoHenshin("altering_henshin",Wmod.TabKamenRiderAGITO);
	public static final Item ELEMENT_GROUND= new ArmorAgitoGround("agito_ground",Wmod.TabKamenRiderAGITO,GROUND_AGITO,EntityEquipmentSlot.HEAD);
	public static final Item ELEMENT_FLAME = new ArmorAgitoFlame("agito_flame",Wmod.TabKamenRiderAGITO,FLAME_AGITO,EntityEquipmentSlot.CHEST);
	public static final Item ELEMENT_STORM = new ArmorAgitoStorm("agito_storm",Wmod.TabKamenRiderAGITO,STORM_AGITO,EntityEquipmentSlot.CHEST);
	public static final Item ELEMENT_TRINITY =new ArmorAgitoTrinity("agito_trinity",Wmod.TabKamenRiderAGITO,TRINITY_AGITO,EntityEquipmentSlot.CHEST);
	//  public static final Item DRAGONS_NAIL = new ItemBase("agito_dragonsnail",Wmod.TabKamenRiderAgito);
	//  public static final Item DRAGONS_NAIL_SHINING = new ItemBase("agito_dragonsnail_shining",Wmod.TabKamenRiderAgito);
	public static final Item FLAME_SABER = new ItemFlameSaber("agito_flame_saber",AGITO_SWORD,Wmod.TabKamenRiderAGITO);
	public static final Item FLAME_SABER_AWAKEN = new ItemFlameSaber("agito_flame_saber_awaken",AGITO_SWORD_AWAKEN,Wmod.TabKamenRiderAGITO);
	public static final Item STORM_HALBERD = new ItemBaseRod("agito_storm_halberd",Wmod.TabKamenRiderAGITO,8,4,AGITO_HALBERD);

	//  public static final Item G_BUCKLE = new ItemBase("g3_buckle",Wmod.TabKamenRiderAGITO);
	//  public static final Item G3_MET = new ItemBase("g3_met",Wmod.TabKamenRiderAGITO);
	//  public static final Item G3_ARMOR = new ItemBase("g3_armor.TabKamenRiderAGITO);
	//  public static final Item G3X_MET = new ItemBase("g3x_met",Wmod.TabKamenRiderAGITO);
	//  public static final Item G3X_ARMOR = new ItemBase("g3x_armor",Wmod.TabKamenRiderAGITO);
	//  public static final Item G3MILD_MET = new ItemBase("g3mild_met",Wmod.TabKamenRiderAGITO);
	//  public static final Item G3MILD_ARMOR = new ItemBase("g3mild_armor.TabKamenRiderAGITO);
	//  public static final Item G4_MET = new ItemBase("g4_met",Wmod.TabKamenRiderAGITO);
	//  public static final Item G4_ARMOR = new ItemBase("g4_armor.TabKamenRiderAGITO);

	//  public static final Item METAFACTOR = new ItemBase("metafactor",Wmod.TabKamenRiderAGITO);
	//  public static final Item METAFACTOR_EXCEED = new ItemBase("metafactor_exceed",Wmod.TabKamenRiderAGITO);

	//ryuki
	public static final ArmorMaterial DRIVER_RYUKI = EnumHelper.addArmorMaterial("mirrorworld", Reference.MODID+":vbuckle", 30, new int[]{0, 2, 0, 0},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial RYUKI_BLANK = EnumHelper.addArmorMaterial("carddeck1", Reference.MODID+":deck_blank_ryuki", 20, new int[]{0, 0, 0, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KNIGHT_BLANK = EnumHelper.addArmorMaterial("carddeck2", Reference.MODID+":deck_blank_knight", 20, new int[]{0, 0, 0, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial OUJA_BLANK = EnumHelper.addArmorMaterial("carddeck3", Reference.MODID+":deck_blank_ouja", 23, new int[]{0, 0, 0, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial RYUKI_DECK = EnumHelper.addArmorMaterial("dragredder", Reference.MODID+":deck_ryuki", 23, new int[]{0, 0, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial KNIGHT_DECK = EnumHelper.addArmorMaterial("darkwing", Reference.MODID+":deck_knight", 23, new int[]{0, 0, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial OUJA_DECK = EnumHelper.addArmorMaterial("venosnaker", Reference.MODID+":deck_ouja", 23, new int[]{0, 0, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial RYUGA_DECK = EnumHelper.addArmorMaterial("dragblacker", Reference.MODID+":deck_ryuga", 23, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);

	public static final ToolMaterial BLANK_SWORDVENT =EnumHelper.addToolMaterial("blank_sword",3, 10, 0F, 2.0F,0);
	public static final ToolMaterial RYUKI_SWORDVENT =EnumHelper.addToolMaterial("ryuki_sword",3, 800, 4.0F, 6.0F,0);
	public static final ToolMaterial KNIGHT_SWORDVENT =EnumHelper.addToolMaterial("knight_sword",3, 800, 4.0F, 6.0F,0);
	public static final ToolMaterial OUJA_SWORDVENT =EnumHelper.addToolMaterial("ouja_sword",3, 800, 4.0F, 6.0F,0);	
	public static final ToolMaterial RYUGA_SWORDVENT =EnumHelper.addToolMaterial("ryuga_sword",3, 800, 4.0F, 7.0F,0);	

	public static final Item V_BUCKLE = new ArmorVbuckle("vbuckle",Wmod.TabKamenRiderRYUKI,DRIVER_RYUKI, EntityEquipmentSlot.LEGS);
	public static final Item V_BUCKLE_GOLD = new ItemBase("vbuckle_gold",Wmod.TabKamenRiderRYUKI);

	public static final Item DECK_BLANK = new ItemBlankDeck("carddeck_blank",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_RYUKI_BLANK = new ArmorRyukiBlank("carddeck_ryuki_blank",Wmod.TabKamenRiderRYUKI,RYUKI_BLANK, EntityEquipmentSlot.HEAD);
	public static final Item DECK_KNIGHT_BLANK = new ArmorKnightBlank("carddeck_knight_blank",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_OUJA_BLANK = new ArmorOujaBlank("carddeck_ouja_blank",Wmod.TabKamenRiderRYUKI,OUJA_BLANK, EntityEquipmentSlot.HEAD);
	public static final Item SWORDVENT_BLANK = new ItemBaseSword("blank_swordvent",BLANK_SWORDVENT, Wmod.TabKamenRiderRYUKI);
	//  	public static final Item CONTRACT = new ItemBase("vent_contract",Wmod.TabKamenRiderRyuki);	

	public static final Item DECK_RYUKI = new ArmorRyuki("carddeck_ryuki",Wmod.TabKamenRiderRYUKI,RYUKI_DECK, EntityEquipmentSlot.HEAD);
	public static final Item SWORDVENT_RYUKI = new ItemBaseSword("ryuki_swordvent",RYUKI_SWORDVENT, Wmod.TabKamenRiderRYUKI);
	//  	public static final Item GUARDVENT_RYUKI = new ItemBaseShield("ryuki_guardvent",Wmod.TabKamenRiderRyuki);
	public static final Item STRIKEVENT_RYUKI = new ItemStrikevent("ryuki_strikevent",Wmod.TabKamenRiderRYUKI);
	//  	public static final Item ADVENT_RYUKI = new ItemBase("ryuki_advent",Wmod.TabKamenRiderRyuki);
	//  	public static final Item GUARDVENT_RYUKI_ARMOR = new ItemBase("ryuki_guardvent_armor",Wmod.TabKamenRiderRyuki);
	//  	public static final Item SURVIVE_REKKA = new ItemBase("ryuki_survive_rekka",Wmod.TabKamenRiderRyuki);

	public static final Item DECK_KNIGHT = new ArmorKnight("carddeck_knight",Wmod.TabKamenRiderRYUKI);
	//  	public static final Item DARKVISER = new ItemVIser("knight_viser",Wmod.TabKamenRiderRYUKI);
	//public static final Item SWORDVENT_KNIGHT = new ItemBaseSword("knight_swordvent",KNIGHT_SWORDVENT, Wmod.TabKamenRiderRYUKI);
	//  	public static final Item GUARDVENT_KNIGHT = new ItemBase("knight_guardvent",Wmod.TabKamenRiderRYUKI);
	//  	public static final Item SURVIVE_SHIPPU = new ItemBase("ryuki_survive_shippu",Wmod.TabKamenRiderRyuki);

	public static final Item DECK_SCISSORS = new ArmorScissors("carddeck_scissors",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_ZOLDA = new ArmorZolda("carddeck_zolda",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_RAIA = new ArmorRaia("carddeck_raia",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_GAI = new ArmorGai("carddeck_gai",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_OUJA = new ArmorOuja("carddeck_ouja",Wmod.TabKamenRiderRYUKI,OUJA_DECK,EntityEquipmentSlot.HEAD);
	//	public static final Item VENOVISER = new ItemViser("ouja_viser",Wmod.TabKamenRiderRYUKI);
	//public static final Item SWORDVENT_OUJA = new ItemBaseSword("ouja_swordvent",OUJA_SWORDVENT, Wmod.TabKamenRiderRYUKI);
	//  	public static final Item SURVIVE_MUGEN = new ItemBase("ryuki_survive_mugen",Wmod.TabKamenRiderRyuki);
	public static final Item DECK_IMPERROR = new ArmorImperror("carddeck_imperror",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_TIGER = new ArmorTiger("carddeck_tiger",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_ODIN = new ArmorOdin("carddeck_odin",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_VERDE = new ArmorVelde("carddeck_verde",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_RYUGA = new ArmorRyuga("carddeck_ryuga",Wmod.TabKamenRiderRYUKI,RYUGA_DECK, EntityEquipmentSlot.HEAD);
	public static final Item SWORDVENT_RYUGA = new ItemBaseSword("ryuga_swordvent",RYUGA_SWORDVENT,Wmod.TabKamenRiderRYUKI);
	//  	public static final Item GUARDVENT_RYUGA = new ItemBase("ryuga_guardvent",Wmod.TabKamenRiderRyuki);
	public static final Item STRIKEVENT_RYUGA = new ItemStrikevent("ryuga_strikevent",Wmod.TabKamenRiderRYUKI);
	//  	public static final Item ADVENT_RYUGA = new ItemBase("ryuga_advent",Wmod.TabKamenRiderRyuki);
	//  	public static final Item GUARDVENT_ARMED_RYUGA = new ItemBase("ryuga_guardvent_armor",Wmod.TabKamenRiderRyuki);
	public static final Item DECK_FEMME = new ArmorFemme("carddeck_femme",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_ABISS = new ArmorAbiss("carddeck_abiss",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_FATALE = new ArmorFatale("carddeck_fatale",Wmod.TabKamenRiderRYUKI);

	public static final Item DECK_RYUKI_SURVIVE = new ArmorRyukiSurvive("carddeck_ryuki_survive",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_KNIGHT_SURVIVE = new ArmorKnightSurvive("carddeck_knight_survive",Wmod.TabKamenRiderRYUKI);
	public static final Item DECK_OUJA_SURVIVE = new ArmorOujaSurvive("carddeck_ouja_survive",Wmod.TabKamenRiderRYUKI);

	//faiz
	//  public static final Item FAIZ_PHONE = new ItemBase("faiz_phone",Wmod.TabKamenRiderFaiz);
	public static final Item FAIZ_DRIVER = new ItemBase("faiz_driver",Wmod.TabKamenRiderFAIZ);
	//  public static final Item FAIZ_POINTER = new ItemBase("faiz_pointer",Wmod.TabKamenRiderFaiz);
	//  public static final Item FAIZ_SHOT = new ItemBase("faiz_shot",Wmod.TabKamenRiderFaiz);
	//  public static final Item FAIZ_EDGE = new ItemBase("faiz_edge",Wmod.TabKamenRiderFaiz);
	//  public static final Item FAIZ_ACCEL = new ItemBase("faiz_accel",Wmod.TabKamenRiderFaiz);
	//  public static final Item FAIZ_BLASTER = new ItemBase("faiz_blaster",Wmod.TabKamenRiderFaiz);
	//  public static final Item FAIZ_SOUNDER = new ItemBase("faiz_sounder,Wmod.TabKamenRiderFaiz);

	//  public static final Item KAIZA_PHONE = new ItemBase("kaiza_phone",Wmod.TabKamenRiderFaiz);
	//	public static final Item KAIZA_DRIVER = new ItemBase("kaiza_driver",Wmod.TabKamenRiderFAIZ);
	//  public static final Item KAIZA_BLAGUN = new ItemBase("kaiza_edge",Wmod.TabKamenRiderFaiz);
	//  public static final Item KAIZA_SHOT = new ItemBase("kaiza_shot",Wmod.TabKamenRiderFaiz);
	//  public static final Item KAIZA_SCOPE = new ItemBase("kaiza_pointer",Wmod.TabKamenRiderFaiz);

	//  public static final Item DELTA_PHONE = new ItemBase("delta_phone",Wmod.TabKamenRiderFaiz);
	//	public static final Item DELTA_DRIVER = new ItemBase("delta_driver",Wmod.TabKamenRiderFAIZ);

	//blade
	public static final ArmorMaterial DRIVER_BLADE = EnumHelper.addArmorMaterial("battlefight", Reference.MODID+":blabuckle", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CHANGE_BEETLE = EnumHelper.addArmorMaterial("spade_change", Reference.MODID+":blade", 30, new int[]{0, 0, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial FUSION_EAGLE = EnumHelper.addArmorMaterial("spade_fusion", Reference.MODID+":blade_jack", 30, new int[]{0, 3, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial EVOLUTION_CAUCASUS = EnumHelper.addArmorMaterial("spade_evolution", Reference.MODID+":blade_king", 30, new int[]{0, 13, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial DRIVER_GARREN = EnumHelper.addArmorMaterial("tachibana", Reference.MODID+":garrenbuckle", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CHANGE_STAGBEETLE = EnumHelper.addArmorMaterial("dia_change", Reference.MODID+":garren", 30, new int[]{0, 0, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FUSION_PEACOCK = EnumHelper.addArmorMaterial("dia_fusion", Reference.MODID+":garren_jack", 30, new int[]{0, 3, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial EVOLUTION_GIRAFFA = EnumHelper.addArmorMaterial("dia_evolution", Reference.MODID+":garren_king", 30, new int[]{0, 13, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial DRIVER_CHALICE = EnumHelper.addArmorMaterial("joker_undead", Reference.MODID+":chalice_rouser", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CHANGE_MANTIS = EnumHelper.addArmorMaterial("heart_change", Reference.MODID+":chalice", 30, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial EVOLUTION_PARADOXA = EnumHelper.addArmorMaterial("heart_evolution", Reference.MODID+":chalice_king", 30, new int[]{0, 13, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);

	public static final ArmorMaterial DRIVER_LEANGLE = EnumHelper.addArmorMaterial("spider_undead", Reference.MODID+":leangle_buckle", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CHANGE_SPIDER = EnumHelper.addArmorMaterial("club_change", Reference.MODID+":leangle", 30, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial FUSION_ELEPHANT = EnumHelper.addArmorMaterial("club_fusion", Reference.MODID+":leangle_jack", 30, new int[]{0, 4, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial EVOLUTION_TARANTULA = EnumHelper.addArmorMaterial("club_evolution", Reference.MODID+":leangle_king", 30, new int[]{0, 13, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial ABSORBER = EnumHelper.addArmorMaterial("board_absorber", Reference.MODID+":rouse_absorber", 40, new int[]{2, 0, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ToolMaterial BLADE_SWORD =EnumHelper.addToolMaterial("blade_tool",3, 800, 4.0F, 6.0F,0);

	public static final Item BLABUCKLE_ITEM = new ItemBlabuckle("blabuckle",Wmod.TabKamenRiderBLADE);
	public static final Item BLABUCKLE_BELT = new ArmorBlabuckle("blabuckle_belt",Wmod.TabKamenRiderBLADE,DRIVER_BLADE,EntityEquipmentSlot.LEGS);
	public static final Item BLADE_TURN_UP = new ItemTurnUp("blade_turnup",Wmod.TabKamenRiderBLADE);
	public static final Item BLAROUSER = new ItemBaseSword("blarouser",BLADE_SWORD,Wmod.TabKamenRiderBLADE);

	public static final Item GARRENBUCKLE_ITEM = new ItemBlabuckle("garrenbuckle",Wmod.TabKamenRiderBLADE);
	public static final Item GARRENBUCKLE_BELT = new ArmorGarrenBuckle("garrenbuckle_belt",Wmod.TabKamenRiderBLADE,DRIVER_GARREN,EntityEquipmentSlot.LEGS);
	public static final Item GARRENROUSER = new ItemBaseGun("garrenrouser",Wmod.TabKamenRiderBLADE);

	/*
	public static final Item CARISROUSER = new ItemBase("karisrouser",Wmod.TabKamenRiderBlade);
	public static final Item CARISARROW = new ItemBaseGun("karisarrow",Wmod.TabKamenRiderBlade);

	public static final Item RENGELBUCKLE_ITEM = new ItemBase("rengelbuckle",Wmod.TabKamenRiderBlade);
	public static final Item RENGELBUCKLE_BELT = new ArmorBlabuckle("rengelbuckle_belt",Wmod.TabKamenRiderBlade,DRIVER_BLADE,EntityEquipmentSlot.LEGS);
	public static final Item RENGEL_OPEN_UP = new ItemOpenUp("rengel_openup",Wmod.TabKamenRiderBlade);
	public static final Item RENGELROUSER = new ItemBaseSword("rengelrouser",BLADE_SWORD,Wmod.TabKamenRiderBlade);

	 */
	public static final Item ROUSE_ABSORBER = new ArmorRouseAbsorber("rouse_absorber",Wmod.TabKamenRiderBLADE,ABSORBER, EntityEquipmentSlot.FEET);

	public static final Item SPADE_A = new ArmorBlade("blade_spade_a",Wmod.TabKamenRiderBLADE,CHANGE_BEETLE, EntityEquipmentSlot.HEAD);
	public static final Item SPADE_2 = new ItemBase("blade_spade_2",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_3 = new ItemBase("blade_spade_3",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_4 = new ItemBase("blade_spade_4",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_5 = new ItemBase("blade_spade_5",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_6 = new ItemBase("blade_spade_6",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_7 = new ItemBase("blade_spade_7",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_8 = new ItemBase("blade_spade_8",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_9 = new ItemBase("blade_spade_9",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_10 = new ItemBase("blade_spade_10",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_J = new ItemBase("blade_spade_j",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_Q = new ItemBase("blade_spade_q",Wmod.TabKamenRiderBLADE);
	public static final Item SPADE_K = new ItemBase("blade_spade_k",Wmod.TabKamenRiderBLADE);

	public static final Item DIA_A = new ArmorGarren("blade_dia_a",Wmod.TabKamenRiderBLADE,CHANGE_STAGBEETLE, EntityEquipmentSlot.HEAD);
	public static final Item DIA_2 = new ItemBase("blade_dia_2",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_3 = new ItemBase("blade_dia_3",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_4 = new ItemBase("blade_dia_4",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_5 = new ItemBase("blade_dia_5",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_6 = new ItemBase("blade_dia_6",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_7 = new ItemBase("blade_dia_7",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_8 = new ItemBase("blade_dia_8",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_9 = new ItemBase("blade_dia_9",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_10 = new ItemBase("blade_dia_10",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_J = new ItemBase("blade_dia_j",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_Q = new ItemBase("blade_dia_q",Wmod.TabKamenRiderBLADE);
	public static final Item DIA_K = new ItemBase("blade_dia_k",Wmod.TabKamenRiderBLADE);

	public static final Item HEART_A = new ArmorChalice("blade_heart_a",Wmod.TabKamenRiderBLADE//,CHANGE_MANTIS, EntityEquipmentSlot.HEAD
			);
	public static final Item HEART_2 = new ArmorChaliceSpirit("blade_heart_2",Wmod.TabKamenRiderBLADE//,CHANGE_SPIRIT, EntityEquipmentSlot.HEAD
			);
	public static final Item HEART_3 = new ItemBase("blade_heart_3",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_4 = new ItemBase("blade_heart_4",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_5 = new ItemBase("blade_heart_5",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_6 = new ItemBase("blade_heart_6",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_7 = new ItemBase("blade_heart_7",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_8 = new ItemBase("blade_heart_8",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_9 = new ItemBase("blade_heart_9",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_10 = new ItemBase("blade_heart_10",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_J = new ItemBase("blade_heart_j",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_Q = new ItemBase("blade_heart_q",Wmod.TabKamenRiderBLADE);
	public static final Item HEART_K = new ItemBase("blade_heart_k",Wmod.TabKamenRiderBLADE);
	//	public static final Item ROUSE_WILD = new ItemBase("blade_wild",Wmod.TabKamenRiderBlade);

	public static final Item CLUB_A = new ArmorRengel("blade_club_a",Wmod.TabKamenRiderBLADE//,CHANGE_SPIDER, EntityEquipmentSlot.HEAD
			);
	public static final Item CLUB_2 = new ItemBase("blade_club_2",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_3 = new ItemBase("blade_club_3",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_4 = new ItemBase("blade_club_4",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_5 = new ItemBase("blade_club_5",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_6 = new ItemBase("blade_club_6",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_7 = new ItemBase("blade_club_7",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_8 = new ItemBase("blade_club_8",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_9 = new ItemBase("blade_club_9",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_10 = new ItemBase("blade_club_10",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_J = new ItemBase("blade_club_j",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_Q = new ItemBase("blade_club_q",Wmod.TabKamenRiderBLADE);
	public static final Item CLUB_K = new ItemBase("blade_club_k",Wmod.TabKamenRiderBLADE);

	//	public static final Item JOKER = new ItemBase("blade_joker",Wmod.TabKamenRiderBlade);
	//	public static final Item JOKER_ALBINO = new ItemBase("blade_joker_albino",Wmod.TabKamenRiderBlade);

	//hibiki
	public static final ArmorMaterial BODY_HIBIKI = EnumHelper.addArmorMaterial("ongeki", Reference.MODID+":hibiki_body", 20, new int[]{0, 0, 15, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HEAD_HIBIKI = EnumHelper.addArmorMaterial("kimen", Reference.MODID+":hibiki_head", 20, new int[]{0, 0, 0, 5},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CRIMSON_HIBIKI = EnumHelper.addArmorMaterial("kurenai", Reference.MODID+":hibiki_kurenai", 20, new int[]{0, 0, 0, 13},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_HIBIKI = EnumHelper.addArmorMaterial("armed", Reference.MODID+":hibiki_armed", 20, new int[]{0, 0, 22, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 10.0F);

	public static final ToolMaterial HIBIKI_TOOL =EnumHelper.addToolMaterial("hibiki_tool",3, 800, 8.0F, 2.0F,0);
	public static final ToolMaterial HIBIKI_SABER =EnumHelper.addToolMaterial("hibiki_saber",3, 800, 4.0F, 8.0F,0);

	public static final Item HIBIKI_HEAD = new ArmorHibikiHead("hibiki_head",Wmod.TabKamenRiderHIBIKI,HEAD_HIBIKI,EntityEquipmentSlot.HEAD);
	public static final Item HIBIKI_BODY = new ArmorHibikiBody("hibiki_body",Wmod.TabKamenRiderHIBIKI,BODY_HIBIKI,EntityEquipmentSlot.CHEST);
	public static final Item HIBIKI_HEAD_KURENAI = new ArmorHibikiCrimson("hibiki_head_kurenai",Wmod.TabKamenRiderHIBIKI,CRIMSON_HIBIKI,EntityEquipmentSlot.HEAD);
	public static final Item HIBIKI_ONSAKEN = new ItemOnsaken("hibiki_onsaken",HIBIKI_TOOL,Wmod.TabKamenRiderHIBIKI);
	public static final Item ONGEKIKO_KAEN = new ItemOngekiko("ongekiko_kaen",Wmod.TabKamenRiderHIBIKI);
	public static final Item ARMED_SABER = new ItemArmedSaber("armed_saber",HIBIKI_SABER,Wmod.TabKamenRiderHIBIKI);
	public static final Item ARMED_SABER_OPEN = new ItemArmedSaberOpen("armed_saber_open",Wmod.TabKamenRiderHIBIKI);

	//kabuto
	public static final ArmorMaterial RIDERBELT_KABUTO = EnumHelper.addArmorMaterial("redshoes_kabuto", Reference.MODID+":kabuto_riderbelt", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_KABUTO = EnumHelper.addArmorMaterial("zector_kabuto", Reference.MODID+":kabuto_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MASKED_ARMOR_KABUTO = EnumHelper.addArmorMaterial("ma_kabuto", Reference.MODID+":kabuto_masked", 30, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial RIDERBELT_GATACK = EnumHelper.addArmorMaterial("redshoes_gatack", Reference.MODID+":gatack_riderbelt", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_GATACK = EnumHelper.addArmorMaterial("zector_gatack", Reference.MODID+":gatack_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MASKED_ARMOR_GATACK = EnumHelper.addArmorMaterial("ma_gatack", Reference.MODID+":gatack_masked", 20, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial RIDERBLACE_THEBEE = EnumHelper.addArmorMaterial("thebee", Reference.MODID+":thebee_riderbrace", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_THEBEE = EnumHelper.addArmorMaterial("zector_thebee", Reference.MODID+":thebee_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MASKED_ARMOR_THEBEE = EnumHelper.addArmorMaterial("ma_thebee", Reference.MODID+":thebee_masked", 30, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial ZECTOR_SASWORD = EnumHelper.addArmorMaterial("zector_sasword", Reference.MODID+":sasword_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MASKED_ARMOR_SASWORD = EnumHelper.addArmorMaterial("ma_sasword", Reference.MODID+":sasword_masked", 30, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial ZECTOR_DRAKE = EnumHelper.addArmorMaterial("zector_drake", Reference.MODID+":drake_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MASKED_ARMOR_DRAKE = EnumHelper.addArmorMaterial("ma_drake", Reference.MODID+":drake_masked", 30, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial RIDERBELT_ZECT = EnumHelper.addArmorMaterial("zect", Reference.MODID+":zect_buckle", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_HOPPER_PUNCH = EnumHelper.addArmorMaterial("zector_punchhopper", Reference.MODID+":punchhopper_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_HOPPER_KICK = EnumHelper.addArmorMaterial("zector_kickhopper", Reference.MODID+":kickhopper_rider", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RIDERBELT_DARKKABUTO = EnumHelper.addArmorMaterial("nativeworm", Reference.MODID+":darkkabuto_riderbelt", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZECTOR_DARKKABUTO = EnumHelper.addArmorMaterial("zector_darkkabuto", Reference.MODID+":darkkabuto_rider", 20, new int[]{0, 0, 0, 15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item KABUTO_RIDERBELT = new ArmorKabutoBelt("kabuto_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_KABUTO,EntityEquipmentSlot.LEGS);
	public static final Item KABUTO_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	public static final Item KABUTO_MASKED_ARMOR = new ArmorKabutoMasked("kabuto_masked_armor",Wmod.TabKamenRiderKABUTO,MASKED_ARMOR_KABUTO,EntityEquipmentSlot.CHEST);
	public static final Item KABUTO_CAST_OFF = new ItemCastOff("kabuto_castoff",Wmod.TabKamenRiderKABUTO);
	//	public static final Item HYPER_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	//	public static final Item PERFECT_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	public static final Item GATACK_RIDERBELT = new ArmorGatackBelt("gatack_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_GATACK,EntityEquipmentSlot.LEGS);
	public static final Item GATACK_ZECTOR = new ItemBase("gatack_zector",Wmod.TabKamenRiderKABUTO//,ZECTOR_GATACK,EntityEquipmentSlot.HEAD
			);
	//	public static final Item GATACK_MASKED_ARMOR = new ArmorKabutoMasked("kabuto_masked_armor",Wmod.TabKamenRiderKABUTO,MASKED_ARMOR_KABUTO,EntityEquipmentSlot.CHEST);

	//	public static final Item RIDER_BLECE_THEBEE = new ArmorRiderBeltGatack("thebee_riderblace",Wmod.TabKamenRiderKABUTO,RIDERBELT_GATACK,EntityEquipmentSlot.LEGS);
	//	public static final Item THEBEE_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	//	public static final Item THEBEE_MASKED_ARMOR = new ArmorKabutoMasked("kabuto_masked_armor",Wmod.TabKamenRiderKABUTO,MASKED_ARMOR_KABUTO,EntityEquipmentSlot.CHEST);
	//	public static final Item SASWORD_YAIBA = new ArmorRiderBeltGatack("gatack_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_GATACK,EntityEquipmentSlot.LEGS);
	//	public static final Item SASWORD_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	//	public static final Item SASWORD_MASKED_ARMOR = new ArmorKabutoMasked("kabuto_masked_armor",Wmod.TabKamenRiderKABUTO,MASKED_ARMOR_KABUTO,EntityEquipmentSlot.CHEST);
	//	public static final Item DRAKE_GRIP = new ArmorRiderBeltGatack("gatack_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_GATACK,EntityEquipmentSlot.LEGS);
	//	public static final Item DRAKE_ZECTOR = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	//	public static final Item DRAKE_MASKED_ARMOR = new ArmorKabutoMasked("kabuto_masked_armor",Wmod.TabKamenRiderKABUTO,MASKED_ARMOR_KABUTO,EntityEquipmentSlot.CHEST);
	//	public static final Item ZECT_BUCKLE = new ArmorRiderBeltGatack("gatack_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_GATACK,EntityEquipmentSlot.LEGS);
	//	public static final Item HOPPER_ZECTOR_PUNCH = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	//	public static final Item HOPPER_ZECTOR_KICK = new ArmorKabutoRider("kabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_KABUTO,EntityEquipmentSlot.HEAD);
	public static final Item DARKKABUTO_RIDERBELT= new ArmorDarkKabutoBelt("darkkabuto_riderbelt",Wmod.TabKamenRiderKABUTO,RIDERBELT_DARKKABUTO,EntityEquipmentSlot.LEGS);
	public static final Item DARKKABUTO_ZECTOR = new ArmorDarkKabutoRider("darkkabuto_zector",Wmod.TabKamenRiderKABUTO,ZECTOR_DARKKABUTO,EntityEquipmentSlot.HEAD);

	//den-o
	/*
	public static final ArmorMaterial DENO_BELT = EnumHelper.addArmorMaterial("time_train", Reference.MODID+":deno_belt", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_MOMO= EnumHelper.addArmorMaterial("imagine_momo", Reference.MODID+":deno_sword", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_URA= EnumHelper.addArmorMaterial("imagine_ura", Reference.MODID+":deno_lod", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_KIN= EnumHelper.addArmorMaterial("imagine_kin", Reference.MODID+":deno_ax", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_RYU= EnumHelper.addArmorMaterial("imagine_ryu", Reference.MODID+":deno_gun", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_ZEIG= EnumHelper.addArmorMaterial("imagine_zeig", Reference.MODID+":deno_wing", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_NEGA= EnumHelper.addArmorMaterial("imagine_nega", Reference.MODID+":deno_nega", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_DENEB= EnumHelper.addArmorMaterial("imagine_deneb", Reference.MODID+":deno_vega", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_KEITAROS= EnumHelper.addArmorMaterial("imagine_keitaros", Reference.MODID+":deno_keitaros", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_CLIMAX= EnumHelper.addArmorMaterial("imagine_climax", Reference.MODID+":deno_climax", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial IMAGINE_LINER= EnumHelper.addArmorMaterial("imagine_liner", Reference.MODID+":deno_liner", 20, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item DENO_BELT = new ItemBase("denobelt",Wmod.TabKamenRiderDENO);
	public static final Item RIDER_PASS = new ItemBase("rider_pass",Wmod.TabKamenRiderDENO);
	public static final Item DENKAMEN_SWORD = new ArmorDenKamenSword("denkamen_sword",Wmod.TabKamenRiderDENO, IMAGINE_MOMO,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_ROD = new ArmorDenKamenRod("denkamen_rod",Wmod.TabKamenRiderDENO, IMAGINE_URA,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_AX = new ArmorDenKamenAx("denkamen_ax",Wmod.TabKamenRiderDENO, IMAGINE_KIN,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_GUN = new ArmorDenKamenGun("denkamen_gun",Wmod.TabKamenRiderDENO, IMAGINE_RYU,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_WING = new ArmorDenKamenWing("denkamen_wing",Wmod.TabKamenRiderDENO, IMAGINE_ZEIG,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_NEGA = new ArmorDenKamenNega("denkamen_nega",Wmod.TabKamenRiderDENO, IMAGINE_NEGA,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_VEGA = new ArmorDenKamenVega("denkamen_vegar",Wmod.TabKamenRiderDENO, IMAGINE_DENEB,EntityEquipmentSlot.HEAD);
	public static final Item KEITAROS = new ArmorKeitaros("deno_keitaros",Wmod.TabKamenRiderDENO, IMAGINE_KEITAROS,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_CLIMAX = new ArmorDenKamenClimax("denkamen_climax",Wmod.TabKamenRiderDENO, IMAGINE_CLIMAX,EntityEquipmentSlot.HEAD);
	public static final Item DENKAMEN_LINER = new ArmorDenKamenLiner("denkamen_liner",Wmod.TabKamenRiderDENO, IMAGINE_LINER,EntityEquipmentSlot.HEAD);

	 */
	//kiva
	//  public static final Item KIBUCKLE = new ItemBase("kibuckle",Wmod.TabKamenRiderKIVA);
	//  public static final Item KIVATBAT_3rd = new ItemBase("kivatbat_3rd",Wmod.TabKamenRiderKIVA);
	//  public static final Item FUESSLE_WAKEUP = new ItemBase("fuessle_wakeup",Wmod.TabKamenRiderKIVA);
	//  public static final Item FUESSLE_GARURU = new ItemBase("fuessle_garuru",Wmod.TabKamenRiderKIVA);
	//  public static final Item FUESSLE_BASSHAH = new ItemBase("fuessle_basshah",Wmod.TabKamenRiderKIVA);
	//  public static final Item FUESSLE_DOGGA = new ItemBase("fuessle_dogga",Wmod.TabKamenRiderKIVA);
	//  public static final Item FUESSLE_DOGABAKI = new ItemBase("fuessle_dogabaki",Wmod.TabKamenRiderKIVA);
	//  public static final Item GARURU_SABER = new ItemBase("garuru_saber",Wmod.TabKamenRiderKIVA);
	//  public static final Item BASHAH_MAGNUM = new ItemBase("bashah_magnum",Wmod.TabKamenRiderKIVA);
	//  public static final Item DOGGA_HAMMER = new ItemBase("dogga_hammer",Wmod.TabKamenRiderKIVA);
	//  public static final Item TATSUROT = new ItemBase("tatsurot",Wmod.TabKamenRiderKIVA);
	//  public static final Item ZANBAT_SWORD = new ItemBase("zanbat_sword",Wmod.TabKamenRiderKIVA);

	//  public static final Item KIVATBAT_2nd = new ItemBase("kivatbat_2nd",Wmod.TabKamenRiderKIVA);
	//  public static final Item KIVATBAT_4th = new ItemBase("kivatbat_4th",Wmod.TabKamenRiderKIVA);

	//  public static final Item IXA_BELT = new ItemBase("ixa_belt",Wmod.TabKamenRiderKIVA);
	//  public static final Item IXA_KNUCKLE = new ItemBase("ixa_knuckle",Wmod.TabKamenRiderKIVA);
	//  public static final Item IXA_CALIBAR = new ItemBase("ixa_calibar",Wmod.TabKamenRiderKIVA);
	//  public static final Item IXA_RISER = new ItemBase("ixa_riser",Wmod.TabKamenRiderKIVA);

	//decade
	public static final ArmorMaterial DRIVER_DECADE = EnumHelper.addArmorMaterial("kamenride", Reference.MODID+":decadriver", 40, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_KUUGA = EnumHelper.addArmorMaterial("kamenride_kuuga", Reference.MODID+":kamenride_kuuga", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_AGITO = EnumHelper.addArmorMaterial("kamenride_agito", Reference.MODID+":kamenride_agito", 40, new int[]{0, 0, 0, 19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_RYUKI = EnumHelper.addArmorMaterial("kamenride_ryuki", Reference.MODID+":kamenride_ryuki", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_FAIZ = EnumHelper.addArmorMaterial("kamenride_faiz", Reference.MODID+":kamenride_faiz", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_BLADE = EnumHelper.addArmorMaterial("kamenride_blade", Reference.MODID+":kamenride_blade", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial KR_HIBIKI = EnumHelper.addArmorMaterial("kamenride_hibiki", Reference.MODID+":kamenride_hibiki", 40, new int[]{0, 0, 0,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_KABUTO = EnumHelper.addArmorMaterial("kamenride_kabuto", Reference.MODID+":kamenride_kabuto", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DENO = EnumHelper.addArmorMaterial("kamenride_deno", Reference.MODID+":kamenride_deno", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_KIVA = EnumHelper.addArmorMaterial("kamenride_kiva", Reference.MODID+":kamenride_kiva", 40, new int[]{0, 0, 0 ,19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DECADE = EnumHelper.addArmorMaterial("kamenride_decade", Reference.MODID+":kamenride_decade", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DECADE_RAGE = EnumHelper.addArmorMaterial("kamenride_decade_rage", Reference.MODID+":kamenride_decade_rage", 40, new int[]{0, 0, 0 ,32},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 23.0F);
	public static final ArmorMaterial DRIVER_DECADE_NEO = EnumHelper.addArmorMaterial("kamenride2", Reference.MODID+":decadriver_neo", 40, new int[]{0, 12, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_W = EnumHelper.addArmorMaterial("kamenride_w", Reference.MODID+":kamenride_w", 40, new int[]{0, 0, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_OOO = EnumHelper.addArmorMaterial("kamenride_ooo", Reference.MODID+":kamenride_ooo", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial KR_FOURZE = EnumHelper.addArmorMaterial("kamenride_fourze", Reference.MODID+":kamenride_fourze", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_WIZARD = EnumHelper.addArmorMaterial("kamenride_wizard", Reference.MODID+":kamenride_wizard", 40, new int[]{0, 0, 0 ,21},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_GAIM = EnumHelper.addArmorMaterial("kamenride_gaim", Reference.MODID+":kamenride_gaim", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DRIVE = EnumHelper.addArmorMaterial("kamenride_drive", Reference.MODID+":kamenride_drive", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial KR_GHOST = EnumHelper.addArmorMaterial("kamenride_ghost", Reference.MODID+":kamenride_ghost", 40, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial KR_EXAID = EnumHelper.addArmorMaterial("kamenride_exaid", Reference.MODID+":kamenride_exaid", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_BUILD = EnumHelper.addArmorMaterial("kamenride_build", Reference.MODID+":kamenride_build", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial KR_ZIO = EnumHelper.addArmorMaterial("kamenride_zio", Reference.MODID+":kamenride_zio", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);

	public static final ArmorMaterial DRIVER_DIEND = EnumHelper.addArmorMaterial("kamenride_", Reference.MODID+":diendriver", 40, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_DIEND_NEO = EnumHelper.addArmorMaterial("kamenride_2", Reference.MODID+":diendriver", 40, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DIEND = EnumHelper.addArmorMaterial("kamenride_diend", Reference.MODID+":kamenride_diend", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KR_DIEND_POWERUP = EnumHelper.addArmorMaterial("kamenride_diend_powerup", Reference.MODID+":kamenride_diend_powerup", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item DECADRIVER = new ArmorDecadriver("decadriver",Wmod.TabKamenRiderDECADE,DRIVER_DECADE,EntityEquipmentSlot.LEGS);
	public static final Item DECADRIVER_NEO = new ArmorDecadriverNeo("decadriver_neo",Wmod.TabKamenRiderDECADE,DRIVER_DECADE_NEO,EntityEquipmentSlot.LEGS);
	//	public static final Item K_TOUCH = new ArmorDecadriver("k_touch",Wmod.TabKamenRiderDECADE,DRIVER_DECADE,EntityEquipmentSlot.CHEST);
	//	public static final Item K_TOUCH21 = new ArmorDecadriver("k_touch21",Wmod.TabKamenRiderDECADE,DRIVER_DECADE,EntityEquipmentSlot.CHEST);

	public static final Item AttackRideHENSHIN = new ItemHenshinTrigger("attackride_henshin",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideKUUGA = new ArmorKRKuuga("kamenride_kuuga",Wmod.TabKamenRiderDECADE,KR_KUUGA,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideAGITO =new ArmorKRAgito("kamenride_agito",Wmod.TabKamenRiderDECADE,KR_AGITO,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideRYUKI = new ArmorKRRyuki("kamenride_ryuki",Wmod.TabKamenRiderDECADE,KR_RYUKI,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideFAIZ =new ItemBase("kamenride_faiz",Wmod.TabKamenRiderDECADE);	// new ArmorFaiz("kamenride_faiz",Wmod.TabKamenRiderDecade,KR_BUILD,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideBLADE = new ArmorKRBlade("kamenride_blade",Wmod.TabKamenRiderDECADE,KR_BLADE,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideHIBIKI =  new ArmorKRHibiki("kamenride_hibiki",Wmod.TabKamenRiderDECADE,KR_HIBIKI,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideKABUTO = new ArmorKRKabuto("kamenride_kabuto",Wmod.TabKamenRiderDECADE,KR_KABUTO,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideDENO =new ItemBase("kamenride_deno",Wmod.TabKamenRiderDECADE);// new ArmorDeno("kamenride_build",Wmod.TabKamenRiderDecade,KR_BUILD,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideKIVA =new ItemBase("kamenride_kiva",Wmod.TabKamenRiderDECADE);// new ArmorKiva("kamenride_w",Wmod.TabKamenRiderW,KR_W,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideDECADE = new ArmorKRDecade("kamenride_decade",Wmod.TabKamenRiderDECADE,KR_DECADE,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideW = new ArmorKRW("kamenride_w",Wmod.TabKamenRiderDECADE,KR_W,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideOOO = new ArmorKROOO("kamenride_ooo",Wmod.TabKamenRiderDECADE,KR_OOO,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideFOURZE =new ArmorKRFourze("kamenride_fourze",Wmod.TabKamenRiderDECADE,KR_FOURZE,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideWIZARD =  new ArmorKRWizard("kamenride_wizard",Wmod.TabKamenRiderDECADE,KR_WIZARD,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideGAIM =new ArmorKRGaim("kamenride_gaim",Wmod.TabKamenRiderDECADE,KR_GAIM,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideDRIVE =new ArmorKRDrive("kamenride_drive",Wmod.TabKamenRiderDECADE,KR_DRIVE,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideGHOST = new ArmorKRGhost("kamenride_ghost",Wmod.TabKamenRiderDECADE,KR_GHOST,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideEXAID =new ArmorKRExaid("kamenride_exaid",Wmod.TabKamenRiderDECADE,KR_EXAID,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideBUILD =new ArmorKRBuild("kamenride_build",Wmod.TabKamenRiderDECADE,KR_BUILD,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideZIO =new ItemBase("kamenride_zio",Wmod.TabKamenRiderDECADE);// new ArmorZio("kamenride_exaid",Wmod.TabKamenRiderDecade,KR_EXAID,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideDECADERage = new ArmorKRDecadeRage("kamenride_decade_rage",Wmod.TabKamenRiderDECADE,KR_DECADE_RAGE,EntityEquipmentSlot.HEAD);

	/*
	public static final Item DIENDRIVER = new ArmorDiendriver("decadriver",Wmod.TabKamenRiderDECADE,DRIVER_DECADE,EntityEquipmentSlot.LEGS);
	public static final Item DIENDRIVER_NEO = new ArmorDiendriverNeo("decadriver_neo",Wmod.TabKamenRiderDECADE,DRIVER_DECADE_NEO,EntityEquipmentSlot.LEGS);
	public static final Item DIEND_BUCKLE = new ArmorDiendriver("decadriver",Wmod.TabKamenRiderDECADE,DRIVER_DECADE,EntityEquipmentSlot.LEGS);
	public static final Item DIEND_BUCKLE_NEO = new ArmorDiendriverNeo("decadriver_neo",Wmod.TabKamenRiderDECADE,DRIVER_DECADE_NEO,EntityEquipmentSlot.LEGS);

	public static final Item KamenRideDIEND = new ArmorKRDiende("kamenride_diend",Wmod.TabKamenRiderDECADE,KR_DIEND,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideG3 =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideKNIGHT  =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideKAIZA =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideGARREN =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideIBUKI =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideGATACK =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideZERONOS =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideIXA =new ItemBase("kamenride_agito",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideDIEND_POWERUP = new ArmorKRDiendPU("kamenride_diend_pu",Wmod.TabKamenRiderDECADE,KR_DIEND_POWERUP ,EntityEquipmentSlot.HEAD);
	public static final Item KamenRideACCEL =new ItemBase("kamenride_accel",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideBIRTH  =new ItemBase("kamenride_birth",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideMETEOR =new ItemBase("kamenride_meteor",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideBEAST =new ItemBase("kamenride_beast",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideBARON  =new ItemBase("kamenride_baron",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideMACH =new ItemBase("kamenride_mach",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideSPECTOR =new ItemBase("kamenride_spector",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideBRAVE  =new ItemBase("kamenride_brave",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideCROSSZ =new ItemBase("kamenride_crossz",Wmod.TabKamenRiderDECADE);
	public static final Item KamenRideGEIZ =new ItemBase("kamenride_geiz",Wmod.TabKamenRiderDECADE);
	 */

	//W
	public static final ArmorMaterial DRIVER_W = EnumHelper.addArmorMaterial("gaiamemory", Reference.MODID+":double_driver", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial WCyclone = EnumHelper.addArmorMaterial("cyclone", Reference.MODID+":w_cyclone", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial WJoker = EnumHelper.addArmorMaterial("joker", Reference.MODID+":w_joker", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial WHeat = EnumHelper.addArmorMaterial("heat", Reference.MODID+":w_heat", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial WMetal = EnumHelper.addArmorMaterial("metal", Reference.MODID+":w_metal", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial WLuna = EnumHelper.addArmorMaterial("luna", Reference.MODID+":w_luna", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial WTrigger = EnumHelper.addArmorMaterial("trigger", Reference.MODID+":w_trigger", 30, new int[]{9, 0, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial WFang = EnumHelper.addArmorMaterial("fang", Reference.MODID+":w_fang", 30, new int[]{0, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial WXtreme = EnumHelper.addArmorMaterial("xtreme", Reference.MODID+":w_xtreme", 30, new int[]{0, 0, 14, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);

	public static final ArmorMaterial DRIVER_Lost = EnumHelper.addArmorMaterial("lostmemory", Reference.MODID+":lost_driver", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial WHat = EnumHelper.addArmorMaterial("hat", Reference.MODID+":w_hat", 15, new int[]{1, 2, 3, 1},0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

	public static final ToolMaterial W_METALSHAFT =EnumHelper.addToolMaterial("w_tool",3, 800, 8.0F, 1.0F,0);
	public static final ToolMaterial W_METALSHAFT_M =EnumHelper.addToolMaterial("w_tool2",3, 800, 12.0F, 1.0F,0);

	public static final Item DOUBLE_DRIVER = new ArmorWDriver("double_driver",Wmod.TabKamenRiderW,DRIVER_W,EntityEquipmentSlot.LEGS);
	public static final Item LOST_DRIVER = new ArmorLostDriver("lost_driver",Wmod.TabKamenRiderW,DRIVER_Lost,EntityEquipmentSlot.LEGS);
	// 	public static final Item ACCEL_DRIVER = new ItemBase("accel_driver",Wmod.TabKamenRiderW);

	public static final Item MEMORY_CYCLONE = new ArmorWCyclone("memory_cyclone",Wmod.TabKamenRiderW,WCyclone,EntityEquipmentSlot.FEET);
	public static final Item MEMORY_HEAT = new ArmorWHeat("memory_heat",Wmod.TabKamenRiderW,WHeat,EntityEquipmentSlot.FEET);
	public static final Item MEMORY_LUNA = new ArmorWLuna("memory_luna",Wmod.TabKamenRiderW,WLuna,EntityEquipmentSlot.FEET);
	public static final Item MEMORY_JOKER = new ArmorWJoker("memory_joker",Wmod.TabKamenRiderW,WJoker,EntityEquipmentSlot.HEAD);
	public static final Item MEMORY_METAL = new ArmorWMetal("memory_metal",Wmod.TabKamenRiderW,WMetal,EntityEquipmentSlot.HEAD);
	public static final Item MEMORY_TRIGGER = new ArmorWTrigger("memory_trigger",Wmod.TabKamenRiderW,WTrigger,EntityEquipmentSlot.HEAD);
	public static final Item MEMORY_FANG = new ItemBase("memory_fang",Wmod.TabKamenRiderW);
	public static final Item MEMORY_XTREME = new ItemBase("memory_xtreme",Wmod.TabKamenRiderW);
	public static final Item MEMORY_PRIZM = new ItemBase("memory_prizm",Wmod.TabKamenRiderW);
	public static final Item MEMORY_SCULL = new ItemBase("memory_scull",Wmod.TabKamenRiderW);
	public static final Item MEMORY_ETERNAL = new ItemBase("memory_eternal_t2",Wmod.TabKamenRiderW);
	public static final Item MEMORY_ETERNAL_T1 = new ItemBase("memory_eternal_t1",Wmod.TabKamenRiderW);
	public static final Item MEMORY_ACCEL = new ItemBase("memory_accel",Wmod.TabKamenRiderW);
	//	public static final Item MEMORY_ENGINE = new ItemBase("memory_engine",Wmod.TabKamenRiderW);
	//	public static final Item MEMORY_TRIAL = new ItemBase("memory_trial",Wmod.TabKamenRiderW);
	public static final Item METAL_SHAFT = new ItemBaseRod("metal_shaft",Wmod.TabKamenRiderW, 8, 1,W_METALSHAFT );
	public static final Item METAL_SHAFT_M = new ItemBaseRod("metal_shaft_maximum",Wmod.TabKamenRiderW, 12, 1,W_METALSHAFT );
	public static final Item TRIGGER_MAGNUM = new ItemTriggerMagnum("trigger_magnum",Wmod.TabKamenRiderW);
	public static final Item TRIGGER_MAGNUM_M = new ItemTriggerMaximum("trigger_magnum_maximum",Wmod.TabKamenRiderW);
	//	public static final Item PRIZM_BICKER = new ItemBase("prizm",Wmod.TabKamenRiderW);
	//public static final Item PRIZM_SWORD = new ItemBase("prizm",Wmod.TabKamenRiderW);
	//public static final Item BICKER_SHEILD = new ItemBase("prizm",Wmod.TabKamenRiderW);
	public static final Item SCULL_MAGNUM = new ItemTriggerMagnum("scull_magnum",Wmod.TabKamenRiderW);
	//	public static final Item ETERNAL_EDGE = new ItemBase("prizm",Wmod.TabKamenRiderW);
	//	public static final Item ENGINE_BLADE = new ItemBase("memory_trial",Wmod.TabKamenRiderW);
	public static final Item BlackHat = new ArmorBlackHat("hat",Wmod.TabKamenRiderW,WHat,EntityEquipmentSlot.HEAD);

	//OOO
	public static final ArmorMaterial DRIVER_OOO = EnumHelper.addArmorMaterial("coremedal", Reference.MODID+":ooo_driver", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial OOO_Taka = EnumHelper.addArmorMaterial("takamedal", Reference.MODID+":ooo_taka", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Kujaku = EnumHelper.addArmorMaterial("kujakumedal", Reference.MODID+":ooo_kujaku", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Condle = EnumHelper.addArmorMaterial("condlemedal", Reference.MODID+":ooo_condle", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Lion = EnumHelper.addArmorMaterial("lionmedal", Reference.MODID+":ooo_lion", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Tora = EnumHelper.addArmorMaterial("toramedal", Reference.MODID+":ooo_tora", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Cheetah = EnumHelper.addArmorMaterial("cheetahmedal", Reference.MODID+":ooo_cheetah", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Kuwa = EnumHelper.addArmorMaterial("kuwamedal", Reference.MODID+":ooo_kuwa", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Kama = EnumHelper.addArmorMaterial("kamamedal", Reference.MODID+":ooo_kama", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Batta = EnumHelper.addArmorMaterial("battamedal", Reference.MODID+":ooo_batta", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Sai = EnumHelper.addArmorMaterial("saimedal", Reference.MODID+":ooo_sai", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Gorilla = EnumHelper.addArmorMaterial("gorillamedal", Reference.MODID+":ooo_gorilla", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Zou = EnumHelper.addArmorMaterial("zoumedal", Reference.MODID+":ooo_zou", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Shachi = EnumHelper.addArmorMaterial("shachimedal", Reference.MODID+":ooo_shachi", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Unagi = EnumHelper.addArmorMaterial("unagimedal", Reference.MODID+":ooo_unagi", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Tako = EnumHelper.addArmorMaterial("takomedal", Reference.MODID+":ooo_tako", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Putera = EnumHelper.addArmorMaterial("puteramedal", Reference.MODID+":ooo_putera", 30, new int[]{10, 2, 10, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial OOO_Tricera = EnumHelper.addArmorMaterial("triceramedal", Reference.MODID+":ooo_tricera", 30, new int[]{10, 2, 10, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial OOO_Tyrano = EnumHelper.addArmorMaterial("tyranomedal", Reference.MODID+":ooo_tyrano", 30, new int[]{10, 2, 10, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial OOO_Cobra = EnumHelper.addArmorMaterial("cobramedal", Reference.MODID+":ooo_cobra", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Kame = EnumHelper.addArmorMaterial("kammemedal", Reference.MODID+":ooo_kame", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_Wani = EnumHelper.addArmorMaterial("wanimedal", Reference.MODID+":ooo_wani", 30, new int[]{6, 2, 6, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial OOO_SuperTaka = EnumHelper.addArmorMaterial("supertakamedal", Reference.MODID+":ooo_supertaka", 30, new int[]{12, 2, 12, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial OOO_SuperTora = EnumHelper.addArmorMaterial("supertoramedal", Reference.MODID+":ooo_supertora", 30, new int[]{12, 2, 12, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial OOO_SuperBatta = EnumHelper.addArmorMaterial("superbattamedal", Reference.MODID+":ooo_superbatta", 30, new int[]{12, 2, 12, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);

	public static final ToolMaterial OOO_SWORD =EnumHelper.addToolMaterial("ooo_tool",3, 800, 0F, 4.0F,0);

	public static final Item OOO_DRIVER = new ArmorOOODriver("ooo_driver",Wmod.TabKamenRiderOOO,DRIVER_OOO,EntityEquipmentSlot.LEGS);
	public static final Item O_SCANNER = new ItemOScanner("o_scanner",Wmod.TabKamenRiderOOO);
	public static final Item OOO_DRIVER2 = new ArmorOOODriver2("ooo_driver2",Wmod.TabKamenRiderOOO,DRIVER_OOO,EntityEquipmentSlot.LEGS);
	public static final Item MEDAJARIBAR = new ItemMedajaribar("medajaribar",OOO_SWORD,Wmod.TabKamenRiderOOO);
	//	public static final Item TAJASPINNER = new ItemBase("tajaspinner",Wmod.TabKamenRiderOOO);
	//	public static final Item MEDAGABURYU = new ItemBase("medagaburyu",Wmod.TabKamenRiderOOO);
	public static final Item BIRTH_DRIVER = new ItemBase("birth_driver",Wmod.TabKamenRiderOOO);
	public static final Item BIRTH_BUSTER = new ItemBaseGunWithAmmo("birth_buster",Wmod.TabKamenRiderOOO);
	//	public static final Item BIRTHX_UNIT = new ItemBase("birthx_unit",Wmod.TabKamenRiderOOO);

	public static final Item TAKA_CORE =  new ArmorOOOTaka("medal_taka",Wmod.TabKamenRiderOOO,OOO_Taka,EntityEquipmentSlot.HEAD);
	public static final Item KUJAKU_CORE = new ItemBase("medal_kujaku",Wmod.TabKamenRiderOOO);
	public static final Item CONDLE_CORE = new ItemBase("medal_condle",Wmod.TabKamenRiderOOO);
	public static final Item KUWA_CORE = new ArmorOOOKuwagata("medal_kuwa",Wmod.TabKamenRiderOOO,OOO_Kuwa,EntityEquipmentSlot.HEAD);
	public static final Item KAMA_CORE = new ArmorOOOKamakiri("medal_kama",Wmod.TabKamenRiderOOO,OOO_Kama,EntityEquipmentSlot.CHEST);
	public static final Item BATTA_CORE =  new ArmorOOOBatta("medal_batta",Wmod.TabKamenRiderOOO,OOO_Batta,EntityEquipmentSlot.FEET);
	public static final Item LION_CORE = new ItemBase("medal_lion",Wmod.TabKamenRiderOOO);
	public static final Item TORA_CORE =  new ArmorOOOTora("medal_tora",Wmod.TabKamenRiderOOO,OOO_Tora,EntityEquipmentSlot.CHEST);
	public static final Item CHEETAH_CORE = new ItemBase("medal_cheetah",Wmod.TabKamenRiderOOO);
	public static final Item SAI_CORE = new ItemBase("medal_sai",Wmod.TabKamenRiderOOO);
	public static final Item GORILLA_CORE = new ItemBase("medal_gorilla",Wmod.TabKamenRiderOOO);
	public static final Item ZOU_CORE = new ItemBase("medal_zou",Wmod.TabKamenRiderOOO);
	public static final Item SHACHI_CORE = new ItemBase("medal_shachi",Wmod.TabKamenRiderOOO);
	public static final Item UNAGI_CORE = new ItemBase("medal_unagi",Wmod.TabKamenRiderOOO);
	public static final Item TAKO_CORE = new ItemBase("medal_tako",Wmod.TabKamenRiderOOO);
	public static final Item PUTERA_CORE = new ItemBase("medal_putera",Wmod.TabKamenRiderOOO);
	public static final Item TRICERA_CORE = new ItemBase("medal_tricera",Wmod.TabKamenRiderOOO);
	public static final Item TYRANO_CORE = new ItemBase("medal_tyrano",Wmod.TabKamenRiderOOO);
	//	public static final Item COBRA_CORE = new ItemBase("medal_cobra",Wmod.TabKamenRiderOOO);
	//	public static final Item KAME_CORE = new ItemBase("medal_kame",Wmod.TabKamenRiderOOO);
	//	public static final Item WANI_CORE = new ItemBase("medal_wani",Wmod.TabKamenRiderOOO);
	public static final Item TAKA_CORE_SUPER = new ItemBase("medal_taka_s",Wmod.TabKamenRiderOOO);
	public static final Item TORA_CORE_SUPER = new ItemBase("medal_tora_s",Wmod.TabKamenRiderOOO);
	public static final Item BATTA_CORE_SUPER = new ItemBase("medal_batta_s",Wmod.TabKamenRiderOOO);
	//	public static final Item SAME_CORE = new ItemBase("medal_same",Wmod.TabKamenRiderOOO);
	//	public static final Item KUJIRA_CORE = new ItemBase("medal_kujira",Wmod.TabKamenRiderOOO);
	//	public static final Item OOKAMIUO_CORE = new ItemBase("medal_ookamiuo",Wmod.TabKamenRiderOOO);
	//	public static final Item EBI_CORE = new ItemBase("medal_ebi",Wmod.TabKamenRiderOOO);
	//	public static final Item KANI_CORE = new ItemBase("medal_kani",Wmod.TabKamenRiderOOO);
	//	public static final Item SASORI_CORE = new ItemBase("medal_sasori",Wmod.TabKamenRiderOOO);
	public static final Item TAKA_CORE_ETERNITY =  new ItemBase("medal_taka_et",Wmod.TabKamenRiderOOO);
	public static final Item KUJAKU_CORE_ETERNITY = new ItemBase("medal_kujaku_et",Wmod.TabKamenRiderOOO);
	public static final Item CONDLE_CORE_ETERNITY = new ItemBase("medal_condle_et",Wmod.TabKamenRiderOOO);

	public static final Item CELL_MEDAL = new ItemBase2("medal_cell",Wmod.TabKamenRiderOOO);

	public static final Item GORIRRA_CORE = new ItemGorirraSalvagion("medal_gorrira",Wmod.TabKamenRiderOOO);

	//FOURZE
	public static final ArmorMaterial DRIVER_FOURZE = EnumHelper.addArmorMaterial("cosmicenergy", Reference.MODID+":fourze_driver", 50, new int[]{2, 2, 2 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STATES_BASE = EnumHelper.addArmorMaterial("states_base", Reference.MODID+":fourze_base", 40, new int[]{2, 2, 2 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STATES_ELCK = EnumHelper.addArmorMaterial("states_elec", Reference.MODID+":fourze_elec", 40, new int[]{2, 2, 2 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STATES_FIRE = EnumHelper.addArmorMaterial("states_fire", Reference.MODID+":fourze_fire", 40, new int[]{2, 2, 2 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STATES_MAGNET = EnumHelper.addArmorMaterial("states_magnet", Reference.MODID+":fourze_magnet", 40, new int[]{11, 2, 2 ,11},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial STATES_COSMIC = EnumHelper.addArmorMaterial("states_cosmic", Reference.MODID+":fourze_cosmic", 40, new int[]{2, 2, 2 ,24},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);

	public static final Item FOURZE_DRIVER = new ArmorFourzeDriver("fourze_driver",Wmod.TabKamenRiderFOURZE,DRIVER_FOURZE,EntityEquipmentSlot.LEGS);
	public static final Item FOURZE_LEVER= new ItemFourzeHenshin("fourze_henshin",Wmod.TabKamenRiderFOURZE);
	public static final Item FOURZE_BASE= new ArmorFourzeBase("fourze_base",Wmod.TabKamenRiderFOURZE,STATES_BASE,EntityEquipmentSlot.HEAD);

	//  public static final Item AS_01= new ItemBase("as_rocket",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_02= new ItemBase("as_launcher",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_03= new ItemBase("as_drill",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_04= new ItemBase("as_lader",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_05= new ItemBase("as_magichand",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_06= new ItemBase("as_camerar",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_07= new ItemBase("as_parashoot",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_08= new ItemBase("as_chainsaw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_09= new ItemBase("as_hopping",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_10= new ItemBase("as_elec",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_11= new ItemBase("as_scissors",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_12= new ItemBase("as_beat",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_13= new ItemBase("as_chainarray",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_14= new ItemBase("as_smoke",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_15= new ItemBase("as_spike",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_16= new ItemBase("as_winch",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_17= new ItemBase("as_flash",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_18= new ItemBase("as_shield",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_19= new ItemBase("as_gatling",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_20= new ItemBase("as_fire",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_21= new ItemBase("as_stealth",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_22= new ItemBase("as_hammer",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_23= new ItemBase("as_water",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_24= new ItemBase("as_medical",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_25= new ItemBase("as_pen",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_26= new ItemBase("as_wheel",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_27= new ItemBase("as_screw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_28= new ItemBase("as_hand",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_29= new ItemBase("as_scop",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_30= new ItemBase("as_n_magnet",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_31= new ItemBase("as_s_magnet",Wmod.TabKamenRiderFOURZE);
	//  public static final Item NS_MAGPHONE= new ItemBase("ns_magphone",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_32= new ItemBase("as_freeze",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_33= new ItemBase("as_claw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_34= new ItemBase("as_board",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_35= new ItemBase("as_giantfoot",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_36= new ItemBase("as_aero",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_37= new ItemBase("as_gyro",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_38= new ItemBase("as_net",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_39= new ItemBase("as_stamper",Wmod.TabKamenRiderFOURZE);
	//  public static final Item AS_40= new ItemBase("as_cozmic",Wmod.TabKamenRiderFOURZE);

	//  public static final Item MOJULE_01= new ItemBase("mojule_rocket",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_02= new ItemBase("mojule_launcher",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_03= new ItemBase("mojule_drill",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_04= new ItemBase("mojule_lader",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_05= new ItemBase("mojule_magichand",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_06= new ItemBase("mojule_camera",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_07= new ItemBase("mojule_parashoot",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_08= new ItemBase("mojule_chainsaw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_09= new ItemBase("mojule_hopping",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_10= new ItemBase("mojule_elec",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_11= new ItemBase("mojule_scissors",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_12= new ItemBase("mojule_beat",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_13= new ItemBase("mojule_chainarray",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_14= new ItemBase("mojule_smoke",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_15= new ItemBase("mojule_spike",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_16= new ItemBase("mojule_winch",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_17= new ItemBase("mojule_flash",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_18= new ItemBase("mojule_shield",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_19= new ItemBase("mojule_gatling",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_20= new ItemBase("mojule_fire",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_21= new ItemBase("mojule_stealth",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_22= new ItemBase("mojule_hammer",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_23= new ItemBase("mojule_water",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_24= new ItemBase("mojule_medical",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_25= new ItemBase("mojule_pen",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_26= new ItemBase("mojule_wheel",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_27= new ItemBase("mojule_screw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_28= new ItemBase("mojule_hand",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_29= new ItemBase("mojule_scop",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_30= new ItemBase("mojule_n_magnet",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_31= new ItemBase("mojule_s_magnet",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_32= new ItemBase("mojule_freeze",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_33= new ItemBase("mojule_claw",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_34= new ItemBase("mojule_board",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_35= new ItemBase("mojule_giantfoot",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_36= new ItemBase("mojule_aero",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_37= new ItemBase("mojule_gyro",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_38= new ItemBase("mojule_net",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_39= new ItemBase("mojule_stamper",Wmod.TabKamenRiderFOURZE);
	//  public static final Item MOJULE_40= new ItemBase("mojule_cozmic",Wmod.TabKamenRiderFOURZE);

	//WIZARD
	public static final ArmorMaterial DRIVER_WIZARD = EnumHelper.addArmorMaterial("wiseman", Reference.MODID+":wizardriver", 50, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_FLAME = EnumHelper.addArmorMaterial("style_flame", Reference.MODID+":wizard_flame", 40, new int[]{0, 2, 0 ,19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_WATER = EnumHelper.addArmorMaterial("style_water", Reference.MODID+":wizard_water", 40, new int[]{0, 2, 0, 19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_HURRICANE = EnumHelper.addArmorMaterial("style_hurricane", Reference.MODID+":wizard_hurricane", 40, new int[]{0, 2, 0, 19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_LAND = EnumHelper.addArmorMaterial("style_land", Reference.MODID+":wizard_land", 40, new int[]{0, 2, 0, 19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial STYLE_FLAME_DRAGON = EnumHelper.addArmorMaterial("style_flame_dragon", Reference.MODID+":wizard_flame_dragon", 40, new int[]{0, 2, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_WATER_DRAGON = EnumHelper.addArmorMaterial("style_water_dragon", Reference.MODID+":wizard_water_dragon", 40, new int[]{0, 2, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_HURRICANE_DRAGON = EnumHelper.addArmorMaterial("style_hurricane_dragon", Reference.MODID+":wizard_hurricane_dragon", 40, new int[]{0, 2, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_LAND_DRAGON = EnumHelper.addArmorMaterial("style_land_dragon", Reference.MODID+":wizard_land_dragon", 40, new int[]{0, 2, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial STYLE_INFINITY = EnumHelper.addArmorMaterial("style_infinity", Reference.MODID+":wizard_infinity", 40, new int[]{0, 2, 0 ,31},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial STYLE_INFINITY_DRAGON = EnumHelper.addArmorMaterial("style_infinity_dragon", Reference.MODID+":wizard_infinity_dragon", 40, new int[]{0, 2, 5 ,31},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial STYLE_BLACK = EnumHelper.addArmorMaterial("style_black", Reference.MODID+":wizard_black", 40, new int[]{0, 2, 0 ,19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STYLE_DARK = EnumHelper.addArmorMaterial("style_dark", Reference.MODID+":wizard_dark", 40, new int[]{0, 2, 0 ,19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial DRIVER_WISE = EnumHelper.addArmorMaterial("mage", Reference.MODID+":wisedriver", 50, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item WIZARDRIVER = new ArmorWizarDriver("wizardriver",Wmod.TabKamenRiderWIZARD,DRIVER_WIZARD,EntityEquipmentSlot.LEGS);
	//	public static final Item BEAST_DRIVER = new ItemBase("beast_driver",Wmod.TabKamenRiderWizard);
	public static final Item WISE_DRIVER = new ArmorWiseDriver("wisedriver",Wmod.TabKamenRiderWIZARD,DRIVER_WISE,EntityEquipmentSlot.LEGS);

	public static final Item RING_FLAME= new ArmorWizardFlame("wizardring_flame",Wmod.TabKamenRiderWIZARD,STYLE_FLAME,EntityEquipmentSlot.HEAD);
	public static final Item RING_WATER = new ArmorWizardWater("wizardring_water",Wmod.TabKamenRiderWIZARD,STYLE_WATER,EntityEquipmentSlot.HEAD);
	public static final Item RING_HURRICANE = new ArmorWizardHurricane("wizardring_hurricane",Wmod.TabKamenRiderWIZARD,STYLE_HURRICANE,EntityEquipmentSlot.HEAD);
	public static final Item RING_LAND = new ArmorWizardLand("wizardring_land",Wmod.TabKamenRiderWIZARD,STYLE_LAND,EntityEquipmentSlot.HEAD);
	public static final Item RING_FLAMEDRAGON= new ItemBase("wizardring_flame_d",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_WATERDRAGON = new ItemBase("wizardring_water_d",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_HURRICANEDRAGON = new ItemBase("wizardring_hurricane_d",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_LANDDRAGON = new ItemBase("wizardring_land_d",Wmod.TabKamenRiderWIZARD);
	//  	public static final Item DRAGO_TIMER = new ItemBase("wizard_drogotimer",Wmod.TabKamenRiderWizard); 
	public static final Item RING_INFINITY = new ItemBase("wizardring_infinity",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_SPECIALLUSH= new ItemBase("wizardring_speciallush",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_FINISH_STRIKE= new ItemBase("wizardring_finishstrike",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_WISEMAN= new ItemBase("wizardring_wiseman",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_MAGE= new ItemBase("wizardring_mage",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_SORSALOR= new ItemBase("wizardring_sorsalor",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_BLACK= new ArmorWizardBlack("wizardring_black",Wmod.TabKamenRiderWIZARD,STYLE_BLACK,EntityEquipmentSlot.HEAD);
	public static final Item RING_DARK= new ArmorWizardDark("wizardring_dark",Wmod.TabKamenRiderWIZARD,STYLE_DARK,EntityEquipmentSlot.HEAD);	

	public static final Item RING_DRIVERON = new ItemDriverSummoner("wizardring_driveron",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_DRIVERON_WISE = new ItemDriverSummoner("wizardring_driveron_wise",Wmod.TabKamenRiderWIZARD);

	public static final Item RING_COMMON= new ItemBase2("wizardring_common",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_ENGAGE= new ItemBase2("wizardring_engage",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_COPY = new ItemRingCopy("wizardring_copy",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_CONNECT= new ItemBase("wizardring_connect",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_DEFEND = new ItemBase("wizardring_defend",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_LIGHT = new ItemBase("wizardring_light",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_DRAGORISE = new ItemBase("wizardring_dragorise",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_FLOWER= new ItemRingFlower("wizardring_flower",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_SPECIAL= new ItemBase("wizardring_special",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_BLIZARD= new ItemBase("wizardring_blizard",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_THUNDER= new ItemBase("wizardring_thunder",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_GRAVITY= new ItemBase("wizardring_gravity",Wmod.TabKamenRiderWIZARD);

	public static final Item RING_EXPLOSION = new ItemBase("wizardring_explosion",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_FALL= new ItemBase("wizardring_fall",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_HOPE= new ItemBase("wizardring_hope",Wmod.TabKamenRiderWIZARD);

	public static final Item RING_COMMON_BLACK= new ItemBase2("wizardring_common_black",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_ECLIPSE = new ItemBase("wizardring_eclipse",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_HOLY= new ItemBase("wizardring_holy",Wmod.TabKamenRiderWIZARD);
	public static final Item RING_FINALSTRIKE= new ItemBase("wizardring_finalstrike",Wmod.TabKamenRiderWIZARD);

	//		public static final Item RING_BEAST= new ItemBase("wizardring_beast",Wmod.TabKamenRiderWIZARD);
	//  	public static final Item RING_DRIVERON_BEAST = new ItemBase("wizardring_driveron_beast",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_BUFFA= new ItemBase("wizardring_buffa",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_FALCO= new ItemBase("wizardring_falco",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_CHAMELEO= new ItemBase("wizardring_chameleo",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_DOLPHI= new ItemBase("wizardring_dolphi",Wmod.TabKamenRiderWIZARD);
	//		public static final Item RING_HYPER= new ItemBase("wizardring_hyper",Wmod.TabKamenRiderWIZARD);

	public static final Item MAGICSTONE_RED = new ItemBase2("magicstone_red",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_BLUE = new ItemBase2("magicstone_blue",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_GREEN = new ItemBase2("magicstone_green",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_YELLOW = new ItemBase2("magicstone_yellow",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_BLACK = new ItemBase2("magicstone_black",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_DUST = new ItemBase2("magicstone_dust",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_ORANGE = new ItemBase2("magicstone_orange",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_PURPLE = new ItemBase2("magicstone_purple",Wmod.TabKamenRiderWIZARD);
	public static final Item MAGICSTONE_CRISTAL = new ItemBase2("magicstone_cristal",Wmod.TabKamenRiderWIZARD);
	//	public static final Item CONNECT_BOX = new ItemConnectBox("box_connect",Wmod.TabKamenRiderWizard);

	//GAIM
	public static final ArmorMaterial DRIVER_SENGOKU = EnumHelper.addArmorMaterial("helheim", Reference.MODID+":sengoku_driver", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_GAIM = EnumHelper.addArmorMaterial("sengoku_gaim", Reference.MODID+":sengoku_driver_gaim", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BARON = EnumHelper.addArmorMaterial("sengoku_baron", Reference.MODID+":sengoku_driver_baron", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_RYUGEN = EnumHelper.addArmorMaterial("sengoku_ryugen", Reference.MODID+":sengoku_driver_ryugen", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_ZANGETSU = EnumHelper.addArmorMaterial("sengoku_zangetsu", Reference.MODID+":sengoku_driver_zangetsu", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_KUROKAGE = EnumHelper.addArmorMaterial("sengoku_kurokage", Reference.MODID+":sengoku_driver_kurokage", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_GRIDON = EnumHelper.addArmorMaterial("sengoku_gridon", Reference.MODID+":sengoku_driver_gridon", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BRAVO = EnumHelper.addArmorMaterial("sengoku_bravo", Reference.MODID+":sengoku_driver_bravo", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_KNUCKLE = EnumHelper.addArmorMaterial("sengoku_knuckle", Reference.MODID+":sengoku_driver_knuckle", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_DUKE = EnumHelper.addArmorMaterial("sengoku_duke", Reference.MODID+":sengoku_driver_duke", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_MARIKA = EnumHelper.addArmorMaterial("sengoku_marika", Reference.MODID+":sengoku_driver_marika", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_SIGRUD = EnumHelper.addArmorMaterial("sengoku_sigrud", Reference.MODID+":sengoku_driver_sigrud", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BUJINGAIM = EnumHelper.addArmorMaterial("sengoku_bujingaim", Reference.MODID+":sengoku_driver_bujingaim", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BLACKBARON = EnumHelper.addArmorMaterial("sengoku_blackbaron", Reference.MODID+":sengoku_driver_blackbaron", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_KAMURO = EnumHelper.addArmorMaterial("sengoku_kamro", Reference.MODID+":sengoku_driver_kamro", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_MARS = EnumHelper.addArmorMaterial("sengoku_mars", Reference.MODID+":sengoku_driver_mars", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_JAM = EnumHelper.addArmorMaterial("sengoku_jam", Reference.MODID+":sengoku_driver_jam", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_SAVIOR = EnumHelper.addArmorMaterial("sengoku_savior", Reference.MODID+":sengoku_driver_savior", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_IDUNN = EnumHelper.addArmorMaterial("sengoku_idunn", Reference.MODID+":sengoku_driver_idunn", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_SYLFEE = EnumHelper.addArmorMaterial("sengoku_sylfee", Reference.MODID+":sengoku_driver_sylfee", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial HimawariLS = EnumHelper.addArmorMaterial("ls_00", Reference.MODID+":gaim_himawari", 40, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MatsubokkuriArms = EnumHelper.addArmorMaterial("ls_01", Reference.MODID+":gaim_matsubokkuri", 40, new int[]{0, 2, 0 ,16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KurumiArms = EnumHelper.addArmorMaterial("ls_02", Reference.MODID+":gaim_kurumi", 40, new int[]{0, 2, 0 ,17},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial DongriArms = EnumHelper.addArmorMaterial("ls_03", Reference.MODID+":gaim_dongri", 40, new int[]{0, 2, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MelonArms = EnumHelper.addArmorMaterial("ls_04", Reference.MODID+":gaim_melon", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial PineArms= EnumHelper.addArmorMaterial("ls_05", Reference.MODID+":gaim_pine", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial IchigoArms = EnumHelper.addArmorMaterial("ls_06", Reference.MODID+":gaim_ichigo", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial OrangeArms = EnumHelper.addArmorMaterial("ls_07", Reference.MODID+":gaim_orange", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BananaArms = EnumHelper.addArmorMaterial("ls_08", Reference.MODID+":gaim_banana", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial BudouArms = EnumHelper.addArmorMaterial("ls_09", Reference.MODID+":gaim_budou", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial SuicaArms = EnumHelper.addArmorMaterial("ls_10", Reference.MODID+":gaim_suica", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F);
	public static final ArmorMaterial MangoArms = EnumHelper.addArmorMaterial("ls_11", Reference.MODID+":gaim_mango", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial DorianArms = EnumHelper.addArmorMaterial("ls_12", Reference.MODID+":gaim_dorian", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KiwiArms = EnumHelper.addArmorMaterial("ls_13", Reference.MODID+":gaim_kiwi", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LycheeArms = EnumHelper.addArmorMaterial("ls_14", Reference.MODID+":gaim_lychee", 40, new int[]{0, 2, 0 ,23},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial BloodOrangeArms = EnumHelper.addArmorMaterial("ls_07blood", Reference.MODID+":gaim_blood_orange", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial OrangeArmsBlack = EnumHelper.addArmorMaterial("ls_07black", Reference.MODID+":gaim_orange_black", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial OrangeArmsFresh= EnumHelper.addArmorMaterial("ls_07fresh", Reference.MODID+":gaim_orange_fresh", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial WaterMelonArms = EnumHelper.addArmorMaterial("ls_10p", Reference.MODID+":gaim_watermelon", 40, new int[]{0, 2, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F);


	public static final ArmorMaterial DRIVER_GENESIS = EnumHelper.addArmorMaterial("ygdracil", Reference.MODID+":genesis_driver", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LemonEnergyArms = EnumHelper.addArmorMaterial("els_01", Reference.MODID+":gaim_lemonenergy", 40, new int[]{0, 2, 0 ,28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial CherryEnergyArms = EnumHelper.addArmorMaterial("els_02", Reference.MODID+":gaim_cherryenergy", 40, new int[]{0, 2, 0 ,28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial PeachEnergyArms = EnumHelper.addArmorMaterial("els_03", Reference.MODID+":gaim_peachenergy", 40, new int[]{0, 2, 0 ,28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MelonEnergyArms = EnumHelper.addArmorMaterial("els_04", Reference.MODID+":gaim_melonenergy", 40, new int[]{0, 2, 0 ,28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial MatsubokkuriEnergyArms = EnumHelper.addArmorMaterial("els_05", Reference.MODID+":gaim_matsubokkurienergy", 40, new int[]{0, 2, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MalonEnergyArms = EnumHelper.addArmorMaterial("els_06", Reference.MODID+":gaim_malonenergy", 40, new int[]{0, 2, 0 ,26},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DragonEnergyArms = EnumHelper.addArmorMaterial("els_00", Reference.MODID+":gaim_dragonenergy", 40, new int[]{0, 2, 0 ,32},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial DRIVER_GENESISCORE = EnumHelper.addArmorMaterial("jimber", Reference.MODID+":genesis_core", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial JimberLemon = EnumHelper.addArmorMaterial("jimber_01", Reference.MODID+":gaim_jimberlemon", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial JimberCherry = EnumHelper.addArmorMaterial("jimber_02", Reference.MODID+":gaim_jimbercherry", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial JimberPeach = EnumHelper.addArmorMaterial("jimber_03", Reference.MODID+":gaim_jimberpeach", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial JimberMelon = EnumHelper.addArmorMaterial("jimber_04", Reference.MODID+":gaim_jimbermelon", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial JimberMatsubokkuri = EnumHelper.addArmorMaterial("jimber_05", Reference.MODID+":gaim_jimbermatsubokkuri", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial JimberMarron = EnumHelper.addArmorMaterial("jimber_06", Reference.MODID+":gaim_jimbermarron", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial JimberDragon = EnumHelper.addArmorMaterial("jimber_00", Reference.MODID+":gaim_jimberdragon", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial JimberBlack = EnumHelper.addArmorMaterial("jimber_01b", Reference.MODID+":gaim_jimberblack", 40, new int[]{0, 0, 8 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ToolMaterial WEAPON_MUSOU =EnumHelper.addToolMaterial("aw_00",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_MATSUBOKKURI =EnumHelper.addToolMaterial("aw_01",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_DONGRI =EnumHelper.addToolMaterial("aw_03",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_MELON =EnumHelper.addToolMaterial("aw_04",3, 800, 0F, 2.0F,0);
	public static final ToolMaterial WEAPON_PINE =EnumHelper.addToolMaterial("aw_05",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_ICHIGO =EnumHelper.addToolMaterial("aw_06",3, 800, 0F, 2.0F,0);
	public static final ToolMaterial WEAPON_ORANGE =EnumHelper.addToolMaterial("aw_07",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_BANANA =EnumHelper.addToolMaterial("aw_08",3, 800, 0F, 5.0F,0);
	public static final ToolMaterial WEAPON_BUDOU =EnumHelper.addToolMaterial("aw_09",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_SUIKA =EnumHelper.addToolMaterial("aw_10",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_MANGO =EnumHelper.addToolMaterial("aw_11",3, 800, 0F, 12.0F,0);
	public static final ToolMaterial WEAPON_DORIAN =EnumHelper.addToolMaterial("aw_12",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_KIWI =EnumHelper.addToolMaterial("aw_13",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_LYCHEE_DONKACHI =EnumHelper.addToolMaterial("aw_14_1",3, 800, 0F, 8.0F,0);
	public static final ToolMaterial WEAPON_LYCHEE_SWORD =EnumHelper.addToolMaterial("aw_14_2",3, 800, 0F, 12.0F,0);

	public static final ToolMaterial WEAPON_WATERMELON =EnumHelper.addToolMaterial("aw_p10",3, 800, 0F, 4.0F,0);
	public static final ToolMaterial WEAPON_ZAKURO =EnumHelper.addToolMaterial("aw_zakuro",3, 800, 0F, 4.0F,0);

	public static final ToolMaterial WEAPON_GENESIS = EnumHelper.addToolMaterial("aw_e00",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_ELS05 =EnumHelper.addToolMaterial("aw_e05",3, 800, 0F, 6.0F,0);
	public static final ToolMaterial WEAPON_ELS06 =EnumHelper.addToolMaterial("aw_e06",3, 800, 0F, 6.0F,0);

	public static final Item SENGOKU_DRIVER = new ArmorSengokuDriver("sengoku_driver",Wmod.TabKamenRiderGAIM);
	public static final Item SENGOKU_DRIVER_GAIM = new ArmorSengokuDriverGAIM("sengoku_driver_gaim",Wmod.TabKamenRiderGAIM,DRIVER_GAIM,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_BARON = new ArmorSengokuDriverBARON("sengoku_driver_baron",Wmod.TabKamenRiderGAIM,DRIVER_BARON,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_RYUGEN = new ArmorSengokuDriverRYUGEN("sengoku_driver_ryugen",Wmod.TabKamenRiderGAIM,DRIVER_RYUGEN,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_ZANGETSU = new ArmorSengokuDriverZANGETSU("sengoku_driver_zangetsu",Wmod.TabKamenRiderGAIM,DRIVER_ZANGETSU,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_KUROKAGE = new ArmorSengokuDriverKUROKAGE("sengoku_driver_kurokage",Wmod.TabKamenRiderGAIM,DRIVER_KUROKAGE,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_GRIDON = new ArmorSengokuDriverGRIDON("sengoku_driver_gridon",Wmod.TabKamenRiderGAIM,DRIVER_GRIDON,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_BRAVO = new ArmorSengokuDriverBRAVO("sengoku_driver_bravo",Wmod.TabKamenRiderGAIM,DRIVER_BRAVO,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_KNUCKLE = new ArmorSengokuDriverKNUCKLE("sengoku_driver_knuckle",Wmod.TabKamenRiderGAIM,DRIVER_KNUCKLE,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_BUJIN_GAIM = new ArmorSengokuDriverBujinGAIM("sengoku_driver_bujingaim",Wmod.TabKamenRiderGAIM,DRIVER_BUJINGAIM,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_BLACKBARON = new ArmorSengokuDriverBlackBARON("sengoku_driver_blackbaron",Wmod.TabKamenRiderGAIM,DRIVER_BLACKBARON,EntityEquipmentSlot.LEGS);

	/*
	public static final Item SENGOKU_DRIVER_DUKE = new ArmorSengokuDriverDUKE("sengoku_driver_duke",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_MARIKA = new ArmorSengokuDriverMARIKA("sengoku_driver_marika",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_SIGRUD = new ArmorSengokuDriverSIGRUD("sengoku_driver_sigrud",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_KAMRO = new ArmorSengokuDriverKAMRO("sengoku_driver_kamro",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_MARS = new ArmorSengokuDriverMARS("sengoku_driver_mars",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_SYLFEE = new ArmorSengokuDriverSYLFEE("sengoku_driver_sylfee",Wmod.TabKamenRiderGaim);

	public static final Item SENGOKU_DRIVER_SAVIOR = new ArmorSengokuDriverSAVIOR("sengoku_driver_savior",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_JAM = new ArmorSengokuDriverJAM("sengoku_driver_jam",Wmod.TabKamenRiderGaim);
	public static final Item SENGOKU_DRIVER_IDUNN = new ArmorSengokuDriverIDUNN("sengoku_driver_idunn",Wmod.TabKamenRiderGaim);

	 */
	public static final Item SENGOKU_DRIVER_MASS = new ArmorSengokuDriverMASS("sengoku_driver_mass",Wmod.TabKamenRiderGAIM,DRIVER_SENGOKU,EntityEquipmentSlot.LEGS);
	public static final Item SENGOKU_DRIVER_STUDY = new ArmorSengokuDriverSTUDY("sengoku_driver_study",Wmod.TabKamenRiderGAIM,DRIVER_SENGOKU,EntityEquipmentSlot.LEGS);

	public static final Item GENESIS_DRIVER = new ItemBase("genesis_driver",Wmod.TabKamenRiderGAIM);
	public static final Item GENESIS_CORE = new ArmorGenesisCore("genesis_core",Wmod.TabKamenRiderGAIM,DRIVER_GENESISCORE,EntityEquipmentSlot.FEET);

	public static final Item LS_HIMAWARI= new ArmorGaimHimawariLS("ls_himawari",Wmod.TabKamenRiderGAIM,HimawariLS,EntityEquipmentSlot.HEAD);
	public static final Item LS_MATSUBOKKURI= new ArmorGaimMatsubokkuri("ls_matsubokkuri",Wmod.TabKamenRiderGAIM,MatsubokkuriArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_KURUMI = new ArmorGaimKurumi("ls_kurumi",Wmod.TabKamenRiderGAIM,KurumiArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_DONGRI = new ArmorGaimDongri("ls_donguri",Wmod.TabKamenRiderGAIM,DongriArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_MELON = new  ArmorGaimMelon("ls_melon",Wmod.TabKamenRiderGAIM,MelonArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_PINE = new ItemBase("ls_pine",Wmod.TabKamenRiderGAIM);
	public static final Item LS_ICHIGO = new ItemBase("ls_ichigo",Wmod.TabKamenRiderGAIM);
	public static final Item LS_ORANGE = new ArmorGaimOrange("ls_orange",Wmod.TabKamenRiderGAIM,OrangeArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_BANANA = new ArmorGaimBanana("ls_banana",Wmod.TabKamenRiderGAIM,BananaArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_BUDOU = new ArmorGaimBudou("ls_budou",Wmod.TabKamenRiderGAIM,BudouArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_SUICA = new ItemBase("ls_suika",Wmod.TabKamenRiderGAIM);
	public static final Item LS_MANGO = new ItemBase("ls_mango",Wmod.TabKamenRiderGAIM);
	public static final Item LS_DORIAN = new  ArmorGaimDorian("ls_dorian",Wmod.TabKamenRiderGAIM,DorianArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_KIWI = new ItemBase("ls_kiwi",Wmod.TabKamenRiderGAIM);
	public static final Item LS_LYCHEE = new ItemBase("ls_lychee",Wmod.TabKamenRiderGAIM);

	public static final Item LS_WATERMELON = new ArmorGaimWaterMelon("ls_watermelon",Wmod.TabKamenRiderGAIM,WaterMelonArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_BLOOD_ORANGE = new ArmorGaimBloodOrange("ls_blood_orange",Wmod.TabKamenRiderGAIM,BloodOrangeArms,EntityEquipmentSlot.HEAD);
	public static final Item LS_ORANGE_BLACK = new ArmorGaimOrangeBlack("ls_orange_black",Wmod.TabKamenRiderGAIM,OrangeArmsBlack,EntityEquipmentSlot.HEAD);
	public static final Item LS_ORANGE_FRESH = new ArmorGaimOrangeFresh("ls_orange_fresh",Wmod.TabKamenRiderGAIM,OrangeArmsFresh,EntityEquipmentSlot.HEAD);

	public static final Item LS_KING_DORIAN = new ItemBase("ls_kingdorian",Wmod.TabKamenRiderGAIM);
	public static final Item LS_LEMON= new ItemBase("ls_lemon",Wmod.TabKamenRiderGAIM);
	public static final Item LS_ZAKURO = new ItemBase("ls_zakuro",Wmod.TabKamenRiderGAIM);

	public static final Item LS_YOMI = new ItemBase("ls_yomotsu",Wmod.TabKamenRiderGAIM);
	public static final Item LS_RINGO = new ItemBase("ls_ringo",Wmod.TabKamenRiderGAIM);
	public static final Item LS_SILVER= new ItemBase("ls_silver",Wmod.TabKamenRiderGAIM);
	public static final Item LS_GOLDEN = new ItemBase("ls_golden",Wmod.TabKamenRiderGAIM);
	public static final Item LS_DARKNESS = new ItemBase("ls_dark",Wmod.TabKamenRiderGAIM);
	public static final Item LS_HELHEIM = new ItemBase("ls_helheim",Wmod.TabKamenRiderGAIM);

	/*
	public static final Item LS_KACHIDOKI = new ItemBase("ls_kachidoki",Wmod.TabKamenRiderGaim);
	public static final Item LS_SHIN_KACHIDOKI = new ItemBase("ls_shin_kachidoki",Wmod.TabKamenRiderGaim);
	public static final Item LS_KIWAMI = new ItemBase("ls_kiwami",Wmod.TabKamenRiderGaim);

	public static final Item LS_CHERRY = new ItemBase("ls_cherry",Wmod.TabKamenRiderGaim);
	public static final Item LS_PEACH= new ItemBase("ls_peach",Wmod.TabKamenRiderGaim);
	 */
	public static final Item AW_MUSOU_SABER = new ItemBaseGunSword("aw_00musou",WEAPON_MUSOU,Wmod.TabKamenRiderGAIM);
	public static final Item AW_MATSUBOKKURI= new ItemBaseWeapon("aw_01matsubokkuri",Wmod.TabKamenRiderGAIM, 8, 2, WEAPON_MATSUBOKKURI);
	//	public static final Item AW_KURUMI = new ItemBase("aw_kurumi",Wmod.TabKamenRiderGaim);
	public static final Item AW_DONGRI = new ItemBaseWeapon("aw_03donguri",Wmod.TabKamenRiderGAIM, 10, 2, WEAPON_DONGRI);
	public static final Item AW_MELON = new ItemBaseShield("aw_04melon",Wmod.TabKamenRiderGAIM);
	//	public static final Item AW_PINE = new ItemBase("aw_05pine",Wmod.TabKamenRiderGaim);
	//	public static final Item AW_ICHIGO = new ItemBase("aw_06ichigo",Wmod.TabKamenRiderGaim);
	public static final Item AW_ORANGE = new ItemBaseSword("aw_07orange",WEAPON_ORANGE, Wmod.TabKamenRiderGAIM);
	public static final Item AW_BANANA = new ItemBaseWeapon("aw_08banana",Wmod.TabKamenRiderGAIM, 10, 2, WEAPON_BANANA);
	public static final Item AW_BUDOU = new ItemBudouGun("aw_09budou",Wmod.TabKamenRiderGAIM);
	//	public static final Item AW_SUICA = new ItemBase("aw_10suika",Wmod.TabKamenRiderGaim);
	//	public static final Item AW_MANGO = new ItemBase("aw_11mango",Wmod.TabKamenRiderGaim);
	public static final Item AW_DORIAN = new ItemBaseSword("aw_12dorian",WEAPON_DORIAN,Wmod.TabKamenRiderGAIM);
	//	public static final Item AW_KIWI = new ItemBaseSword("aw_13kiwi",Wmod.TabKamenRiderGaim);
	//	public static final Item AW_LYCHEE_HAMMER = new ItemBase("aw_14shine_donkachi",Wmod.TabKamenRiderGaim);
	//	public static final Item AW_LYCHEE_SWORD = new ItemBaseSword("aw_14shine_sword",Wmod.TabKamenRiderGaim);

	public static final Item AW_WATERMELON = new ItemWaterMelonGatling("aw_p10watermelon",Wmod.TabKamenRiderGAIM);
	public static final Item AW_BLOOD_ORANGE = new ItemBaseSword("aw_07orange_b",WEAPON_ORANGE,Wmod.TabKamenRiderGAIM);
	/*
 	public static final Item AW_KING_DORIAN = new ItemBaseSword("aw_12king_dorian",Wmod.TabKamenRiderGaim);
	public static final Item AW_LEMON= new ItemBaseSword("aw_lemon",Wmod.TabKamenRiderGaim);
	public static final Item AW_ZAKURO = new ItemBase("aw_zakuro",Wmod.TabKamenRiderGaim);
	public static final Item AW_RINGO = new ItemBase("aw_ringo",Wmod.TabKamenRiderGaim);
	public static final Item AW_SILVER= new ItemBase("aw_silver",Wmod.TabKamenRiderGaim);
	public static final Item AW_GOLDEN = new ItemBase("aw_golden",Wmod.TabKamenRiderGaim);
	public static final Item AW_DARKNESS = new ItemBaseSword("aw_dark",Wmod.TabKamenRiderGaim);
	public static final Item AW_FIFTEEN= new ItemBase("aw_lemon",Wmod.TabKamenRiderGaim);
	public static final Item AW_KACHIDOKI = new ItemBase("aw_kingdorian",Wmod.TabKamenRiderGaim);
	public static final Item AW_SHIN_KACHIDOKI = new ItemBase("aw_lemon",Wmod.TabKamenRiderGaim);	 *
	 */
	public static final Item AW_SONIC_ARROW = new ItemBaseGunSword("aw_e00sonic",WEAPON_GENESIS,Wmod.TabKamenRiderGAIM);
	public static final Item AW_MATSUBOKKURI_SHIN = new ItemBaseWeapon("aw_e05matsubokkuri",Wmod.TabKamenRiderGAIM, 12, 4, WEAPON_MATSUBOKKURI);
	public static final Item AW_MARRON = new ItemBaseWeapon("aw_e06marron",Wmod.TabKamenRiderGAIM,15,5,WEAPON_ELS06);

	//	public static final Item ELS_LEMON= new ItemBase("els_01lemon",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_CHERRY = new ItemBase("els_02cherry",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_PEACH= new ItemBase("els_03peach",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_MELON= new ItemBase("els_04melon",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_MATSUBOKKURI= new ItemBase("els_05matsubokkuri",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_MARRON = new ItemBase("els_06marron",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_DRAGON = new ItemBase("els_00dragon",Wmod.TabKamenRiderGAIM);
	//	public static final Item ELS_BLACK= new ItemBase("els_01black",Wmod.TabKamenRiderGAIM);

	public static final Item JIMBER_LEMON= new ArmorJimberLemon("jimber_01lemon",Wmod.TabKamenRiderGAIM,JimberLemon,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_CHERRY = new ArmorJimberCherry("jimber_02cherry",Wmod.TabKamenRiderGAIM,JimberCherry,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_PEACH= new ArmorJimberPeach("jimber_03peach",Wmod.TabKamenRiderGAIM,JimberPeach,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_MELON= new ArmorJimberMelon("jimber_04melon",Wmod.TabKamenRiderGAIM,JimberMelon,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_MATSUBOKKURI= new ArmorJimberMatsubokkuri("jimber_05matsubokkuri",Wmod.TabKamenRiderGAIM,JimberMatsubokkuri,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_MARRON = new ArmorJimberMarron("jimber_06marron",Wmod.TabKamenRiderGAIM,JimberMarron,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_DRAGON = new ArmorJimberDragon("jimber_00dragon",Wmod.TabKamenRiderGAIM,JimberDragon,EntityEquipmentSlot.CHEST);
	public static final Item JIMBER_BLACK= new ArmorJimberBlack("jimber_01black",Wmod.TabKamenRiderGAIM,JimberBlack,EntityEquipmentSlot.CHEST);

	//DRIVE
	public static final ArmorMaterial DRIVER_DRIVE = EnumHelper.addArmorMaterial("stainbelt", Reference.MODID+":drive_driver", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Type_Proto = EnumHelper.addArmorMaterial("type_proto", Reference.MODID+":drive_proto", 40, new int[]{0, 0, 0 ,13},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Type_Speed = EnumHelper.addArmorMaterial("type_speed", Reference.MODID+":drive_speed", 40, new int[]{0, 0, 0 ,16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial Type_Wild = EnumHelper.addArmorMaterial("type_wild", Reference.MODID+":drive_wild", 40, new int[]{0, 0, 0 ,16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial Type_Techinc = EnumHelper.addArmorMaterial("type_technic", Reference.MODID+":drive_technic", 40, new int[]{0, 0, 0 ,16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial Type_Deadheat = EnumHelper.addArmorMaterial("type_deadheat", Reference.MODID+":drive_deadheat", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Type_Formula = EnumHelper.addArmorMaterial("type_formula", Reference.MODID+":drive_formula", 40, new int[]{0, 0, 0 ,25},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Type_Tridron= EnumHelper.addArmorMaterial("type_trydron", Reference.MODID+":drive_trydron", 40, new int[]{0, 0, 0,35},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial Type_Next = EnumHelper.addArmorMaterial("type_next", Reference.MODID+":drive_next", 40, new int[]{0, 0, 0 ,36},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Type_Special = EnumHelper.addArmorMaterial("type_special", Reference.MODID+":drive_special", 40, new int[]{0, 0, 0 ,36},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial Type_Zero = EnumHelper.addArmorMaterial("type_zero", Reference.MODID+":drive_zero", 40, new int[]{0, 0, 0 ,13},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial Tire_Flare = EnumHelper.addArmorMaterial("tire_flare", Reference.MODID+":drive_flare", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Spike = EnumHelper.addArmorMaterial("tire_spike", Reference.MODID+":drive_spike", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Shadow = EnumHelper.addArmorMaterial("tire_shadow", Reference.MODID+":drive_shadow", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Hunter = EnumHelper.addArmorMaterial("tire_hunter", Reference.MODID+":drive_hunter", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Mixer = EnumHelper.addArmorMaterial("tire_mixer", Reference.MODID+":drive_mixer", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Monster = EnumHelper.addArmorMaterial("tire_monster", Reference.MODID+":drive_monster", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Vegas = EnumHelper.addArmorMaterial("tire_vegas", Reference.MODID+":drive_vegas", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Cab = EnumHelper.addArmorMaterial("tire_cab", Reference.MODID+":drive_cab", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Dump = EnumHelper.addArmorMaterial("tire_dump", Reference.MODID+":drive_dump", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Doctor = EnumHelper.addArmorMaterial("tire_doctor", Reference.MODID+":drive_doctor", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Wrecker = EnumHelper.addArmorMaterial("tire_wrecker", Reference.MODID+":drive_wrecker", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Braver = EnumHelper.addArmorMaterial("tire_braver", Reference.MODID+":drive_braver", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Gravity = EnumHelper.addArmorMaterial("tire_gravity", Reference.MODID+":drive_gravity", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Tire_Winter = EnumHelper.addArmorMaterial("tire_winter", Reference.MODID+":drive_winter", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial DRIVER_MACH = EnumHelper.addArmorMaterial("harlee", Reference.MODID+":mach_driver", 50, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Mach = EnumHelper.addArmorMaterial("nextsys", Reference.MODID+":signal_mach", 40, new int[]{0, 2, 3 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Magal = EnumHelper.addArmorMaterial("next01", Reference.MODID+":signal_magal", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Kakusan = EnumHelper.addArmorMaterial("next02", Reference.MODID+":signal_kaksan", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Tomale = EnumHelper.addArmorMaterial("next03", Reference.MODID+":signal_tomale", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Kiken = EnumHelper.addArmorMaterial("next04", Reference.MODID+":signal_kiken", 40, new int[]{0, 2, 3 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Signal_Chaser = EnumHelper.addArmorMaterial("nextchaser", Reference.MODID+":signal_chaser", 40, new int[]{0, 2, 18 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial DRIVER_BANNO = EnumHelper.addArmorMaterial("banno", Reference.MODID+":gorddrive", 50, new int[]{0, 32, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BRAIN = EnumHelper.addArmorMaterial("roymude_003", Reference.MODID+":brain_driver", 50, new int[]{0, 30, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BANNO_BRONZE = EnumHelper.addArmorMaterial("banno2", Reference.MODID+":bronzedrive", 50, new int[]{0, 22, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ToolMaterial DRIVE_SHOOTER =EnumHelper.addToolMaterial("drive_shooter",3, 800, 8.0F, 3.0F,0);
	public static final ToolMaterial DRIVE_AXE =EnumHelper.addToolMaterial("drive_axe",3, 800, 8.0F, 8.0F,0);

	public static final Item DRIVE_DRIVER = new ArmorDrivedriver("drive_driver",Wmod.TabKamenRiderDRIVE,DRIVER_DRIVE,EntityEquipmentSlot.LEGS);
	public static final Item MACH_DRIVER = new ArmorMachDriver("mach_driver",Wmod.TabKamenRiderDRIVE,DRIVER_MACH,EntityEquipmentSlot.LEGS);
	public static final Item BANNO_DRIVER = new ArmorBannodriver("banno_driver",Wmod.TabKamenRiderDRIVE,DRIVER_BANNO,EntityEquipmentSlot.LEGS);
	public static final Item BRAIN_DRIVER = new ArmorBraindriver("brain_driver",Wmod.TabKamenRiderDRIVE,DRIVER_BRAIN,EntityEquipmentSlot.LEGS);
	public static final Item BANNO_DRIVER_BRONZE = new ArmorBannodriverBronze("banno_driver_broken",Wmod.TabKamenRiderDRIVE,DRIVER_BANNO_BRONZE,EntityEquipmentSlot.LEGS);

	public static final Item ShiftSPEEDProto= new ArmorDriveProto("shift_speed_proto",Wmod.TabKamenRiderDRIVE,Type_Proto,EntityEquipmentSlot.HEAD);
	public static final Item ShiftSPEED= new ArmorDriveSpeed("shift_speed",Wmod.TabKamenRiderDRIVE,Type_Speed,EntityEquipmentSlot.HEAD);
	//	public static final Item ShiftWILD = new ItemBase("shift_wild",Wmod.TabKamenRiderDRIVE);
	//	public static final Item ShiftTECHNIC = new ItemBase("shift_technic",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftDEADHEAT = new ArmorDriveDeadheat("shift_deadheat",Wmod.TabKamenRiderDRIVE,Type_Deadheat,EntityEquipmentSlot.HEAD);
	//	public static final Item ShiftFORMULA = new ItemBase("shift_formula",Wmod.TabKamenRiderDRIVE);
	//	public static final Item ShiftTRIDRON = new ItemBase("shift_tridoron",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftNEXT = new ArmorDriveNext("shift_next",Wmod.TabKamenRiderDRIVE,Type_Next,EntityEquipmentSlot.HEAD);
	public static final Item ShiftSP = new ItemBase("shift_special",Wmod.TabKamenRiderDRIVE);
	//new ArmorDriveSpecial("shift_special",Wmod.TabKamenRiderDRIVE,Type_Special,EntityEquipmentSlot.HEAD);
	//	public static final Item ShiftSPEED_H= new ItemBase("shift_speed_h",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftSPEEDZero= new ArmorDriveZero("shift_speed_zero",Wmod.TabKamenRiderDRIVE,Type_Zero,EntityEquipmentSlot.HEAD);

	public static final Item ShiftFLARE= new ArmorShiftFlare("shift_tire_flare",Wmod.TabKamenRiderDRIVE,Tire_Flare,EntityEquipmentSlot.CHEST);
	//	public static final Item ShiftFLARE_MEGA= new ItemBase("shift_tire_flare_mega",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftSPIKE = new ArmorShiftSpike("shift_tire_spike",Wmod.TabKamenRiderDRIVE,Tire_Spike,EntityEquipmentSlot.CHEST);
	public static final Item ShiftSHADOW = new ArmorShiftShadow("shift_tire_shadow",Wmod.TabKamenRiderDRIVE,Tire_Shadow,EntityEquipmentSlot.CHEST); 
	public static final Item ShiftHUNTER = new ArmorShiftHunter("shift_tire_hunter",Wmod.TabKamenRiderDRIVE,Tire_Hunter,EntityEquipmentSlot.CHEST);
	public static final Item ShiftMIXER = new ArmorShiftMixer("shift_tire_mixer",Wmod.TabKamenRiderDRIVE,Tire_Mixer,EntityEquipmentSlot.CHEST);
	public static final Item ShiftMONSTER = new ArmorShiftMonster("shift_tire_monster",Wmod.TabKamenRiderDRIVE,Tire_Monster,EntityEquipmentSlot.CHEST);
	public static final Item ShiftVEGAS = new ArmorShiftVegas("shift_tire_vegas",Wmod.TabKamenRiderDRIVE,Tire_Vegas,EntityEquipmentSlot.CHEST);
	public static final Item ShiftCAB = new ArmorShiftCab("shift_tire_cab",Wmod.TabKamenRiderDRIVE,Tire_Cab,EntityEquipmentSlot.CHEST);

	public static final Item ShiftDUMP = new ArmorShiftDump("shift_tire_dump",Wmod.TabKamenRiderDRIVE,Tire_Dump,EntityEquipmentSlot.CHEST);
	public static final Item ShiftDOCTOR = new ArmorShiftDoctor("shift_tire_doctor",Wmod.TabKamenRiderDRIVE,Tire_Doctor,EntityEquipmentSlot.CHEST);
	public static final Item ShiftWRECKER = new ArmorShiftWrecker("shift_tire_wrecker",Wmod.TabKamenRiderDRIVE,Tire_Wrecker,EntityEquipmentSlot.CHEST);

	public static final Item ShiftBRAVER= new ArmorShiftBraver("shift_tire_braver",Wmod.TabKamenRiderDRIVE,Tire_Braver,EntityEquipmentSlot.CHEST);
	public static final Item ShiftGRAVITY = new ArmorShiftGravity("shift_tire_gravity",Wmod.TabKamenRiderDRIVE,Tire_Gravity,EntityEquipmentSlot.CHEST);
	public static final Item ShiftWINTER = new ItemBase("shift_tire_winter",Wmod.TabKamenRiderDRIVE);

	public static final Item ShiftSOLAR = new ItemBase("shift_tire_solar",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftTRAVELER = new ItemBase("shift_tire_traveler",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftCM= new ItemBase("shift_tire_cm",Wmod.TabKamenRiderDRIVE);
	public static final Item ShiftCIRCUS = new ItemBase("shift_tire_circus",Wmod.TabKamenRiderDRIVE);

	//	public static final Item ShiftF01 = new ItemBase("shift_tire_f1",Wmod.TabKamenRiderDRIVE);
	//	public static final Item ShiftF02= new ItemBase("shift_tire_f2",Wmod.TabKamenRiderDRIVE);
	//	public static final Item ShiftF03 = new ItemBase("shift_tire_f3",Wmod.TabKamenRiderDRIVE);

	public static final Item SignalMACH = new ArmorSignalMach("signal_mach",Wmod.TabKamenRiderDRIVE,Signal_Mach,EntityEquipmentSlot.HEAD);
	public static final Item SignalCHASER = new ArmorSignalChaser("signal_chaser",Wmod.TabKamenRiderDRIVE,Signal_Chaser,EntityEquipmentSlot.CHEST);
	//	public static final Item SignalMAGAL = new ItemBase("signal_magal",Wmod.TabKamenRiderDRIVE);
	//	public static final Item SignalKAKSAN = new ItemBase("signal_caksan",Wmod.TabKamenRiderDRIVE);
	//	public static final Item SignalTOMALE = new ItemBase("signal_tomare",Wmod.TabKamenRiderDRIVE);
	//	public static final Item SignalKIKEN = new ItemBase("signal_kiken",Wmod.TabKamenRiderDRIVE);
	// public static final Item ShiftRIDECROSSER = new ItemBase("shift_ridecrosser",Wmod.TabKamenRiderDRIVE);
	// public static final Item TRIDRON_KEY = new ItemBase("tridoron_key",Wmod.TabKamenRiderDRIVE);

	public static final Item ZENRIN_SHOOTER = new ItemBaseGunWeapon("zenrin_shooter",Wmod.TabKamenRiderDRIVE,5,2,DRIVE_SHOOTER);
	public static final Item SINGOU_AXE = new ItemBaseAx("singou_axe",Wmod.TabKamenRiderDRIVE,12,1,DRIVE_AXE);

	//GHOST
	public static final ArmorMaterial DRIVER_GHOST = EnumHelper.addArmorMaterial("tenkuuji", Reference.MODID+":ghost_driver", 50, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Ore = EnumHelper.addArmorMaterial("soul_ore", Reference.MODID+":ghost_ore", 30, new int[]{0, 2, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Soul_Boost = EnumHelper.addArmorMaterial("soul_boost", Reference.MODID+":ghost_boost", 30, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial Soul_Grateful = EnumHelper.addArmorMaterial("soul_grateful", Reference.MODID+":ghost_grateful", 30, new int[]{0, 30, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial Soul_Mugen = EnumHelper.addArmorMaterial("soul_mugen", Reference.MODID+":ghost_mugen", 30, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F);
	public static final ArmorMaterial Soul_Spector = EnumHelper.addArmorMaterial("soul_spector", Reference.MODID+":ghost_spector", 30, new int[]{0, 2, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial Soul_Deep = EnumHelper.addArmorMaterial("soul_deep", Reference.MODID+":ghost_deepspector", 30, new int[]{0, 2, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Soul_Sin = EnumHelper.addArmorMaterial("soul_sin", Reference.MODID+":ghost_sinspector", 30, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial Soul_Necrom = EnumHelper.addArmorMaterial("soul_necrom", Reference.MODID+":ghost_necrom", 30, new int[]{0, 20, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial Soul_Burst = EnumHelper.addArmorMaterial("soul_boost", Reference.MODID+":ghost_burst", 30, new int[]{0, 20, 8, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Soul_Darkghost = EnumHelper.addArmorMaterial("soul_darkghost", Reference.MODID+":ghost_darkghost", 30, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Soul_ZeroSpector = EnumHelper.addArmorMaterial("soul_zerospector", Reference.MODID+":ghost_zerospector", 30, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial Soul_ZeroGhost = EnumHelper.addArmorMaterial("soul_zeroghost", Reference.MODID+":ghost_zeroghost", 30, new int[]{0, 2, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);

	public static final ArmorMaterial Soul_Musashi = EnumHelper.addArmorMaterial("soul_musashi", Reference.MODID+":ghost_musashi", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Edison = EnumHelper.addArmorMaterial("soul_edison", Reference.MODID+":ghost_edison", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Robin = EnumHelper.addArmorMaterial("soul_robin", Reference.MODID+":ghost_robin", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Newton = EnumHelper.addArmorMaterial("soul_newton", Reference.MODID+":ghost_newton", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Billy = EnumHelper.addArmorMaterial("soul_billy", Reference.MODID+":ghost_billy", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Beethoven = EnumHelper.addArmorMaterial("soul_beethoven", Reference.MODID+":ghost_beethoven", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Benkei = EnumHelper.addArmorMaterial("soul_benkei", Reference.MODID+":ghost_benkei", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Goemon = EnumHelper.addArmorMaterial("soul_goemon", Reference.MODID+":ghost_goemon", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Ryoma = EnumHelper.addArmorMaterial("soul_ryoma", Reference.MODID+":ghost_ryoma", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Himiko = EnumHelper.addArmorMaterial("soul_himiko", Reference.MODID+":ghost_himiko", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Tutankhamun = EnumHelper.addArmorMaterial("soul_tutankhamun", Reference.MODID+":ghost_tutankhamun", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Nobunaga = EnumHelper.addArmorMaterial("soul_nobunaga", Reference.MODID+":ghost_nobunaga", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Houdini = EnumHelper.addArmorMaterial("soul_houdini", Reference.MODID+":ghost_houdini", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Grimm = EnumHelper.addArmorMaterial("soul_grimm", Reference.MODID+":ghost_grimm", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial Soul_Sanzo = EnumHelper.addArmorMaterial("soul_sanzo", Reference.MODID+":ghost_sanzo", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item GHOST_DRIVER = new ArmorGhostDriver("ghost_driver",Wmod.TabKamenRiderGHOST,DRIVER_GHOST,EntityEquipmentSlot.LEGS);
	//	public static final Item ICON_DRIVER_G = new ArmorIconDriver("ghost_eyecon_driver",Wmod.TabKamenRiderGhost,DRIVER_ICON,EntityEquipmentSlot.LEGS);
	//	public static final Item MEGA_UL_LOADER = new ArmorMegaUlLoader("ghost_ulloader",Wmod.TabKamenRiderGhost,ULLOADER,EntityEquipmentSlot.LEGS);

	public static final Item EyeconORE= new ArmorGhostOre("eyecon_00g_ore",Wmod.TabKamenRiderGHOST,Soul_Ore,EntityEquipmentSlot.HEAD);
	public static final Item EyeconBOOST= new ItemBase("eyecon_boost",Wmod.TabKamenRiderGHOST);
	// 		public static final Item EyeconMUGEN = new ItemBase("eyecon_mugen",Wmod.TabKamenRiderGhost);
	public static final Item EyeconSPECTOR = new ArmorSpector("eyecon_00s_spector",Wmod.TabKamenRiderGHOST,Soul_Spector,EntityEquipmentSlot.HEAD);
	public static final Item EyeconDEEPSPECTOR= new ItemBase("eyecon_deep",Wmod.TabKamenRiderGHOST);
	//		public static final Item EyeconSINSPECTOR = new ItemBase("eyecon_sin",Wmod.TabKamenRiderGhost);
	//	  	public static final Item EyeconNECROM = new ItemBase("eyecon_necrom",Wmod.TabKamenRiderGhost);
	//		public static final Item EyeconYUUJOBURST = new ItemBase("eyecon_burst",Wmod.TabKamenRiderGhost);
	public static final Item EyeconDARKGHOST= new ArmorGhostDark("eyecon_00dg_darkghost",Wmod.TabKamenRiderGHOST,Soul_Darkghost,EntityEquipmentSlot.HEAD);
	public static final Item EyeconZEROSPECTOR = new ArmorSpectorZero("eyecon_00zs_spector_zero",Wmod.TabKamenRiderGHOST,Soul_ZeroSpector,EntityEquipmentSlot.HEAD);
	public static final Item EyeconKANONSPECTOR = new ItemBase("eyecon_00ks_spector_kanon",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconZEROGHOST = new ArmorGhostZero("eyecon_00zg_ghost_zero",Wmod.TabKamenRiderGHOST,Soul_ZeroGhost,EntityEquipmentSlot.HEAD);

	public static final Item EyeconMUSASHI= new ArmorGhostMusashi("eyecon_01musashi",Wmod.TabKamenRiderGHOST,Soul_Musashi,EntityEquipmentSlot.CHEST);
	public static final Item EyeconEDISON = new ItemBase("eyecon_02edison",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconROBIN_HOOT = new ItemBase("eyecon_03robin",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconNEWTON = new ItemBase("eyecon_04newton",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconBILLY_THE_KID = new ItemBase("eyecon_05billy",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconBEETHOVEN = new ItemBase("eyecon_06beethoven",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconBENKEI = new ItemBase("eyecon_07benkei",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconGOEMON = new ItemBase("eyecon_08goemon",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconRYOMA = new ItemBase("eyecon_09ryoma",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconHIMIKO = new ItemBase("eyecon_10himiko",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconTUTANKHAMUN = new ItemBase("eyecon_11tutankhamun",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconNOBUNAGA = new ItemBase("eyecon_12nobunaga",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconHOUDINI = new ItemBase("eyecon_13houdini",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconGRIMM = new ItemBase("eyecon_14grimm",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconSANZO = new ItemBase("eyecon_15sanzo",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconIKKYU = new ItemBase("eyecon_ex_ikkyu",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconPYTAGORAS = new ItemBase("eyecon_ex_pytagoras",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconDARWIN = new ItemBase("eyecon_ex_darwin",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconNAPOLEON = new ItemBase("eyecon_ex_napoleon",Wmod.TabKamenRiderGHOST);
	public static final Item EyeconBLANK = new ItemBase4("eyecon_blank",Wmod.TabKamenRiderGHOST);

	//EX-AID
	public static final ArmorMaterial DRIVER_EXAID = EnumHelper.addArmorMaterial("bugstarvirus", Reference.MODID+":gamer_driver", 50, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ActionGame = EnumHelper.addArmorMaterial("game_action", Reference.MODID+":exaid_action", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial QuestGame = EnumHelper.addArmorMaterial("game_quest", Reference.MODID+":exaid_quest", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ShootingGame = EnumHelper.addArmorMaterial("game_shooting", Reference.MODID+":exaid_shooting", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BikeGame = EnumHelper.addArmorMaterial("game_bike", Reference.MODID+":exaid_bike", 40, new int[]{0, 0, 0, 17},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ActionGame_Proto = EnumHelper.addArmorMaterial("game_action_proto", Reference.MODID+":exaid_action_proto", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ActionGame_Origin = EnumHelper.addArmorMaterial("game_action_origin", Reference.MODID+":exaid_action_origin", 40, new int[] {0, 0, 0, 15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BikeGame_Turbo = EnumHelper.addArmorMaterial("game_bike_turbo", Reference.MODID+":exaid_bike_turbo", 40, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial QuestGame_Proto = EnumHelper.addArmorMaterial("game_quest_proto", Reference.MODID+":exaid_quest_proto", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial ShootingGame_Proto = EnumHelper.addArmorMaterial("game_shooting_proto", Reference.MODID+":exaid_shooting_proto", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BikeGame_Proto = EnumHelper.addArmorMaterial("game_bike_proto", Reference.MODID+":exaid_bike_proto", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BikeGame_Combi = EnumHelper.addArmorMaterial("game_bike_combi", Reference.MODID+":exaid_bike_combi", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static final ArmorMaterial ActionLV1 = EnumHelper.addArmorMaterial("game_actionlv1", Reference.MODID+":exaid_actionlv1", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial QuestLV1 = EnumHelper.addArmorMaterial("game_questlv1", Reference.MODID+":exaid_questlv1", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial ShootingLV1 = EnumHelper.addArmorMaterial("game_shootinglv1", Reference.MODID+":exaid_shootinglv1", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial BikeLV1 = EnumHelper.addArmorMaterial("g7dame_bikelv1", Reference.MODID+":exaid_bikelv1", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial ActionLV1_Proto = EnumHelper.addArmorMaterial("game_actionlv1_proto", Reference.MODID+":exaid_actionlv1_proto", 40, new int[]{0, 0, 2, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial RobotGame = EnumHelper.addArmorMaterial("game_robot", Reference.MODID+":exaid_robot", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BeatGame = EnumHelper.addArmorMaterial("game_beat", Reference.MODID+":exaid_beat", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CombatGame = EnumHelper.addArmorMaterial("game_combat_heat", Reference.MODID+":exaid_combat", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ChambaraGame = EnumHelper.addArmorMaterial("game_chambara", Reference.MODID+":exaid_chambara", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial SportsGame = EnumHelper.addArmorMaterial("game_sports", Reference.MODID+":exaid_sports", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HunterGameZ = EnumHelper.addArmorMaterial("game_hunter", Reference.MODID+":exaid_hunter", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HunterGameEXAID = EnumHelper.addArmorMaterial("game_hunter_ex", Reference.MODID+":exaid_hunter_exaid", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HunterGameBRAVE = EnumHelper.addArmorMaterial("game_hunter_br", Reference.MODID+":exaid_hunter_brave", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HunterGameSNIPE = EnumHelper.addArmorMaterial("game_hunter_sn", Reference.MODID+":exaid_hunter_snipe", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial HunterGameLAZOR = EnumHelper.addArmorMaterial("game_hunter_lz", Reference.MODID+":exaid_hunter_lazor", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial RobotGame_Proto = EnumHelper.addArmorMaterial("game_robot_proto", Reference.MODID+":exaid_robot_proto", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BeatGame_Proto = EnumHelper.addArmorMaterial("game_beat_proto", Reference.MODID+":exaid_beat_proto", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial CombatGame_Proto = EnumHelper.addArmorMaterial("game_combat_proto", Reference.MODID+":exaid_combat_proto", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ChambaraGame_Proto = EnumHelper.addArmorMaterial("game_chambara_proto", Reference.MODID+":exaid_chambara_proto", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial SportsGame_Proto = EnumHelper.addArmorMaterial("game_sports_proto", Reference.MODID+":exaid_sports_proto", 40, new int[]{0, 0, 3, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial HunterGameZ_Proto = EnumHelper.addArmorMaterial("game_hunter_proto", Reference.MODID+":exaid_hunter_proto", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static final ArmorMaterial DRIVER_BUGGLE = EnumHelper.addArmorMaterial("dangerouszombie", Reference.MODID+":buggle_driver", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial ZombieGame = EnumHelper.addArmorMaterial("game_zombie", Reference.MODID+":exaid_zombie", 40, new int[]{0, 2, 23, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,5.0F);
	public static final ArmorMaterial PuzzleGame = EnumHelper.addArmorMaterial("game_puzzle", Reference.MODID+":exaid_puzzle", 40, new int[]{0, 0, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial FighterGame = EnumHelper.addArmorMaterial("game_fighter", Reference.MODID+":exaid_fighter", 40, new int[]{0, 0, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PKGame = EnumHelper.addArmorMaterial("game_perfect_knockout", Reference.MODID+":exaid_perfect_knockout", 40, new int[]{0, 0, 0, 35},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);

	public static final ArmorMaterial BurgerGame = EnumHelper.addArmorMaterial("game_burger", Reference.MODID+":exaid_burger", 40, new int[]{0, 0, 4, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial SafariGame = EnumHelper.addArmorMaterial("game_safari", Reference.MODID+":exaid_safari", 40, new int[]{0, 0, 4, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DoubleActionGame = EnumHelper.addArmorMaterial("game_double_action", Reference.MODID+":exaid_doubleaction_x", 40, new int[]{0, 0, 5, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DoubleActionGameL = EnumHelper.addArmorMaterial("game_double_action_l", Reference.MODID+":exaid_doubleaction_xxl", 40, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial DoubleActionGameR = EnumHelper.addArmorMaterial("game_double_action_R", Reference.MODID+":exaid_doubleaction_xxr", 40, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial FantasyGame = EnumHelper.addArmorMaterial("game_fantasy", Reference.MODID+":exaid_fantasy", 40, new int[]{0, 0, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial SimulationGame = EnumHelper.addArmorMaterial("game_simulation", Reference.MODID+":exaid_simulation", 40, new int[]{0, 0, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial DRIVER_BUGGLE_ZWEI = EnumHelper.addArmorMaterial("riderchronicle", Reference.MODID+":buggle_driver_zwei", 40, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RidePlayer = EnumHelper.addArmorMaterial("game_rideplayer", Reference.MODID+":exaid_rideplayer", 40, new int[]{0, 0, 0, 16},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TokimekiGame = EnumHelper.addArmorMaterial("game_tokimeki", Reference.MODID+":exaid_tokimeki", 40, new int[]{0, 2, 0, 28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial ChronicleGame = EnumHelper.addArmorMaterial("game_chronicle", Reference.MODID+":exaid_chronicle", 40, new int[]{0, 0, 0, 38},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 10.0F);

	public static final ArmorMaterial MaximumGame = EnumHelper.addArmorMaterial("game_maximum", Reference.MODID+":exaid_maximum", 99, new int[]{0, 2, 5, 28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MaximumGamer_Armor = EnumHelper.addArmorMaterial("maximum_gama", Reference.MODID+":exaid_maximum_armor", 99, new int[]{0, 2, 5, 28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MutekiGame = EnumHelper.addArmorMaterial("game_muteki", Reference.MODID+":exaid_muteki", 40, new int[]{0, 2, 10, 28},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);
	public static final ArmorMaterial LegacyGame = EnumHelper.addArmorMaterial("game_legacy", Reference.MODID+":exaid_legacy", 40, new int[]{0, 2, 0, 36},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial NinjaGame = EnumHelper.addArmorMaterial("game_ninja", Reference.MODID+":exaid_ninja", 40, new int[]{0, 0, 0, 23},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial CreatorGame = EnumHelper.addArmorMaterial("game_creator", Reference.MODID+":exaid_creator", 40, new int[]{0, 0, 0, 25},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial PKGameA = EnumHelper.addArmorMaterial("game_perfect_knockout_a", Reference.MODID+":exaid_perfect_knockout_a", 40, new int[]{0, 0, 0, 35},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial GodMaximumGame = EnumHelper.addArmorMaterial("game_god_maximum", Reference.MODID+":exaid_godmaximum",800, new int[]{0, 0, 23, 15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial GodMaximumGamer_Armor = EnumHelper.addArmorMaterial("godmaximum_gama", Reference.MODID+":exaid_godmaximum_armor", 800, new int[]{0, 2, 23, 15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 20.0F);
	public static final ArmorMaterial NovelGame = EnumHelper.addArmorMaterial("game_novel", Reference.MODID+":exaid_novel", 40, new int[] {0, 0, 0, 27},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TankGame = EnumHelper.addArmorMaterial("game_tank", Reference.MODID+":exaid_tank", 40, new int[]{0, 0, 4, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial MinecraftGame = EnumHelper.addArmorMaterial("game_minecraft", Reference.MODID+":exaid_minecraft", 40, new int[]{0, 0, 99, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 99.0F);
	public static final ArmorMaterial MusouGame = EnumHelper.addArmorMaterial("game_musou", Reference.MODID+":exaid_musou", 40, new int[]{0, 0, 0, 33},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial MaximumZombieGame = EnumHelper.addArmorMaterial("game_maximum_zombie", Reference.MODID+":exaid_maximum_zombie", 40, new int[]{0, 0, 8, 23},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial MaximumZombieGamer_Armor = EnumHelper.addArmorMaterial("maximumzombie_gama", Reference.MODID+":exaid_zombiemaximum_armor", 40, new int[]{0, 2, 8, 23},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial FumetsuGame = EnumHelper.addArmorMaterial("game_fumetsu", Reference.MODID+":exaid_fumetsu", 40, new int[]{0, 0, 15, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 10.0F);

	public static final ToolMaterial EXAID_BREAKER = EnumHelper.addToolMaterial("exaid_breaker",3, 800, 8.0F, 8.0F,0);
	public static final ToolMaterial EXAID_BREAKER_PROTO = EnumHelper.addToolMaterial("exaid_breaker_proto",3, 1001, 10.0F, 10.0F,0);
	public static final ToolMaterial EXAID_SWORD = EnumHelper.addToolMaterial("exaid_sword",3, 800, 8.0F, 5.0F,0);
	public static final ToolMaterial EXAID_SPAROW = EnumHelper.addToolMaterial("exaid_sparow",3, 800, 8.0F, 4.0F,0);
	public static final ToolMaterial EXAID_BUG1 = EnumHelper.addToolMaterial("exaid_bug1",3, 800, 10.0F, 6.0F,0);
	public static final ToolMaterial EXAID_BUG2 = EnumHelper.addToolMaterial("exaid_bug2",3, 800, 10.0F, 10.0F,0);
	public static final ToolMaterial EXAID_KEYSLASHER = EnumHelper.addToolMaterial("exaid_keyslasher",3, 800, 8.0F, 6.0F,0);

	public static final Item GAMER_DRIVER = new ArmorGamerDriver("gamer_driver",Wmod.TabKamenRiderEXAID,DRIVER_EXAID,EntityEquipmentSlot.LEGS);
	public static final Item BUGGLE_DRIVER = new ArmorBuggleDriver("buggle_driver",Wmod.TabKamenRiderEXAID,DRIVER_BUGGLE,EntityEquipmentSlot.LEGS);
	public static final Item BUGGLE_DRIVER_ZWEI = new ArmorBuggleDriverZwei("buggle_driver_zwei",Wmod.TabKamenRiderEXAID,DRIVER_BUGGLE_ZWEI,EntityEquipmentSlot.LEGS);

	public static final Item GashatACTION = new ArmorExaidAction("gashat_action",Wmod.TabKamenRiderEXAID,ActionGame,EntityEquipmentSlot.HEAD);
	public static final Item GashatQUEST =new ArmorExaidQuest("gashat_quest",Wmod.TabKamenRiderEXAID//,QuestGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatSHOOTING = new ArmorExaidShooting("gashat_shooting",Wmod.TabKamenRiderEXAID//,ShootingGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatBIKE =new ArmorExaidBike("gashat_bike",Wmod.TabKamenRiderEXAID//,BikeGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatBIKE_TURBO =new ArmorExaidBikeTurbo("gashat_bike_turbo",Wmod.TabKamenRiderEXAID,BikeGame_Turbo,EntityEquipmentSlot.HEAD);
	public static final Item GashatROBOT =new ArmorExaidRobot("gashat_robot",Wmod.TabKamenRiderEXAID,RobotGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatBEAT = new ArmorExaidBeat("gashat_beat",Wmod.TabKamenRiderEXAID,BeatGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatCOMBAT = new ArmorExaidCombat("gashat_combat",Wmod.TabKamenRiderEXAID,CombatGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatCHAMBARA =new ArmorExaidChambara("gashat_chambara",Wmod.TabKamenRiderEXAID,ChambaraGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatSPORTS = new ArmorExaidSports("gashat_sports",Wmod.TabKamenRiderEXAID,SportsGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatHUNTER = new ArmorExaidHunterFull("gashat_hunter",Wmod.TabKamenRiderEXAID);
	public static final Item GashatHUNTER_FANG = new ArmorExaidHunterFang("gashat_hunter_fang",Wmod.TabKamenRiderEXAID);
	public static final Item GashatHUNTER_BLADE = new ArmorExaidHunterBlade("gashat_hunter_blade",Wmod.TabKamenRiderEXAID);
	public static final Item GashatHUNTER_GUN = new ArmorExaidHunterGun("gashat_hunter_gun",Wmod.TabKamenRiderEXAID);
	public static final Item GashatHUNTER_CRAW = new ArmorExaidHunterCraw("gashat_hunter_craw",Wmod.TabKamenRiderEXAID);

	public static final Item GashatACTION_Proto = new ArmorExaidActionProto("gashat_action_proto",Wmod.TabKamenRiderEXAID,ActionGame_Proto,EntityEquipmentSlot.HEAD);
	public static final Item GashatACTION_Origin = new ArmorExaidActionOrigin("gashat_origin",Wmod.TabKamenRiderEXAID,ActionGame_Origin,EntityEquipmentSlot.HEAD);
	public static final Item GashatQUEST_Proto = new ArmorExaidQuestProto("gashat_quest_proto",Wmod.TabKamenRiderEXAID//QuestGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatSHOOTING_Proto = new ArmorExaidShootingProto("gashat_shooting_proto",Wmod.TabKamenRiderEXAID//,ShootingGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatBIKE_Proto = new ArmorExaidBikeProto("gashat_bike_proto",Wmod.TabKamenRiderEXAID//,BikeGame,EntityEquipmentSlot.HEAD
			);
	public static final Item GashatBIKE_Proto_Combi = new ArmorExaidBikeCombi("gashat_bike_combi",Wmod.TabKamenRiderEXAID,BikeGame_Combi,EntityEquipmentSlot.CHEST);

	public static final Item GashatROBOT_Proto =new ArmorExaidRobotProto("gashat_robot_proto",Wmod.TabKamenRiderEXAID,RobotGame_Proto,EntityEquipmentSlot.CHEST);
	public static final Item GashatBEAT_Proto = new ArmorExaidBeatProto("gashat_beat_proto",Wmod.TabKamenRiderEXAID,BeatGame_Proto,EntityEquipmentSlot.CHEST);
	public static final Item GashatCOMBAT_Proto = new ArmorExaidCombatProto("gashat_combat_proto",Wmod.TabKamenRiderEXAID,CombatGame_Proto,EntityEquipmentSlot.CHEST);
	public static final Item GashatCHAMBARA_Proto = new ArmorExaidChambaraProto("gashat_chambara_proto",Wmod.TabKamenRiderEXAID,ChambaraGame_Proto,EntityEquipmentSlot.CHEST);
	public static final Item GashatSPORTS_Proto = new ArmorExaidSportsProto("gashat_sports_proto",Wmod.TabKamenRiderEXAID,SportsGame_Proto,EntityEquipmentSlot.CHEST);
	public static final Item GashatHUNTER_Proto = new ArmorExaidHunterProto("gashat_hunter_proto",Wmod.TabKamenRiderEXAID);

	public static final Item GashatBURGER = new ArmorExaidBurger("gashat_burger",Wmod.TabKamenRiderEXAID,BurgerGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatSAFARI = new ArmorExaidSafari("gashat_safari",Wmod.TabKamenRiderEXAID,SafariGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatTANK = new ArmorExaidTank("gashat_tank",Wmod.TabKamenRiderEXAID,TankGame,EntityEquipmentSlot.CHEST);
	public static final Item GashatZOMBIE = new ArmorExaidZombie("gashat_zombie",Wmod.TabKamenRiderEXAID,ZombieGame,EntityEquipmentSlot.CHEST);

	public static final Item GashatRidePlayer = new ArmorRidePlayer("gashat_rideplayer",Wmod.TabKamenRiderEXAID,RidePlayer,EntityEquipmentSlot.HEAD);
	public static final Item GashatCRISIS = new ArmorExaidCrisis("gashat_crisis",Wmod.TabKamenRiderEXAID);
	public static final Item GashatCHROCICLE = new ArmorExaidChronicle("gashat_chronicle",Wmod.TabKamenRiderEXAID);
	public static final Item GashatLEGACY = new ArmorExaidLegacy("gashat_legacy",Wmod.TabKamenRiderEXAID);

	public static final Item GashatNINJA = new ItemBase("gashat_ninja",Wmod.TabKamenRiderEXAID);
	public static final Item GashatCREATOR = new ItemBase("gashat_creator",Wmod.TabKamenRiderEXAID);	
	public static final Item GashatNOVEL = new ArmorExaidNovel("gashat_novel",Wmod.TabKamenRiderEXAID,NovelGame,EntityEquipmentSlot.HEAD);

	public static final Item GashatBROTHERS = new ArmorExaidBrothers("gashat_brothers",Wmod.TabKamenRiderEXAID);	
	public static final Item GashatDOCTOR = new ItemBase("gashat_doctor",Wmod.TabKamenRiderEXAID);
	public static final Item GashatFIGHTER2 = new ArmorExaidFighter2("gashat_fighter2",Wmod.TabKamenRiderEXAID);

	public static final Item GashatDUAL = new ItemGearDual("gashat_gear",Wmod.TabKamenRiderEXAID);
	public static final Item GashatPUZZLE = new ArmorExaidPuzzle("gashat_gear_puzzle",Wmod.TabKamenRiderEXAID);
	public static final Item GashatFIGHTER = new ArmorExaidFighter("gashat_gear_fighter",Wmod.TabKamenRiderEXAID);
	public static final Item GashatDUAL_BETA = new ItemGearDual("gashat_gear_beta",Wmod.TabKamenRiderEXAID);
	public static final Item GashatFANTASY = new ArmorExaidFantasy("gashat_gear_fantasy",Wmod.TabKamenRiderEXAID);
	public static final Item GashatSIMULATIONS = new ArmorExaidSimulation("gashat_gear_simulations",Wmod.TabKamenRiderEXAID);
	public static final Item GashatDUAL_ANOTHER = new ItemGearDual("gashat_gear_another",Wmod.TabKamenRiderEXAID);
	public static final Item GashatPUZZLE_ANOTHER = new ArmorExaidPuzzleAnother("gashat_gear_puzzle_another",Wmod.TabKamenRiderEXAID);
	public static final Item GashatFIGHTER_ANOTHER = new ArmorExaidFighterAnother("gashat_gear_fighter_another",Wmod.TabKamenRiderEXAID);

	public static final Item GashatMAXIMUM = new ArmorExaidMAX("gashat_maximum",Wmod.TabKamenRiderEXAID,MaximumGame,EntityEquipmentSlot.HEAD);
	public static final Item GashatGODMAXIMUM = new ArmorExaidGOD("gashat_godmaximum",Wmod.TabKamenRiderEXAID,GodMaximumGame,EntityEquipmentSlot.HEAD);
	public static final Item GashatMUTEKI = new ArmorExaidMuteki("gashat_muteki",Wmod.TabKamenRiderEXAID);
	public static final Item GashatMUSOU = new ItemBase("gashat_musou",Wmod.TabKamenRiderEXAID);
	public static final Item GashatMAXIMUM_ZOMBIE = new ArmorExaidZombieMAX("gashat_maximum_zombie",Wmod.TabKamenRiderEXAID,MaximumZombieGame,EntityEquipmentSlot.HEAD);
	public static final Item GashatFUMETSU = new ArmorExaidFumetsu("gashat_fumetsu",Wmod.TabKamenRiderEXAID);
	public static final Item GashatBRIDAL = new ItemBase("gashat_bridal",Wmod.TabKamenRiderEXAID);
	public static final Item GashatNOIR = new ItemBase("gashat_action_noir",Wmod.TabKamenRiderEXAID);

	public static final Item GashatMINECRAFT = new ArmorExaidMinecraft("gashat_minecraft",Wmod.TabKamenRiderEXAID,MinecraftGame,EntityEquipmentSlot.CHEST);
	//public static final Item GashatALLSTAR = new ArmorAllStar("gashat_allstar",Wmod.TabKamenRiderEXAID,AllstarGame,EntityEquipmentSlot.HEAD);

	public static final Item LV1_ACTION = new ArmorExaidActionLv1("action_level1",Wmod.TabKamenRiderEXAID,ActionLV1,EntityEquipmentSlot.CHEST);
	//		public static final Item LV1_QUEST = new ArmorActionLv1("quest_level1",Wmod.TabKamenRiderExaid,ActionLV1,EntityEquipmentSlot.CHEST);
	//   	public static final Item LV1_SHOOTING = new ArmorActionLv1Proto("shooting_level1",Wmod.TabKamenRiderExaid,ActionLV1_Proto,EntityEquipmentSlot.CHEST);
	//   	public static final Item LV1_BIKE = new ArmorActionLv1("bike_level1",Wmod.TabKamenRiderExaid,ActionLV1,EntityEquipmentSlot.CHEST);
	public static final Item LV1_ACTION_Proto = new ArmorExaidActionProtoLv1("action_level1_proto",Wmod.TabKamenRiderEXAID,ActionLV1_Proto,EntityEquipmentSlot.CHEST);
	//		public static final Item LVX_DOUBLE_ACTION = new ArmorDoubleActionLvX("double_action_levelx",Wmod.TabKamenRiderExaid,DoubleActionGame,EntityEquipmentSlot.CHEST);

	public static final Item GashaconBreaker_hammer =new ItemGashaconBreaker("gashacon_breaker_hammer",EXAID_BREAKER,Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBreaker_blade =new ItemGashaconBreakerBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBreakerProro_hammer =new ItemGashaconBreaker("gashacon_breaker_proto_hammer",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBreakerProto_blade =new ItemGashaconBreakerBlade("gashacon_breaker_proto_blade",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderEXAID);
	/*	
 	public static final Item GashaconSword_frame =new ItemGashaconBreaker("gashacon_breaker_hammer",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	public static final Item GashaconSword_ice =new ItemGashaconBreakerBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	public static final Item GashaconMagnum_handgun =new ItemGashaconBreaker("gashacon_breaker_proto_hammer",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderExaid);
	public static final Item GashaconMagnum_ryfle =new ItemGashaconBreakerBlade("gashacon_breaker_proto_blade",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderExaid);
	public static final Item GashaconSparrow_scythe =new ItemGashaconBreaker("gashacon_breaker_hammer",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	public static final Item GashaconSparrow_bow =new ItemGashaconBreakerBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	public static final Item GashaconParablagun_axe =new ItemGashaconBreaker("gashacon_breaker_proto_hammer",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderExaid);
	public static final Item GashaconParablagun_gun =new ItemGashaconBreakerBlade("gashacon_breaker_proto_blade",EXAID_BREAKER_PROTO,Wmod.TabKamenRiderExaid);
	 */
	public static final Item GashaconBugviser =new ItemGashaconBugviser("gashacon_bugviser",Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBugviser_chainsaw =new ItemGashaconBugviserSaw("gashacon_bugviser_chainsaw",EXAID_BUG1,Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBugviser_beamgun =new ItemGashaconBugviserGun("gashacon_bugviser_beamgun",Wmod.TabKamenRiderEXAID);
	//		public static final Item GashaconKeySlasher_blade =new ItemGashaconKeySlasherBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	//		public static final Item GashaconKeySlasher_axe =new ItemGashaconKeySlasherBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderExaid);
	//		public static final Item GashaconKeySlasher_gun =new ItemGashaconKeySlasherBlade("gashacon_breaker_blade",EXAID_BREAKER,Wmod.TabKamenRiderExaid);

	public static final Item GashaconBugviserZwei =new ItemGashaconBugviser("gashacon_bugviser_zwei",Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBugviserZwei_chainsaw =new ItemGashaconBugviserSaw("gashacon_bugviser_zwei_chainsaw",EXAID_BUG2,Wmod.TabKamenRiderEXAID);
	public static final Item GashaconBugviserZwei_beamgun =new ItemGashaconBugviserGun("gashacon_bugviser_zwei_beamgun",Wmod.TabKamenRiderEXAID);

	public static final Item GashatrophyACTION = new ItemBase2("gashatrophy_action",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyQUEST = new ItemBase2("gashatrophy_quest",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophySHOOTING = new ItemBase2("gashatrophy_shooting",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyBIKE = new ItemBase2("gashatrophy_bike",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyROBOT = new ItemBase2("gashatrophy_robot",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyBEAT = new ItemBase2("gashatrophy_beat",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyCOMBAT = new ItemBase2("gashatrophy_combat",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyCHAMBARA = new ItemBase2("gashatrophy_chambara",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophySPORTS = new ItemBase2("gashatrophy_sports",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyHUNTER = new ItemBase2("gashatrophy_hunter",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyCRISIS = new ItemBase2("gashatrophy_crisis",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyPUZZLE = new ItemBase2("gashatrophy_puzzle",Wmod.TabKamenRiderEXAID);
	public static final Item GashatrophyFIGHTER = new ItemBase2("gashatrophy_fighter",Wmod.TabKamenRiderEXAID);

	public static final Item GashatrophyMINECRAFT = new ItemBase2("gashatrophy_minecraft",Wmod.TabKamenRiderEXAID);

	//Build
	public static final ArmorMaterial DRIVER_BUILD = EnumHelper.addArmorMaterial("nebulagas", Reference.MODID+":build_driver", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BUILD_HAZARD = EnumHelper.addArmorMaterial("build_hazard", Reference.MODID+":build_driver_hazard", 30, new int[]{0, 8, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial BuildRabbit = EnumHelper.addArmorMaterial("build_rabbit", Reference.MODID+":build_rabbit", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildTank = EnumHelper.addArmorMaterial("build_tank", Reference.MODID+":build_tank", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BuildGorilla = EnumHelper.addArmorMaterial("build_gorilla", Reference.MODID+":build_gorilla", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDiamond = EnumHelper.addArmorMaterial("build_diamond", Reference.MODID+":build_diamond", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BuildHawk = EnumHelper.addArmorMaterial("build_hawk", Reference.MODID+":build_hawk", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildGatling = EnumHelper.addArmorMaterial("build_gatling", Reference.MODID+":build_gatling", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildNinja = EnumHelper.addArmorMaterial("build_ninja", Reference.MODID+":build_ninja", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildComic = EnumHelper.addArmorMaterial("build_comic", Reference.MODID+":build_comic", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildPanda = EnumHelper.addArmorMaterial("build_panda", Reference.MODID+":build_panda", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildRocket = EnumHelper.addArmorMaterial("build_rocket", Reference.MODID+":build_rocket", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildHedgehog = EnumHelper.addArmorMaterial("build_hedgehog", Reference.MODID+":build_hedgehog", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildFireRescue = EnumHelper.addArmorMaterial("build_firerescue", Reference.MODID+":build_firerescue", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BuildLion = EnumHelper.addArmorMaterial("build_lion", Reference.MODID+":build_lion", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildCleaner = EnumHelper.addArmorMaterial("build_cleaner", Reference.MODID+":build_cleaner", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDragon = EnumHelper.addArmorMaterial("build_dragon", Reference.MODID+":build_dragon", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildLock = EnumHelper.addArmorMaterial("build_lock", Reference.MODID+":build_lock", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildKaizoku = EnumHelper.addArmorMaterial("build_pirates", Reference.MODID+":build_pirates", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDensya = EnumHelper.addArmorMaterial("build_densya", Reference.MODID+":build_densya", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildOctopas = EnumHelper.addArmorMaterial("build_octopas", Reference.MODID+":build_octopas", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildLight = EnumHelper.addArmorMaterial("build_light", Reference.MODID+":build_light", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BuildPhoenix = EnumHelper.addArmorMaterial("build_phoenix", Reference.MODID+":build_phoenix", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildRobot = EnumHelper.addArmorMaterial("build_robot", Reference.MODID+":build_robot", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BuildWolf = EnumHelper.addArmorMaterial("build_wolf", Reference.MODID+":build_wolf", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSmartphone = EnumHelper.addArmorMaterial("build_smartphone", Reference.MODID+":build_smartphone", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildUnicorn = EnumHelper.addArmorMaterial("build_unicorn", Reference.MODID+":build_unicorn", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildEraser = EnumHelper.addArmorMaterial("build_eraser", Reference.MODID+":build_eraser", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildRose = EnumHelper.addArmorMaterial("build_rose", Reference.MODID+":build_rose", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildHelicopter = EnumHelper.addArmorMaterial("build_helicopter", Reference.MODID+":build_helicopter", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildTurtle = EnumHelper.addArmorMaterial("build_turtle", Reference.MODID+":build_turtle", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BuildWatch = EnumHelper.addArmorMaterial("build_watch", Reference.MODID+":build_watch", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildKuma = EnumHelper.addArmorMaterial("build_kuma", Reference.MODID+":build_kuma", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildTV = EnumHelper.addArmorMaterial("build_tv", Reference.MODID+":build_tv", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildBeetle = EnumHelper.addArmorMaterial("build_beetle", Reference.MODID+":build_beetle", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildCamera = EnumHelper.addArmorMaterial("build_camera", Reference.MODID+":build_camera", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSpider = EnumHelper.addArmorMaterial("build_spider", Reference.MODID+":build_spider", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildFreezer  = EnumHelper.addArmorMaterial("build_freezer", Reference.MODID+":build_freezer", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDog = EnumHelper.addArmorMaterial("build_dog", Reference.MODID+":build_dog", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildMic = EnumHelper.addArmorMaterial("build_mike", Reference.MODID+":build_mike", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSanta = EnumHelper.addArmorMaterial("build_santa", Reference.MODID+":build_santa", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildCake = EnumHelper.addArmorMaterial("build_cake", Reference.MODID+":build_cake", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BuildTora = EnumHelper.addArmorMaterial("build_tora", Reference.MODID+":build_tora", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildUFO = EnumHelper.addArmorMaterial("build_ufo", Reference.MODID+":build_ufo", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildKujira = EnumHelper.addArmorMaterial("build_kujira", Reference.MODID+":build_kujira", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildJet = EnumHelper.addArmorMaterial("build_jet", Reference.MODID+":build_jet", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSika = EnumHelper.addArmorMaterial("build_sika", Reference.MODID+":build_sika", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildPyramid = EnumHelper.addArmorMaterial("build_pyramid", Reference.MODID+":build_pyramid", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildKirin = EnumHelper.addArmorMaterial("build_kirin", Reference.MODID+":build_kirin", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildFan = EnumHelper.addArmorMaterial("build_fan", Reference.MODID+":build_fan", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildPenguin = EnumHelper.addArmorMaterial("build_penguin", Reference.MODID+":build_penguin", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSkate = EnumHelper.addArmorMaterial("build_skate", Reference.MODID+":build_skate", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSame = EnumHelper.addArmorMaterial("build_same", Reference.MODID+":build_same", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildBike = EnumHelper.addArmorMaterial("build_bike", Reference.MODID+":build_bike", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildHachi = EnumHelper.addArmorMaterial("build_hachi", Reference.MODID+":build_hachi", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSubmarine = EnumHelper.addArmorMaterial("build_submarine", Reference.MODID+":build_submarine", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSai = EnumHelper.addArmorMaterial("build_sai", Reference.MODID+":build_sai", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDrier = EnumHelper.addArmorMaterial("build_drier", Reference.MODID+":build_drier", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildBat = EnumHelper.addArmorMaterial("build_bat", Reference.MODID+":build_bat", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildEngine = EnumHelper.addArmorMaterial("build_engine", Reference.MODID+":build_engine", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BuildObake = EnumHelper.addArmorMaterial("build_obake", Reference.MODID+":build_obake", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildMagnet = EnumHelper.addArmorMaterial("build_magnet", Reference.MODID+":build_magnet", 20, new int[]{10, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BuildMetalTank = EnumHelper.addArmorMaterial("build_metaltank", Reference.MODID+":build_metaltank", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial BuildGoldRabbit = EnumHelper.addArmorMaterial("build_goldrabbit", Reference.MODID+":build_goldrabbit", 20, new int[]{18, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BuildSilverDragon = EnumHelper.addArmorMaterial("build_silverdragon", Reference.MODID+":build_silverdragon", 20, new int[]{18, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static final ArmorMaterial CrossZ_Dragon = EnumHelper.addArmorMaterial("crossz_dragon", Reference.MODID+":build_crossz", 30, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BuildBatLost = EnumHelper.addArmorMaterial("build_bat_lost",Reference.MODID+":build_bat_lost", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildCobra = EnumHelper.addArmorMaterial("build_cobra_lost",Reference.MODID+":build_cobra_lost", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);
	public static final ArmorMaterial BuildCastle = EnumHelper.addArmorMaterial("build_castle",Reference.MODID+":build_castle", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);
	public static final ArmorMaterial BuildStag = EnumHelper.addArmorMaterial("build_stag",Reference.MODID+":build_stag", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildOwl = EnumHelper.addArmorMaterial("build_owl",Reference.MODID+":build_owl", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildCD = EnumHelper.addArmorMaterial("build_cd",Reference.MODID+":build_cd", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildSpana = EnumHelper.addArmorMaterial("build_spana",Reference.MODID+":build_spana", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildZebra = EnumHelper.addArmorMaterial("build_zebra",Reference.MODID+":build_zebra", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildHammer = EnumHelper.addArmorMaterial("build_hammer",Reference.MODID+":build_hammer", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildScissors = EnumHelper.addArmorMaterial("build_scissors",Reference.MODID+":build_scissors", 20, new int[]{12, 0, 0, 12},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BuildRuin = EnumHelper.addArmorMaterial("build_ruin",Reference.MODID+":build_ruin", 20, new int[]{8, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildOOPArts = EnumHelper.addArmorMaterial("build_ooparts",Reference.MODID+":build_ooparts", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);
	public static final ArmorMaterial BuildMirror = EnumHelper.addArmorMaterial("build_mirror",Reference.MODID+":build_mirror", 20, new int[]{6, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);
	public static final ArmorMaterial BuildOrphenoch = EnumHelper.addArmorMaterial("build_orphenoch", Reference.MODID+":build_orphenoch", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildFAIZGear = EnumHelper.addArmorMaterial("build_faizgear", Reference.MODID+":build_faizgear", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildTrump = EnumHelper.addArmorMaterial("build_trump",Reference.MODID+":build_trump", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildOgre = EnumHelper.addArmorMaterial("build_ogre",Reference.MODID+":build_ogre", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDrum = EnumHelper.addArmorMaterial("build_drum",Reference.MODID+":build_drum", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildMomotaros = EnumHelper.addArmorMaterial("build_momotaros",Reference.MODID+":build_momotaros", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildZector = EnumHelper.addArmorMaterial("build_zector",Reference.MODID+":build_zector", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildViolin = EnumHelper.addArmorMaterial("build_viorin",Reference.MODID+":build_viorin", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildRidercard = EnumHelper.addArmorMaterial("build_ridercard",Reference.MODID+":build_ridercard", 20, new int[]{10, 2, 0, 8},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildDetective = EnumHelper.addArmorMaterial("build_detective", Reference.MODID+":build_detective", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildUSB = EnumHelper.addArmorMaterial("build_usb", Reference.MODID+":build_usb",20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildMedal = EnumHelper.addArmorMaterial("build_medal", Reference.MODID+":build_medal", 20, new int[]{8, 0, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial BuildFriendship = EnumHelper.addArmorMaterial("build_friendship",Reference.MODID+":build_friendship", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildWizard = EnumHelper.addArmorMaterial("build_wizard",Reference.MODID+":build_wizard", 20, new int[]{10, 2, 0, 11},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildOrange = EnumHelper.addArmorMaterial("build_orange",Reference.MODID+":build_orange", 20, new int[]{10, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildPolice = EnumHelper.addArmorMaterial("build_police",Reference.MODID+":build_police", 20, new int[]{10, 2, 0, 6},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildParka = EnumHelper.addArmorMaterial("build_parka",Reference.MODID+":build_parka", 20, new int[]{8, 2, 0, 10},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial BuildDoctor = EnumHelper.addArmorMaterial("build_doctor", Reference.MODID+":build_doctor", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildGame = EnumHelper.addArmorMaterial("build_game", Reference.MODID+":build_game", 20, new int[]{9, 2, 0, 9},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BuildKamenRider = EnumHelper.addArmorMaterial("build_kamenrider",Reference.MODID+":build_kamenrider", 20, new int[]{10, 2, 0, 8},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item BUILD_DRIVER = new ArmorBuildDriver("build_driver",Wmod.TabKamenRiderBUILD,DRIVER_BUILD,EntityEquipmentSlot.LEGS);
	public static final Item HAZARD_TRIGGER= new ItemDriverSummoner("hazard_trigger",Wmod.TabKamenRiderBUILD);
	// public static final Item BUILD_DRIVER_HAZARD = new ArmorBuildDriverHazard("build_driver_hazard",Wmod.TabKamenRiderBUILD,DRIVER_BUILD,EntityEquipmentSlot.LEGS);
	//	public static final Item SCLUSH_DRIVER = new ArmorHazardBuildDriver("build_driver_hazard",Wmod.TabKamenRiderBuild,DRIVER_BUILD,EntityEquipmentSlot.LEGS);
	//	public static final Item EVOL_DRIVER = new ArmorHazardBuildDriver("build_driver_hazard",Wmod.TabKamenRiderBuild,DRIVER_BUILD,EntityEquipmentSlot.LEGS);
	//  public static final Item EVOL_TRIGGER= new ItemDriverSummoner("hazard_trigger",Wmod.TabKamenRiderBUILD);

	public static final Item BottleEMPTY = new ItemEmptyBottle("fullbottle_empty",Wmod.TabKamenRiderBUILD);
	public static final Item BottleRABBIT = new ArmorBuildRabbit("fullbottle_rabbit",Wmod.TabKamenRiderBUILD,BuildRabbit,EntityEquipmentSlot.HEAD);
	public static final Item BottleTANK = new ArmorBuildTank("fullbottle_tank",Wmod.TabKamenRiderBUILD,BuildTank,EntityEquipmentSlot.FEET);
	public static final Item BottleGORILLA = new ArmorBuildGorilla("fullbottle_gorilla",Wmod.TabKamenRiderBUILD,BuildGorilla,EntityEquipmentSlot.HEAD);
	public static final Item BottleDIAMOND= new ArmorBuildDiamond("fullbottle_diamond",Wmod.TabKamenRiderBUILD,BuildDiamond,EntityEquipmentSlot.FEET);
	public static final Item BottleHAWK = new ArmorBuildTaka("fullbottle_hawk",Wmod.TabKamenRiderBUILD,BuildHawk,EntityEquipmentSlot.HEAD);
	public static final Item BottleGATLING = new ArmorBuildGatling("fullbottle_gatling",Wmod.TabKamenRiderBUILD,BuildGatling,EntityEquipmentSlot.FEET);
	public static final Item BottleNINJA = new ArmorBuildNinja("fullbottle_ninja",Wmod.TabKamenRiderBUILD,BuildNinja,EntityEquipmentSlot.HEAD);
	public static final Item BottleCOMIC = new ArmorBuildComic("fullbottle_comic",Wmod.TabKamenRiderBUILD,BuildComic,EntityEquipmentSlot.FEET);
	public static final Item BottlePANDA = new ArmorBuildPanda("fullbottle_panda",Wmod.TabKamenRiderBUILD,BuildPanda,EntityEquipmentSlot.HEAD);
	public static final Item BottleROCKET = new ArmorBuildRocket("fullbottle_rocket",Wmod.TabKamenRiderBUILD,BuildRocket,EntityEquipmentSlot.FEET);
	public static final Item BottleHEDGEHOG = new ArmorBuildHedgehog("fullbottle_hedgehog",Wmod.TabKamenRiderBUILD,BuildHedgehog,EntityEquipmentSlot.HEAD);
	public static final Item BottleFIRERESCUE = new ArmorBuildFireRescue("fullbottle_firerescue",Wmod.TabKamenRiderBUILD,BuildFireRescue,EntityEquipmentSlot.FEET);
	public static final Item BottleLION = new ArmorBuildLion("fullbottle_lion",Wmod.TabKamenRiderBUILD,BuildLion,EntityEquipmentSlot.HEAD);
	public static final Item BottleCLEANER = new ArmorBuildCleaner("fullbottle_cleaner",Wmod.TabKamenRiderBUILD,BuildCleaner,EntityEquipmentSlot.FEET);
	public static final Item BottleDRAGON = new ArmorBuildDragon("fullbottle_dragon",Wmod.TabKamenRiderBUILD,BuildDragon,EntityEquipmentSlot.HEAD);
	public static final Item BottleLOCK = new ArmorBuildLock("fullbottle_lock",Wmod.TabKamenRiderBUILD,BuildLock,EntityEquipmentSlot.FEET);
	public static final Item BottleKAIZOKU = new ArmorBuildKaizoku("fullbottle_kaizoku",Wmod.TabKamenRiderBUILD,BuildKaizoku,EntityEquipmentSlot.HEAD);
	public static final Item BottleDENSYA = new ArmorBuildDensya("fullbottle_densya",Wmod.TabKamenRiderBUILD,BuildDensya,EntityEquipmentSlot.FEET);
	public static final Item BottleOCTOPAS = new ArmorBuildOctopas("fullbottle_octopas",Wmod.TabKamenRiderBUILD,BuildOctopas,EntityEquipmentSlot.HEAD);
	public static final Item BottleLIGHT = new ArmorBuildLight("fullbottle_light",Wmod.TabKamenRiderBUILD,BuildLight,EntityEquipmentSlot.FEET);
	public static final Item BottlePHOENIX = new ArmorBuildPhoenix("fullbottle_phoenix",Wmod.TabKamenRiderBUILD,BuildPhoenix,EntityEquipmentSlot.HEAD);
	public static final Item BottleROBOT = new ArmorBuildRobot("fullbottle_robot",Wmod.TabKamenRiderBUILD,BuildRobot,EntityEquipmentSlot.FEET);
	public static final Item BottleWOLF = new ArmorBuildWolf("fullbottle_wolf",Wmod.TabKamenRiderBUILD,BuildWolf,EntityEquipmentSlot.HEAD);
	public static final Item BottleSMAPHO = new ArmorBuildSmapho("fullbottle_smapho",Wmod.TabKamenRiderBUILD,BuildSmartphone,EntityEquipmentSlot.FEET);
	public static final Item BottleUNICORN = new ArmorBuildUnicorn("fullbottle_unicorn",Wmod.TabKamenRiderBUILD,BuildUnicorn,EntityEquipmentSlot.HEAD);
	public static final Item BottleERASER = new ArmorBuildEraser("fullbottle_eraser",Wmod.TabKamenRiderBUILD,BuildEraser,EntityEquipmentSlot.FEET);
	public static final Item BottleROSE = new ArmorBuildRose("fullbottle_rose",Wmod.TabKamenRiderBUILD,BuildRose,EntityEquipmentSlot.HEAD);
	public static final Item BottleHELICOPTER = new ArmorBuildHelicopter("fullbottle_helicopter",Wmod.TabKamenRiderBUILD,BuildHelicopter,EntityEquipmentSlot.FEET);
	public static final Item BottleTURTLE = new ArmorBuildTurtle("fullbottle_turtle",Wmod.TabKamenRiderBUILD,BuildTurtle,EntityEquipmentSlot.HEAD);
	public static final Item BottleWATCH = new ArmorBuildWatch("fullbottle_watch",Wmod.TabKamenRiderBUILD,BuildWatch,EntityEquipmentSlot.FEET);
	public static final Item BottleKUMA = new ArmorBuildKuma("fullbottle_kuma",Wmod.TabKamenRiderBUILD,BuildKuma,EntityEquipmentSlot.HEAD);
	public static final Item BottleTV = new ArmorBuildTV("fullbottle_tv",Wmod.TabKamenRiderBUILD,BuildTV,EntityEquipmentSlot.FEET);
	public static final Item BottleBEETLE =  new ArmorBuildBeetle("fullbottle_beetle",Wmod.TabKamenRiderBUILD,BuildBeetle,EntityEquipmentSlot.HEAD);
	public static final Item BottleCAMERA = new ArmorBuildCamera("fullbottle_camera",Wmod.TabKamenRiderBUILD,BuildCamera,EntityEquipmentSlot.FEET);
	public static final Item BottleSPIDER = new ArmorBuildSpider("fullbottle_spider",Wmod.TabKamenRiderBUILD,BuildSpider,EntityEquipmentSlot.HEAD);
	public static final Item BottleFREEZER = new ArmorBuildFreezer("fullbottle_freezer",Wmod.TabKamenRiderBUILD,BuildFreezer,EntityEquipmentSlot.FEET);
	public static final Item BottleDOG = new ArmorBuildDog("fullbottle_dog",Wmod.TabKamenRiderBUILD,BuildDog,EntityEquipmentSlot.HEAD);
	public static final Item BottleMIC = new ArmorBuildMic("fullbottle_mic",Wmod.TabKamenRiderBUILD,BuildMic,EntityEquipmentSlot.FEET);
	public static final Item BottleSANTA = new ArmorBuildSanta("fullbottle_santa",Wmod.TabKamenRiderBUILD,BuildSanta,EntityEquipmentSlot.HEAD);
	public static final Item BottleCAKE = new ArmorBuildCake("fullbottle_cake",Wmod.TabKamenRiderBUILD,BuildCake,EntityEquipmentSlot.FEET);
	public static final Item BottleTORA = new ArmorBuildTora("fullbottle_tora",Wmod.TabKamenRiderBUILD,BuildTora,EntityEquipmentSlot.HEAD);
	public static final Item BottleUFO = new ArmorBuildUFO("fullbottle_ufo",Wmod.TabKamenRiderBUILD,BuildUFO,EntityEquipmentSlot.FEET);
	public static final Item BottleKUJIRA = new ArmorBuildKujira("fullbottle_kujira",Wmod.TabKamenRiderBUILD,BuildKujira,EntityEquipmentSlot.HEAD);
	public static final Item BottleJET = new ArmorBuildJet("fullbottle_jet",Wmod.TabKamenRiderBUILD,BuildJet,EntityEquipmentSlot.FEET);
	public static final Item BottleSIKA = new ArmorBuildSika("fullbottle_sika",Wmod.TabKamenRiderBUILD,BuildSika,EntityEquipmentSlot.HEAD);
	public static final Item BottlePYRAMID = new ArmorBuildPyramid("fullbottle_pyramid",Wmod.TabKamenRiderBUILD,BuildPyramid,EntityEquipmentSlot.FEET);
	public static final Item BottleKIRIN = new ArmorBuildKirin("fullbottle_kirin",Wmod.TabKamenRiderBUILD,BuildKirin,EntityEquipmentSlot.HEAD);
	public static final Item BottleFAN = new ArmorBuildFan("fullbottle_fan",Wmod.TabKamenRiderBUILD,BuildFan,EntityEquipmentSlot.FEET);
	public static final Item BottlePENGUIN = new ArmorBuildPenguin("fullbottle_penguin",Wmod.TabKamenRiderBUILD,BuildPenguin,EntityEquipmentSlot.HEAD);
	public static final Item BottleSKATE = new ArmorBuildSkate("fullbottle_skate",Wmod.TabKamenRiderBUILD,BuildSkate,EntityEquipmentSlot.FEET);
	public static final Item BottleSAME = new ArmorBuildSame("fullbottle_same",Wmod.TabKamenRiderBUILD,BuildSame,EntityEquipmentSlot.HEAD);
	public static final Item BottleBIKE = new ArmorBuildBike("fullbottle_bike",Wmod.TabKamenRiderBUILD,BuildBike,EntityEquipmentSlot.FEET);
	public static final Item BottleHACHI = new ArmorBuildHachi("fullbottle_hachi",Wmod.TabKamenRiderBUILD,BuildHachi,EntityEquipmentSlot.HEAD);
	public static final Item BottleSUBMARINE = new ArmorBuildSubmarine("fullbottle_submarine",Wmod.TabKamenRiderBUILD,BuildSubmarine,EntityEquipmentSlot.FEET);
	public static final Item BottleSAI = new ArmorBuildSai("fullbottle_sai",Wmod.TabKamenRiderBUILD,BuildSai,EntityEquipmentSlot.HEAD);
	public static final Item BottleDRIER = new ArmorBuildDrier("fullbottle_drier",Wmod.TabKamenRiderBUILD,BuildDrier,EntityEquipmentSlot.FEET);
	public static final Item BottleBAT = new ArmorBuildBat("fullbottle_bat",Wmod.TabKamenRiderBUILD,BuildBat,EntityEquipmentSlot.HEAD);
	public static final Item BottleENGINE = new ArmorBuildEngine("fullbottle_engine",Wmod.TabKamenRiderBUILD,BuildEngine,EntityEquipmentSlot.FEET);
	public static final Item BottleOBAKE = new ArmorBuildObake("fullbottle_obake",Wmod.TabKamenRiderBUILD,BuildObake,EntityEquipmentSlot.HEAD);
	public static final Item BottleMAGNET = new ArmorBuildMagnet("fullbottle_magnet",Wmod.TabKamenRiderBUILD,BuildMagnet,EntityEquipmentSlot.FEET);

	public static final Item BottleBAT_LOST = new ItemBase("fullbottle_bat_lost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleCOBRA = new ItemBase("fullbottle_cobra",Wmod.TabKamenRiderBUILD);
	public static final Item BottleCASTLE = new ItemBase("fullbottle_castle",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSTAG = new ArmorBuildStag("fullbottle_stag",Wmod.TabKamenRiderBUILD,BuildStag,EntityEquipmentSlot.HEAD);
	public static final Item BottleOWL = new ItemBase("fullbottle_owl",Wmod.TabKamenRiderBUILD);
	public static final Item BottleZEBRA = new ItemBase("fullbottle_zebra",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSCISSORS = new ItemBase("fullbottle_scissors",Wmod.TabKamenRiderBUILD);	 
	public static final Item BottleCD = new ItemBase("fullbottle_cd",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSPANA = new ItemBase("fullbottle_spana",Wmod.TabKamenRiderBUILD);
	public static final Item BottleHAMMER = new ItemBase("fullbottle_hammer",Wmod.TabKamenRiderBUILD);

	public static final Item BottleBAT_BLACKLOST = new ItemBase("fullbottle_bat_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleCOBRA_BLACKLOST = new ItemBase("fullbottle_cobra_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleCASTLE_BLACKLOST = new ItemBase("fullbottle_castle_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSTAG_BLACKLOST = new ItemBase("fullbottle_stag_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleOWL_BLACKLOST = new ItemBase("fullbottle_owl_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleZEBRA_BLACKLOST = new ItemBase("fullbottle_zebra_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSCISSORS_BLACKLOST = new ItemBase("fullbottle_scissors_blacklost",Wmod.TabKamenRiderBUILD);	 
	public static final Item BottleCD_BLACKLOST = new ItemBase("fullbottle_cd_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleSPANA_BLACKLOST = new ItemBase("fullbottle_spana_blacklost",Wmod.TabKamenRiderBUILD);
	public static final Item BottleHAMMER_BLACKLOST = new ItemBase("fullbottle_hammer_blacklost",Wmod.TabKamenRiderBUILD);

	public static final Item BottleGOLDRABBIT = new ArmorBuildRabbitGold("fullbottle_goldrabbit",Wmod.TabKamenRiderBUILD,BuildGoldRabbit,EntityEquipmentSlot.HEAD);
	public static final Item BottleSILVERDRAGON = new ArmorBuildDragonSilver("fullbottle_silverdragon",Wmod.TabKamenRiderBUILD,BuildSilverDragon,EntityEquipmentSlot.FEET);
	public static final Item BottleLOWRABBIT = new ItemBase2("fullbottle_lowrabbit",Wmod.TabKamenRiderBUILD);
	public static final Item BottleMETALTANK = new ArmorBuildTankMetal("fullbottle_metaltank",Wmod.TabKamenRiderBUILD,BuildMetalTank,EntityEquipmentSlot.FEET);

	//public static final Item BottleSPARKING = new ItemBase("fullbottle_sparking",Wmod.TabKamenRiderBuild);
	//public static final Item BottleFULLFULL = new ItemBase("fullbottle_fullfull",Wmod.TabKamenRiderBuild);
	//public static final Item BottleFULLFULL_RABBIT = new ItemBase("fullbottle_fullrabbit",Wmod.TabKamenRiderBuild);
	//public static final Item BottleFULLFULL_TANK = new ItemBase("fullbottle_fulltank",Wmod.TabKamenRiderBuild);
	//public static final Item BottleGENIUS = new ItemBase("fullbottle_genius",Wmod.TabKamenRiderBuild);
	//public static final Item BottleCROSSZ_BUILD = new ItemBase("fullbottle_crosszbuild",Wmod.TabKamenRiderBuild);

	public static final Item CrossZDRAGON = new ArmorCrossZ("crossz_dragon",Wmod.TabKamenRiderBUILD, CrossZ_Dragon,EntityEquipmentSlot.FEET);
	public static final Item CrossZDRAGON_GREAT = new ItemBase("crossz_dragon_great",Wmod.TabKamenRiderBUILD);
	//public static final Item KNUCKLE_MAGMA = new ItemBase("knuckle_magma",Wmod.TabKamenRiderBuild);
	//public static final Item KNUCKLE_BLIZZARD = new ItemBase("knuckle_blizzard",Wmod.TabKamenRiderBuild);
	//public static final Item PERFECT_KINGDOM = new ItemBase("grease_perfect",Wmod.TabKamenRiderBuild);
	//public static final Item BottlePRIME_ROUGE = new ItemBase("fullbottle_hammer",Wmod.TabKamenRiderBuild);

	//public static final Item JerryDRAGON = new ItemBase("fullbottle_momotaros",Wmod.TabKamenRiderBuild);
	//public static final Item JerryROBOT = new ItemBase("fullbottle_momotaros",Wmod.TabKamenRiderBuild);
	//public static final Item BottleCrocodile = new ItemBase("fullbottle_spana",Wmod.TabKamenRiderBuild);

	public static final Item BottleRUIN = new ArmorLMRuin("fullbottle_ruin",Wmod.TabKamenRiderBUILD,BuildRuin,EntityEquipmentSlot.FEET);
	public static final Item BottleOOPARTS = new ArmorLMOOPARTS("fullbottle_ooparts",Wmod.TabKamenRiderBUILD,BuildOOPArts,EntityEquipmentSlot.FEET);
	public static final Item BottleMIRROR = new ArmorLMMirror("fullbottle_mirror",Wmod.TabKamenRiderBUILD,BuildMirror,EntityEquipmentSlot.FEET);
	//	public static final Item BottleORPHENOCH  = new ArmorLMOrphenoch("fullbottle_orphenoch",Wmod.TabKamenRiderBUILD,BuildOrphenoch,EntityEquipmentSlot.HEAD);
	//	public static final Item BottleFAIZGear = new ArmorLMFAIZGear("fullbottle_faizgear",Wmod.TabKamenRiderBUILD,BuildFAIZGear,EntityEquipmentSlot.FEET);
	public static final Item BottleTRUMP = new ArmorLMTrump("fullbottle_trump",Wmod.TabKamenRiderBUILD,BuildTrump,EntityEquipmentSlot.FEET);
	public static final Item BottleORGE  = new ArmorLMOgre("fullbottle_ogre",Wmod.TabKamenRiderBUILD,BuildOgre,EntityEquipmentSlot.HEAD);
	public static final Item BottleDRUM = new ArmorLMDrum("fullbottle_drum",Wmod.TabKamenRiderBUILD,BuildDrum,EntityEquipmentSlot.FEET);
	public static final Item BottleZECTOR = new ArmorLMZector("fullbottle_zector",Wmod.TabKamenRiderBUILD,BuildZector,EntityEquipmentSlot.FEET);
	//	public static final Item BottleMOMOTAROS = new ArmorLMMOMOTAROS("fullbottle_momotaros",Wmod.TabKamenRiderBUILD,BuildMomotaros,EntityEquipmentSlot.HEAD);
	//	public static final Item BottleVIOLIN = new ArmorLMViolin("fullbottle_violin",Wmod.TabKamenRiderBUILD,BuildViolin,EntityEquipmentSlot.FEET);
	public static final Item BottleRIDERCARD = new ArmorLMRidercard("fullbottle_ridercard",Wmod.TabKamenRiderBUILD,BuildRidercard,EntityEquipmentSlot.HEAD);
	public static final Item BottleDETECTIVE = new ArmorLMDetective("fullbottle_detective",Wmod.TabKamenRiderBUILD,BuildDetective,EntityEquipmentSlot.HEAD);
	public static final Item BottleUSB = new ArmorLMUSB("fullbottle_usb",Wmod.TabKamenRiderBUILD,BuildUSB,EntityEquipmentSlot.FEET);
	public static final Item BottleMEDAL = new ArmorLMMedal("fullbottle_medal",Wmod.TabKamenRiderBUILD,BuildMedal,EntityEquipmentSlot.FEET);
	public static final Item BottleFRIENDSHIP = new ArmorLMFriendship("fullbottle_friendship",Wmod.TabKamenRiderBUILD,BuildFriendship,EntityEquipmentSlot.HEAD);
	public static final Item BottleWIZARD = new ArmorLMWizard("fullbottle_wizard",Wmod.TabKamenRiderBUILD,BuildWizard,EntityEquipmentSlot.HEAD);
	public static final Item BottleORANGE = new ArmorLMOrange("fullbottle_orange",Wmod.TabKamenRiderBUILD,BuildOrange,EntityEquipmentSlot.HEAD);
	public static final Item BottlePOLICE = new ArmorLMPolice("fullbottle_police",Wmod.TabKamenRiderBUILD,BuildPolice,EntityEquipmentSlot.HEAD);
	public static final Item BottlePARKA = new ArmorLMParka("fullbottle_parka",Wmod.TabKamenRiderBUILD,BuildParka,EntityEquipmentSlot.FEET);
	public static final Item BottleDOCTOR = new ArmorLMDoctor("fullbottle_doctor",Wmod.TabKamenRiderBUILD,BuildDoctor,EntityEquipmentSlot.HEAD);
	public static final Item BottleGAME = new ArmorLMGame("fullbottle_game",Wmod.TabKamenRiderBUILD,BuildGame,EntityEquipmentSlot.FEET);
	//	public static final Item BottleRIDER = new ArmorLMKamenRider("fullbottle_rider",Wmod.TabKamenRiderBUILD,BuildKamenRider,EntityEquipmentSlot.HEAD);

	//ZI-O
	public static final ArmorMaterial DRIVER_ZIO = EnumHelper.addArmorMaterial("quarzer", Reference.MODID+":zio_ziku_driver", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BEYOND = EnumHelper.addArmorMaterial("blackorwhite_woz", Reference.MODID+":beyondriver", 40, new int[]{0, 2, 3, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_MIRAI = EnumHelper.addArmorMaterial("another_future", Reference.MODID+":zio_mirai_driver", 20, new int[]{0, 2, 0 ,15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_QUIZ = EnumHelper.addArmorMaterial("question", Reference.MODID+":zio_quiz_driver", 20, new int[]{0, 2, 0 ,15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial RIDER_ZIO = EnumHelper.addArmorMaterial("zio", Reference.MODID+":zio", 40, new int[]{0, 2, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RIDER_GEIZ = EnumHelper.addArmorMaterial("geiz", Reference.MODID+":geiz", 40, new int[]{0, 2, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial KUUGA_ARMOR = EnumHelper.addArmorMaterial("zio_kuuga", Reference.MODID+":kuuga_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial AGITO_ARMOR = EnumHelper.addArmorMaterial("zio_agito", Reference.MODID+":agito_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial RYUKI_ARMOR = EnumHelper.addArmorMaterial("zio_ryuki", Reference.MODID+":ryuki_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial FAIZ_ARMOR = EnumHelper.addArmorMaterial("zio_faiz", Reference.MODID+":faiz_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BLADE_ARMOR = EnumHelper.addArmorMaterial("zio_blade", Reference.MODID+":blade_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial HIBIKI_ARMOR = EnumHelper.addArmorMaterial("zio_hibiki", Reference.MODID+":hibiki_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KABUTO_ARMOR = EnumHelper.addArmorMaterial("zio_kabuto", Reference.MODID+":kabuto_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DENO_ARMOR = EnumHelper.addArmorMaterial("zio_deno", Reference.MODID+":deno_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KIVA_ARMOR = EnumHelper.addArmorMaterial("zio_kiva", Reference.MODID+":kiva_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DECADE_ARMOR = EnumHelper.addArmorMaterial("zio_decade", Reference.MODID+":decade_armor", 40, new int[]{3, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial W_ARMOR = EnumHelper.addArmorMaterial("zio_w", Reference.MODID+":w_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial OOO_ARMOR = EnumHelper.addArmorMaterial("zio_ooo", Reference.MODID+":ooo_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial FOURZE_ARMOR = EnumHelper.addArmorMaterial("zio_fourze", Reference.MODID+":fourze_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial WIZARD_ARMOR = EnumHelper.addArmorMaterial("zio_wizard", Reference.MODID+":wizard_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial GAIM_ARMOR = EnumHelper.addArmorMaterial("zio_gaim", Reference.MODID+":gaim_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DRIVE_ARMOR = EnumHelper.addArmorMaterial("zio_drive", Reference.MODID+":drive_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial GHOST_ARMOR = EnumHelper.addArmorMaterial("zio_ghost", Reference.MODID+":ghost_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial EXAID_ARMOR = EnumHelper.addArmorMaterial("zio_exaid", Reference.MODID+":exaid_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BUILD_ARMOR = EnumHelper.addArmorMaterial("zio_build", Reference.MODID+":build_armor", 40, new int[]{0, 2, 3, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final ArmorMaterial RIDER_SHINOBI = EnumHelper.addArmorMaterial("ninja", Reference.MODID+":zio_shinobi", 20, new int[]{0, 2, 0 ,15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RIDER_HATTARI = EnumHelper.addArmorMaterial("hattari", Reference.MODID+":zio_hattari", 15, new int[]{0, 2, 0 ,13},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial RIDER_QUIZ = EnumHelper.addArmorMaterial("question", Reference.MODID+":zio_quiz", 20, new int[]{0, 2, 0 ,15},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item ZIKU_DRIVER = new ArmorZikuDriver("ziku_driver",Wmod.TabKamenRiderZIO,DRIVER_ZIO,EntityEquipmentSlot.LEGS);
	public static final Item RideWatchZIO = new ItemBase("ridewatch_zio",Wmod.TabKamenRiderZIO);// new ArmorZIO("ridewatch_zio",Wmod.TabKamenRiderZIO,ZIO,EntityEquipmentSlot.HEAD);
	// 	public static final Item RideWatchGEIZ = new ArmorGEIZ("ridewatch_geiz",Wmod.TabKamenRiderZIO,GEIZ,EntityEquipmentSlot.HEAD);
	//	public static final Item RidewatchWOZ = new ItemBase("ridewatch_woz",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchTSUKUYOMI = new ItemBase("ridewatch_tsukuyomi",Wmod.TabKamenRiderZIO);

	//   public static final Item RidewatchZIO2 = new ItemBase("ridewatch_zio2",Wmod.TabKamenRiderZIO);
	//   public static final Item RidewatchReviveG = new ItemBase("ridewatch_revive_gouretsu",Wmod.TabKamenRiderZIO);
	//   public static final Item RidewatchReviveS = new ItemBase("ridewatch_revive_shippuu",Wmod.TabKamenRiderZIO);
	//   public static final Item RidewatchTrinity = new ItemBase("ridewatch_trinity",Wmod.TabKamenRiderZIO);
	// 	 public static final Item RidewatchGrandZIO= new ItemBase("ridewatch_grandzio",Wmod.TabKamenRiderZIO);
	//	 public static final Item RidewatchGeizMajesty= new ItemBase("ridewatch_majesty",Wmod.TabKamenRiderZIO);
	//	 public static final Item RidewatchOhma = new ItemBase("ridewatch_ohmazio",Wmod.TabKamenRiderZIO);

	public static final Item RidewatchBlank = new ItemBase2("ridewatch_blank",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchKuuga = new ArmorKuugaArmor("ridewatch_kuuga",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchAgito = new ArmorAgitoArmor("ridewatch_agito",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchRyuki = new ArmorRyukiArmor("ridewatch_ryuki",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchFaiz = new ItemBase("ridewatch_faiz",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchBlade = new ArmorBladeArmor("ridewatch_blade",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchHibiki = new ArmorHIbikiArmor("ridewatch_hibiki",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchKabuto = new ArmorKabutoArmor("ridewatch_kabuto",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchDenO = new ItemBase("ridewatch_deno",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchKiva = new ItemBase("ridewatch_kiva",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchDecade = new ArmorDecadeArmor("ridewatch_decade",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchW = new ArmorWArmor("ridewatch_w",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchOOO = new ArmorOOOArmor("ridewatch_ooo",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchFourze = new  ArmorFourzeArmor("ridewatch_fourze",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchWizard = new ArmorWizardArmor("ridewatch_wizard",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchGaim = new ArmorGaimArmor("ridewatch_gaim",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchDrive = new ArmorDriveArmor("ridewatch_drive",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchGhost = new ArmorGhostArmor("ridewatch_ghost",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchExaid = new ArmorExaidArmor("ridewatch_exaid",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchBuild = new ArmorBuildArmor("ridewatch_build",Wmod.TabKamenRiderZIO);

	public static final Item RidewatchGenm = new ItemBase("ridewatch_genm",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchG3 = new ItemBase("ridewatch_g3",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchKnight = new ItemBase("ridewatch_knight",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchKaiza = new ItemBase("ridewatch_kaiza",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchGarren = new ItemBase("ridewatch_garren",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchIbuki = new ItemBase("ridewatch_ibuki",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchGatack = new ItemBase("ridewatch_gatack",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchZeronos = new ItemBase("ridewatch_zeronos",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchIxa = new ItemBase("ridewatch_ixa",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchDiend = new ItemBase("ridewatch_diend",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchAccel = new ItemBase("ridewatch_accel",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchBirth = new ItemBase("ridewatch_birth",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchMeteor = new ItemBase("ridewatch_meteor",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchBeast = new ItemBase("ridewatch_beast",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchBaron = new ItemBase("ridewatch_baron",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchMach = new ItemBase("ridewatch_mach",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchSpector = new ItemBase("ridewatch_spector",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchBrave = new ItemBase("ridewatch_brave",Wmod.TabKamenRiderZIO);
	public static final Item RidewatchCrossZ = new ItemBase("ridewatch_crossz",Wmod.TabKamenRiderZIO);

	//	public static final Item RidewatchZeroone = new ItemBase("ridewatch_zeroone",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchSaber = new ItemBase("ridewatch_saber",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchRevi = new ItemBase("ridewatch_revi",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchVice = new ItemBase("ridewatch_vice",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchGeats = new ItemBase("ridewatch_geats",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchGotchard = new ItemBase("ridewatch_gotchard",Wmod.TabKamenRiderZIO);	
	//	public static final Item RidewatchLegend = new ItemBase("ridewatch_legend",Wmod.TabKamenRiderZIO);	
	//	public static final Item RidewatchGavv = new ItemBase("ridewatch_gavv",Wmod.TabKamenRiderZIO);	
	//	public static final Item RidewatchZeztz = new ItemBase("ridewatch_zeztz",Wmod.TabKamenRiderZIO);	
	//	public static final Item RidewatchMyth = new ItemBase("ridewatch_myth",Wmod.TabKamenRiderZIO);	

	// 	 public static final Item ZIKANGILADE_KEN= new ItemBase("zikangirade_ken",Wmod.TabKamenRiderZIO);
	// 	 public static final Item ZIKANGILADE_JYU= new ItemBase("zikangirade_jyu",Wmod.TabKamenRiderZIO);
	//	 public static final Item ZIKANZAX_OHNO= new ItemBase("zikanzax_ono",Wmod.TabKamenRiderZIO);
	//	 public static final Item ZIKANZAX_YOUME= new ItemBase("zikanzax_youme",Wmod.TabKamenRiderZIO);
	//	 public static final Item ZIKANJACROW_NOKO= new ItemBase("zikanjacrow_noko",Wmod.TabKamenRiderZIO);
	//	 public static final Item ZIKANJACROW_TSUME= new ItemBase("zikanjacrow_tsume",Wmod.TabKamenRiderZIO);

	//	public static final Item RideWatchBARLCKX = new ArmorGEIZ("ridewatch_barlckx",Wmod.TabKamenRiderZIO,GEIZ,EntityEquipmentSlot.HEAD);
	//	public static final Item RidewatchZONJIS = new ItemBase("ridewatch_zonjis",Wmod.TabKamenRiderZIO);
	//	public static final Item RidewatchZAMONAS = new ItemBase("ridewatch_zamonas",Wmod.TabKamenRiderZIO);
	//  public static final Item RidewatchOverQuarzer = new ItemBase("ridewatch_quarzer",Wmod.TabKamenRiderZIO);

	public static final Item BEYONDRIVER = new ItemBase("beyondriver",Wmod.TabKamenRiderZIO);
	//	public static final Item MiridewatchWoz = new ItemBase("miridewatch_woz",Wmod.TabKamenRiderZIO);
	//	public static final Item MiridewatchSHINOBI = new ItemBase("miridewatch_shinobi",Wmod.TabKamenRiderZIO);
	//	public static final Item MiridewatchQUIZ = new ItemBase("miridewatch_quiz",Wmod.TabKamenRiderZIO);
	//	public static final Item MiridewatchKIKAI = new ItemBase("miridewatch_kikai",Wmod.TabKamenRiderZIO);
	//	public static final Item MiridewatchGINGA = new ItemBase("miridewatch_ginga",Wmod.TabKamenRiderZIO);
	//	 public static final Item ZIKAN_DE_SPEAR = new ItemBase("zikan_de_spear",Wmod.TabKamenRiderZIO);

	public static final Item MIRAI_DRIVER = new ArmorMiraiDriver("mirai_driver",Wmod.TabKamenRiderZIO,DRIVER_MIRAI,EntityEquipmentSlot.LEGS);
	public static final Item MIRAI_SHINOBI = new ArmorShinobi("mirai_shinobi_plate",Wmod.TabKamenRiderZIO,RIDER_SHINOBI,EntityEquipmentSlot.HEAD);
	public static final Item HYOUTAN_SHINOBI = new ItemDriverSummoner("mirai_shinobi_hyoutan",Wmod.TabKamenRiderZIO);
	public static final Item MIRAI_HATTARI = new ArmorHattari("mirai_hattari_plate",Wmod.TabKamenRiderZIO,RIDER_HATTARI,EntityEquipmentSlot.HEAD);
	public static final Item HYOUTAN_HATTARI = new ItemDriverSummoner("mirai_hattari_hyoutan",Wmod.TabKamenRiderZIO);
	public static final Item QUIZ_DRIVER = new ArmorQuizDriver("mirai_quiz_driver",Wmod.TabKamenRiderZIO,DRIVER_QUIZ,EntityEquipmentSlot.LEGS);
	public static final Item MIRAI_QUIZ = new ArmorQuiz("mirai_quiz_topper",Wmod.TabKamenRiderZIO,RIDER_QUIZ,EntityEquipmentSlot.HEAD);
	//	 public static final Item QUIZ_SINBOLIC = new ItemBase("mirai_quiz_sinbolic",Wmod.TabKamenRiderZIO);
	public static final Item QUIZ_PENDANT = new ItemDriverSummoner("mirai_quiz_pendant",Wmod.TabKamenRiderZIO);
	//	 public static final Item MIRAI_KIKAI = new ItemBase("mirai_kikai",Wmod.TabKamenRiderZIO);
	//	 public static final Item MIRAI_GINGA = new ItemBase("mirai_ginga",Wmod.TabKamenRiderZIO);

	//Zero-one
	public static final ArmorMaterial DRIVER_ZEROONE = EnumHelper.addArmorMaterial("satelite_zea", Reference.MODID+":zeroone_driver", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DRIVER_ZEROTWO = EnumHelper.addArmorMaterial("humagear_dream", Reference.MODID+":zerotwo_driver", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial SHOT_RISER = EnumHelper.addArmorMaterial("aims_squad", Reference.MODID+":shot_riser", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial FORCE_RISER = EnumHelper.addArmorMaterial("metsuboujinrai_net", Reference.MODID+":force_riser", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial RISING_HOPPER = EnumHelper.addArmorMaterial("zeroone_rising", Reference.MODID+":rising_hopper", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final Item ZEROONE_DRIVER = new ItemBase("zeroone_driver",Wmod.TabKamenRiderZEROONE);
	//	public static final Item AIMS_SHOTRISER = new ItemBase("shotriser",Wmod.TabKamenRiderZEROONE);
	public static final Item METSUBOUJINRAI_FORCERISER = new ItemBase("forceriser",Wmod.TabKamenRiderZEROONE);
	public static final Item ZEROTWO_DRIVER = new ItemBase("zerotwo_driver",Wmod.TabKamenRiderZEROONE);
	public static final Item ZEROTHREE_DRIVER = new ItemBase("zerothree_driver",Wmod.TabKamenRiderZEROONE);
	//	public static final Item CYCLONE_RISER = new ItemBase("cycloneriser",Wmod.TabKamenRiderZEROONE);
	//	public static final Item ARK_DRIVER = new ItemBase("ark_driver",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_RISING = new ItemBase("progrisekey_rising",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_BITING = new ItemBase("progrisekey_biting",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_FRYING = new ItemBase("progrisekey_frying",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_FRAMING = new ItemBase("progrisekey_flaming",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_FREEZING = new ItemBase("progrisekey_freezing",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_BREAKING = new ItemBase("progrisekey_breaking",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_REALIZING = new ArmorZeroOneRealizing("progrisekey_realizing",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_SHOOTING = new ItemBase("progrisekey_shooting",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_PUNCHING = new ItemBase("progrisekey_punching",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_GATLING = new ItemBase("progrisekey_gatling",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_RUSHING = new ItemBase("progrisekey_rushing",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_LIGHTNING = new ItemBase("progrisekey_lightning",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_STING = new ItemBase("progrisekey_sting",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_AMAZING = new ItemBase("progrisekey_amazing",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_BURNING = new ItemBase("progrisekey_burning",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_CRUSHING = new ItemBase("progrisekey_crushing",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_SPLASHING = new ItemBase("progrisekey_splashing",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_DYNAMITING = new ItemBase("progrisekey_dynamiting",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_STORMING = new ItemBase("progrisekey_storming",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_SCOUTING = new ItemBase("progrisekey_scouting",Wmod.TabKamenRiderZEROONE);
	public static final Item PROGRISEKEY_FIGHTING = new ItemBase("progrisekey_fighting",Wmod.TabKamenRiderZEROONE);	 
	public static final Item PROGRISEKEY_INVADING = new ItemBase("progrisekey_invading",Wmod.TabKamenRiderZEROONE);

	public static final Item PROGRISEKEY_SHINING = new ItemBase("progrisekey_shining",Wmod.TabKamenRiderZEROONE); 
	public static final Item PROGRISEKEY_SHINING_ASSAULT = new ItemBase("progrisekey_shining_assault",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_METALCLUSTER = new ItemBase("progrisekey_metal",Wmod.TabKamenRiderZEROONE); 
	public static final Item PROGRISEKEY_ZEROTWO = new ItemBase("progrisekey_zerotwo",Wmod.TabKamenRiderZEROONE); 
	public static final Item PROGRISEKEY_ZEROTHREE = new ItemBase("progrisekey_zerothree",Wmod.TabKamenRiderZEROONE); 
	public static final Item PROGRISEKEY_ASSAULT = new ItemBase("progrisekey_assault",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_RAMPAGE = new ItemBase("progrisekey_rampage",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_LONEWOLF = new ItemBase("progrisekey_lonewolf",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_JUSTICE = new ItemBase("progrisekey_justice",Wmod.TabKamenRiderZEROONE); 
	public static final Item PROGRISEKEY_ARKSCORPION = new ItemBase("progrisekey_arcscorpion",Wmod.TabKamenRiderZEROONE);

	//	 public static final Item PROGRISEKEY_THOUSER = new ItemBase("progrisekey_thouser",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_ZAIA = new ItemBase("progrisekey_zaia",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_EDEN = new ItemBase("progrisekey_eden",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_LUCIFER = new ItemBase("progrisekey_lucifer",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_ZEIN = new ItemBase("progrisekey_zein",Wmod.TabKamenRiderZEROONE); 

	//	 public static final Item PROGRISEKEY_ARKONE = new ItemBase("progrisekey_arcone",Wmod.TabKamenRiderZEROONE); 
	//	 public static final Item PROGRISEKEY_ARKZEROONE = new ItemBase("progrisekey_arczeroone",Wmod.TabKamenRiderZEROONE);
	//	 public static final Item PROGRISEKEY_THOUSAND_ARK = new ItemBase("progrisekey_thousandarc",Wmod.TabKamenRiderZEROONE); 

	//Saber
	public static final ArmorMaterial DRIVER_SABER = EnumHelper.addArmorMaterial("flame_holysword", Reference.MODID+":swordriver_saber", 50, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_BLADES = EnumHelper.addArmorMaterial("water_holdsword", Reference.MODID+":swordriver_blades", 50, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_ESPADA = EnumHelper.addArmorMaterial("thunder_holysword", Reference.MODID+":swordriver_espada", 50, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_SAIKOU = EnumHelper.addArmorMaterial("light_holysword", Reference.MODID+":saikou_driver", 50, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial DRIVER_FALCHION = EnumHelper.addArmorMaterial("void_holysword", Reference.MODID+":bladriver_falchion", 50, new int[]{4, 7, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial DRIVER_XSABER = EnumHelper.addArmorMaterial("galaxy_holysword", Reference.MODID+":swordriver_xsaber", 50, new int[]{4, 14, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);	
	public static final ArmorMaterial DRIVER_DEZAST = EnumHelper.addArmorMaterial("black_holysword", Reference.MODID+":swordriver_dezast", 50, new int[]{4, 7, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial BRAVE_DRAGON = EnumHelper.addArmorMaterial("brave_dragon", Reference.MODID+":saber_dragon", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial STORM_EAGLE = EnumHelper.addArmorMaterial("storm_eagle", Reference.MODID+":saber_eagle", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial SAIYU_JOURNEY = EnumHelper.addArmorMaterial("saiyu_journey", Reference.MODID+":saber_saiyu", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial TENKUU_PEGASAS = EnumHelper.addArmorMaterial("tenku_pegasas", Reference.MODID+":saber_pegasas", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial LION_SENKI = EnumHelper.addArmorMaterial("lion_senki", Reference.MODID+":saber_lion", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial PETER_FANTASISTA = EnumHelper.addArmorMaterial("peter_fantasista", Reference.MODID+":saber_peter", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial TRI_CERBERUS = EnumHelper.addArmorMaterial("tri_cerberus", Reference.MODID+":saber_cerberus", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial NEEDLE_HEDGEHOG = EnumHelper.addArmorMaterial("needle_hedgehog", Reference.MODID+":saber_hedgehog", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial LAMPDO_ARANGINA = EnumHelper.addArmorMaterial("lamp_arangina", Reference.MODID+":saber_arangina", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);	
	public static final ArmorMaterial GENBU_SHINWA = EnumHelper.addArmorMaterial("genbu_shinwa", Reference.MODID+":saber_genbu", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial JACKUN_DOMAMENOKI = EnumHelper.addArmorMaterial("jackun_domamenoki", Reference.MODID+":saber_jackun", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);	
	public static final ArmorMaterial SARUTOBI_NINJADEN = EnumHelper.addArmorMaterial("sarutobi_ninjaden", Reference.MODID+":saber_ninja", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KOBUTA_3KYOUDAI = EnumHelper.addArmorMaterial("kobuta_3kyoudai", Reference.MODID+":saber_kobuta", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial HENZELNUTS_GRETEL = EnumHelper.addArmorMaterial("henzenlnuts_gretel", Reference.MODID+":saber_henzel", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial BREMEN_ROCKBAND = EnumHelper.addArmorMaterial("bremen_rocknband", Reference.MODID+":saber_bremen", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial JAAKU_DRAGON = EnumHelper.addArmorMaterial("jaaku_dragon", Reference.MODID+":saber_jaakudragon", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KINBUKI_GINBUKI = EnumHelper.addArmorMaterial("kinbuki_ginbuki", Reference.MODID+":saber_kingin", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial SAIKOU_SHADOW = EnumHelper.addArmorMaterial("saikou_shadow", Reference.MODID+":saber_shadow", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial OCEAN_HISTORY = EnumHelper.addArmorMaterial("ocean_history", Reference.MODID+":saber_ocean", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial KONCHU_DAIHYAKKA = EnumHelper.addArmorMaterial("konchu_daihyakka", Reference.MODID+":saber_konchu", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);	
	public static final ArmorMaterial ETERNAL_PHOENIX = EnumHelper.addArmorMaterial("eternal_phoenix", Reference.MODID+":saber_phoenix", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);	
	public static final ArmorMaterial AMAZING_SIREN = EnumHelper.addArmorMaterial("amazing_siren", Reference.MODID+":saber_siren", 40, new int[]{4, 2, 4, 14},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);	

	public static final Item SWORDRIVER_REKKA = new ArmorSwordriverRekka("swordriver_rekka",Wmod.TabKamenRiderSABER,DRIVER_SABER,EntityEquipmentSlot.LEGS);
	public static final Item SWORDRIVER_NAGARE = new ArmorSwordriverNagare("swordriver_nagare",Wmod.TabKamenRiderSABER,DRIVER_BLADES,EntityEquipmentSlot.LEGS);
	public static final Item SWORDRIVER_IKAZUCHI = new ArmorSwordriverIkazuchi("swordriver_ikazuchi",Wmod.TabKamenRiderSABER,DRIVER_ESPADA,EntityEquipmentSlot.LEGS);
	public static final Item BLADRIVER_KYOMU = new ItemBase("bladriver_kyomu",Wmod.TabKamenRiderSABER);
	//  public static final Item SWORDRIVER_CROSS = new ItemBase("swordriver_cross",Wmod.TabKamenRiderSaber);
	public static final Item SWORDRIVER_SHIKKOKU = new ArmorSwordriverShikkoku("swordriver_shikkoku",Wmod.TabKamenRiderSABER,DRIVER_DEZAST,EntityEquipmentSlot.LEGS);

	public static final ToolMaterial SEIKEN_SABER = EnumHelper.addToolMaterial("saber_kaen",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_BLADES = EnumHelper.addToolMaterial("saber_susei",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_ESPADA = EnumHelper.addToolMaterial("saber_raimei",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_BUSTER = EnumHelper.addToolMaterial("saber_dogou",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_KENZAN = EnumHelper.addToolMaterial("saber_fusou",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_SLASH = EnumHelper.addToolMaterial("saber_onjuu",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial SEIKEN_SAIKOU = EnumHelper.addToolMaterial("saber_kougou",3, 800, 8.0F, 14.0F,0);
	public static final ToolMaterial SEIKEN_CALIBUR = EnumHelper.addToolMaterial("saber_ankoku",3, 800, 8.0F, 14.0F,0);
	public static final ToolMaterial SEIKEN_DURENDAL = EnumHelper.addToolMaterial("saber_jikoku",3, 800, 8.0F, 14.0F,0);
	public static final ToolMaterial SEIKEN_SABELA = EnumHelper.addToolMaterial("saber_enei",3, 800, 8.0F, 14.0F,0);
	public static final ToolMaterial SEIKEN_FALCHION = EnumHelper.addToolMaterial("saber_mumei",3, 800, 8.0F, 14.0F,0);	
	public static final ToolMaterial SEIKEN_XSABER = EnumHelper.addToolMaterial("saber_haou",3, 1000, 10.0F, 16.0F,0);
	public static final ToolMaterial SEIKEN_DEZAST = EnumHelper.addToolMaterial("saber_kokuran",3, 800, 8.0F, 12.0F,0);

	public static final Item BATTOU_REKKA = new ItemSwordriverBattou("battou_rekka",Wmod.TabKamenRiderSABER);	
	public static final Item BATTOU_NAGARE = new ItemSwordriverBattou("battou_nagare",Wmod.TabKamenRiderSABER);
	public static final Item BATTOU_IKAZUCHI = new ItemSwordriverBattou("battou_ikazuchi",Wmod.TabKamenRiderSABER);
	public static final Item BATTOU_KYOMU = new ItemSwordriverBattou("battou_kyomu",Wmod.TabKamenRiderSABER);
	public static final Item BATTOU_SHIKKOKU = new ItemSwordriverBattou("battou_shikkoku",Wmod.TabKamenRiderSABER);

	public static final Item SEIKEN_REKKA = new ItemSeikenRekka("seiken_rekka",SEIKEN_SABER,Wmod.TabKamenRiderSABER);	
	public static final Item SEIKEN_NAGARE = new ItemSeikenNagare("seiken_nagare",SEIKEN_BLADES,Wmod.TabKamenRiderSABER);	
	public static final Item SEIKEN_IKAZUCHI = new ItemSeikenIkazuchi("seiken_ikazuchi",SEIKEN_ESPADA,Wmod.TabKamenRiderSABER);	
	public static final Item SEIKEN_KYOMU = new ItemBaseSword("seiken_kyomu",SEIKEN_FALCHION,Wmod.TabKamenRiderSABER);	
	public static final Item SEIKEN_SHIKKOKU = new ItemSeikenShikkoku("seiken_shikkoku",SEIKEN_DEZAST,Wmod.TabKamenRiderSABER);

	public static final Item WRB_DRAGON = new ArmorSaberDragon("wrb_bravedragon",Wmod.TabKamenRiderSABER,BRAVE_DRAGON,EntityEquipmentSlot.HEAD);
	public static final Item WRB_EAGLE = new ArmorSaberEagle("wrb_eagle",Wmod.TabKamenRiderSABER,STORM_EAGLE,EntityEquipmentSlot.CHEST);
	public static final Item WRB_SAIYUU = new ArmorSaberSaiyuu("wrb_saiyu",Wmod.TabKamenRiderSABER,SAIYU_JOURNEY,EntityEquipmentSlot.FEET);
	public static final Item WRB_PEGASAS = new ArmorSaberPegasas("wrb_pegasas",Wmod.TabKamenRiderSABER,TENKUU_PEGASAS,EntityEquipmentSlot.HEAD);
	public static final Item WRB_LION = new ArmorSaberLion("wrb_lion",Wmod.TabKamenRiderSABER,LION_SENKI,EntityEquipmentSlot.CHEST);
	public static final Item WRB_PETER = new ArmorSaberPeter("wrb_peter",Wmod.TabKamenRiderSABER,PETER_FANTASISTA,EntityEquipmentSlot.FEET);
	public static final Item WRB_CERBERUS = new ArmorSaberCerberus("wrb_cerberus",Wmod.TabKamenRiderSABER,TRI_CERBERUS,EntityEquipmentSlot.HEAD);
	public static final Item WRB_HEDGEHOG = new ArmorSaberHedgehog("wrb_hedgehog",Wmod.TabKamenRiderSABER,NEEDLE_HEDGEHOG,EntityEquipmentSlot.CHEST);
	public static final Item WRB_ARANGINA = new ArmorSaberArangina("wrb_arangina",Wmod.TabKamenRiderSABER,LAMPDO_ARANGINA,EntityEquipmentSlot.FEET);
	public static final Item WRB_GENBU = new ArmorSaberGenbu("wrb_genbu",Wmod.TabKamenRiderSABER,GENBU_SHINWA,EntityEquipmentSlot.HEAD);
	public static final Item WRB_JACKUN = new ArmorSaberJackun("wrb_jackun",Wmod.TabKamenRiderSABER,JACKUN_DOMAMENOKI,EntityEquipmentSlot.FEET);
	public static final Item WRB_NINJA = new ArmorSaberNinja("wrb_ninja",Wmod.TabKamenRiderSABER,SARUTOBI_NINJADEN,EntityEquipmentSlot.FEET);
	public static final Item WRB_KOBUTA = new ArmorSaberKobuta("wrb_kobuta",Wmod.TabKamenRiderSABER,KOBUTA_3KYOUDAI,EntityEquipmentSlot.FEET);
	public static final Item WRB_HENZEL = new ArmorSaberHenzel("wrb_henzel",Wmod.TabKamenRiderSABER,HENZELNUTS_GRETEL,EntityEquipmentSlot.FEET);
	public static final Item WRB_BREMEN = new ArmorSaberBremen("wrb_bremen",Wmod.TabKamenRiderSABER,BREMEN_ROCKBAND,EntityEquipmentSlot.FEET);
	public static final Item WRB_JAAKUDRAGON= new ArmorSaberJaakuDragon("wrb_jaakudragon",Wmod.TabKamenRiderSABER,JAAKU_DRAGON,EntityEquipmentSlot.HEAD);
	public static final Item WRB_KINGIN = new ItemBase("wrb_kingin",Wmod.TabKamenRiderSABER);
	public static final Item WRB_KONCHU= new ItemBase("wrb_konchu",Wmod.TabKamenRiderSABER);
	public static final Item WRB_OCEAN = new ItemBase("wrb_ocean",Wmod.TabKamenRiderSABER);
	public static final Item WRB_PHOENIX = new ArmorSaberPhoenix("wrb_phoenix",Wmod.TabKamenRiderSABER,ETERNAL_PHOENIX,EntityEquipmentSlot.HEAD);
	public static final Item WRB_SIREN = new ArmorSaberSiren("wrb_siren",Wmod.TabKamenRiderSABER,AMAZING_SIREN,EntityEquipmentSlot.HEAD);

	//Revice
	public static final ArmorMaterial DRIVER_REVICE = EnumHelper.addArmorMaterial("devil_within", Reference.MODID+":revice_driver", 50, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial REX_GENOME = EnumHelper.addArmorMaterial("rex_genome", Reference.MODID+":rex_genome", 40, new int[]{0, 2, 0, 30},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

	public static final Item REVICE_DRIVER = new ItemBase("revice_driver",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_REX = new ItemBase("vistamp_rex",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_MEGALODON = new ItemBase("vistamp_megalodon",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_EAGLE = new ItemBase("vistamp_eagle",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_MAMMMOTH = new ItemBase("vistamp_mammoth",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_PTERA = new ItemBase("vistamp_ptera",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_LION = new ItemBase("vistamp_lion",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_JACKAL = new ItemBase("vistamp_jackal",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KONG = new ItemBase("vistamp_kong",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KAMAKIRI = new ItemBase("vistamp_kamakiri",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_BRACHIO = new ItemBase("vistamp_brachio",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_NEOBATTA = new ItemBase("vistamp_neobatta",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KANGAROO = new ItemBase("vistamp_kangaroo",Wmod.TabKamenRiderREVICE);
	/*
 	public static final Item VISTAMP_BARIDREX = new ItemBase("vistamp_baridrex",Wmod.TabKamenRiderREVICE);
 	public static final Item VISTAMP_VOLCANO = new ItemBase("vistamp_volcano",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_ROLLING = new ItemBase("vistamp_rolling",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_THUNDERGALE = new ItemBase("vistamp_thundergale",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_GIFFARDREX = new ItemBase("vistamp_giffardrex",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_GIFFARDREX_REVI = new ItemBase("vistamp_giffardrex_revi",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_GIFFARDREX_VICE = new ItemBase("vistamp_giffardrex_vice",Wmod.TabKamenRiderREVICE);

	public static final Item VISTAMP_KRAKEN = new ItemBase("vistamp_kraken",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KABUTO = new ItemBase("vistamp_kabuto",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_HERCULES = new ItemBase("vistamp_hercules",Wmod.TabKamenRiderREVICE);
	 * 
	public static final Item VISTAMP_BAT = new ItemBase("vistamp_bat",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_COBRA = new ItemBase("vistamp_cobra",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_SPIDER = new ItemBase("vistamp_spider",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_QUEENBEE = new ItemBase("vistamp_queenbee",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KUWAGATA = new ItemBase("vistamp_kuwagata",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_GIRAFFA = new ItemBase("vistamp_giraffa",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KRAKEN = new ItemBase("vistamp_kraken",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KABUTO = new ItemBase("vistamp_kabuto",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_HERCULES = new ItemBase("vistamp_hercules",Wmod.TabKamenRiderREVICE);

	public static final Item VISTAMP_BATTA = new ItemBase("vistamp_batta",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_TURTLE = new ItemBase("vistamp_turtle",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_SCOPION = new ItemBase("vistamp_scopion",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_MOGURA = new ItemBase("vistamp_mogura",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KUJAKU = new ItemBase("vistamp_kujaku",Wmod.TabKamenRiderREVICE);	
	public static final Item VISTAMP_ANOMALOCARIS = new ItemBase("vistamp_anomalocaris",Wmod.TabKamenRiderREVICE);

	public static final Item VISTAMP_HASHIBIROKOU = new ItemBase("vistamp_hashibirokou",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_TRICERA = new ItemBase("vistamp_tricera",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_BUFFALO = new ItemBase("vistamp_buffalo",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KOMODODRAGON = new ItemBase("vistamp_komododragon",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_CROCODILE = new ItemBase("vistamp_crocodile",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_CONDLE = new ItemBase("vistamp_condle",Wmod.TabKamenRiderREVICE);

	public static final Item VISTAMP_KINGCRAB = new ItemBase("vistamp_kingcrab",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_OCTOPAS = new ItemBase("vistamp_octopas",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_HEDGEHOG = new ItemBase("vistamp_hedgehog",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KUROSAI = new ItemBase("vistamp_kurosai",Wmod.TabKamenRiderREVICE);
	public static final Item VISTAMP_KAJIKI = new ItemBase("vistamp_kajiki",Wmod.TabKamenRiderREVICE);
	 */

	//Geats
	public static final ArmorMaterial DRIVER_GEATS = EnumHelper.addArmorMaterial("desire_gp", Reference.MODID+":desire_driver", 50, new int[]{0, 2, 0, 0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);
	public static final ArmorMaterial ID_GEATS = EnumHelper.addArmorMaterial("id_geats", Reference.MODID+":entry_geats", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_TYCOON = EnumHelper.addArmorMaterial("id_tycoon", Reference.MODID+":entry_tycoon", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_BUFFA = EnumHelper.addArmorMaterial("id_buffa", Reference.MODID+":entry_buffa", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_NAGO = EnumHelper.addArmorMaterial("id_nago", Reference.MODID+":entry_nago", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_SHIROWE = EnumHelper.addArmorMaterial("id_shirowe", Reference.MODID+":entry_shirowe", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_GINPEN = EnumHelper.addArmorMaterial("id_ginpen", Reference.MODID+":entry_ginpen", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_DAPAAN = EnumHelper.addArmorMaterial("id_dapaan", Reference.MODID+":entry_dapaan", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_MARY = EnumHelper.addArmorMaterial("id_mary", Reference.MODID+":entry_mary", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_PUNKJACK = EnumHelper.addArmorMaterial("id_punkjack", Reference.MODID+":entry_punkjack", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_LETTER = EnumHelper.addArmorMaterial("id_letter", Reference.MODID+":entry_letter", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_KEILOW = EnumHelper.addArmorMaterial("id_keilow", Reference.MODID+":entry_keilow", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_NADGESPARROW = EnumHelper.addArmorMaterial("id_nadgesparrow", Reference.MODID+":entry_nadgesparrow", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_LOPO = EnumHelper.addArmorMaterial("id_lopo", Reference.MODID+":entry_lopo", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_GROOVY = EnumHelper.addArmorMaterial("id_groovy", Reference.MODID+":entry_groovy", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_HAKUBI = EnumHelper.addArmorMaterial("id_hakubi", Reference.MODID+":entry_hakubi", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_BUCHI = EnumHelper.addArmorMaterial("id_buchi", Reference.MODID+":entry_buchi", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_GYAGO = EnumHelper.addArmorMaterial("id_gyago", Reference.MODID+":entry_gyago", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_TURBON = EnumHelper.addArmorMaterial("id_turbon", Reference.MODID+":entry_turbon", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_BRALI= EnumHelper.addArmorMaterial("id_brali", Reference.MODID+":entry_brali", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_SEEKER = EnumHelper.addArmorMaterial("id_seeker", Reference.MODID+":entry_seeker", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_REVI = EnumHelper.addArmorMaterial("id_revi", Reference.MODID+":entry_revi", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_VICE = EnumHelper.addArmorMaterial("id_vice", Reference.MODID+":entry_vice", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_XGEATS = EnumHelper.addArmorMaterial("id_xgeats", Reference.MODID+":entry_xgeats", 7, new int[]{0, 2, 0, 15},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_GEATS_ONENESS = EnumHelper.addArmorMaterial("id_geats_oneness", Reference.MODID+":entry_geats_oneness", 7, new int[]{0, 2, 0, 15},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);
	public static final ArmorMaterial ID_DOOMSGEATS = EnumHelper.addArmorMaterial("id_doomsgeats", Reference.MODID+":entry_doomsgeats", 7, new int[]{0, 2, 0, 15},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);

	public static final ArmorMaterial ID_ORIGINAL1 = EnumHelper.addArmorMaterial("id_original1", Reference.MODID+":entry_skmatter", 7, new int[]{0, 2, 0, 13},0, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 0.0F);

	public static final ArmorMaterial ARMED_HAMMER =EnumHelper.addArmorMaterial("armed_hammer",Reference.MODID+":raise_hammer", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_WATER =EnumHelper.addArmorMaterial("armed_water",Reference.MODID+":raise_water", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_ARROW =EnumHelper.addArmorMaterial("armed_arrow",Reference.MODID+":raise_arrow", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SHIELD =EnumHelper.addArmorMaterial("armed_sheild",Reference.MODID+":raise_shield", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_CRAW =EnumHelper.addArmorMaterial("armed_craw",Reference.MODID+":raise_craw", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_CHAINARRAY =EnumHelper.addArmorMaterial("armed_chainarray",Reference.MODID+":raise_chainarray", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_DRILL =EnumHelper.addArmorMaterial("armed_drill",Reference.MODID+":raise_drill", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_PROPELLER =EnumHelper.addArmorMaterial("armed_proprller",Reference.MODID+":raise_propeller", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SHOOTER =EnumHelper.addArmorMaterial("armed_shooter",Reference.MODID+":raise_shooter", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_BREAKER =EnumHelper.addArmorMaterial("armed_breaker",Reference.MODID+":raise_breaker", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_DUALER =EnumHelper.addArmorMaterial("armed_dualer",Reference.MODID+":raise_dualer", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_AX =EnumHelper.addArmorMaterial("armed_ax",Reference.MODID+":raise_ax", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SP =EnumHelper.addArmorMaterial("armed_sp",Reference.MODID+":raise_sp", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_MAGNUM =EnumHelper.addArmorMaterial("magnum_form",Reference.MODID+":raise_magnum", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_ZOMBIE =EnumHelper.addArmorMaterial("zombie_form",Reference.MODID+":raise_zombie", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_NINJA =EnumHelper.addArmorMaterial("ninja_form",Reference.MODID+":raise_ninja", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_BEAT =EnumHelper.addArmorMaterial("beat_form",Reference.MODID+":raise_beat", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_MONSTER =EnumHelper.addArmorMaterial("monster_form",Reference.MODID+":raise_monster", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_BOOST =EnumHelper.addArmorMaterial("boost_form",Reference.MODID+":raise_boost", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial ARMED_HAMMER_R =EnumHelper.addArmorMaterial("armed_hammer_r",Reference.MODID+":raise_hammer_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_WATER_R =EnumHelper.addArmorMaterial("armed_water_r",Reference.MODID+":raise_water_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_ARROW_R =EnumHelper.addArmorMaterial("armed_arrow_r",Reference.MODID+":raise_arrow_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SHIELD_R =EnumHelper.addArmorMaterial("armed_sheild_r",Reference.MODID+":raise_shield_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_CRAW_R =EnumHelper.addArmorMaterial("armed_craw_r",Reference.MODID+":raise_craw_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_CHAINARRAY_R =EnumHelper.addArmorMaterial("armed_chainarray_r",Reference.MODID+":raise_chainarray_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_DRILL_R =EnumHelper.addArmorMaterial("armed_drill_r",Reference.MODID+":raise_drill_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_PROPELLER_R =EnumHelper.addArmorMaterial("armed_proprller_r",Reference.MODID+":raise_propeller_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SHOOTER_R =EnumHelper.addArmorMaterial("armed_shooter_r",Reference.MODID+":raise_shooter_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_BREAKER_R =EnumHelper.addArmorMaterial("armed_breaker_r",Reference.MODID+":raise_breaker_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_DUALER_R =EnumHelper.addArmorMaterial("armed_dualer_r",Reference.MODID+":raise_dualer_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_AX_R =EnumHelper.addArmorMaterial("armed_ax_r",Reference.MODID+":raise_ax_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMED_SP_R =EnumHelper.addArmorMaterial("armed_sp_r",Reference.MODID+":raise_sp_r", 20, new int[]{3, 0, 3, 3},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_MAGNUM_R =EnumHelper.addArmorMaterial("magnum_form_r",Reference.MODID+":raise_magnum_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_ZOMBIE_R =EnumHelper.addArmorMaterial("zombie_form_r",Reference.MODID+":raise_zombie_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_NINJA_R =EnumHelper.addArmorMaterial("ninja_form_r",Reference.MODID+":raise_ninja_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_BEAT_R =EnumHelper.addArmorMaterial("beat_form_r",Reference.MODID+":raise_beat_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_MONSTER_R =EnumHelper.addArmorMaterial("monster_form_r",Reference.MODID+":raise_monster_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_BOOST_R =EnumHelper.addArmorMaterial("boost_form_r",Reference.MODID+":raise_boost_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial FORM_KINGOHGER =EnumHelper.addArmorMaterial("king_ohger",Reference.MODID+":raise_kingohger", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial FORM_KINGOHGER_R =EnumHelper.addArmorMaterial("king_ohger",Reference.MODID+":raise_kingohger_r", 20, new int[]{7, 0, 7, 7},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item DESIRE_DRIVER = new ArmorDesireDriver("desire_driver",Wmod.TabKamenRiderGEATS,DRIVER_GEATS,EntityEquipmentSlot.LEGS);
	public static final Item REVOLVE_ON= new ItemRevolveOn("revolveon",Wmod.TabKamenRiderGEATS);

	public static final ToolMaterial RAISEWEAPON_HAMMER =EnumHelper.addToolMaterial("raise_hammer",3, 800, 8.0F, 12.0F,0);
	public static final ToolMaterial RAISEWEAPON_WATER =EnumHelper.addToolMaterial("raise_water",3, 800, 8.0F, 5.0F,0);
	public static final ToolMaterial RAISEWEAPON_CRAW =EnumHelper.addToolMaterial("raise_craw",3, 800, 12.0F, 3.0F,0);
	public static final ToolMaterial RAISEWEAPON_CHAINARRAY =EnumHelper.addToolMaterial("raise_chainarray",3, 800, 8.0F, 2.0F,0);
	public static final ToolMaterial CHAINARRAY_SHOOT =EnumHelper.addToolMaterial("chainarray_shoot",0, 800, 0.0F, 0.0F,0);
	public static final ToolMaterial RAISEWEAPON_DRILL =EnumHelper.addToolMaterial("raise_drill",3, 800, 16.0F, 6.0F,0);
	public static final ToolMaterial RAISEWEAPON_PROPELLER =EnumHelper.addToolMaterial("raise_proprller",3, 800, 8.0F, 5.0F,0);
	public static final ToolMaterial RAISEWEAPON_BREAKER =EnumHelper.addToolMaterial("raise_breaker",3, 800, 5.0F, 8.0F,0);
	public static final ToolMaterial RAISEWEAPON_DUALER =EnumHelper.addToolMaterial("raise_dualer",3, 800, 6.0F, 6.0F,0);
	public static final ToolMaterial RAISEWEAPON_DUALER_A =EnumHelper.addToolMaterial("raise_dualer",3, 800, 10.0F, 4.0F,0);
	public static final ToolMaterial RAISEWEAPON_DUALER_B =EnumHelper.addToolMaterial("raise_dualer",3, 800, 10.0F, 4.0F,0);
	public static final ToolMaterial RAISEWEAPON_AX =EnumHelper.addToolMaterial("raise_ax",3, 800, 8.0F, 10.0F,0);

	public static final Item IDCORE_GEATS= new ArmorIDGeats("idcore_geats",Wmod.TabKamenRiderGEATS,ID_GEATS,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_TYCOON= new ArmorIDTycoon("idcore_tycoon",Wmod.TabKamenRiderGEATS,ID_TYCOON,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_BUFFA= new ArmorIDBuffa("idcore_buffa",Wmod.TabKamenRiderGEATS,ID_BUFFA,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_NAGO= new ArmorIDNago("idcore_nago",Wmod.TabKamenRiderGEATS,ID_NAGO,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_SHIROWE= new ArmorIDShirowe("idcore_shirowe",Wmod.TabKamenRiderGEATS,ID_SHIROWE,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_GINPEN= new ArmorIDGinpen("idcore_ginpen",Wmod.TabKamenRiderGEATS,ID_GINPEN,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_DAPAAN= new ArmorIDDapaan("idcore_dapaan",Wmod.TabKamenRiderGEATS,ID_DAPAAN,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_MARY= new ArmorIDMary("idcore_mary",Wmod.TabKamenRiderGEATS,ID_MARY,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_PUNKJACK= new ArmorIDPunkjack("idcore_punkjack",Wmod.TabKamenRiderGEATS,ID_PUNKJACK,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_LETTER= new ArmorIDLetter("idcore_letter",Wmod.TabKamenRiderGEATS,ID_LETTER,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_KEILOW= new ArmorIDKeilow("idcore_keilow",Wmod.TabKamenRiderGEATS,ID_KEILOW,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_NADGESPARROW= new ArmorIDNadgesparrow("idcore_nadgesparrow",Wmod.TabKamenRiderGEATS,ID_NADGESPARROW,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_LOPO= new ArmorIDLopo("idcore_lopo",Wmod.TabKamenRiderGEATS,ID_LOPO,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_GROOVY= new ArmorIDGroovy("idcore_groovy",Wmod.TabKamenRiderGEATS,ID_GROOVY,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_HAKUBI= new ArmorIDHakubi("idcore_hakubi",Wmod.TabKamenRiderGEATS,ID_HAKUBI,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_BUCHI= new ArmorIDBuchi("idcore_buchi",Wmod.TabKamenRiderGEATS,ID_BUCHI,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_TURBON= new ArmorIDTurbon("idcore_turbon",Wmod.TabKamenRiderGEATS,ID_TURBON,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_GYAGO= new ArmorIDGyago("idcore_gyago",Wmod.TabKamenRiderGEATS,ID_GYAGO,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_BRALI= new ArmorIDBrali("idcore_brali",Wmod.TabKamenRiderGEATS,ID_BRALI,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_SEEKER= new ArmorIDSeeker("idcore_seeker",Wmod.TabKamenRiderGEATS,ID_SEEKER,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_XGEATS= new ArmorIDXGeats("idcore_xgeats",Wmod.TabKamenRiderGEATS,ID_XGEATS,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_DOOMSGEATS= new ArmorIDDoomsGeats("idcore_doomsgeats",Wmod.TabKamenRiderGEATS,ID_DOOMSGEATS,EntityEquipmentSlot.HEAD);
	public static final Item IDCORE_GEATSONENESS= new ArmorIDGeatsOneness("idcore_geatsoneness",Wmod.TabKamenRiderGEATS,ID_GEATS_ONENESS,EntityEquipmentSlot.HEAD);

	public static final Item IDCORE_SKUMATTER= new ArmorIDSkumatter("idcore_skumatter",Wmod.TabKamenRiderGEATS,ID_ORIGINAL1,EntityEquipmentSlot.HEAD);

	public static final Item RB_HAMMER = new ArmorRaiseHammer("raisebuckle_hammer",Wmod.TabKamenRiderGEATS,ARMED_HAMMER,EntityEquipmentSlot.CHEST);
	public static final Item RB_WATER = new ArmorRaiseWater("raisebuckle_water",Wmod.TabKamenRiderGEATS,ARMED_WATER,EntityEquipmentSlot.CHEST);
	public static final Item RB_ARROW = new ArmorRaiseArrow2("raisebuckle_arrow",Wmod.TabKamenRiderGEATS,ARMED_ARROW,EntityEquipmentSlot.CHEST);
	public static final Item RB_SHIELD = new ArmorRaiseShield2("raisebuckle_shield",Wmod.TabKamenRiderGEATS,ARMED_SHIELD,EntityEquipmentSlot.CHEST);
	public static final Item RB_CRAW = new ArmorRaiseCraw("raisebuckle_craw",Wmod.TabKamenRiderGEATS,ARMED_CRAW,EntityEquipmentSlot.CHEST);
	public static final Item RB_CHAINARRAY = new ArmorRaiseChainarray("raisebuckle_chainarray",Wmod.TabKamenRiderGEATS,ARMED_CHAINARRAY,EntityEquipmentSlot.CHEST);
	public static final Item RB_DRILL = new ArmorRaiseDrill("raisebuckle_drill",Wmod.TabKamenRiderGEATS,ARMED_DRILL,EntityEquipmentSlot.CHEST);
	public static final Item RB_PROPELLER = new ArmorRaisePropeller("raisebuckle_propeller",Wmod.TabKamenRiderGEATS,ARMED_PROPELLER,EntityEquipmentSlot.CHEST);
	public static final Item RB_SHOOTER = new ArmorRaiseShooter("raisebuckle_shooter",Wmod.TabKamenRiderGEATS,ARMED_SHOOTER,EntityEquipmentSlot.CHEST);
	public static final Item RB_BREAKER = new ArmorRaiseBreaker("raisebuckle_breaker",Wmod.TabKamenRiderGEATS,ARMED_BREAKER,EntityEquipmentSlot.CHEST);
	public static final Item RB_DUALER = new ArmorRaiseDualer("raisebuckle_dualer",Wmod.TabKamenRiderGEATS,ARMED_DUALER,EntityEquipmentSlot.CHEST);
	public static final Item RB_AX = new ArmorRaiseAx("raisebuckle_ax",Wmod.TabKamenRiderGEATS,ARMED_AX,EntityEquipmentSlot.CHEST);
	public static final Item RB_SP = new ArmorRaiseSP("raisebuckle_sp",Wmod.TabKamenRiderGEATS,ARMED_SP,EntityEquipmentSlot.CHEST);

	public static final Item RB_MAGNUM = new ArmorRaiseMagnum("raisebuckle_magnum",Wmod.TabKamenRiderGEATS,FORM_MAGNUM,EntityEquipmentSlot.CHEST);
	public static final Item RB_BOOST = new ArmorRaiseBoost("raisebuckle_boost",Wmod.TabKamenRiderGEATS,FORM_BOOST,EntityEquipmentSlot.CHEST);
	public static final Item RB_ZOMBIE = new ItemBase("raisebuckle_zombie",Wmod.TabKamenRiderGEATS);
	public static final Item RB_NINJA = new ItemBase("raisebuckle_ninja",Wmod.TabKamenRiderGEATS);
	public static final Item RB_BEAT = new ItemBase("raisebuckle_beat",Wmod.TabKamenRiderGEATS);
	public static final Item RB_MONSTER = new ItemBase("raisebuckle_monster",Wmod.TabKamenRiderGEATS);
	public static final Item RB_FEVERSLOT = new ItemBase("raisebuckle_feverslot",Wmod.TabKamenRiderGEATS);

	/*
	 public static final Item RB_FEVERSLOT_MAGNUM = new ArmorRaiseMagnum_Fever("raisebuckle_fever_magnum",Wmod.TabKamenRiderGEATS,FORM_MAGNUM,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_ZOMBIE = new ItemBase("raisebuckle_fever_zombie",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_NINJA = new ItemBase("raisebuckle_fever_ninja",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_BEAT = new ItemBase("raisebuckle_fever_beat",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_MONSTER = new ItemBase("raisebuckle_fever_monster",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_BOOST = new ArmorRaiseBoost_Fever("raisebuckle_fever_boost",Wmod.TabKamenRiderGEATS,FORM_BOOST,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_HAMMER = new ArmorRaiseHammer_Fever("raisebuckle_fever_hammer",Wmod.TabKamenRiderGEATS,ARMED_HAMMER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_WATER = new ArmorRaiseWater_Fever("raisebuckle_fever_water",Wmod.TabKamenRiderGEATS,ARMED_WATER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_ARROW = new ArmorRaiseArrow_Fever("raisebuckle_fever_arrow",Wmod.TabKamenRiderGEATS,ARMED_ARROW,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_SHIELD = new ArmorRaiseShield_Fever("raisebuckle_fever_shield",Wmod.TabKamenRiderGEATS,ARMED_SHIELD,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_CRAW = new ArmorRaiseCraw_Fever("raisebuckle_fever_craw",Wmod.TabKamenRiderGEATS,ARMED_CRAW,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_CHAINARRAY = new ArmorRaiseChainarray_Fever("raisebuckle_fever_chainarray",Wmod.TabKamenRiderGEATS,ARMED_CHAINARRAY,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_DRILL = new ArmorRaiseDrill_Fever("raisebuckle_fever_drill",Wmod.TabKamenRiderGEATS,ARMED_DRILL,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_PROPELLER = new ArmorRaisePropeller_Fever("raisebuckle_fever_propeller",Wmod.TabKamenRiderGEATS,ARMED_PROPELLER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_SHOOTER = new ArmorRaiseShooter_Fever("raisebuckle_fever_shooter",Wmod.TabKamenRiderGEATS,ARMED_SHOOTER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_BREAKER = new ArmorRaiseBreaker_Fever("raisebuckle_fever_breaker",Wmod.TabKamenRiderGEATS,ARMED_BREAKER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_DUALER = new ArmorRaiseDualer_Fever("raisebuckle_fever_dualer",Wmod.TabKamenRiderGEATS,ARMED_DUALER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_AX = new ArmorRaiseAx_Fever("raisebuckle_fever_ax",Wmod.TabKamenRiderGEATS,ARMED_AX,EntityEquipmentSlot.CHEST);
	 */

	//	public static final Item RB_COMMAND_JET = new ItemBase("raisebuckle_command_jet",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_COMMAND_CANNON = new ItemBase("raisebuckle_command_cannon",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BUILDER = new ItemBase("raisebuckle_builder",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_GB_CONTAINER = new ItemBase("raisebuckle_container",Wmod.TabKamenRiderGEATS);
	//	public static final Item GB_HAMMER = new ItemBase("raisebuckle_g_hammer",Wmod.TabKamenRiderGEATS);
	//	public static final Item GB_SWORD = new ItemBase("raisebuckle_g_sword",Wmod.TabKamenRiderGEATS);
	//	public static final Item GB_BLASTER = new ItemBase("raisebuckle_g_blaster",Wmod.TabKamenRiderGEATS);
	public static final Item RB_BOOST_MK2 = new ItemBase("raisebuckle_boost_mk2",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BOOST_MK3 = new ItemBase("raisebuckle_boost_mk3",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BOOST_MK9 = new ItemBase("raisebuckle_boost_mk9",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_ONENESS = new ItemBase("raisebuckle_oneness",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_SHINOBI = new ItemBase("raisebuckle_shinobi",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BUJINSWORD = new ItemBase("raisebuckle_bujinsword",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BUJIN = new ItemBase("raisebuckle_bujin",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_FANTASY = new ItemBase("raisebuckle_fantasy",Wmod.TabKamenRiderGEATS);
	public static final Item RB_JAMATO = new ItemBase("raisebuckle_jamato",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_PLOSION_RAGE = new ItemBase("raisebuckle_plosion",Wmod.TabKamenRiderGEATS);

	//	public static final Item RB_XGEATS = new ItemBase("raisebuckle_xgeats",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BOOST_DARKNESS = new ItemBase("raisebuckle_boost_darkness",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_DOOMSGEATS = new ItemBase("raisebuckle_doomsgeats",Wmod.TabKamenRiderGEATS);
	//	public static final Item RB_BOOST_JUDGEMENT = new ItemBase("raisebuckle_boost_judgement",Wmod.TabKamenRiderGEATS);

	public static final Item RB_HAMMER_R = new ArmorRaiseHammer_R("raisebuckle_hammer_r",Wmod.TabKamenRiderGEATS,ARMED_HAMMER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_WATER_R = new ArmorRaiseWater_R("raisebuckle_water_r",Wmod.TabKamenRiderGEATS,ARMED_WATER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_ARROW_R = new ArmorRaiseArrow_R("raisebuckle_arrow_r",Wmod.TabKamenRiderGEATS,ARMED_ARROW_R,EntityEquipmentSlot.FEET);
	public static final Item RB_SHIELD_R = new ArmorRaiseShield_R("raisebuckle_shield_r",Wmod.TabKamenRiderGEATS,ARMED_SHIELD_R,EntityEquipmentSlot.FEET);
	public static final Item RB_CRAW_R = new ArmorRaiseCraw_R("raisebuckle_craw_r",Wmod.TabKamenRiderGEATS,ARMED_CRAW_R,EntityEquipmentSlot.FEET);
	public static final Item RB_CHAINARRAY_R = new ArmorRaiseChainarray_R("raisebuckle_chainarray_r",Wmod.TabKamenRiderGEATS,ARMED_CHAINARRAY_R,EntityEquipmentSlot.FEET);
	public static final Item RB_DRILL_R = new ArmorRaiseDrill_R("raisebuckle_drill_r",Wmod.TabKamenRiderGEATS,ARMED_DRILL_R,EntityEquipmentSlot.FEET);
	public static final Item RB_PROPELLER_R = new ArmorRaisePropeller_R("raisebuckle_propeller_r",Wmod.TabKamenRiderGEATS,ARMED_PROPELLER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_SHOOTER_R = new ArmorRaiseShooter_R("raisebuckle_shooter_r",Wmod.TabKamenRiderGEATS,ARMED_SHOOTER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_BREAKER_R = new ArmorRaiseBreaker_R("raisebuckle_breaker_r",Wmod.TabKamenRiderGEATS,ARMED_BREAKER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_DUALER_R = new ArmorRaiseDualer_R("raisebuckle_dualer_r",Wmod.TabKamenRiderGEATS,ARMED_DUALER_R,EntityEquipmentSlot.FEET);
	public static final Item RB_AX_R = new ArmorRaiseAx_R("raisebuckle_ax_r",Wmod.TabKamenRiderGEATS,ARMED_AX_R,EntityEquipmentSlot.FEET);
	public static final Item RB_SP_R = new ArmorRaiseSP_R("raisebuckle_sp_r",Wmod.TabKamenRiderGEATS,ARMED_SP_R,EntityEquipmentSlot.FEET);
	public static final Item RB_KINGOHGER_R = new ArmorRaiseKingOhger_R("raisebuckle_kingohger_r",Wmod.TabKamenRiderGEATS,FORM_KINGOHGER_R,EntityEquipmentSlot.FEET);

	public static final Item RB_MAGNUM_R = new ArmorRaiseMagnum_R("raisebuckle_magnum_r",Wmod.TabKamenRiderGEATS,FORM_MAGNUM_R,EntityEquipmentSlot.FEET);
	public static final Item RB_BOOST_R = new ArmorRaiseBoost_R("raisebuckle_boost_r",Wmod.TabKamenRiderGEATS,FORM_BOOST_R,EntityEquipmentSlot.FEET);
	public static final Item RB_ZOMBIE_R = new ItemBase3("raisebuckle_zombie_r",Wmod.TabKamenRiderGEATS);
	public static final Item RB_NINJA_R = new ItemBase3("raisebuckle_ninja_r",Wmod.TabKamenRiderGEATS);
	public static final Item RB_BEAT_R = new ItemBase3("raisebuckle_beat_r",Wmod.TabKamenRiderGEATS);
	public static final Item RB_MONSTER_R = new ItemBase3("raisebuckle_monster_r",Wmod.TabKamenRiderGEATS);
	public static final Item RB_JAMATO_R = new ItemBase3("raisebuckle_jamato_r",Wmod.TabKamenRiderGEATS);

	/*
	 public static final Item RB_FEVERSLOT_MAGNUM = new ArmorRaiseMagnum_Fever("raisebuckle_fever_magnum",Wmod.TabKamenRiderGEATS,FORM_MAGNUM,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_ZOMBIE = new ItemBase("raisebuckle_fever_zombie",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_NINJA = new ItemBase("raisebuckle_fever_ninja",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_BEAT = new ItemBase("raisebuckle_fever_beat",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_MONSTER = new ItemBase("raisebuckle_fever_monster",Wmod.TabKamenRiderGEATS);
	 public static final Item RB_FEVERSLOT_BOOST = new ArmorRaiseBoost_Fever("raisebuckle_fever_boost",Wmod.TabKamenRiderGEATS,FORM_BOOST,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_HAMMER = new ArmorRaiseHammer_Fever("raisebuckle_fever_hammer",Wmod.TabKamenRiderGEATS,ARMED_HAMMER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_WATER = new ArmorRaiseWater_Fever("raisebuckle_fever_water",Wmod.TabKamenRiderGEATS,ARMED_WATER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_ARROW = new ArmorRaiseArrow_Fever("raisebuckle_fever_arrow",Wmod.TabKamenRiderGEATS,ARMED_ARROW,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_SHIELD = new ArmorRaiseShield_Fever("raisebuckle_fever_shield",Wmod.TabKamenRiderGEATS,ARMED_SHIELD,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_CRAW = new ArmorRaiseCraw_Fever("raisebuckle_fever_craw",Wmod.TabKamenRiderGEATS,ARMED_CRAW,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_CHAINARRAY = new ArmorRaiseChainarray_Fever("raisebuckle_fever_chainarray",Wmod.TabKamenRiderGEATS,ARMED_CHAINARRAY,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_DRILL = new ArmorRaiseDrill_Fever("raisebuckle_fever_drill",Wmod.TabKamenRiderGEATS,ARMED_DRILL,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_PROPELLER = new ArmorRaisePropeller_Fever("raisebuckle_fever_propeller",Wmod.TabKamenRiderGEATS,ARMED_PROPELLER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_SHOOTER = new ArmorRaiseShooter_Fever("raisebuckle_fever_shooter",Wmod.TabKamenRiderGEATS,ARMED_SHOOTER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_BREAKER = new ArmorRaiseBreaker_Fever("raisebuckle_fever_breaker",Wmod.TabKamenRiderGEATS,ARMED_BREAKER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_DUALER = new ArmorRaiseDualer_Fever("raisebuckle_fever_dualer",Wmod.TabKamenRiderGEATS,ARMED_DUALER,EntityEquipmentSlot.CHEST);
	 public static final Item RB_FEVERSLOT_AX = new ArmorRaiseAx_Fever("raisebuckle_fever_ax",Wmod.TabKamenRiderGEATS,ARMED_AX,EntityEquipmentSlot.CHEST);
	 */

	public static final Item RAISE_HAMMER = new ItemBaseWeapon("raise_hammer",Wmod.TabKamenRiderGEATS, 10, 2, RAISEWEAPON_HAMMER);
	public static final Item RAISE_WATER = new ItemRaiseWater("raise_water",Wmod.TabKamenRiderGEATS,5,2,RAISEWEAPON_WATER);
	public static final Item RAISE_ARROW = new ItemRaiseArrow("raise_arrow",Wmod.TabKamenRiderGEATS);
	public static final Item RAISE_SHIELD = new ItemRaiseShield("raise_shield",Wmod.TabKamenRiderGEATS);
	public static final Item RAISE_CRAW = new ItemRaiseCraw("raise_craw",RAISEWEAPON_CRAW,Wmod.TabKamenRiderGEATS);
	public static final Item RAISE_CHAINARRAY = new ItemBaseChainArray("raise_chainarray",Wmod.TabKamenRiderGEATS, 8, 2, RAISEWEAPON_CHAINARRAY);
	public static final Item RAISE_CHAINARRAY_SHOOT = new ItemBaseChainArray("raise_chainarray_shooted",Wmod.TabKamenRiderGEATS, 0, 2, CHAINARRAY_SHOOT);
	public static final Item RAISE_DRILL = new ItemRaiseDrill("raise_drill",Wmod.TabKamenRiderGEATS, 6, 4, RAISEWEAPON_DRILL);
	public static final Item RAISE_PROPELLER = new ItemRaisePropeller("raise_propeller",Wmod.TabKamenRiderGEATS, 5, 2, RAISEWEAPON_PROPELLER);

	public static final Item MAGNUM_SHOOTER_HANDGUN = new ItemMagnumShooter("magnum_shooter_handgun",Wmod.TabKamenRiderGEATS);
	public static final Item MAGNUM_SHOOTER_RYFLE = new ItemMagnumShooter("magnum_shooter_ryfle",Wmod.TabKamenRiderGEATS);
	public static final Item ZOMBIE_BREAKER = new ItemBaseSword("zombie_breaker",RAISEWEAPON_BREAKER,Wmod.TabKamenRiderGEATS);
	public static final Item NINJA_DUALER_SINGLE = new ItemNinjadualer("ninja_dualer_single",RAISEWEAPON_DUALER,Wmod.TabKamenRiderGEATS);
	public static final Item NINJA_DUALER_TWIN_A = new ItemNinjadualer("ninja_dualer_twin_a",RAISEWEAPON_DUALER_A,Wmod.TabKamenRiderGEATS);
	public static final Item NINJA_DUALER_TWIN_B = new ItemNinjadualer("ninja_dualer_twin_b",RAISEWEAPON_DUALER_B,Wmod.TabKamenRiderGEATS);
	public static final Item BEAT_AX = new ItemBeatAx("beat_ax",Wmod.TabKamenRiderGEATS,14,1,RAISEWEAPON_AX);
	public static final Item BOOST_TIME = new ItemBase3("raisebuckle_boost_time",Wmod.TabKamenRiderGEATS);	
	//	public static final Item RAISING_SWORD = new ItemBase("raising_sword",Wmod.TabKamenRiderGEATS);
	//	public static final Item GIGANT_HAMMMER = new ItemBase("gigant_hammer",Wmod.TabKamenRiderGEATS);
	//	public static final Item GIGANT_SWORD = new ItemBase("gigant_hammer",Wmod.TabKamenRiderGEATS);
	//	public static final Item GIGANT_BLASTER = new ItemBase("gigant_blaster",Wmod.TabKamenRiderGEATS);
	//	public static final Item GEATS_BUSTER_QB9_RAILGUN = new ItemBase("geats_buster_railgun",Wmod.TabKamenRiderGEATS);
	//	public static final Item GEATS_BUSTER_QB9_BLADE = new ItemBase("geats_buster_blade",Wmod.TabKamenRiderGEATS);
	//	public static final Item BUJIN = new ItemBase("bujin",Wmod.TabKamenRiderGEATS);
	//	public static final Item PLOGION_RAGE_SHIELD = new ItemBase("plosion_sheild",Wmod.TabKamenRiderGEATS);
	//	public static final Item GEATS_BUSTER_X_RAILGUN = new ItemBase("geats_buster_x_railgun",Wmod.TabKamenRiderGEATS);
	//	public static final Item GEATS_BUSTER_X_BLADE = new ItemBase("geats_buster_x_blade",Wmod.TabKamenRiderGEATS);
	//	public static final Item X_RAISING_SWORD = new ItemBase("x_raising_sword",Wmod.TabKamenRiderGEATS);
	//	public static final Item DOOMSGEATS_BUSTER_X_RAILGUN = new ItemBase("geats_buster_railgun",Wmod.TabKamenRiderGEATS);
	//	public static final Item DOOMSGEATS_BUSTER_X_BLADE = new ItemBase("geats_buster_blade",Wmod.TabKamenRiderGEATS);

	public static final ToolMaterial KINGOHGER =EnumHelper.addToolMaterial("shugod",3, 1500, 8.0F, 10.0F,0);
	public static final Item RB_KINGOHGER = new ArmorRaiseKingOhger("raisebuckle_kingohger",Wmod.TabKamenRiderGEATS,FORM_KINGOHGER,EntityEquipmentSlot.CHEST);
	public static final Item OHGER_CALIBUR = new ItemBaseSword("ohger_calibur",KINGOHGER, Wmod.TabKamenRiderGEATS);

	//Gotchard
	public static final ArmorMaterial DRIVER_GOTCHARD = EnumHelper.addArmorMaterial("nijigon", Reference.MODID+":gotchardriver", 50, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STEAM_HOPPER = EnumHelper.addArmorMaterial("hopper_liner", Reference.MODID+":gotchard_steamhopper", 40, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial DRIVER_GOTCHARD_DB = EnumHelper.addArmorMaterial("daybreak", Reference.MODID+":gotchardriver_daybreak", 50, new int[]{0, 4, 0, 25},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STEAM_HOPPER_DB = EnumHelper.addArmorMaterial("hopper_liner_db", Reference.MODID+":gotchard_daybreak", 40, new int[]{0, 4, 0, 25},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial GOTCHARIGNITER = EnumHelper.addArmorMaterial("gotcharigniter", Reference.MODID+":gotchard_igniter", 40, new int[]{0, 2, 7, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial DRIVER_LEGEND = EnumHelper.addArmorMaterial("chemyride", Reference.MODID+":legendriver", 40, new int[]{0, 2, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_LEGEND = EnumHelper.addArmorMaterial("legendride_legend", Reference.MODID+":legendride_legend", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial LEGENDARY_LEGEND = EnumHelper.addArmorMaterial("finalchemyride", Reference.MODID+":legendary_legend", 40, new int[]{0, 12, 0 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial LR_KUUGA = EnumHelper.addArmorMaterial("gougeous_kuuga", Reference.MODID+":legendride_kuuga", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_AGITO = EnumHelper.addArmorMaterial("gougeous_agito", Reference.MODID+":legendride_agito", 40, new int[]{0, 0, 0, 18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_RYUKI = EnumHelper.addArmorMaterial("gougeous_ryuki", Reference.MODID+":legendride_ryuki", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_FAIZ = EnumHelper.addArmorMaterial("gougeous_faiz", Reference.MODID+":legendride_faiz", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_BLADE = EnumHelper.addArmorMaterial("gougeous_blade", Reference.MODID+":legendride_blade", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_HIBIKI = EnumHelper.addArmorMaterial("gougeous_hibiki", Reference.MODID+":legendride_hibiki", 40, new int[]{0, 0, 0,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_KABUTO = EnumHelper.addArmorMaterial("gougeous_kabuto", Reference.MODID+":legendride_kabuto", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_DENO = EnumHelper.addArmorMaterial("gougeous_deno", Reference.MODID+":legendride_deno", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_KIVA = EnumHelper.addArmorMaterial("gougeous_kiva", Reference.MODID+":legendride_kiva", 40, new int[]{0, 0, 0 ,19},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_DECADE = EnumHelper.addArmorMaterial("gougeous_decade", Reference.MODID+":legendride_decade", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_W = EnumHelper.addArmorMaterial("gougeous_w", Reference.MODID+":legendride_w", 40, new int[]{0, 0, 0, 22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_OOO = EnumHelper.addArmorMaterial("gougeous_ooo", Reference.MODID+":legendride_ooo", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial LR_FOURZE = EnumHelper.addArmorMaterial("gougeous_fourze", Reference.MODID+":legendride_fourze", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_WIZARD = EnumHelper.addArmorMaterial("gougeous_wizard", Reference.MODID+":legendride_wizard", 40, new int[]{0, 0, 0 ,21},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_GAIM = EnumHelper.addArmorMaterial("gougeous_gaim", Reference.MODID+":legendride_gaim", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_DRIVE = EnumHelper.addArmorMaterial("gougeous_drive", Reference.MODID+":legendride_drive", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_GHOST = EnumHelper.addArmorMaterial("gougeous_ghost", Reference.MODID+":legendride_ghost", 40, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial LR_EXAID = EnumHelper.addArmorMaterial("gougeous_exaid", Reference.MODID+":legendride_exaid", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_BUILD = EnumHelper.addArmorMaterial("gougeous_build", Reference.MODID+":legendride_build", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_ZIO = EnumHelper.addArmorMaterial("gougeous_zio", Reference.MODID+":legendride_zio", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial LR_ZEROONE = EnumHelper.addArmorMaterial("gougeous_zeroone", Reference.MODID+":legendride_zeroone", 40, new int[]{0, 0, 0 ,21},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_SABER = EnumHelper.addArmorMaterial("gougeous_saber", Reference.MODID+":legendride_saber", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_REVI = EnumHelper.addArmorMaterial("gougeous_revi", Reference.MODID+":legendride_revi", 40, new int[]{0, 0, 0 ,18},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_VICE = EnumHelper.addArmorMaterial("gougeous_vice", Reference.MODID+":legendride_vice", 40, new int[]{0, 2, 0, 20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
	public static final ArmorMaterial LR_GEATS = EnumHelper.addArmorMaterial("gougeous_geats", Reference.MODID+":legendride_geats", 40, new int[]{0, 0, 0 ,20},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LR_GOTCHARD = EnumHelper.addArmorMaterial("gougeous_gotchard", Reference.MODID+":legendride_gotchard", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_GAVV = EnumHelper.addArmorMaterial("gougeous_gavv", Reference.MODID+":legendride_gavv", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_ZEZTZ = EnumHelper.addArmorMaterial("gougeous_zeztz", Reference.MODID+":legendride_zeztz", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial LR_MYTH = EnumHelper.addArmorMaterial("gougeous_myth", Reference.MODID+":legendride_myth", 40, new int[]{0, 0, 0 ,22},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static final Item GOTCHARDRIVER = new ArmorGotchardriver("gotchardriver",Wmod.TabKamenRiderGOTCHARD,DRIVER_GOTCHARD,EntityEquipmentSlot.LEGS);
	public static final Item GOTCHARDRIVER_DAYBREAK = new ArmorGotchardriverDaybreak("gotchardriver_daybreak",Wmod.TabKamenRiderGOTCHARD,DRIVER_GOTCHARD_DB,EntityEquipmentSlot.LEGS);
	public static final Item VALVARADRIVER = new ItemBase("valvaradriver",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIVER = new ArmorLegendriver("legendriver",Wmod.TabKamenRiderGOTCHARD,DRIVER_LEGEND,EntityEquipmentSlot.LEGS);
	public static final Item GOTCHAR_IGNITER = new ItemBase("gotchar_igniter",Wmod.TabKamenRiderGOTCHARD);

	//public static final Item LEGENDRIDE_MAGNUM = new ItemBase("legendride_magnum",Wmod.TabKamenRiderGOTCHARD);
	//public static final Item LEGEND_KAMEN_RISER = new ItemBaseGun("legendkamen_riser",Wmod.TabKamenRiderGOTCHARD);
	/*
 	public static final Item LEGENDRIDE_LEGEND = new ArmorLRLegend("legendride_kuuga",Wmod.TabKamenRiderGOTCHARD,LR_KUUGA,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_KUUGA = new ArmorLRKuuga("legendride_kuuga",Wmod.TabKamenRiderGOTCHARD,LR_KUUGA,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_AGITO =new ItemBase("legendride_agito",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_RYUKI = new ArmorLRRyuki("legendride_ryuki",Wmod.TabKamenRiderGOTCHARD,LR_RYUKI,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_FAIZ =new ItemBase("legendride_faiz",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_BLADE = new ArmorLRBlade("legendride_blade",Wmod.TabKamenRiderGOTCHARD,LR_BLADE,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_HIBIKI =  new ArmorLRHibiki("legendride_hibiki",Wmod.TabKamenRiderGOTCHARD,LR_HIBIKI,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_KABUTO = new ArmorLRKabuto("legendride_kabuto",Wmod.TabKamenRiderGOTCHARD,LR_KABUTO,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_DENO =new ItemBase("legendride_deno",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_KIVA =new ItemBase("legendride_kiva",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_DECADE = new ArmorLRDecade("legendride_decade",Wmod.TabKamenRiderGOTCHARD,LR_DECADE,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_W = new ArmorLRW("legendride_w",Wmod.TabKamenRiderGOTCHARD,LR_W,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_OOO = new ArmorLROOO("legendride_ooo",Wmod.TabKamenRiderGOTCHARD,LR_OOO,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_FOURZE =new ItemBase("legendride_fourze",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_WIZARD =  new ArmorLRWizard("legendride_wizard",Wmod.TabKamenRiderGOTCHARD,LR_WIZARD,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_GAIM =new ItemBase("legendride_gaim",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_DRIVE =new ArmorLRDrive("legendride_drive",Wmod.TabKamenRiderGOTCHARD,LR_DRIVE,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_GHOST = new ArmorLRGhost("legendride_ghost",Wmod.TabKamenRiderGOTCHARD,LR_GHOST,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_EXAID =new ArmorLRExaid("legendride_exaid",Wmod.TabKamenRiderGOTCHARD,LR_EXAID,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_BUILD =new ArmorLRBuild("legendride_build",Wmod.TabKamenRiderGOTCHARD,LR_BUILD,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_ZIO =new ItemBase("legendride_zio",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_ZEROONE =new ItemBase("legendride_zeroone",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_SABER =  new ArmorLRSaber("legendride_saber",Wmod.TabKamenRiderGOTCHARD,LR_WIZARD,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_REVI =new ItemBase("legendride_revi",Wmod.TabKamenRiderGOTCHARD);
	public static final Item LEGENDRIDE_VICE =new ArmorLRDrive("legendride_vice",Wmod.TabKamenRiderGOTCHARD,LR_DRIVE,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_GEATS = new ArmorLRGhost("legendride_geats",Wmod.TabKamenRiderGOTCHARD,LR_GHOST,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_GOTCHARD =new ArmorLRExaid("legendride_gotchard",Wmod.TabKamenRiderGOTCHARD,LR_EXAID,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_GAVV =new ArmorLRBuild("legendride_gavv",Wmod.TabKamenRiderGOTCHARD,LR_BUILD,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_ZEZTZ =new ArmorLRZeztz("legendride_zeztz",Wmod.TabKamenRiderGOTCHARD,LR_ZEZTZ,EntityEquipmentSlot.HEAD);
	public static final Item LEGENDRIDE_MYTH =new ArmorLRMyth("legendride_myth",Wmod.TabKamenRiderGOTCHARD,LR_MYTH,EntityEquipmentSlot.HEAD);
	 */
	public static final ArmorMaterial DRIVER_ZEZTZ = EnumHelper.addArmorMaterial("goodmorning", Reference.MODID+":zeztz_driver", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PHYSICAM_IMPACT = EnumHelper.addArmorMaterial("physicam_impact", Reference.MODID+":zeztz_impact", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
/*	public static final ArmorMaterial PHYSICAM_TRANSFORM = EnumHelper.addArmorMaterial("physicam_transform", Reference.MODID+":zeztz_transform", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PHYSICAM_WING = EnumHelper.addArmorMaterial("physicam_wing", Reference.MODID+":zeztz_wing", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TECHNOLOM_STREAM = EnumHelper.addArmorMaterial("techonolom_stream", Reference.MODID+":zeztz_stream", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TECHNOLOM_MACHINARY = EnumHelper.addArmorMaterial("techonolom_machinary", Reference.MODID+":zeztz_machinary", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TECHNOLOM_PROJECTION = EnumHelper.addArmorMaterial("techonolom_projection", Reference.MODID+":zeztz_projection", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ESPRIM_RECOVERY = EnumHelper.addArmorMaterial("esprim_recovery", Reference.MODID+":zeztz_recovery", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ESPRIM_BARRIOR = EnumHelper.addArmorMaterial("esprim_barrior", Reference.MODID+":zeztz_barrior", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PARADIGM_WONDER = EnumHelper.addArmorMaterial("paradigm_wonder", Reference.MODID+":zeztz_wonder", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PARADIGM_GRAVITY = EnumHelper.addArmorMaterial("paradigm_gravity", Reference.MODID+":zeztz_gravity", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial INAZUMA_PLAZMA = EnumHelper.addArmorMaterial("inazuma_plazma", Reference.MODID+":zeztz_plazma", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial INAZUMA_BOOSTER = EnumHelper.addArmorMaterial("inazuma_booster", Reference.MODID+":zeztz_booster", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ZEZTZ_DARKNESS = EnumHelper.addArmorMaterial("zeztz_darkness", Reference.MODID+":zeztz_darkness", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial KNIGHT_INVOKER = EnumHelper.addArmorMaterial("invoke_knight", Reference.MODID+":knight_invoker", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial INVOKE_ERASE = EnumHelper.addArmorMaterial("knight_four", Reference.MODID+":zeztz_erase", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
*/
	
	public static final Item CAPSEM_IMPACT = new ArmorZeztzImpact("capsem_impact",Wmod.TabKamenRiderGOTCHARD,PHYSICAM_IMPACT,EntityEquipmentSlot.HEAD);
	//	public static final Item CAPSEM_STREAM = new ArmorZeztzStream("capsem_stream",Wmod.TabKamenRiderGOTCHARD,TECHNOLOM_STREAM,EntityEquipmentSlot.HEAD);
	//	public static final Item CAPSEM_RECOVERY = new ArmorZeztzRecovery("capsem_recovery",Wmod.TabKamenRiderGOTCHARD,ESPRIM_RECOVERY,EntityEquipmentSlot.HEAD);
	//	public static final Item CAPSEM_WONDER = new ArmorZeztzWonder("capsem_wonder",Wmod.TabKamenRiderGOTCHARD,PARADIGM_WONDER,EntityEquipmentSlot.HEAD);
	public static final Item ZEZTZ_DRIVER = new ArmorZeztzDriver("zeztz_driver",Wmod.TabKamenRiderGOTCHARD,DRIVER_ZEZTZ,EntityEquipmentSlot.CHEST);

	public static final ArmorMaterial DRIVER_MYTH = EnumHelper.addArmorMaterial("nezumicheeser", Reference.MODID+":myth_driver", 40, new int[]{0, 0, 2 ,0},0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	//	 public static final Item MYTH_DRIVER = new ArmorMythdriver("myth_driver",Wmod.TabKamenRiderGOTCHARD,DRIVER_MYTH,EntityEquipmentSlot.CHEST);

	public static final ToolMaterial GOJUGER =EnumHelper.addToolMaterial("tegasword",3, 800, 8.0F, 10.0F,0);
	public static final Item TEGASWORD_GOLD = new ItemBaseSword("tegasword_gold",GOJUGER, CreativeTabs.COMBAT);
	public static final Item TEGASWORD_SILVER = new ItemBaseSword("tegasword_silver",GOJUGER, CreativeTabs.COMBAT);
}