import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeTest {

    public static void main(String args[]) {
        String path = " BridgePersisterInputThread | BRIDGE RECEIVE UPDATE [CONTAINER_ARGO 'LAJA0000043' 1550:0{0}N4(10.0.0.149)USER_LCL:-xps-@20191108.122442.229] #DBObjectFromBento ( { \"ContainerArgo\" [\"gkey\"(vs64)=\"1550\"] [\"pkey\"(vs64)=\"-66742238\"] [\"tableId\"=34] [\"recordIndex\"=2588] [\"groupID\"(vs64)=\"1550\"] [\"objectVersion\"=0] [\"bundleKey\"=0] [\"updateTime\"(inst)=\"2015-08-18 14:49:46.413 UTC\"] [\"lastMoveTime\"(inst)=\"2019-11-08 12:24:42.200 UTC\"] [\"preferCelsiusTemp\"=true] [\"desiredOnPowerState\"=false] [\"sentReeferRequest\"=false] [\"od\"=false] [\"tynes\"=false] [\"liveReefer\"=false] [\"damage\"=false] [\"hold1\"=false] [\"hold2\"=false] [\"hold3\"=false] [\"changed\"=true] [\"folded\"=false] [\"cou\"=false] [\"unVerified\"=true] [\"multHazard\"=false] [\"onPower\"=false] [\"wasDelivered\"=false] [\"addSlaveHeights\"=true] [\"transferableRelease\"=false] [\"validateReleaseGroup\"=false] [\"wheeledCare\"=false] [\"mustPlanToWheels\"=false] [\"specialBox\"=false] [\"addSlaveWeights\"=true] [\"verifiedLoadList\"=false] [\"plugProjection\"=false] [\"stop\"=false] [\"equipmentHeight\"=2590] [\"weight\"=24400] [\"weightAdvised\"=0] [\"weightGateMeasured\"=0] [\"weightYardMeasured\"=0] [\"reeferTemp\"(flot)=\"-327.679993\"] [\"upperReeferTemp\"(flot)=\"-327.679993\"] [\"lowerReeferTemp\"(flot)=\"-327.679993\"] [\"overdimensionTop\"=0] [\"overdimensionRight\"=0] [\"overdimensionLeft\"=0] [\"overdimensionFront\"=0] [\"overdimensionBack\"=0] [\"arriveVisit\"=\"LAJV001\"] [\"departVisit\"=\"TRUCK\"] [\"qArrive\"='V'] [\"qDepart\"='T'] [\"qCategory\"='I'] [\"qStatus\"='F'] [\"qReeferType\"=' '] [\"qRehandle\"=' '] [\"qHazStowReq\"=' '] [\"qEquipmentType\"=' '] [\"qCheckDigit\"='?'] [\"qFtxQualifier\"=''] [\"equipmentId\"=\"LAJA0000043\"] [\"bookingNumber\"=\"\"] [\"service\"=\"AEO\"] [\"equipmentType\"=\"2200\"] [\"loadPort\"=\"HKHKG\"] [\"dischargePort\"=\"LYT\"] [\"destination\"=\"\"] [\"origin\"=\"\"] [\"equipmentFeature\"=\"\"] [\"lineOperator\"=\"APL\"] [\"group\"=\"\"] [\"stow1\"=\"\"] [\"stow2\"=\"\"] [\"stow3\"=\"\"] [\"commodity\"=\"\"] [\"remarks\"=\"\"] [\"hazards\"(vsta)='\"\",\"\",\"\",\"\",\"\",\"\"'] [\"userValidated1\"=\"\"] [\"userValidated2\"=\"\"] [\"userValidated3\"=\"\"] [\"user1\"=\"\"] [\"user2\"=\"\"] [\"user3\"=\"\"] [\"user4\"=\"\"] [\"user5\"=\"\"] [\"user6\"=\"\"] [\"user7\"=\"\"] [\"user8\"=\"\"] [\"user9\"=\"\"] [\"user10\"=\"\"] [\"userA\"=\"\"] [\"userB\"=\"\"] [\"userC\"=\"\"] [\"userD\"=\"\"] [\"userE\"=\"\"] [\"userF\"=\"\"] [\"userG\"=\"\"] [\"userH\"=\"\"] [\"userI\"=\"\"] [\"userJ\"=\"\"] [\"userK\"=\"\"] [\"userL\"=\"\"] [\"userM\"=\"\"] [\"userN\"=\"\"] [\"userO\"=\"\"] [\"hostKey\"=\"\"] [\"chassis\"=\"\"] [\"transId\"=\"\"] [\"ufvFlexDate1\"(inst)=\"NEVER\"] [\"ufvFlexDate2\"(inst)=\"NEVER\"] [\"ufvFlexDate3\"(inst)=\"NEVER\"] [\"ufvFlexDate4\"(inst)=\"NEVER\"] [\"ufvFlexDate5\"(inst)=\"NEVER\"] [\"ufvFlexDate6\"(inst)=\"NEVER\"] [\"ufvFlexDate7\"(inst)=\"NEVER\"] [\"ufvFlexDate8\"(inst)=\"NEVER\"] [\"rnDTime\"(inst)=\"NEVER\"] [\"yardInTime\"(inst)=\"NEVER\"] [\"yardOutTime\"(inst)=\"NEVER\"] [\"appointmentTime\"(inst)=\"NEVER\"] [\"userTime\"(inst)=\"NEVER\"] [\"lastReeferTime\"(inst)=\"NEVER\"] [\"lastReeferTemp\"(flot)=\"-327.679993\"] [\"inventoryTime\"(inst)=\"PAST\"] [\"bundledOn\"=\"\"] [\"tareWeight\"=1900] [\"payload\"=0] [\"equipRequestId\"=\"\"] [\"note\"=\"\"] [\"damageCode\"=\"\"] [\"visitState\"=1] [\"transitState\"=1] [\"fireCode\"=\"\"] [\"drayStatus\"=999] [\"seal1\"=\"\"] [\"seal2\"=\"\"] [\"seal3\"=\"\"] [\"seal4\"=\"\"] [\"positionOnTruck\"=\"\"] [\"truckLicense\"=\"\"] [\"truckCompany\"=\"\"] [\"truckDriver\"=\"\"] [\"customsAgent\"=\"\"] [\"shipper\"=\"\"] [\"consignee\"=\"\"] [\"exchangeLane\"=\"\"] [\"containerGrade\"=\"\"] [\"importDelivGroup\"=\"\"] [\"eCn\"=\"\"] [\"reeferComment\"=\"\"] [\"deliveryTask\"=\"\"] [\"opdPort1\"=\"\"] [\"billOfLading\"=\"\"] [\"boxStrength\"=\"TB\"] [\"lowBillOfLading\"=\"\"] [\"bookingRelease\"=\"\"] [\"containerCondition\"=\"\"] [\"facilityId\"=\"LCT\"] [\"locOrientation\"(vs_8)=\"0\"] [\"flexStringsCntr\"(vsta)='\"\",\"\",\"\",\"\"'] [\"userValidated4\"=\"\"] [\"userValidated5\"=\"\"] [\"mnRStatus\"=\"\"] [\"directHandling\"=false] [\"chassisType\"=\"\"] [\"chassisLineOp\"=\"\"] [\"n4StowFactor\"=\"\"] [\"railRASPriorityContainer\"=false] [\"reservedForCheId\"=0] [\"housekeepingCurrentSlot\"=\"\"] [\"housekeepingFutureSlot\"=\"\"] [\"housekeepingCurrentScore\"=0] [\"housekeepingFutureScore\"=0] [\"housekeepingTimeStamp\"(inst)=\"NEVER\"] [\"n4StackingFactor\"=\"\"] [\"n4SectionFactor\"=\"\"] [\"tankRailType\"=4] [\"n4OptimalRailTZSlot\"=\"\"] [\"emptySelectionTime\"(inst)=\"NEVER\"] [\"opdPort2\"=\"\"] [\"opdPort3\"=\"\"] [\"carrierIncompatibilityReason\"(vs_8)=\"0\"] [\"projDischPort\"=\"\"] [\"archCommodity\"=\"\"] [\"railConeStatus\"(vs_8)=\"0\"] [\"unitCombo\"(vs64)=\"0\"] [\"eqUnitRole\"(vs_8)=\"0\"] [\"n4SegregationFactor\"=\"\"] { \"bundleSlaves\" } } ) ecs.version:1.0.1 agent.hostname:EC2AMAZ-DF1UMC9 agent.id:01af765d-7384-4f73-9dc0-6190b205be42 agent.type:filebeat agent.ephemeral_id:b94a1763-09d2-4c92-b03d-21edc97b14ea agent.version:7.3.0 host.name:ec2amaz-df1umc9 log.offset:549,343 log.file.path:C:\\ProgramData\\Navis\\xps\\log\\xps.log log-timestamp-YYYYMMddHH:2019-11-08-12 log-timestamp:Nov 8, 2019 @ 17:54:42.250 log-level:INFO @version:1 input.type:log @timestamp:Nov 8, 2019 @ 17:54:43.032 fields.log-type:navis-xps-messages fields.n4-type:xps fields.customer:navis tags: _id:THv5Sm4B19VrQHb_U0R6 _type:_doc _index:navis-xps-messages-ec2amaz-df1umc9-2019.11.08 _score: -";


        if (path != null) {
            int index = path.indexOf('@');
            if (index > 0) {
                String orig = path.substring(index + 1, index + 20);
                String rec = "20191108.175442.250";
                int o_h = Integer.parseInt(orig.substring(9, 11));
                int o_m = Integer.parseInt(orig.substring(11, 13));
                int o_s = Integer.parseInt(orig.substring(13, 15));
                int r_h = Integer.parseInt(rec.substring(9, 11)) - 7;
                int r_m = Integer.parseInt(rec.substring(11, 13));
                int r_s = Integer.parseInt(rec.substring(13, 15));
                if ((o_h > r_h) || (o_h == r_h && o_m > r_m) || (o_h == r_h && o_m == r_m && o_s > r_s)) {
                    int sw = r_h;
                    o_h = r_h;
                    r_h = sw;
                    sw = o_m;
                    o_m = r_m;
                    r_m = sw;
                    sw = o_s;
                    o_s = r_s;
                    r_s = sw;
                }
                if (r_s - o_s < 0) {
                    r_m--;
                    r_s += 60;
                }
                if (r_m - o_m < 0) {
                    r_h--;
                    r_m += 60;
                }
                System.out.println("*************** VALUE-> " + Math.abs((r_m - o_m) * 60 + (r_s - o_s)));
            } else {
                System.out.println("*************** -> " + -20);
            }
        }
        System.out.println("*************** -> " + -10);
    }
}
