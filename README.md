# An app demonstrating Thermal Api implementation

The thermal status shows the severity 

| Name | Severity |
|--|--|
| THERMAL_STATUS_NONE | 0 |
| THERMAL_STATUS_LIGHT | 1 |
| THERMAL_STATUS_MODERATE | 2 |
| THERMAL_STATUS_SEVERE | 3 |
| THERMAL_STATUS_CRITICAL | 4 |
| THERMAL_STATUS_EMERGENCY | 5 |
| THERMAL_STATUS_SHUTDOWN | 0 |

In order to change the thermal status inside the emulator 
You can make use of this adb command 

    adb shell cmd thermalservice override-status STATUS
For eg: 

    adb shell cmd thermalservice override-status 4
Result:

    4

When testing is done, you can reset the thermal status to normal using command 

`adb shell cmd thermalservice reset`


References: 
[https://source.android.com/devices/architecture/hidl/thermal-mitigation#api-testing](https://source.android.com/devices/architecture/hidl/thermal-mitigation#api-testing)
