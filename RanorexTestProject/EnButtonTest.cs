﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using WinForms = System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;
using Ranorex.Core.Repository;

namespace Test.androidTest
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    ///The EnButtonTest recording.
    /// </summary>
    [TestModule("4d41cc11-40b1-4dcc-911c-203190fa6fdf", ModuleType.Recording, 1)]
    public partial class EnButtonTest : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Test.TestRepository repository.
        /// </summary>
        public static Test.TestRepository repo = Test.TestRepository.Instance;

        static EnButtonTest instance = new EnButtonTest();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public EnButtonTest()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static EnButtonTest Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.0")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.0")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.00;

            Init();

            Report.Log(ReportLevel.Info, "Application", "Run mobile app 'io.selendroid.testapp' on device 'USB-00f540f2c4f126d9'.", new RecordItemIndex(0));
            Host.Local.RunMobileApp("USB-00f540f2c4f126d9", "io.selendroid.testapp", true);
            Delay.Milliseconds(3500);
            
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='EN Button') on item 'IoSelendroidTestapp.HomeScreenActivity.ButtonTest'.", repo.IoSelendroidTestapp.HomeScreenActivity.ButtonTestInfo, new RecordItemIndex(1));
            Validate.Attribute(repo.IoSelendroidTestapp.HomeScreenActivity.ButtonTestInfo, "Text", "EN Button");
            Delay.Milliseconds(100);
            
            Report.Log(ReportLevel.Info, "Touch", "Touch item 'IoSelendroidTestapp.HomeScreenActivity.ButtonTest' at Center", repo.IoSelendroidTestapp.HomeScreenActivity.ButtonTestInfo, new RecordItemIndex(2));
            repo.IoSelendroidTestapp.HomeScreenActivity.ButtonTest.Touch();
            Delay.Milliseconds(500);
            
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='This will end the activity') on item 'IoSelendroidTestapp.ThisWillEndTheActivity'.", repo.IoSelendroidTestapp.ThisWillEndTheActivityInfo, new RecordItemIndex(3));
            Validate.Attribute(repo.IoSelendroidTestapp.ThisWillEndTheActivityInfo, "Text", "This will end the activity");
            Delay.Milliseconds(100);
            
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='I agree') on item 'IoSelendroidTestapp.Button1'.", repo.IoSelendroidTestapp.Button1Info, new RecordItemIndex(4));
            Validate.Attribute(repo.IoSelendroidTestapp.Button1Info, "Text", "I agree");
            Delay.Milliseconds(100);
            
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='No, no') on item 'IoSelendroidTestapp.Button2'.", repo.IoSelendroidTestapp.Button2Info, new RecordItemIndex(5));
            Validate.Attribute(repo.IoSelendroidTestapp.Button2Info, "Text", "No, no");
            Delay.Milliseconds(100);
            
            Report.Log(ReportLevel.Info, "Touch", "Touch item 'IoSelendroidTestapp.Button2' at Center", repo.IoSelendroidTestapp.Button2Info, new RecordItemIndex(6));
            repo.IoSelendroidTestapp.Button2.Touch();
            Delay.Milliseconds(1000);
            
        }

#region Image Feature Data
#endregion
    }
#pragma warning restore 0436
}