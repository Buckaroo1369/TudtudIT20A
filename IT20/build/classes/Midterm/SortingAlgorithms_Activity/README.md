DISCLAIMER: Kuan ni siya AI collaboration, gipa enhance nako sa AI gamay para sakto jud ang pagka explain kay pati ako ga libog sa akong explanation tas gipa enhance pud nako para chadaa siya tan-awon sa gitHub.

# Sorting Algorithms Activity
## The Last Transmission

*Sorting incoming signals before the final broadcast.*

## Program Description

Kini nga program nagpakita sa tulo ka sorting algorithms sa Java: Bubble Sort, Selection Sort, ug Insertion Sort. Gigamit nako ang mga numero isip signal strengths sa usa ka fictional radio station nga nagdawat og lain-laing transmissions.

Ang tumong sa program kay ihan-ay ang mga signal values gikan sa pinakagamay ngadto sa pinakadako. Ang tulo ka algorithms gigamit sa parehas nga original array, apan tagsa-tagsa sila og copy aron patas ang ilang pagsort ug dili maapektuhan sa resulta sa laing algorithm.

## Sorting Algorithms

### 1. Bubble Sort

Ang Bubble Sort magtan-aw sa magkatapad nga mga numero ug ikumpara sila. Kung mas dako ang numero sa wala kaysa numero sa tuo, ilang ilisan ang ilang pwesto. Magpadayon kini sa pag-compare ug pag-swap hangtod mahan-ay ang mga numero gikan sa pinakagamay ngadto sa pinakadako.

### 2. Selection Sort

Ang Selection Sort mangita sa pinakagamay nga numero sa wala pa nahapsay nga bahin sa array. Kung makita na niya ang pinakagamay, ibutang niya kini sa sunod nga sakto nga pwesto. Balik-balikon niya kini nga proseso hangtod mahuman ang array.

### 3. Insertion Sort

Ang Insertion Sort magsugod sa ikaduhang numero ug itandi kini sa mga numero nga naa sa wala niini. Kung naay mas dagko nga numero, ibalhin niya kini aron makabutang ang iyang current number sa sakto nga pwesto. Sama kini sa paghan-ay og mga butang nga naa na sa imong kamot pinaagi sa pag-insert sa bag-ong butang sa hustong lugar.

## Differences Between the Algorithms

Ang tulo ka algorithms parehas og resulta, pero lahi ang paagi sa ilang paghan-ay sa mga numero.

Ang Bubble Sort mag-focus sa pag-compare sa magkatapad nga numero ug pag-ilis sa ilang pwesto kung kinahanglan. Ang Selection Sort mangita sa pinakagamay nga numero sa matag round, samtang ang Insertion Sort magkuha og usa ka numero ug ibutang kini sa sakto nga lugar sulod sa bahin nga nahapsay na.

Bisan parehas sila og output, lahi ang ilang proseso ug ang kadaghan sa pag-compare, pag-swap, o pagbalhin sa mga numero depende sa input.

## Reflection Questions

### 1. How does each sorting algorithm arrange numbers? What makes their processes different?

Ang Bubble Sort mag-compare sa magkatapad nga mga numero ug mag-swap kung ang ilang order sayop. Ang Selection Sort mangita sa pinakagamay nga numero ug ibutang kini sa sunod nga pwesto. Ang Insertion Sort magkuha og numero ug i-insert kini sa sakto nga pwesto sa mga numero nga nahapsay na.

Lahi sila sa paagi sa paghan-ay, bisan pa nga parehas ra ang ilang final result. Ang Bubble Sort nagbalhin-balhin pinaagi sa swaps, ang Selection Sort nag-select sa minimum, ug ang Insertion Sort nagbalhin sa mga numero aron makasulod ang usa ka value sa sakto nga pwesto.

### 2. Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?

Para nako, ang Bubble Sort ang pinakasayon sabton ug implement kay klaro ra ang iyang proseso. I-compare ra ang magkatapad nga numero, ug kung kinahanglan, ilisan sila og pwesto. Dili kaayo lisod sundon ang iyang logic, labi na kung bag-o pa nagtuon og sorting algorithms.

### 3. If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.

Para nako, ang Insertion Sort ang mas maayo kung daan nang sorted ang mga numero. Kay kung ang current number mas dako na kaysa naa sa wala niini, dili na kinahanglan magbalhin-balhin og mga numero. Mahuman dayon ang insertion sa maong value.

Sa akong code, ang Insertion Sort dili na mag-shift og mga numero kung sorted na ang array, bisan moagi gihapon siya sa loop aron ma-check ang matag value. Ang Bubble Sort ug Selection Sort, sa ilang current implementations, magpadayon gihapon sa ilang mga comparison bisan sorted na ang array.

### 4. What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?

Kung modaghan ang mga numero sa array, modaghan usab ang trabaho sa sorting algorithms. Mas daghan silang i-compare ug posibleng i-swap o ibalhin nga mga numero.

Kung gamay ra ang array, dili kaayo makita ang kalainan sa ilang performance. Pero kung daghan na kaayo ang data, mas mudugay ang tulo ka algorithms tungod kay ilang mga proseso magkadaghan samtang modaghan ang input. Mao nga importante ang pagpili og sorting algorithm nga angay sa kadaghan ug kahimtang sa data.

### 5. As a future programmer, why is it important to understand different sorting algorithms instead of using just one?

Importante nga masabtan ang lain-laing sorting algorithms kay dili tanan parehas og performance sa tanang sitwasyon. Naay algorithm nga mas angay kung random ang data, ug naay algorithm nga mas maayo kung hapit na sorted ang mga numero.

Kung masabtan nako ilang differences, mas makapili ko og algorithm nga angay sa akong program imbes nga usa ra pirmi akong gamiton. Makatabang pud kini nga mas masabtan nako kung unsaon pag-process sa data ug unsaon paghimo og mas efficient nga program sa umaabot.

## Conclusion

Pinaagi ani nga activity, mas nasabtan nako nga bisan parehas og output ang Bubble Sort, Selection Sort, ug Insertion Sort, lahi gihapon ang ilang pamaagi sa paghan-ay sa data.

Nakatabang kini nga makita nako nga dili lang ang final result ang importante sa programming, apil pud ang proseso kung giunsa pagkuha ang maong result. Ang pagsabot sa ilang differences makatabang nako sa pagpili og mas angay nga algorithm depende sa sitwasyon ug sa data nga akong gi-process.