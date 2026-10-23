package corona.jesus.publicacionfer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import corona.jesus.publicacionfer.ui.theme.PublicacionFERTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PublicacionFERTheme {
                PublicationScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PublicationScreen() {
    // Colors based on the provided design
    val darkBlue = Color(0xFF162B4E)
    val textGray = Color(0xFF818999)
    val backgroundColor = Color(0xFFF7F9FB)
    val yellowBanner = Color(0xFFDCD260)
    val cardBackground = Color(0xFFF0F5FA)
    val topBarColor = Color.White

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Publicación",
                        fontWeight = FontWeight.Bold,
                        color = darkBlue,
                        fontSize = 20.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = darkBlue
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = topBarColor
                )
            )
        },
        containerColor = backgroundColor
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {
            Text(
                text = "Renovación de becas 2026",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = darkBlue
            )
            
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(
                text = "Hace 1 día",
                fontSize = 14.sp,
                color = textGray
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            val bodyText1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            val bodyText2 = "Lorem Ipsum has been the industry's standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets."
            val bodyText3 = "It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including ."
            
            Text(
                text = bodyText1,
                fontSize = 15.sp,
                color = darkBlue,
                lineHeight = 22.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = bodyText2,
                fontSize = 15.sp,
                color = darkBlue,
                lineHeight = 22.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = bodyText3,
                fontSize = 15.sp,
                color = darkBlue,
                lineHeight = 22.sp
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Yellow banner simulating the image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(yellowBanner)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(top = 24.dp, bottom = 24.dp, start = 20.dp, end = 8.dp)
                    ) {
                        Text(
                            text = "BECARIO DE UNI PLAN SEMESTRAL\nY UNIVERSIDAD PRIVADA:",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp,
                            lineHeight = 16.sp
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Últimos\ndías para\nrenovar\ntu beca.",
                            color = Color.White,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.ExtraBold,
                            lineHeight = 34.sp
                        )
                    }
                    // Space placeholder for the person's photo from the original design
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .fillMaxHeight()
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Document download card
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(cardBackground)
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.Description,
                    contentDescription = "Document Icon",
                    tint = darkBlue,
                    modifier = Modifier.size(30.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Guía de renovación 2026.pdf",
                        fontWeight = FontWeight.Bold,
                        color = darkBlue,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Archivo PDF",
                        color = textGray,
                        fontSize = 12.sp
                    )
                }
                Icon(
                    imageVector = Icons.Outlined.Download,
                    contentDescription = "Download Icon",
                    tint = darkBlue,
                    modifier = Modifier.size(24.dp)
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PublicationScreenPreview() {
    PublicacionFERTheme {
        PublicationScreen()
    }
}